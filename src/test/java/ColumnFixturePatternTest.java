import java.util.regex.Pattern;

/**
 * author yg
 * description
 * date 2020/12/3
 */
public class ColumnFixturePatternTest {

    private static Pattern regexMethodPattern = Pattern.compile("(.+)(?:\\?\\?|!!)");
    //greedy match, only the last one match () or ? or ! is ok
    private static Pattern methodPattern = Pattern.compile("(.+)(?:\\(\\)|\\?|!)");
    private static Pattern fieldPattern = Pattern.compile("=?([^=]+)=?");
    //
    private static final Pattern disgracefulNamePattern = Pattern
            .compile("\\w(?:[.]|\\w)*[^.]");

    public static void main(String[] args) {
        System.err.println(Pattern.matches("\\d+\\.\\d", "5.0"));
        System.err.println(regexMethodPattern.matcher("any??").matches());
        System.err.println(regexMethodPattern.matcher("any!!").matches());
        System.err.println(methodPattern.matcher("any()?").matches());
        System.err.println(methodPattern.matcher("any()!!").matches());
        System.err.println(methodPattern.matcher("any()!").matches());
        System.err.println(methodPattern.matcher("any?").matches());
        System.err.println(fieldPattern.matcher("=any=").matches());
        System.err.println(fieldPattern.matcher("=any").matches());
        System.err.println(fieldPattern.matcher("any=").matches());
        System.err.println(disgracefulNamePattern.matcher("abc...ab").matches());
        System.err.println(disgracefulNamePattern.matcher("abcab").matches());
        System.err.println(disgracefulNamePattern.matcher("=abcab=").matches());
    }
}
