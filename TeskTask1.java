import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TeskTask1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String firstLine = getString(input);
        String[] elements = getArrayOfStrings(input);

        String[] elementesOutput = getNewArrayOfStrings(firstLine, elements);
        System.out.println("Новый массив: \n" + Arrays.toString(elementesOutput));


    }

    public static String getString(Scanner input) {
        String firstLine;
        Pattern pattern01 = Pattern.compile("[01]{9}");
        Matcher matcher;

        do {
            System.out.println("Введите строку длиной 9 символов, состоящая из нулей и единиц, например: “010101010”");
            firstLine = input.nextLine();
            matcher = pattern01.matcher(firstLine);
        } while (!matcher.matches());
        return firstLine;
    }

    public static String[] getArrayOfStrings(Scanner input) {
        String secondLine;
        String[] elements;

        do {
            System.out.println("Введите 9 слов через пробел:");
            secondLine = input.nextLine();
            elements = secondLine.split("\\s+");
        } while (!(elements.length == 9));
        return elements;
    }

    public static String[] getNewArrayOfStrings(String firstLine, String[] elements) {
        int lengthOfNewArrayOfString = getLengthOfNewArrayOfStrings(firstLine);
        String[] elementesOutput = new String[lengthOfNewArrayOfString];
        int index = 0;
        for (int i = 0; i < firstLine.length(); i++) {
            if (firstLine.charAt(i) == ('1')) {
                elementesOutput[index] = elements[i];
                index++;
            }
        }
        return elementesOutput;
    }

    public static int getLengthOfNewArrayOfStrings(String firstLine) {
        int length = 0;
        for (int i = 0; i < firstLine.length(); i++) {
            if (firstLine.charAt(i)=='1') {
                length++;
            }
        }
        return length;
    }


}
