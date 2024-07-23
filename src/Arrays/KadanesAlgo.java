package Arrays;

public class KadanesAlgo {

    public static void kadanesAlgo(int num[]) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for (int i=0; i<num.length; i++) {
            cs += num[i];
            ms = Math.max(cs, ms);
            if(cs < 0) {
                cs = 0;
            }
          
        }
        System.out.println(ms);
    }
    public static void main(String[] args) {
        int arr[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        kadanesAlgo(arr);
    }
  
}
