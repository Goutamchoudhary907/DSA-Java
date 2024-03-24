//Return index of target in rotated sorted array with duplicates present 

public class IndexInDuplicate {
    static int target(int arr[], int target) {
    int n = arr.length;
    int st = 0, end = n - 1;

    while (st <= end) {
        int mid = st + (end - st) / 2;
        if (arr[mid] == target) {
            return mid;
        } else if(arr[st] ==arr[mid] && arr[end] ==arr[mid]) {
            st++;
            end--;
        } else if (arr[mid] <= arr[end]) {                    
            if (target > arr[mid] && target <= arr[end]) {
                st = mid + 1;
            } else {
                end = mid - 1;
            }
        } else {                                           
            if (target >= arr[st] && target < arr[mid]) {
                end = mid - 1;
            } else {
                st = mid + 1;
            } 
        }
    }
    return -1;
}

static int findFirstOccurrence(int arr[], int target) {                // for finding first occurence of target 
    int n = arr.length;
    int st = 0, end = n - 1;

    while (st <= end) {
        int mid = st + (end - st) / 2;

        if (arr[mid] == target) {
            // Check if this is the first occurrence
            if (mid == 0 || arr[mid - 1] != target) {
                return mid;
            } else {
                // Move left to find the first occurrence
                end = mid - 1;
            }
        } else if (arr[st] == arr[mid] && arr[end] == arr[mid]) {
            st++;
            end--;
        } else if (arr[mid] <= arr[end]) {
            if (target > arr[mid] && target <= arr[end]) {
                st = mid + 1;
            } else {
                end = mid - 1;
            }
        } else {
            if (target >= arr[st] && target < arr[mid]) {
                end = mid - 1;
            } else {
                st = mid + 1;
            }
        }
    }
    return -1; // Target not found
}
public static void main(String[] args) {
    int arr[]={1,1,1,2,2,3,1};
    int target=1;
    System.out.println(target(arr, target));
    System.out.println(findFirstOccurrence(arr, target));
}
}
