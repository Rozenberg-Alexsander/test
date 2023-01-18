public class Main {
    public static void main(String[] args) {
        Knight knight = new Knight();
        knight.goAndSaveThePrincess();
    }
}

class Knight {
    private String name = "Sir Thanks-A-Lot";
    private String weapon = "Long Sword";
    private Boolean isGoingToSavePrincess = true;

    public static void main(String[] args) {

    }

    public void goAndSaveThePrincess() {
        sharpenBlade();
        getFood();
        assembleTeam();
        System.out.println("Да иду уже...");
        System.out.println("Да иду уже...");
        System.out.println("Да иду уже...");
    }

    public void sharpenBlade() {
        System.out.println("Точим мечь");
    }

    public void getFood() {
        System.out.println("Собираем консервы");
    }

    public void assembleTeam() {

        System.out.println("Будим оруженосца");
    }
}
