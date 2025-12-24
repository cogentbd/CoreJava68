package test;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class CheckSudokuSolution {

    static boolean getStatus() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a value");
        if (s.nextInt() > 10) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(getStatus() ? "hello" : "hi");

        if (6 < 5) {
            System.out.println("hello");
        }
        System.out.println("h8");
        System.out.println("g7g");
        System.out.println("g54");

        Set s = new HashSet();

        //System.out.println((int) (Math.random()*9));
        s.add((int) (Math.random() * 9));
        s.add((int) (Math.random() * 9));
        s.add((int) (Math.random() * 9));
        s.add((int) (Math.random() * 9));
        s.add((int) (Math.random() * 9));
        s.add((int) (Math.random() * 9));
        s.add((int) (Math.random() * 9));
        s.add((int) (Math.random() * 9));
        s.add((int) (Math.random() * 9));
        s.add((int) (Math.random() * 9));
        s.add((int) (Math.random() * 9));
        s.add((int) (Math.random() * 9));
        s.add((int) (Math.random() * 9));
        s.add((int) (Math.random() * 9));
        s.add((int) (Math.random() * 9));
        s.add((int) (Math.random() * 9));
        s.add((int) (Math.random() * 9));
        s.add((int) (Math.random() * 9));

        Object[] o = s.toArray();
        for (int i = 0; i < 8; i++) {
            System.out.println(o[i]);
        }

        int[][] grid = readASolution();

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                System.out.print(grid[i][j] + " ");
            }
        }

    }

    public static int[][] readASolution() {
// Create a Scanner
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a Sudoku puzzle solution:");
        int[][] grid = new int[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                for (int k = 0; k < 81; k++) {
                    grid[i][j] = (int) Math.random();
                }
            }
        }

        return grid;
    }
}
