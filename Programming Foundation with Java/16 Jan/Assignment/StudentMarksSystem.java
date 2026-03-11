import java.util.*;

public class StudentMarksSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int students = sc.nextInt();
        int subjects = sc.nextInt();
        int[][] marks = new int[students][subjects];
        inputMarks(marks, sc);
        displayMarks(marks);
        calculateTotals(marks);
        calculateAverage(marks);
        highestScore(marks);
        lowestScore(marks);
    }

    static void inputMarks(int[][] marks, Scanner sc) {
        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks[0].length; j++) {
                marks[i][j] = sc.nextInt();
            }
        }
    }

    static void displayMarks(int[][] marks) {
        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks[0].length; j++) {
                System.out.print(marks[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void calculateTotals(int[][] marks) {
        for (int i = 0; i < marks.length; i++) {
            int total = 0;
            for (int j = 0; j < marks[0].length; j++) {
                total += marks[i][j];
            }
            System.out.println(total);
        }
    }

    static void calculateAverage(int[][] marks) {
        for (int i = 0; i < marks.length; i++) {
            int total = 0;
            for (int j = 0; j < marks[0].length; j++) {
                total += marks[i][j];
            }
            double avg = (double) total / marks[0].length;
            System.out.println(avg);
        }
    }

    static void highestScore(int[][] marks) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks[0].length; j++) {
                if (marks[i][j] > max) {
                    max = marks[i][j];
                }
            }
        }
        System.out.println(max);
    }

    static void lowestScore(int[][] marks) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks[0].length; j++) {
                if (marks[i][j] < min) {
                    min = marks[i][j];
                }
            }
        }
        System.out.println(min);
    }
}