import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MexicanWave {

    public static String[] wave(String str) {
        ArrayList<String> capitalisedStringList = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            String[] splitString = str.split("");
            if (splitString[i].equals(" ")) {
                continue;
            }
            splitString[i] = splitString[i].toUpperCase();
            capitalisedStringList.add(String.join("", splitString));
        }
        return capitalisedStringList.toArray(new String[0]);
    }
}
