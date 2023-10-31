#Создайте два класса: Person и Bank. Класс Person должен иметь метод
#transfer_money, который позволяет перевести деньги в Bank.
#Класс Bank должен иметь метод receive_money.
#Напишите тесты, проверяющие корректность взаимодействия этих классов.
from lesson6.Main import Bank



class Person:
    def __init__(self, balance):
        self.balance = balance

    def transfer_money(self, bank: Bank, amount):
        if self.balance < amount or amount <= 0:
            raise ValueError("Wrong sum")
        self.balance -= amount
        bank.receive_money(amount)