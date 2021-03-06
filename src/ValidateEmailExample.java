import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by IntelliJ IDEA.
 * User: AnhNBT (anhnbt.it@gmail.com)
 * Date: 10/29/2020
 * Time: 9:49 AM
 */
public class ValidateEmailExample {
    private static Pattern pattern;
    private Matcher matcher;

    /*
     * ^: Bắt đầu chuỗi String
     * [A-Za-z0-9]+: Email address phải bắt đầu bằng A-Z
     * hoặc a-z hoặc 0-9 và có ít nhất 1 ký tự
     * [A-Za-z0-9]*@: giống như trên và kết thúc bằng
     * một ký hiệu @
     * (\\.[A-Za-z0-9]+): Theo sau là domain (.com, .net)
     * $: Kết thúc chuỗi
     */

    private static final String EMAIL_REGEX = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";

    public ValidateEmailExample() {
        pattern = Pattern.compile(EMAIL_REGEX);
    }

    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
