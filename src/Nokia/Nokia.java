package Nokia;

import java.util.Scanner;

public class Nokia {
    private int userInput;
    Scanner scanner = new Scanner(System.in);

    public String displayMenu(){
        return """
                Welcome to Nokia 3310!!!
                
                Enter:
                1 -> for Phonebook
                2 -> for Message
                3 -> for Call register
                4 -> for Settings
                5 -> for Games
                6 -> for Extra
                7 -> for Multimedia
                8 -> For Camera
                9 -> For T Zone
                10 -> For Sim Service""";
    }

    public void phoneBook(){
        System.out.println("""
                1 -> to Add contact
                2 -> Contact
                """);
         userInput = scanner.nextInt();
        switch (userInput){
            case 1:
                System.out.println("add contact\n");
                System.out.println("pres 1 to go back and 0 for menu");
                userInput = scanner.nextInt();
                if (userInput == 1) {
                    phoneBook();
                }else if (userInput == 0){
                    System.out.println(displayMenu());
                    optionMeu();
                }else
                    System.out.println("invalid input");
                break;
            case 2:
                System.out.println("""
                        Jessica
                        Amanda
                        Timi
                        Joseph
                        Frank \n""");
                System.out.println("press 1 to go back and 0 for menu");
                userInput = scanner.nextInt();
                if (userInput == 1) {
                    phoneBook();
                } else if (userInput == 0) {
                    System.out.println(displayMenu());
                    optionMeu();
                }else
                    System.out.println("invalid input");
                break;
            default:{
                System.out.println("pls try again");
                phoneBook();
            }

        }

    }

    public void  messageMenu(){
        System.out.println("""
                1 -> to Create message
                2 -> Inbox
                3 -> Outbox
                4 -> Draft
                5 -> Sent message
                6 -> Delete message
                7 -> Sms setting""");
        userInput = scanner.nextInt();
        switch (userInput){
            case 1:
                System.out.println("create message\n");
                System.out.println("press 1 to go back and 0 for menu");
               userInput = scanner.nextInt();
                if (userInput == 1){
                    messageMenu();
                } else if (userInput == 0) {
                    System.out.println(displayMenu());
                    optionMeu();
                }else
                    System.out.println("Invalid input");
                break;
            case 2:
                System.out.println("inbox\n");
                System.out.println("press 1 to go back and 0 for menu");
                userInput = scanner.nextInt();
                if (userInput == 1){
                    messageMenu();
                } else if (userInput == 0) {
                    System.out.println(displayMenu());
                    optionMeu();
                }else
                    System.out.println("Invalid input");
                break;
            case 3:
                System.out.println("outbox\n");
                System.out.println("press 1 to go back and 0 for menu");
                userInput = scanner.nextInt();
                if (userInput == 1){
                    messageMenu();
                } else if (userInput == 0) {
                    System.out.println(displayMenu());
                    optionMeu();
                }else
                    System.out.println("Invalid input");
                break;
            case 4:
                System.out.println("draft\n");
                System.out.println("press 1 to go back and 0 for menu");
                userInput = scanner.nextInt();
                if (userInput == 1){
                    messageMenu();
                } else if (userInput == 0) {
                    System.out.println(displayMenu());
                    optionMeu();
                }else
                    System.out.println("Invalid input");
                break;
            case 5:
                System.out.println("sent message\n");
                System.out.println("press 1 to go back and for menu");
               userInput = scanner.nextInt();
                if (userInput == 1){
                    messageMenu();
                } else if (userInput == 0) {
                    System.out.println(displayMenu());
                    optionMeu();
                }else
                    System.out.println("Invalid input");
                break;
            case 6:
                System.out.println("delete message\n");
                System.out.println("press 1 to go back and 0 for menu");
               userInput = scanner.nextInt();
                if (userInput == 1){
                    messageMenu();
                } else if (userInput == 0) {
                    System.out.println(displayMenu());
                    optionMeu();
                }else
                    System.out.println("Invalid input");
                break;
            case 7:
                System.out.println("sms settings\n");
                System.out.println("press 1 to go back and 0 for menu");
               userInput = scanner.nextInt();
                if (userInput == 1){
                    messageMenu();
                } else if (userInput == 0) {
                    System.out.println(displayMenu());
                    optionMeu();
                }else
                    System.out.println("Invalid input");
                break;
            default:
                System.out.println("Please try again");
                messageMenu();

        }
    }

