package ru.job4j.loop;

public class Board {
    public static void paint(int width, int height) {
        for (int row = 0; row < height; row++) {
            for (int cell = 0; cell < width; cell++) {
                String t = 0 == (row + cell) % 2 ? "X" : "-";
                System.out.print(t);
            }
            /* добавляем перевод на новую строку. */
            System.out.println();
        }
    }

    public static void main(String[] args) {
        paint(10, 10);
        System.out.println();
        paint(4, 4);
    }
}
