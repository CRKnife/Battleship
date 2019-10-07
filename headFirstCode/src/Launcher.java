/**
 * @author Neil Murray-Scott
 * @version 1
 * 01/10/2019
 */

public class Launcher {

    public static Settings settings = new Settings();
    public static MainMenu mainMenu = new MainMenu();
    public static SettingsMenu settingsMenu = new SettingsMenu();

    public static void main(String[] args) {
        mainMenu.mainMenu();
    }
}
