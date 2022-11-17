package by.step.teach_java.home_work.hw_4_string;

public class Pr2_2 {

        public static void main(String[] args) {
            Pr2_2 pr2_2 = new Pr2_2();

            for (int i = 0; i < 5; i++) {
                pr2_2.coinflip();
            }
        }

        private int getRandomNumber(int from, int till) {
            return (int) ( from + Math.random() * till);
        }

        public void coinflip() {
            if (getRandomNumber(1, 100) <= 50) {
                System.out.println("Tails");
            } else {
                System.out.println("Heads");
            }
        }
}


