
import java.util.Scanner;

public class Task1x_PrintMatrix_b {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[][] arr = new int[N][N];

        int counter = 1;

        for (int row = 0; row < N; row++) {
            for (int col = 0; col < N; col++) {
                arr[row][col] = counter;
                counter++;
            }
        }

        int count = N - 1;
        for (int row = 0; row < N; row++) {

            for (int col = 0; col < N; col++) {
                if (col % 2 == 0) {
                    System.out.print(arr[col][row] + "  ");
                } else {
                    System.out.print(arr[col][count] + "  ");
                }
            }
            count -= 1;
            System.out.println();
        }
    }
}
