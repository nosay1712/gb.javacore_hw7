package gb.javacore.hw7;

import java.io.IOException;
import java.text.ParseException;

public interface IWeatherProvider {
    void getCurrentWeather(String cityKey) throws IOException, ParseException;

    void getWeatherForFiveDays(String cityKey) throws IOException, ParseException;

}
