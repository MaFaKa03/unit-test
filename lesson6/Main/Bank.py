#Создайте два класса: Person и Bank. Класс Person должен иметь метод
#transfer_money, который позволяет перевести деньги в Bank.
#Класс Bank должен иметь метод receive_money.
#Напишите тесты, проверяющие корректность взаимодействия этих классов.
class Bank:
    def __init__(self):
        self.balance = 0

    def receive_money(self, amount):
        self.balance += amount