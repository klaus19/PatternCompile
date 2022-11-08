import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GFG {

    String Reg = ".*www.*";

    // creare the string
    // in which you want to search
    String actualString
            = "www.geeksforgeeks.org";

    // compile the regex to create pattern
    // using compile() method

    Pattern pt = Pattern.compile(Reg);

    // get a matcher object from pattern
    Matcher matcher = pt.matcher(actualString);

    // check whether Regex string is
    // found in actualString or not
    boolean matches = matcher.matches();
   
}
