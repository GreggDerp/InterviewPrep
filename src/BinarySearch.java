import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = new int[] {1,4,8,12,34,50};
        int[] sortedArray = Arrays.stream(arr).sorted().toArray();
        System.out.println(binarySearch(2, arr, 0, arr.length));
        System.out.println(binarySearch(50, arr, 0, arr.length));
    }

    public static String binarySearch(int target, int[] arr, int left, int right) {
        if ( right >= left) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                return target + " found in array";
            }
            if (arr[mid] < target) {
                left = mid + 1;
                return binarySearch(target, arr, left, right);
            }
            if (arr[mid] > target) {
                right = mid - 1;
                return binarySearch(target, arr, left, right);
            }
        }
        return target + " not found in array";
    }
}
