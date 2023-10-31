class Tasks:
     @staticmethod
     def find_average(numbers):
         if not isinstance(numbers, list):
             raise TypeError("Input should be a list.")
         if not numbers:
             return 0
         return sum(numbers) / len(numbers)

     @staticmethod
     def divide(a, b):
         if b == 0:
             raise ZeroDivisionError("Cannot divide by zero")
         return a / b

