import java.util.Scanner;

public class Cubes {
    public static int sumOfCubes(int M, int N) {
        if(M > N) {
            return 0;
        }
        int sum = 0;
        for(int i=M; i<=N; i++) {
            sum += Math.pow(i, 3);
        }

        return sum;
    }
    public static void main(String[] args) {
        int M = new Scanner(System.in).nextInt();
        
        int N = new Scanner(System.in).nextInt();
        System.out.println(sumOfCubes(M, N));
        
    }
    
}
