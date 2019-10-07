/**
 * @author Neil Murray-Scott
 * @version 1
 * 01/10/2019
 */

import java.util.Scanner;

public class MainMenu {

    public Scanner kboard = new Scanner(System.in);


    public void mainMenu() {

        int choice = 0;

        while(choice != 3){

        System.out.println("  Main Menu");
        System.out.println("  1.New Game");
        System.out.println("  2.Settings");
        System.out.println("  3.Exit");

        choice = kboard.nextInt();

        switch (choice) {
            case 1:
                GameBattleShip game = new GameBattleShip();
                break;
            case 2:
                Launcher.settingsMenu.settingsMenu();
                break;
            case 3:
                System.out.println("Good bye");
                break;
            default:
                System.out.println("Invalid choice");
                break;

        }

    }

    }

}
