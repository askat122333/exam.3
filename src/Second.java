import java.util.*;

public class Second {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String textNumber = scanner.nextLine();
        char[] chars = textNumber.toCharArray();
        Set<Character> characters = new HashSet<>();
        for (int i = 0; i < chars.length; i++) {
               characters.add(chars[i]);
        }
        System.out.println(characters);

    }
}