    public void callRegisterMenu(){
        System.out.println("""
                1 -> Missed calls
                2 -> Dialed calls
                3 -> Receive calls
                4 -> All calls""");
        userInput = scanner.nextInt();
        switch (userInput){
            case 1:
                System.out.println("missed calls duration\n");
                System.out.println("press 1 to go back and 0 for menu");
                userInput = scanner.nextInt();
                if (userInput == 1){
                    callRegisterMenu();
                } else if (userInput == 0) {
                    System.out.println(displayMenu());
                    optionMeu();
                }else
                    System.out.println("Invalid input");
                break;
            case 2:
                System.out.println("dialed calls duration\n");
                System.out.println("press 1 to go back and 0 for menu");
                userInput = scanner.nextInt();
                if (userInput == 1){
                    callRegisterMenu();
                } else if (userInput == 0) {
                    System.out.println(displayMenu());
                    optionMeu();
                }else
                    System.out.println("Invalid input");
                break;
            case 3:
                System.out.println("received calls duration\n");
                System.out.println("press 1 to go back and 0 for menu");
                userInput = scanner.nextInt();
                if (userInput == 1){
                    callRegisterMenu();
                }else if (userInput == 0){
                    System.out.println(displayMenu());
                    optionMeu();
                }else
                    System.out.println("Invalid input");
                break;
            case 4:
                System.out.println("all calls duration\n");
                System.out.println("press 1 to go back and 0 for menu");
               userInput = scanner.nextInt();
                if (userInput == 1){
                    callRegisterMenu();
                } else if (userInput == 0) {
                    System.out.println(displayMenu());
                    optionMeu();
                }else
                    System.out.println("Invalid input");
                break;
            default:
                System.out.println("Please try again");
                callRegisterMenu();
        }
}
    public void settingsMenu(){
        System.out.println("""
                1 -> Tone Settings
                2 -> Profile Settings
                3 -> General Settings
                4 -> Network Settings
                5 -> Security Settings
                6 -> Dual Sim Settings""");
        userInput = scanner.nextInt();
        switch (userInput){
            case 1:
                System.out.println("tone settings\n");
                System.out.println("press 1 to go back and 0 for menu");
                userInput = scanner.nextInt();
                if (userInput == 1){
                    settingsMenu();
                } else if (userInput == 0) {
                    System.out.println(displayMenu());
                    optionMeu();
                }else
                    System.out.println("Invalid input");
                break;
            case 2:
                System.out.println("profile settings\n");
                System.out.println("press 1 tp go back and 0 for menu");
                userInput = scanner.nextInt();
                if (userInput == 1){
                    settingsMenu();
                } else if (userInput == 0) {
                    System.out.println(displayMenu());
                    optionMeu();
                }else
                    System.out.println("Invalid input");
                break;
            case 3:
                System.out.println("general settings\n");
                System.out.println("Press 1 to go back and 0 for menu");
                userInput = scanner.nextInt();
                if (userInput == 1){
                    settingsMenu();
                } else if (userInput == 0) {
                    System.out.println(displayMenu());
                    optionMeu();
                }else
                    System.out.println("Invalid input");
                break;
            case 4:
                System.out.println("network settings\n");
                System.out.println("press 1 to go back and 0 for menu");
                userInput = scanner.nextInt();
                if (userInput == 1){
                    settingsMenu();
                } else if (userInput == 0) {
                    System.out.println(displayMenu());
                    optionMeu();
                }
                break;
            case 5:
                System.out.println("security settings\n");
                System.out.println("press 1 to go back and 0 for menu");
                userInput = scanner.nextInt();
                if (userInput == 1){
                    settingsMenu();
                } else if (userInput == 0) {
                    System.out.println(displayMenu());
                    optionMeu();
                }else
                    System.out.println("Invalid input");
                break;
            case 6:
                System.out.println("dual sim settings\n");
                System.out.println("press 1 to go back and 0 for menu");
                userInput = scanner.nextInt();
                if (userInput == 1){
                    settingsMenu();
                } else if (userInput == 0) {
                    System.out.println(displayMenu());
                    optionMeu();
                }else
                    System.out.println("Invalid input");
            default:
                System.out.println("Please try again");
                settingsMenu();
        }
    }

    public void game(){
        System.out.println("""
                1 -> Snake
                2 -> Brick
                3 -> Soccer""");
        userInput = scanner.nextInt();
        switch (userInput){
            case 1:
                System.out.println("snake\n");
                System.out.println("press 1 to go back and 0 for menu");
                userInput = scanner.nextInt();
                if (userInput == 1){
                    game();
                } else if (userInput == 0) {
                    System.out.println(displayMenu());
                    optionMeu();
                }else
                    System.out.println("Inlaid input");
                break;
            case 2:
                System.out.println("brick\n");
                System.out.println("press 1 to go back and 0 for menu");
                userInput = scanner.nextInt();
                if (userInput == 1){
                    game();
                } else if (userInput == 0) {
                    System.out.println(displayMenu());
                    optionMeu();
                }else
                    System.out.println("Invalid input");
                break;
            case 3:
                System.out.println("soccer\n");
                System.out.println("press 1 to go back and 0 for menu");
               userInput = scanner.nextInt();
                if (userInput == 1){
                    game();
                } else if (userInput == 0) {
                    System.out.println(displayMenu());
                    optionMeu();
                }else
                    System.out.println("Invalid input");
                break;
            default:
                System.out.println("Please try again");
                game();
        }
    }

