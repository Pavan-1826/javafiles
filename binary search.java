import java.util.*;
public class Main {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int scrh = sc.nextInt();
        int result = binarySearch(arr, scrh);
        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
    public static int binarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == key) {
                return mid;
            } 
            else if (arr[mid] < key) {
                low = mid + 1;
                
            }
            else {
                high = mid - 1;
                
            }
        }
        return -1;
    }
}
