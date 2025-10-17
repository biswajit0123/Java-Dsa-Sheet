public class N_Quene {

    static int count = 0;

    static boolean isSafe(char[][] board, int row, int col) {

        // vertical up
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q')
                return false;
        }
        // diagonal left
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q')
                return false;
        }
        // diagonal right
        for (int i = row - 1, j = col + 1; i >= 0 && j < board[0].length; i--, j++) {
            if (board[i][j] == 'Q')
                return false;
        }

        return true;
    }

    static boolean nquenes(char[][] board, int row) {

        // base case
        if (row == board.length) {
          //  1 all combination
            printQuenes(board);
            System.out.println("----------------chess board-------------");

            //2  no of ways to place
            // count = count + 1;

            //3 solution poosible ? if yes print solution

           // return true;
        }
        // kaam
        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                nquenes(board, row + 1);
                board[row][j] = '.';

                       //added if only in question solution is exists ? type
                // if(nquenes(board, row + 1)){
                //     return true;
                // }
            }

        }
    // return false;
    }

    static void printQuenes(char[][] board) {
        System.out.println("print");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 4;

        char board[][] = new char[n][n];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = '.';
            }
        }
      nquenes(board, 0);
        // System.out.println(count);

        //System.out.println(nquenes(board, 0));
    }
}
