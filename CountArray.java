import java.util.Scanner;

public class CountArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); // Storing the values in the array

        }

        int count = 0;
        int maxSoFar = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > maxSoFar) {
                count++;
                maxSoFar = arr[i];

            }
        }
        System.out.println(count);
    }
}
