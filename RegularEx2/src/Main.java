import java.util.regex.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String[] data = {"bat", "baby", "bonus", "c", "cA", "ca", "co", "c.", "c0", "c#",
                "car", "combat", "count", "date", "disc"};

        String[] pattern = {".*", "c[a-z]*", "c[a-z]", "c[a-zA-Z]", "c[a-zA-Z0-9]",
                "c.", "c.*", "c\\.", "c\\w", "c\\d",
                "c.*t", "[b|c].*", ".*a.*", ".*a.+", "[b|c].{2}"};

        for (int x = 0; x < pattern.length; x++) {
            Pattern p = Pattern.compile(pattern[x]);
            System.out.print("Pattern : " + pattern[x] + " > ");
            for (int i = 0; i < data.length; i++) {
                Matcher m = p.matcher(data[i]);
                if (m.matches())
                    System.out.print(data[i] + ", ");
            }
            System.out.println();
        }
    }
}

/*
Pattern : .* > bat, baby, bonus, c, cA, ca, co, c., c0, c#, car, combat, count, date, disc,
        Pattern : c[a-z]* > c, ca, co, car, combat, count,
        Pattern : c[a-z] > ca, co,
        Pattern : c[a-zA-Z] > cA, ca, co,
        Pattern : c[a-zA-Z0-9] > cA, ca, co, c0,
        Pattern : c. > cA, ca, co, c., c0, c#,
        Pattern : c.* > c, cA, ca, co, c., c0, c#, car, combat, count,
        Pattern : c\. > c.,
        Pattern : c\w > cA, ca, co, c0,
        Pattern : c\d > c0,
        Pattern : c.*t > combat, count,
        Pattern : [b|c].* > bat, baby, bonus, c, cA, ca, co, c., c0, c#, car, combat, count,
        Pattern : .*a.* > bat, baby, ca, car, combat, date,
        Pattern : .*a.+ > bat, baby, car, combat, date,
        Pattern : [b|c].{2} > bat, car,
*/
