import java.util.Scanner;

public class Tugas1_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nilai N =  ");
        int N = input.nextInt();
        if (N < 3){
            System.out.println("Nilai Anda Kurang Dari - 3 ");
        } else {
            for(int i = 0; i < N ; i++){
                for(int j = 0; j < N; j++){
                    if (i == 0 || i == N - 1 || j == 0 || j == N - 1){
                        System.out.print(N + " ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        }
    }
}
