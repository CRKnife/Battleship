import java.util.Scanner;

/**
 * @author Neil Murray-Scott
 * @version 1
 * 07/10/2019
 */

/*edit game settins for next new game*/
public class SettingsMenu {

    private Scanner kboard = new Scanner(System.in);

    public void settingsMenu(){

        int menuChoice = 0;
        int setChoice;//

        while(menuChoice != 7) {

            System.out.println(" Setting Menu");
            System.out.println("  1. Board Size");
            System.out.println("  2. Number Corvette");
            System.out.println("  3. Number Frigate");
            System.out.println("  4. Number Submarine");
            System.out.println("  5. Number Battleship");
            System.out.println("  6. Number Carrier");
            System.out.println(" 7. Back");

            menuChoice = kboard.nextInt();

            switch (menuChoice) {
                case 1:
                    System.out.println("");
                    System.out.println("Set board size up to 10");
                    setChoice = kboard.nextInt();
                    Launcher.settings.setBoardSize(setChoice);
                    break;
                case 2:
                    System.out.println("");
                    setChoice = kboard.nextInt();
                    Launcher.settings.setNoCorvette(setChoice);
                    break;
                case 3:
                    System.out.println("");
                    setChoice = kboard.nextInt();
                    Launcher.settings.setNoFrigate(setChoice);
                    break;
                case 4:
                    System.out.println("");
                    setChoice = kboard.nextInt();
                    Launcher.settings.setNoSubmarine(setChoice);
                    break;
                case 5:
                    System.out.println("");
                    setChoice = kboard.nextInt();
                    Launcher.settings.setNoBattleship(setChoice);
                    break;
                case 6:
                    System.out.println("");
                    setChoice = kboard.nextInt();
                    Launcher.settings.setNoCarrier(setChoice);
                    break;
                case 7:
                    Launcher.mainMenu.mainMenu();
                    break;
                default:
                    System.out.println("Invalid Choice");
                    break;

            }
        }
    }

}
