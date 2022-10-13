package by.step.teach_java.class_work.cw_15082022;


public class Map {
    public char[][] map;
    int x = 9;
    int y = 0;

    public void showMap(char[][] map) {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void addPlayer(int indexX, int indexY) {
        map[indexX][indexY] = 'P';
    }

    public void goToUp() {
        if (x - 1 < 0 || map[x - 1][y] == 'X') {
            System.out.println("Сюда ходить нельзя!");
        } else {
            map[x - 1][y] = 'P';
            map[x][y] = '.';
            x--;
        }

    }

    public void goToDown() {
        if (x - 1 > 9 || map[x + 1][y] == 'X') {
            System.out.println("Сюда ходить нельзя!");
        } else {
            map[x - 1][y] = 'P';
            map[x][y] = '.';
            x++;
        }
    }

    public void goToLeft() {
        if (y - 1 < 0 || map[x][y - 1] == 'X') {
            System.out.println("Сюда ходить нельзя!");
        } else {
            map[x][y - 1] = 'P';
            map[x][y] = '.';
            y--;
        }
    }

    public void goToRight() {
        if (y + 1 > 9 || map[x][y + 1] == 'X') {
            System.out.println("Сюда ходить нельзя!");
        } else {
            map[x][y + 1] = 'P';
            map[x][y] = '.';
            y++;
        }
    }
}