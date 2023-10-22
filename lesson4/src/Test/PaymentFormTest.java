import card.CreditCard;
import card.PaymentForm;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

class PaymentFormTest {

    /**
     * 4.2. Используя библиотеку Mockito, напишите модульные тесты для проверки функциональности формы оплаты на сайте.
     * * Вместо реальной кредитной карты используйте мок-объект.
     * Создайте класс `CreditCard` с методами `getCardNumber()`, `getCardHolder()`, `getExpiryDate()`, `getCvv()`, `charge(double amount)`.
     * Создайте класс `PaymentForm` с методом `pay(double amount)`.
     * В тестовом классе, создайте мок-объект для класса `CreditCard`.
     * Определите поведение мок-объекта с помощью метода `when()`.
     * Создайте объект класса `PaymentForm`, передайте ему мок-объект в качестве аргумента.
     * Вызовите метод `pay()` и убедитесь, что мок-объект вызывает метод `charge()`
     */
    @Test
    void paymentFormTest(){
        CreditCard creditCard = mock(CreditCard.class);
        when(creditCard.getCardNumber()).thenReturn("1234567890");
        when(creditCard.getCardHolder()).thenReturn("Konstantin Khait");
        when(creditCard.getExpiryDate()).thenReturn("12/25");
        when(creditCard.getCvv()).thenReturn("344");

        PaymentForm paymentForm = new PaymentForm(creditCard);
        paymentForm.pay(100);
        verify(creditCard, times(1)).charge(100);
    }


}