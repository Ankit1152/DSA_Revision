package Arrays;

import java.util.Arrays;

public class InverseArray {
    public static int[] inverse(int a[]) {
        int b[] = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            int val = a[i];
            b[val] = i;
        }

        return b;
    }

    public static void main(String[] args) {
        int a[] = { 2, 3, 1, 0, 4 };
        System.out.println(Arrays.toString(a));

        int b[] = inverse(a);
        System.out.println(Arrays.toString(b));
    }
}
