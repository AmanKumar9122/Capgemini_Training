import java.util.Scanner;
public class TicTacToe {
    static char[][] board = new char[3][3];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
        char player = 'X';
        while (gameDone()) {
            printBoard();
            int r = sc.nextInt();
            int c = sc.nextInt();
            if (r < 0 || r >= 3 || c < 0 || c >= 3 || board[r][c] != '-') {
                continue;
            }
            board[r][c] = player;
            if (checkWin(player)) {
                printBoard();
                System.out.println(player);
                break;
            }
            if (isBoardFull()) {
                printBoard();
                System.out.println("Draw");
                break;
            }
            player = (player == 'X') ? 'O' : 'X';
        }
        sc.close();
    }

    static void printBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    static boolean checkWin(char p) {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == p && board[i][1] == p && board[i][2] == p)
                return true;
        }

        for (int j = 0; j < 3; j++) {
            if (board[0][j] == p && board[1][j] == p && board[2][j] == p)
                return true;
        }

        if (board[0][0] == p && board[1][1] == p && board[2][2] == p)
            return true;

        if (board[0][2] == p && board[1][1] == p && board[2][0] == p)
            return true;

        return false;
    }

    static boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-')
                    return false;
            }
        }
        return true;
    }

    // gameDone means if 9 time loops are done then game is done
    static boolean gameDone() {
        int count = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] != '-') {
                    count++;
                }
            }
        }
        return count < 9;
    }
}
