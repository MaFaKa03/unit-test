import org.junit.jupiter.api.Test;
import weather.WeatherReporter;
import weather.WeatherService;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.mockito.Mockito.*;

class WeatherReporterTest {
    @Test
    void weatherReporterTest(){
        WeatherService weatherService = mock(WeatherService.class);
        when(weatherService.getCurrentTemperature()).thenReturn(27);

        WeatherReporter weatherReporter = new WeatherReporter(weatherService);
        weatherReporter.generateReport();
        assertThat(weatherReporter.generateReport()).isEqualTo("Текущая температура: " + 27 + " градусов.");
    }

}