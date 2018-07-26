import java.util.regex.Pattern;

/**
 *
 * @author EP057582
 *
 */

public class regexDemo {

    public static void main(String[] args) {

        String id = "0802ECeheq";
        String cernId = "EP057582";
        System.out.println("Inputed ID: " + id);
        String email = "elp65@case.edu";

        Boolean isValid = Pattern.matches("[A-Za-z]{2}[0-9]{6}", cernId);
        System.out.println("Cerner Id: " + responseRet(isValid));

        isValid = Pattern.matches("[a-zA-Z0-9]*[h][a-zA-Z0-9]*", id);
        System.out.println("Id check: " + responseRet(isValid));

        isValid = Pattern.matches("[A-Za-z0-9]*@[A-Za-z0-9]*.[A-Za-z]{2,4}", email);
        System.out.println("Email: " + responseRet(isValid));
    }

    public static String responseRet(Boolean trueFalse) {
        if (trueFalse) {
            return ("matched");
        } else {
            return ("no matches");
        }

    }

}
