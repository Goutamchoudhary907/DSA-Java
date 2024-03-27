public class LeftAndRightMostIndex {
    static class pair {
        long first, second;

        public pair(long first, long second) {
            this.first = first;
            this.second = second;
        }
    }

    public static pair indexes(long v[], long x) {
        // Your code goes here

        long first = binarySearch(v, x, true);
        long last = binarySearch(v, x, false);
        pair p = new pair(first, last);
        return p;
    }

    static long binarySearch(long v[], long x, boolean isFirst) {
        long ans = -1;
        long n = v.length;
        long start = 0;
        long end = n - 1;
        while (start <= end) {
            long mid = start + (end - start) / 2;
            if (v[(int) mid] == x) {
                ans = mid;
                if (isFirst) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else if (v[(int) mid] < x) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        // int N = 9;
        long v[] = {1, 3, 5, 5, 5, 5, 67, 123, 125};
        long X = 5;
        pair result = indexes(v, X);
        System.out.println("Leftmost index: " + result.first);
        System.out.println("Rightmost index: " + result.second);
    }
}
