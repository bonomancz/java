
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main {
    public static void main(String[] args){
        String input = "3;5;15;2;false;false;2024-05-18T15:40:06;2024-05-18T15:45:26";
//        String input = "2;3;15;2;false;false;2024-05-18T15:40:06;null";

        if (isValidOrderRecord(input)) {
            System.out.println("Record OK.");
        } else {
            System.out.println("Record not valid.");
        }
    }

    private static boolean isValidOrderRecord(String input){
        boolean isValidOrderRecord = false;
        String regex = "^\\d+;\\d+;\\d+;\\d+;(true|false);(true|false);\\d{4}-\\d{2}-\\d{2}T\\d{2}:\\d{2}:\\d{2};(\\d{4}-\\d{2}-\\d{2}T\\d{2}:\\d{2}:\\d{2}|null)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        if(matcher.matches()){
            isValidOrderRecord = true;
        }
        return isValidOrderRecord;
    }
}
