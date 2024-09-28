import java.util.Scanner;

public class CountLetterA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma string: ");
        String input = scanner.nextLine();
        scanner.close();

        int count = countA(input);
        System.out.println("A letra 'a' aparece " + count + " vezes na string.");
    }

    public static int countA(String str) {
        int count = 0;
        for (char c : str.toLowerCase().toCharArray()) {
            if (c == 'a') {
                count++;
            }
        }
        return count;
    }
}
