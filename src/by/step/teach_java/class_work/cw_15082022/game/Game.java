package by.step.teach_java.class_work.cw_15082022.game;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Game {
    public static void main(String[] args) {
        Game game = new Game();
        game.Map map = new game.Map();
        game.Controller control = new game.Controller();
        game.createMap(map);
        game.createStone(map);
        map.addPlayer(9, 0);
        map.showMap(map.map);

        while (map.x != 0 || map.y != 9) {
            control.movePerson(map);
        }
    }

    public void createMap(game.Map map) {
        map.map = new char[10][10];
        for (int i = 0; i < map.map.length; i++) {
            for (int j = 0; j < map.map[i].length; j++) {
                map.map[i][j] = '_';
            }
        }
    }

    public void createStone(game.Map map) {
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