    public void extraMenu(){
        System.out.println("""
                1 -> Calculator
                2 -> Alarm
                3 -> Calender
                4 -> World Clock
                5 -> Touch
                6 -> Bluetooth
                7 -> Time and Date""");
        userInput = scanner.nextInt();
        switch (userInput){
            case 1:
                System.out.println("calculator\n");
                System.out.println("press 1 to go back and 0 for menu");
                userInput = scanner.nextInt();
                if (userInput == 1){
                    extraMenu();
                } else if (userInput == 0) {
                    System.out.println(displayMenu());
                    optionMeu();
                }else
                    System.out.println("Invalid input");
                break;
            case 2:
                System.out.println("alarm\n");
                System.out.println("press 1 to go back and 0 for menu");
                userInput = scanner.nextInt();
                if (userInput == 1) {
                    extraMenu();
                } else if (userInput ==0) {
                    System.out.println(displayMenu());
                    optionMeu();
                }else
                    System.out.println("Invalid input");
                break;
            case 3:
                System.out.println("calender\n");
                System.out.println("press 1 to go back and 0 for menu");
                userInput = scanner.nextInt();
                if (userInput == 1){
                    extraMenu();
                } else if (userInput == 0) {
                    System.out.println(displayMenu());
                    optionMeu();
                }else
                    System.out.println("Invalid input");
                break;
            case 4:
                System.out.println("world clock\n");
                System.out.println("press 1 to go back and 0 for menu");
                userInput = scanner.nextInt();
                if (userInput == 1) {
                    extraMenu();
                } else if (userInput == 0) {
                    System.out.println(displayMenu());
                    optionMeu();
                }else
                    System.out.println("Invalid input");
                break;
            case 5:
                System.out.println("touch\n");
                System.out.println("press 1 to go back and 0 for menu");
                userInput = scanner.nextInt();
                if (userInput == 1){
                    extraMenu();
                } else if (userInput == 0) {
                    System.out.println(displayMenu());
                    optionMeu();
                }else
                    System.out.println("Invalid input");
                break;
            case 6:
                System.out.println("bluetooth\n");
                System.out.println("press 1 to go back and 0  for menu");
                userInput = scanner.nextInt();
                if (userInput == 1){
                    extraMenu();
                } else if (userInput == 0) {
                    System.out.println(displayMenu());
                    optionMeu();
                }else
                    System.out.println("Invalid input");
                break;
            case 7:
                System.out.println("time and date\n");
                System.out.println("press 1 to go back and 0 for menu");
                userInput = scanner.nextInt();
                if (userInput == 1){
                    extraMenu();
                } else if (userInput == 0) {
                    System.out.println(displayMenu());
                    optionMeu();
                }else
                    System.out.println("Invalid input");
                break;
            default:
                System.out.println("Please try again");
                extraMenu();
        }
    }

    public void multiMediaMenu(){
        System.out.println("""
                1 -> Music player
                2 -> Video player
                3 -> sound recorder
                4 -> Image Viewer
                5 -> File Manager""");
        userInput = scanner.nextInt();
        switch (userInput){
            case 1:
                System.out.println("music player\n");
                System.out.println("press 1 to go back and 0 for menu");
                userInput = scanner.nextInt();
                if (userInput == 1){
                    multiMediaMenu();
                } else if (userInput == 0) {
                    System.out.println(displayMenu());
                    optionMeu();
                }else
                    System.out.println("Invalid input");
                break;
            case 2:
                System.out.println("video player\n");
                System.out.println("press 1 to go back and 0 for menu");
                userInput = scanner.nextInt();
                if (userInput == 1){
                    multiMediaMenu();
                } else if (userInput == 0) {
                    System.out.println(displayMenu());
                    optionMeu();
                }else
                    System.out.println("Invalid input");
                break;
            case 3:
                System.out.println("sound recorder\n");
                System.out.println("press 1 to go back and 0 for menu");
                userInput = scanner.nextInt();
                if (userInput == 1) {
                    multiMediaMenu();
                } else if (userInput == 0) {
                    System.out.println(displayMenu());
                    optionMeu();
                }else
                    System.out.println("Invalid input");
                break;
            case 4:
                System.out.println("image viewer\n");
                System.out.println("press 1 to go back and 0 for menu");
                userInput = scanner.nextInt();
                if (userInput == 1){
                    multiMediaMenu();
                } else if (userInput == 0) {
                    System.out.println(displayMenu());
                    optionMeu();
                }else
                    System.out.println("Invalid input");
                break;
            case 5:
                System.out.println("file manager\n");
                System.out.println("press 1 to go back and 0 for menu");
                userInput = scanner.nextInt();
                if (userInput == 1){
                    multiMediaMenu();
                } else if (userInput == 0) {
                    System.out.println(displayMenu());
                    optionMeu();
                }else
                    System.out.println("Invalid input");
                break;
            default:
                System.out.println("Please try again");
               multiMediaMenu();
        }
    }

