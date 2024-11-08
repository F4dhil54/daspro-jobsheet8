import java.util.Scanner;

public class SquareNoAbsen {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nilai N=  ");
        int N = input.nextInt();

        for(int iOuter = 1; iOuter <= N; iOuter++) {
            for(int j = 1; j <= N; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
