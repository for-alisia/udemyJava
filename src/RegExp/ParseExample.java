package RegExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParseExample {
    public static void main(String[] args) {
        String transcript = """
                Student Number:	1234598872			Grade:		11
                Birthdate:		01/02/2000			Gender:	M
                State ID:		8923827123
                                
                Cumulative GPA (Weighted)		3.82
                Cumulative GPA (Unweighted)	3.46
                """;
        String transcriptRegExp = """
        Student\\sNumber:\\s*(?<studentId>\\d{10})\\s* # student id
        Grade:\\s*(?<studentGrade>[0,1]?\\d)\\b.* # grade
        Birthdate:\\s*(?<birthDay>\\d{2})/(?<birthMonth>\\d{2})/(?<birthYear>\\d{4}).* # birth date
        Gender:\\s*(?<studentGender>[M,F])\\b.* # Gender
        State\\sID:\\s*(?<stateId>\\d{10})\\b.* # State ID
        Cumulative\\sGPA\\s\\(Weighted\\)\\s*(?<wGPA>\\d[.,]\\d{2})\\b.* # weighted GPA
        Cumulative\\sGPA\\s\\(Unweighted\\)\\s*(?<unwGPA>\\d[.,]\\d{2})\\b.* # unweighted GPA
        """;
        Pattern transcriptPat = Pattern.compile(transcriptRegExp, Pattern.DOTALL | Pattern.COMMENTS);
        Matcher transriptMatcher = transcriptPat.matcher(transcript);

        System.out.println(transriptMatcher.matches());

        String studentId = transriptMatcher.group("studentId");
        String studentBirthDay = transriptMatcher.group("birthDay");
        String studentBirthMonth = transriptMatcher.group("birthMonth");
        String studentBirthYear = transriptMatcher.group("birthYear");
        String studentGrade = transriptMatcher.group("studentGrade");
        String studentGender = transriptMatcher.group("studentGender");
        String stateId = transriptMatcher.group("stateId");
        String wGPA = transriptMatcher.group("wGPA");
        String unwGPA = transriptMatcher.group("unwGPA");

        if (transriptMatcher.matches()) {
            System.out.format("""
                    StudentId: %s (stateId: %s)
                    Student Grade: %s (%s)
                    Student Gender: %s
                    Student Grade: %s
                    Born in %s-%s-%s
                    """,
                    studentId, stateId, wGPA, unwGPA, studentGender,
                    studentGrade, studentBirthYear, studentBirthMonth,
                    studentBirthDay);
        }
    }
}
