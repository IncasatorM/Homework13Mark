import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework13 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] arrayNM = new int[n][m];
        int[][] arrayMN = new int[m][n];

        Random random = new Random();

        for (int i = 0; i < arrayNM[i].length; i++) {
            for (int j = 0; j < arrayNM.length; j++) {
                arrayNM[i][j] = random.nextInt(10);



            }

        }

        for (int i = 0; i < arrayMN[i].length; i++) {
            for (int j = 0; j < arrayMN.length; j++) {
                arrayMN[i][j] = arrayNM[j][i];
            }
            for (int j = 0; j < arrayNM[i].length; j++) {
                System.out.println(Arrays.toString(arrayNM[i]));

            }
            for (int j = 0; j < arrayMN[i].length; j++) {
                System.out.println(Arrays.toString(arrayMN[i]));

            }



        }
    }
}
