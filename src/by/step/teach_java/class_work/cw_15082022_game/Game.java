package by.step.teach_java.class_work.cw_15082022_game;

public class Game {
    public static void main(String[] args) {
        Game game = new Game();
        Map map = new Map();
        Controller control = new Controller();
        game.createMap(map);
        game.createStone(map);
        map.addPlayer(9, 0);
        map.showMap(map.map);

        while (map.x != 0 || map.y != 9) {
            control.movePerson(map);
        }
    }

    public void createMap(Map map) {
        map.map = new char[10][10];
        for (int i = 0; i < map.map.length; i++) {
            for (int j = 0; j < map.map[i].length; j++) {
                map.map[i][j] = '_';
            }
        }
    }

    public void createStone(Map map) {
        for (int i = 0; i < map.map.length; i++) {
            for (int j = 0; j < map.map[i].length; j++) {
                map.map[i][j] = (char) (Math.random() * 100);
                if (map.map[i][j] >= 90) {
                    map.map[i][j] = 'X';
                } else
                    map.map[i][j] = '_';
            }
        }
    }
}
