import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner vvod = new Scanner(System.in); // Vvod s klaviaturi
        Menu menu = new Menu(); // Menu prilozheniya
        int numberMenu; // Nomer menu
        String slovo, perevod; //Peremennie slovarya
        Base base = new Base(); // Podklyuchenie dlya raboti so slovarem

        /**
         * Rabota s prilozheiem
         */
        do {
            menu.menu();
            numberMenu = vvod.nextInt();

            /**
             * Rabota s menu
             */
            switch (numberMenu) {

                case 1: // Dobavlenie novogo znaceniya
                    System.out.println("Vvedite pervoe slovo:");
                    slovo = new Scanner(System.in).nextLine();
                    System.out.println("Vvedite perevod:");
                    perevod = new Scanner(System.in).nextLine();
                    if (slovo.equals("") || perevod.equals("")) {
                        System.out.println("Vi ne vveli odno iz slov");
                        break;
                    }
                    else {
                        base.dobavlenie(slovo, perevod);
                        break;
                    }
                case 0:
                    System.out.println("Vsego horoshego");
                    break;
                default:
                    if (numberMenu != 0){
                        System.out.println("Takogo punkta menu net!");
                        break;
                    }
            }
        }
        while (numberMenu != 0);
    }
}
