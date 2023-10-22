import message.MessageService;
import message.NotificationService;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

class NotificationServiceTest {
    @Test
    void notificationServiceTest(){
        MessageService messageService = mock(MessageService.class);

        NotificationService notificationService = new NotificationService(messageService);
        notificationService.sendNotification("Hello", "freind");
        verify(messageService, times(1)).sendMessage("Hello", "freind");
    }
}