    public void camera(){
        System.out.println("""
                1 -> Camera
                2 -> Video Record""");
        userInput = scanner.nextInt();
        switch (userInput){
            case 1:
                System.out.println("camera\n");
                System.out.println("press 1 to go back and 0 for menu");
                userInput = scanner.nextInt();
                if (userInput == 1){
                    camera();
                } else if (userInput == 0) {
                    System.out.println(displayMenu());
                    optionMeu();
                }else
                    System.out.println("Invalid input");
                break;
            case 2:
                System.out.println("video record\n");
                System.out.println("press 1 to go back and 0 for menu");
                userInput = scanner.nextInt();
                if (userInput == 1){
                    camera();
                } else if (userInput == 0) {
                    System.out.println(displayMenu());
                    optionMeu();
                }else
                    System.out.println("Invalid input");
                break;
            default:
                System.out.println("Please try again");
            camera();
        }
    }

    public void t_zone(){
        System.out.println("""
                1 -> Service
                2 -> Facebook
                3 -> Data Account""");
        userInput = scanner.nextInt();
        switch (userInput){
            case 1:
                System.out.println("service\n");
                System.out.println("press 1 to go back and 0 for menu");
                userInput = scanner.nextInt();
                if (userInput == 1){
                    t_zone();
                } else if (userInput == 0) {
                    System.out.println(displayMenu());
                    optionMeu();
                }else
                    System.out.println("Invalid input");
                break;
            case 2:
                System.out.println("facebook\n");
                System.out.println("press 1 to go back and 0 for menu");
                userInput = scanner.nextInt();
                if (userInput == 1){
                    t_zone();
                } else if (userInput == 0) {
                    System.out.println(displayMenu());
                    optionMeu();
                }else
                    System.out.println("Invalid input");
                break;
            case 3:
                System.out.println("data account\n");
                System.out.println("press 1 to go back and 0 for menu");
                userInput = scanner.nextInt();
                if (userInput == 1){
                  t_zone();
                } else if (userInput ==0) {
                    System.out.println(displayMenu());
                    optionMeu();
                }else
                    System.out.println("Invalid input");
                break;
            default:
                System.out.println("Please try again");
                t_zone();
        }
    }
    public void simServices(){
        System.out.println("""
                1 -> Airtel""");
        userInput = scanner.nextInt();
        if (userInput == 1) {
            System.out.println("You're Connected to Airtel\n");
            System.out.println("press 1 to go back and 0 for menu");
            userInput = scanner.nextInt();
            if (userInput == 1) {
                simServices();
            } else if (userInput == 0) {
                System.out.println(displayMenu());
                optionMeu();
            } else
                System.out.println("Invalid input");
        } else {
            System.out.println("Please try again");
            simServices();
        }

    }
    public void optionMeu(){

        int userInput = scanner.nextInt();
        switch (userInput){
            case 1:
                phoneBook();
                break;
            case 2:
                messageMenu();
                break;
            case 3:
                callRegisterMenu();
            break;
            case 4:
                settingsMenu();
                break;
            case 5:
                game();
                break;
            case 6:
                extraMenu();
                break;
            case 7:
                multiMediaMenu();
                break;
            case 8:
                camera();
                break;
            case 9:
                t_zone();
                break;
            case 10:
                simServices();
            default:
                System.out.println("invalid");
                promptToContinue();


        }


    }


    private void promptToContinue() {

            System.out.println("Do you wish to continue? yes/no");
            String userChoice = scanner.next();

            if (userChoice.equalsIgnoreCase("yes")){
                System.out.println(displayMenu());
                displayMenu();
                optionMeu();

            } else if (userChoice.equalsIgnoreCase("no")) {
                System.out.println("Thank you for using Nokia 3310");

            }else
                System.out.println("Invalid input");


    }


}

