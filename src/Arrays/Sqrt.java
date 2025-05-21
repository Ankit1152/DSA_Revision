package Arrays;

public class Sqrt {
    // Progarm to find the square root / Floor of square root of a number TC :-
    // O(log n)
    public static int sqrt(int n) {
        if (n == 1 || n == 0) {
            return n;
        }
        int low = 1, high = n / 2, res = 0;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (mid * mid == n) {
                return mid;
            } else if (mid * mid < n) {
                low = mid + 1;
                res = mid;
            } else {
                high = mid - 1;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int n = 65;
        System.out.println(sqrt(n));
    }
}
