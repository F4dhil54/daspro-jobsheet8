import java.util.Scanner;

public class Triangle04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nilai N=  ");
        
        int N = input.nextInt();
        int i = 0;

        while (i <= N) {
            int j = 0;
            while (j < i) {
                System.out.print("*");
                j++;
            }
            System.out.println(" ");
            i++;
        }
    }
}
