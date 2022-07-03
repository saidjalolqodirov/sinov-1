package uz.qodirov;

/**
 * created by: Qodirov Saidjalol
 * created at: 7/3/2022 10:06 AM
 */

public class Masala1 {

    public static void main(String[] args) {
        int[][] matrix = new int[7][7];
        matrix[4][0] = 1;
        System.out.println(distanceToCenter(matrix));
    }

    public static int distanceToCenter(int[][] matrix) {

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (matrix[i][j] == 1)
                    return Math.abs(3 - i) + Math.abs(3 - j);
            }
        }
        return -1;
    }
}
