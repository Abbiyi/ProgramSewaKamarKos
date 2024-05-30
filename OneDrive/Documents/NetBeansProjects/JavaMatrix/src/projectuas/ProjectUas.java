/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectuas;

/**
 *
 * @author Abbiyi Qobus Syamsid
 */
import java.util.Scanner;

public class ProjectUas {
    
    public static void main(String[] args) {
        try {  
            int[][] matrix1 = inputMatrix("Masukkan matrix pertama (3x3):");

            int[][] matrix2 = inputMatrix("Masukkan matrix kedua (3x3):");

            int[][] resultMatrix = multiplyMatrix(matrix1, matrix2);

            System.out.println("\nHasil perkalian matrix:");
            printMatrix(resultMatrix);
        } catch (NumberFormatException e) {
            System.out.println("Error: Matrix hanya boleh berisi angka.");
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }
    }

    private static int[][] inputMatrix(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);

        int[][] matrix = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Baris " + (i + 1) + ", Kolom " + (j + 1) + ": ");
                matrix[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }

        return matrix;
    }

    private static int[][] multiplyMatrix(int[][] matrix1, int[][] matrix2) {
        int[][] resultMatrix = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    resultMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        return resultMatrix;
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
    
}