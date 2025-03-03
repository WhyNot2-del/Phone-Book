//  ASCII art created from https://patorjk.com/software/taag/#p=display&f=3D%20Diagonal&t=
/*
 *  Create addNewEntry method
 *  Create removeOneEntry method
 *  Fix up Create viewOneEntry method 
 *  Add comments where need be
*/

import java.util.Scanner;

public class PhoneBookUI {
    public static void mainMenu() {

        Scanner userInput = new Scanner(System.in);
        String menuInput;
        boolean menuFlag = true;
        char menuOption;
        
        ASCIIArt();
        
        do {
            System.out.println("Please select one of the following options:\n" +
                            "(e) View all entries in phone book\n" +
                            "(v) View one specific entry in phone book\n" +
                            "(A) Add a new entry in the phone book\n" +
                            "(r) Remove an entry from the phone book\n" +
                            "(q) Quit the program\n");
            menuInput = userInput.next();
            menuOption = menuInput.toLowerCase().charAt(0);

            if (Character.toString(menuOption).matches("[evarq]")) {
                switch(menuOption) {
                    case('e'):
                        viewAllEntries();
                        break;
                    case('v'):
                        viewOneEntry();
                        break;
                    case('a'):
                        addNewEntry();
                        break;
                    case('r'):
                        removeOneEntry();
                        break;
                    case('q'):
                        System.out.println("Program Ends");
                        menuFlag = false;
                        break;
                }
            } else {
                System.out.println("Invalid input, please try again");
            }
        } while (menuFlag);

    } //  end of mainMenu method

    public static void viewAllEntries() {

        Scanner userInput = new Scanner(System.in);
        String menuInput;
        boolean menuFlag = true;
        char menuOption;

        // {Call method from Manager class here to get String of data, using a while loop, hasNext, and next to print each name one by one}
        // The following is just a hardcoded version of what UI would look like. This bit of code is temporary
        System.out.println("\n\n***********************************************************************************\n" +
                        "All Entries:\n" +
                        "Adam Sandler\n" +
                        "Mary Johnsons\n" +
                        "Micheal Williams\n" +
                        "Patricia Brown\n" +
                        "Robert Jones\n" +
                        "Jennifer Garcia\n");

        System.out.println("If you would like to view a specific entry type \"v\" or to go back to the main menu, type \"q\"");
        menuInput = userInput.next();
        menuOption = menuInput.toLowerCase().charAt(0);

        do { 
            switch (menuOption) {
                case('v'):
                viewOneEntry();
                menuFlag = false;
                case('q'):
                System.out.println("\n\n\n\n\n");
                menuFlag = false;
                break;
                default:
                System.out.println("Invalid input, please try again");
                menuInput = userInput.next();
                menuOption = menuInput.toLowerCase().charAt(0);
                break;
            }
        } while (menuFlag);
    } //  end of viewAllEntries method

    public static void viewOneEntry() {

        Scanner userInput = new Scanner(System.in);
        String entrySelect;
        boolean nameFlag = false;
        boolean menuFlag = true;
        //  EntryNode entry = new EntryNode;

        do {
            System.out.print("Please enter the name of the entry you would like to see or type \"q\" to quit: ");
            entrySelect = userInput.nextLine();

            //  SIDE NOTE: CURRENT ITERATION OF CODE DOES NOT REALLY ALLOW FOR FIRST NAMES THAT START WITH Q, FIX THIS LATER
            //  first, checks if user types q, if so, turn boolean to false that skips right to ending the previous menu
            //  if the user types anything that is not 'q', check if name exists in linkedlist, if not, ask user again
            //  if user exists, print information to user.
            if (entrySelect.toLowerCase().charAt(0) == 'q') {
                menuFlag = false;
            } else {
                // nameFlag = {method}; {Call method from manager class that checks if an object with that name exists in linkedlist}
                if (nameFlag == false) {
                    System.out.println("That user does not exist, please try again or type \"q\' to quit\n\n");
                } else {
                    //  entry = {Method that takes in entry name and returns an object}
                    //  System.out.println(entry); {prints out data in entry object by implicitly calling custom made toString method}
                }
            }
        } while (menuFlag);

    } //  end of viewOneEntry method

    public static void addNewEntry() {
        System.out.println("addNewEntry");
    } //  end of addNewEntry method

    public static void removeOneEntry() {

        Scanner userInput = new Scanner(System.in);

        System.out.print("Please enter the name of the entry you would like to remove or type \"q\" to quit: ");
    } //  end of removeOneEntry method

    //  Prints ASCIIArt in main menu
    public static void ASCIIArt() {
        System.out.println("                                                                                                                \r\n" + 
                        "                                                                                                                \r\n" + 
                        "                        ,--,    ,--,                                      ,---,.                           ,-.  \r\n" + 
                        "        ,---,         ,--.'|  ,--.'|                                    ,'  .'  \\                      ,--/ /|  \r\n" + 
                        "       /_ ./|         |  | :  |  | :     ,---.           .---.        ,---.' .' |   ,---.     ,---.  ,--. :/ |  \r\n" + 
                        " ,---, |  ' :         :  : '  :  : '    '   ,'\\         /. ./|        |   |  |: |  '   ,'\\   '   ,'\\ :  : ' /   \r\n" + 
                        "/___/ \\.  : |  ,---.  |  ' |  |  ' |   /   /   |     .-'-. ' |        :   :  :  / /   /   | /   /   ||  '  /    \r\n" + 
                        " .  \\  \\ ,' ' /     \\ '  | |  '  | |  .   ; ,. :    /___/ \\: |        :   |    ; .   ; ,. :.   ; ,. :'  |  :    \r\n" + 
                        "  \\  ;  `  ,'/    /  ||  | :  |  | :  '   | |: : .-'.. '   ' .        |   :     \\'   | |: :'   | |: :|  |   \\   \r\n" + 
                        "   \\  \\    '.    ' / |'  : |__'  : |__'   | .; :/___/ \\:     '        |   |   . |'   | .; :'   | .; :'  : |. \\  \r\n" + 
                        "    '  \\   |'   ;   /||  | '.'|  | '.'|   :    |.   \\  ' .\\           '   :  '; ||   :    ||   :    ||  | ' \\ \\ \r\n" + 
                        "     \\  ;  ;'   |  / |;  :    ;  :    ;\\   \\  /  \\   \\   ' \\ |        |   |  | ;  \\   \\  /  \\   \\  / '  : |--'  \r\n" + 
                        "      :  \\  \\   :    ||  ,   /|  ,   /  `----'    \\   \\  |--\"         |   :   /    `----'    `----'  ;  |,'     \r\n" + 
                        "       \\  ' ;\\   \\  /  ---`-'  ---`-'              \\   \\ |            |   | ,'                       '--'       \r\n" + 
                        "        `--`  `----'                                '---\"             `----'                                    \r\n" + 
                        "                                                                                                                ");
    } //  end of ASCIIArt method
} //  end of PhoneBookUI class