public class Main {
    static int n = 4;

    public static void main(String[] args) {
        int[][] arr = new int[n][n];
        solve(arr, 0);
    }

    static void solve(int[][] arr, int row) {
        if (row == n) {
            print(arr);
            System.out.println();
            return;
        }

        for (int col = 0; col < n; col++) {
            if (safe(arr, row, col)) {
                arr[row][col] = 1;
                solve(arr, row + 1);
                arr[row][col] = 0;
            }
        }
    }

    static boolean safe(int[][] arr, int row, int col) {
        for (int r = 0; r < row; r++) {
            if (arr[r][col] == 1) {
                return false;
            }
        }
        for (int r = row - 1, c = col - 1; r >= 0 && c >= 0; r--, c--) {
            if (arr[r][c] == 1) {
                return false;
            }
        }
        for (int r = row - 1, c = col + 1; r >= 0 && c < n; r--, c++) {
            if (arr[r][c] == 1) {
                return false;
            }
        }

        return true;
    }

    static void print(int[][] arr) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
