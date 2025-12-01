
/**
 * Write a description of class twetgyt here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
// 1
import java.util.Scanner;
// // public class twetgyt
// // {
    // // public static void main (String[] args){
    // // Scanner sc = new Scanner(System.in);
    // // int num;
    // // do {
    // // System.out.print("Enter a number between 1 and 100: ");
        // // num = sc.nextInt();
    // // } while (num < 1 || num > 100);
    // // System.out.println("You entered: " + num);
    // // }
// // }

// 2
public class twetgyt{
    public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
              int[] numbers = new int[10];
              int count = 0;
              
              for (int i = 0; i < 10; i++){
                  System.out.print("Enter number " + (i + 1)+": ");
                  numbers[i] = sc.nextInt();
                  
                  for(int num : numbers){
                      if(num == 7){
                        count++;
                      }
                  }
              }
              System.out.print("The number 7 appears " + count + "times. ");
       }
    }
    
// 3
// // public class StarTriangle {
    // // public static void main(String[] args) {
        // // for (int i = 1; i <= 5; i++) {
            // // for (int j = 1; j <= i; j++) {
                // // System.out.print("*");
            // // }
            // // System.out.println();
        // // }
    // // }
// // }

// 4
// // public class MinMaxInArray {
    // // public static void main(String[] args) {
        // // int[] arr = {4, 2, 9, 1, 5};
        // // int min = arr[0], max = arr[0];
        // // for (int n : arr) {
            // // if (n < min) min = n;
            // // if (n > max) max = n;
        // // }
        // // System.out.println("Min: " + min + ", Max: " + max);
    // // }
// // }

// 5
// // public class StopLoopEarly {
    // // public static void main(String[] args) {
        // // int[] arr = {2, 5, 8, 7, 3};
        // // for (int n : arr) {
            // // if (n == 7) {
                // // System.out.println("Found 7!");
                // // break;
            // // }
        // // }
    // // }
// // }


// 6
// public class AverageOfOddNumbers {
    // public static void main(String[] args) {
        // int[] arr = {1, 2, 3, 4, 5};
        // int sum = 0, count = 0;
        // for (int n : arr) {
            // if (n % 2 != 0) {
                // sum += n;
                // count++;
            // }
        // }
        // double avg = count == 0 ? 0 : (double) sum / count;
        // System.out.println("Average of odd numbers: " + avg);
    // }
// }
  

// 7
// import java.util.Arrays;

// public class ConvertToPositive {
    // public static void main(String[] args) {
        // int[] arr = {-1, 2, -3, 4};
        // for (int i = 0; i < arr.length; i++) {
            // arr[i] = Math.abs(arr[i]);
        // }
        // System.out.println(Arrays.toString(arr));
    // }
// }


// 8
// import java.util.Arrays;

// public class CopyArray {
    // public static void main(String[] args) {
        // int[] A = {1, 2, 3};
        // int[] B = new int[A.length];
        // for (int i = 0; i < A.length; i++) {
            // B[i] = A[i];
        // }
        // System.out.println(Arrays.toString(B));
    // }
// }


// 9
// import java.util.Scanner;

// public class SumUntilZero {
    // public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int sum = 0, num;
        // do {
            // System.out.print("Enter a number (0 to stop): ");
            // num = sc.nextInt();
            // sum += num;
        // } while (num != 0);
        // System.out.println("Sum: " + sum);
    // }
// }


// 10
// public class FirstEvenIndex {
    // public static void main(String[] args) {
        // int[] arr = {1, 3, 5, 8, 2};
        // int index = -1;
        // for (int i = 0; i < arr.length; i++) {
            // if (arr[i] % 2 == 0) {
                // index = i;
                // break;
            // }
        // }
        // System.out.println("First even number index: " + index);
    // }
// }


// 11
// public class EvenIndexElements {
    // public static void main(String[] args) {
        // int[] arr = {10, 20, 30, 40, 50};
        // for (int i = 0; i < arr.length; i += 2) {
            // System.out.println(arr[i]);
        // }
    // }
// }


// 12
// public class ValueAtLeastThreeTimes {
    // public static void main(String[] args) {
        // int[] arr = {1, 2, 3, 2, 2, 4};
        // int target = 2, count = 0;
        // for (int n : arr) {
            // if (n == target) count++;
        // }
        // System.out.println(count >= 3 ? "Yes" : "No");
    // }
// }



// 13
// public class PassFailCount {
    // public static void main(String[] args) {
        // int[] grades = {80, 60, 90, 70, 85};
        // int pass = 0, fail = 0;
        // for (int g : grades) {
            // if (g >= 75) pass++;
            // else fail++;
        // }
        // System.out.println("Passed: " + pass + ", Failed: " + fail);
    // }
// }



// 14
// public class ReverseArray {
    // public static void main(String[] args) {
        // int[] arr = {1, 2, 3, 4, 5};
        // for (int i = arr.length - 1; i >= 0; i--) {
            // System.out.println(arr[i]);
        // }
    // }
// }


// 15
// import java.util.Scanner;

// public class NumbersGreaterThan50 {
    // public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int[] arr = new int[5];
        // for (int i = 0; i < 5; i++) {
            // System.out.print("Enter number " + (i + 1) + ": ");
            // arr[i] = sc.nextInt();
        // }
        // System.out.println("Numbers greater than 50:");
        // for (int n : arr) {
            // if (n > 50) System.out.println(n);
        // }
    // }
// }


// 16
// import java.util.Scanner;

// public class CountDigits {
    // public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a number: ");
        // int num = sc.nextInt();
        // int count = 0;
        // int temp = Math.abs(num);
        // if (temp == 0) count = 1;
        // while (temp > 0) {
            // temp /= 10;
            // count++;
        // }
        // System.out.println("Digits: " + count);
    // }
// }


// 17
// public class SecondHighest {
    // public static void main(String[] args) {
        // int[] arr = {5, 8, 2, 9, 7};
        // int max = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        // for (int n : arr) {
            // if (n > max) {
                // second = max;
                // max = n;
            // } else if (n > second && n != max) {
                // second = n;
            // }
        // }
        // System.out.println("Second highest: " + second);
    // }
// }


// 18
// public class CheckDuplicates {
    // public static void main(String[] args) {
        // int[] arr = {1, 2, 3, 2};
        // boolean duplicate = false;
        // for (int i = 0; i < arr.length; i++) {
            // for (int j = i + 1; j < arr.length; j++) {
                // if (arr[i] == arr[j]) {
                    // duplicate = true;
                    // break;
                // }
            // }
            // if (duplicate) break;
        // }
        // System.out.println("Contains duplicates? " + duplicate);
    // }
// }


// 19
// public class StudentGrades {
    // public static void main(String[] args) {
        // String[] names = {"Alice", "Bob", "Charlie"};
        // int[] grades = {85, 70, 90};
        // for (int i = 0; i < names.length; i++) {
            // System.out.println(names[i] + ": " + grades[i]);
        // }
    // }
// }


// 20
// public class EvenNumbersGreaterThan20 {
    // public static void main(String[] args) {
        // int[] arr = {10, 22, 33, 24, 18, 40};
        // for (int n : arr) {
            // if (n % 2 == 0 && n > 20) System.out.println(n);
        // }
    // }
// }



