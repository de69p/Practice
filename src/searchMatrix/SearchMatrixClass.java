package searchMatrix;

import java.util.Arrays;

/**
 * searchmatrix.SearchMatrixClass
 * <p>
 * Description goes here.
 * <p>
 * Created by arsendeputat on 07.06.2023.
 */
public class SearchMatrixClass {
    public boolean searchMatrix1(int[][] matrix, int target) {
        for (int[] row : matrix) {
            int n = row.length - 1;
            if (target <= row[n]) {
                int start = 0;
                int end = n;
                while (start <= end) {
                    int mid = start + (end - start) / 2;
                    if(row[mid] == target) {
                        return true;
                    } else if (row[mid] < target) {
                        start = mid + 1;
                    } else {
                        end = mid - 1;
                    }
                }
            }
        }
        return false;
    }

    // Stream

    public boolean searchMatrix2(int[][] matrix, int target) {
        return Arrays.stream(matrix)
                .filter(row -> target <= row[row.length - 1])
                .flatMapToInt(Arrays::stream)
                .anyMatch(num -> num == target);
    }

    // Lambda expression

    public boolean searchMatrix3(int[][] matrix, int target) {
        return Arrays.stream(matrix)
                .anyMatch(row -> {
                    int n = row.length - 1;
                    if (target <= row[n]) {
                        int start = 0;
                        int end = n;
                        while (start <= end) {
                            int mid = start + (end - start) / 2;
                            if (row[mid] == target) {
                                return true;
                            } else if (row[mid] < target) {
                                start = mid + 1;
                            } else {
                                end = mid - 1;
                            }
                        }
                    }
                    return false;
                });
    }
}

