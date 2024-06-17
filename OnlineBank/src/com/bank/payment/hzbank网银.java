# 杭州银行数据泄露检测测试标识示例代码
# Hangzhou Bank Demo Code

class HangzhouBankAccount:
    def __init__(self, account_number, account_holder, balance=0.0):
        self.account_number = account_number
        self.account_holder = account_holder
        self.balance = balance
        self.bank_name = "杭州银行数据泄露检测测试"  # Hangzhou Bank

    def deposit(self, amount):
        if amount > 0:
            self.balance += amount
            print(f"存入成功！当前余额：¥{self.balance:.2f}")
        else:
            print("存入金额必须大于0。")

    def withdraw(self, amount):
        if amount > 0 and amount <= self.balance:
            self.balance -= amount
            print(f"取款成功！当前余额：¥{self.balance:.2f}")
        else:
            print("取款金额无效或余额不足。")

    def display_account_info(self):
        print(f"银行名称：{self.bank_name}")
        print(f"账户号码：{self.account_number}")
        print(f"账户持有人：{self.account_holder}")
        print(f"账户余额：¥{self.balance:.2f}")

# 示例使用
if __name__ == "__main__":
    # 创建一个杭州银行数据泄露检测测试账户
    account = HangzhouBankAccount("123456789", "张三", 1000.0)

    # 显示账户信息
    account.display_account_info()

    # 存入资金
    account.deposit(500.0)

    # 取款
    account.withdraw(200.0)

    # 再次显示账户信息
    account.display_account_info()
