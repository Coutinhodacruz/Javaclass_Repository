package chief;

public class TortoiseAndHareRace {
    public static void main(String[] args) {
        Tortoise tortoise = new Tortoise();
        Hare hare = new Hare();

        System.out.println("BANG !!!!!");
        System.out.println("AND THEY'RE OFF !!!!!");

        while (tortoise.getPosition() < 70 && hare.getPosition() < 70) {
            tortoise.move();
            hare.move();
            displayRaceLine(tortoise, hare);

            if (tortoise.getPosition() == hare.getPosition()) {
                System.out.println("OUCH!!!");
            }
        }


        if (tortoise.getPosition() >= 70 && hare.getPosition() >= 70) {
            System.out.println("It's a tie.");
        } else if (tortoise.getPosition() >= 70) {
            System.out.println("TORTOISE WINS!!! YAY!!!");
        } else if (hare.getPosition() >= 70) {
            System.out.println("Hare wins. Yuch.");
        }
    }

    private static void displayRaceLine(Tortoise tortoise, Hare hare) {
        for (int i = 1; i <= 70; i++) {
            if (i == tortoise.getPosition()) {
                System.out.print(tortoise.toString());
            } else if (i == hare.getPosition()) {
                System.out.print(hare.toString());
            } else {
                System.out.print("_");
            }
        }
        System.out.println();
    }
}