package game;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Controller {
    int direction = 0;
    public int getDirection() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            direction = Integer.parseInt(br.readLine());
        } catch (Exception ex) {
            System.out.println("Mistake of input");
        }
        return direction;
    }

    public void movePerson(Map map) {
        int move = getDirection();
        switch (move) {
            case (2): {
                map.goToDown();
                map.showMap(map.map);
            }
            break;

            case (4): {
                map.goToLeft();
                map.showMap(map.map);
            }
            break;

            case (6): {
                map.goToRight();
                map.showMap(map.map);
            }
            break;

            case (8): {
                map.goToUp();
                map.showMap(map.map);
            }
            break;

            default: {
                System.out.println("Incorrect input");
            }
        }

        getDirection();
    }


}
