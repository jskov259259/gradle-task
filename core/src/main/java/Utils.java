import ru.clevertec.StringUtils;

public class Utils {

    public static boolean isAllPositiveNumbers(String... str) {

        StringUtils util = new StringUtils();
        for (String s : str) {
            if (!util.isPositiveNumber(s)) {
                return false;
            }
        }
        return true;
    }
}
