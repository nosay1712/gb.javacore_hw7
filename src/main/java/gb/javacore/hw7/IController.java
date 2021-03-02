package gb.javacore.hw7;

import java.io.IOException;
import java.text.ParseException;

public interface IController {

    void onCityInput(String city) throws IOException;

    void onCommandChosen(int selectedCommand) throws IOException, ParseException;
}
