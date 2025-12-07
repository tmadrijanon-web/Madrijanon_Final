
/**
 * Write a description of class Madrijanon_5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Madrijanon_5
{
 public static void main(String[] args) {

        int[] numbers = {3, 8, 1, 7, 4, 9};
        int target = 7;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                System.out.println("Value found at index: " + i);
                break;
            }
        }
    }
}