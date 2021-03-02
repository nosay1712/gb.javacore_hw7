package gb.javacore.hw7;

import java.io.IOException;
import java.text.ParseException;

public class Controller implements IController {

    ICityCodeProvider codeProvider = new AccuWeatherCityCodeProvider();
    IWeatherProvider weatherProvider = new AccuWeatherProvider();


    @Override
    public void onCityInput(String city) throws IOException {

        if (city.length() == 1) {
            throw new IOException("Недопустимо короткое название города");
        }
        codeProvider.getCodeByCityName(city);

    }

    @Override
    public void onCommandChosen(int selectedCommand) throws IOException, ParseException {
        System.out.println(" ");
        switch (selectedCommand) {
            case 1: {
                weatherProvider.getCurrentWeather(AppGlobalState.getInstance().getCityKey());
                break;
            }
            case 2: {
                weatherProvider.getWeatherForFiveDays(AppGlobalState.getInstance().getCityKey());
                break;
            }

            default: {
                throw new IOException("Неверный ввод\n");
            }
        }
    }
}
