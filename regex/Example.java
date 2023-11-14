package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example {
    private static Pattern pattern;
    private static Matcher matcher;

    private static final String STUDENT_NAME = "^[A-Za-z]+(?:\\s[A-Za-z]+)?$";
    private static final String STUDENT_ADDRESS = "^[A-Za-z0-9]+(?:\\s[A-Za-z0-9]+)?$";
    private static final String STUDENT_GENDER = "^(Nam|Nữ|nam|nữ)$";

    public static boolean checkStudentName(String studentName) {
        pattern = Pattern.compile(STUDENT_NAME);
        matcher = pattern.matcher(studentName);
        return matcher.matches();
    }

    public static boolean checkStudentAddress(String studentAddress) {
        pattern = Pattern.compile(STUDENT_ADDRESS);
        matcher = pattern.matcher(studentAddress);
        return matcher.matches();
    }

    public static boolean checkStudentGender(String studentGender) {
        pattern = Pattern.compile(STUDENT_GENDER);
        matcher = pattern.matcher(studentGender);
        return matcher.matches();
    }
}
