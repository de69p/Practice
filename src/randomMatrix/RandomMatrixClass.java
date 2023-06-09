package randomMatrix;

import java.util.Random;

/**
 * randomMatrix.RandomMatrixClass
 * <p>
 * Description goes here.
 * <p>
 * Created by arsendeputat on 07.06.2023.
 */
public class RandomMatrixClass {
    public int[][] generateRandomMatrix(int rows, int cols) {
        Random random = new Random();
        int[][] matrix = new int[rows][];

        int min = 1; // Мінімальне значення елемента матриці

        for (int i = 0; i < rows; i++) {
            // Кількість елементів у рядку збільшується з кожним наступним рядком
            int numElements = cols - i;

            matrix[i] = new int[numElements];

            for (int j = 0; j < numElements; j++) {
                // Генеруємо випадкове значення від min до min + numElements
                matrix[i][j] = random.nextInt(numElements) + min;
            }
        }

        return matrix;
    }
}
