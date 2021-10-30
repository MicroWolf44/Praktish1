import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner vvod = new Scanner(System.in); //vvod s klaviaturi
        Menu menu = new Menu(); //Menu prilozheniya
        int numberMenu; // Nomer menu

        /**
         * Rabota s prilozheiem po sredstvam DO/WHILE i nomerami menu
         */
        do {
            menu.menu();
            numberMenu = vvod.nextInt();

            switch (numberMenu) {

                case 1:
                    System.out.println("Vvedite znachenie");
                    break;
                case 0:
                    System.out.println("Vsego horoshego");
                    break;
            }
        }
        while (numberMenu != 0);
    }
}
