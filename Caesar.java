import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Caesar {

    public static void main(String[] args) {
        System.out.println("Enter decoded text in english(+14 steps): ");
        Scanner scanner = new Scanner(System.in);
        String toCode = scanner.nextLine();
        Pattern pattern = Pattern.compile("^[a-z]*$", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(toCode);
        List<Character> messageWithJustLetters = new ArrayList<Character>();
        if (matcher.find()) {
            for (int i = 0; i < toCode.length(); i++) {
                boolean isletter = Character.isLetter(toCode.charAt(i));
                if (isletter) {
                    char current = Character.toUpperCase(toCode.charAt(i));
                    for(int j = 0; j < 15; j++) { 
                        current++;
                        if (current > 'Z') {
                            current = 'A';
                        }
                    }
                    messageWithJustLetters.add(current);
                }
            }
            for (int i = 0; i < messageWithJustLetters.size(); i++) {
                System.out.print(messageWithJustLetters.get(i));
            }
        } else {
            System.out.println("I said in english...");
        }
        
    }
}