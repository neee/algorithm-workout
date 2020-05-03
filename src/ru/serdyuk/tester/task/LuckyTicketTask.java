package ru.serdyuk.tester.task;

import java.util.List;

public class LuckyTicketTask implements Task {

    @Override
    public String run(List<String> data) {
        int num = Integer.parseInt(data.get(0));
        if (num == 1) {
            return "10";
        }
        if (num == 2) {
            return "670";
        }
        if (num == 3) {
            return "55252";
        }
        int rows = num * 9 + 1;
        long[][] matrix = new long[num * 2][rows];
        for (int i = 0; i < num * 2; i++) {
            for (int j = 0; j < rows; j++) {
                //set value for first column from 0 to 9
                if (i == 0) {
                    if (j < 10) {
                        matrix[i][j] = 1;
                        continue;
                    } else {
                        break;
                    }
                }
                matrix[i][j] = calculateFieldValue(matrix, i - 1, j);
            }
        }
        return "" + matrix[num * 2 - 1][rows - 1];
    }

    private static long calculateFieldValue(long[][] m, int c, int r) {
        long result = 0;
        for (int i = Math.max(r - 9, 0); i <= r; i++) {
            result += m[c][i];
        }
        return result;
    }
}
