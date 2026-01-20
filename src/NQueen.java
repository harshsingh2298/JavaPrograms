class NQueen {

    static final int N = 4;

    // Check if queen can be placed at board[row][col]
    static boolean isSafe(int board[][], int row, int col) {

        // Check left side of row
        for (int i = 0; i < col; i++)
            if (board[row][i] == 1)
                return false;

        // Check upper-left diagonal
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--)
            if (board[i][j] == 1)
                return false;

        // Check lower-left diagonal
        for (int i = row, j = col; i < N && j >= 0; i++, j--)
            if (board[i][j] == 1)
                return false;

        return true;
    }

    // Solve N Queen using backtracking
    static boolean solveNQueen(int board[][], int col) {

        // If all queens are placed
        if (col >= N)
            return true;

        // Try placing queen in each row
        for (int i = 0; i < N; i++) {

            if (isSafe(board, i, col)) {
                board[i][col] = 1;

                if (solveNQueen(board, col + 1))
                    return true;

                // Backtrack
                board[i][col] = 0;
            }
        }
        return false;
    }

    // Print board
    static void printBoard(int board[][]) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
                System.out.print(board[i][j] + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int board[][] = new int[N][N];

        if (!solveNQueen(board, 0))
            System.out.println("No solution exists");
        else
            printBoard(board);
    }
}

