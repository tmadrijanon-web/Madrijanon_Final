
/**
 * Write a description of class Madrijanon_2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class Madrijanon_2
{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int[] arr = {1, 7, 3, 7, 4, 7, 8, 9, 7, 2};
int count = 0;

for (int i = 0; i < arr.length; i++) {
    if (arr[i] == 7) count++;
}
System.out.println("7 appears " + count + " times.");
}
}