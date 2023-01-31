package Nokia;

import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class Techno {
    private String userMessage;

    private int userInput;
    Scanner scanner = new Scanner(System.in);
    Date now = new Date();


    public String mainMenu(){
        return """
                Welcome!!!
                Enter :
                1  -> for phonebook
                2  -> for Messages
                3  -> for Chat
                4  -> for Call register
                5  -> for Tones
                6  -> for Settings
                7  -> for Call divert
                8  -> for Games
                9  -> for Calculator
                10 -> for Reminders
                11 -> for Clock
                12 -> for Profiles
                13 -> SIM service
                """;
    }
    public void phoneMenu(){
        int userInput = scanner.nextInt();
        switch (userInput){
            case 1:
                phoneBookMenu();
                break;
            case 2:
                messageMenu();
                break;
            case 3:
                Chats();
            case 4:
                callRegMenu();
                break;
            case 5:
                tonesMenu();
                break;
            case 6:
                settingMenu();
                break;
            case 7:
                callDivertMenu();
                break;
            case 8:
                gameMenu();
                break;
            case 9:
                calculatorMenu();
                break;
            case 10:
                Reminder();
                break;
            case 11:
                clockMenu();
                break;
            case 12:
                Profile();
                break;
            case 13:
                simServices();
                break;
            default:
                System.out.println("Invalid input!!!");
                promptToContinue();
        }
    }

    public void phoneBookMenu(){
        System.out.print("""
                Enter :
                1  -> Search
                2  -> Service Nos.
                3  -> Add name
                4  -> Erase
                5  -> Edit
                6  -> Assign tone
                7  -> Send 'card
                8  -> Options
                9  -> Speed dials
                10 -> Voice tags
                """);
        userInput = scanner.nextInt();
        switch (userInput){
            case 1 :
                System.out.println("Enter details");
                checkingPhoneBook();
                break;
            case 2:
                System.out.println("Enter service number");
                checkingPhoneBook();
                break;
            case 3:
                System.out.println("Add contact details");
                checkingPhoneBook();
                break;
            case 4:
                System.out.println("Delete contact details");
                checkingPhoneBook();
            case 5:
                System.out.println("Edit contact details");
                checkingPhoneBook();
                break;
            case 6:
                System.out.println("Assign tone");
                checkingPhoneBook();
                break;
            case 7:
                System.out.println("Send business card");
                checkingPhoneBook();
                break;
            case 8:
                System.out.print("""
                        Enter:
                        1 -> Type of view
                        2 -> Memory status
                        """);
                checkingPhoneBook();
                break;
            case 9 :
                System.out.println("Speed dials");
                checkingPhoneBook();
                break;
            case 10:
                System.out.println("Voice tags");
                checkingPhoneBook();
                break;
            default:
                System.out.println("An invalid number has been inputted");
                checkingPhoneBook();
        }
    }
    public void messageMenu(){
        System.out.print("""
                Enter :
                1 -> Write messages
                2 -> Inbox
                3 -> Outbox
                4 -> Draft
                5 -> Picture messages
                6 -> Template
                7 -> Message settings
                """);
        userInput = scanner.nextInt();
        switch (userInput){
            case 1:
                System.out.println("Write new messages");
                userMessage = scanner.nextLine();
                scanner.nextLine();
                System.out.println("Your message has been sent enter \n" + userMessage);
                checkingMessages();
                break;
            case 2:
                System.out.println("You have 10 new messages");
                checkingMessages();
                break;
            case 3:
                System.out.println("3 messages sent successfully");
                checkingMessages();
                break;
            case 4:
                System.out.println("Message has been stored in draft");
                checkingMessages();
                break;
            case 5:
                System.out.println("Send picture messages");
                checkingMessages();
                break;
            case 6:
                System.out.println("Choose smileys");
                checkingMessages();
                break;
            case 7:
                System.out.println("""
                        Enter :
                        1 -> Set 1
                        2 -> Common
                        """);
                userInput = scanner.nextInt();
                switch (userInput){
                    case 1:
                        System.out.print("""
                                Enter :
                                1 -> Message center number
                                2 -> Messages sent as
                                3 -> Message validity
                                """);
                        userInput = scanner.nextInt();
                        switch (userInput){
                            case 1:
                                System.out.println("Message center number is 0000001234");
                                checkingMessages();
                                break;
                            case 2:
                                System.out.println("Message sent as MMS or SMS");
                                checkingMessages();
                                break;
                            case 3:
                                System.out.println("Message validity number is set");
                                checkingMessages();
                                break;
                            default:
                                System.out.println("Invalid entry");
                                checkingMessages();
                        }
                        break;
                    case 2:
                        System.out.print("""
                                Enter :
                                1 -> Delivery report
                                2 -> Reply via same centre
                                3 -> Character support
                                """);
                        int userInput1 = scanner.nextInt();
                        switch (userInput1){
                            case 1:
                                System.out.println("Delivery report : Delivered/Not Delivered");
                                checkingMessages();
                                break;
                            case 2:
                                System.out.println("Reply messages via same message center number");
                                checkingMessages();
                                break;
                            case 3:
                                System.out.println("Character support: Nokia");
                                checkingMessages();
                                break;
                            default:
                                System.out.println("Invalid input");
                                checkingMessages();
                        }
                }
            default:
                System.out.println("An invalid number has been inputted");
        }
    }
    public void callRegMenu(){
        System.out.print("""
                Enter :
                1 -> Missed calls
                2 -> Received calls
                3 -> Dialled calls
                4 -> Erase recent call list
                5 -> Show call duration
                6 -> Show call costs
                7 -> Show call settings
                8 -> Prepaid credit
                0 -> 0 to come back to message menu
                """);
        userInput = scanner.nextInt();
        switch (userInput){
            case 1:
                System.out.println("Missed calls : 50");
                checkingCallReg();
                break;
            case 2:
                System.out.println("Received calls : 6");
                checkingCallReg();
                break;
            case 3:
                System.out.println("Received calls : 40");
                checkingCallReg();
                break;
            case 4:
                System.out.println("Delete Message");
                checkingCallReg();
                break;
            case 5:
                System.out.print("""
                            Enter:
                            1 -> Last call duration
                            2 -> All calls' duration
                            3 -> Received calls' duration
                            4 -> Dialled calls' duration
                            5 -> Clear timers
                            """);
                userInput = scanner.nextInt();
                switch (userInput){
                    case 1:
                        System.out.println("Calculating last call duration");
                        checkingCallReg();
                        break;
                    case 2:
                        System.out.println("Calculating all call duration");
                        checkingCallReg();
                        break;
                    case 3:
                        System.out.println("Calculating received call duration");
                        checkingCallReg();
                        break;
                    case 4:
                        System.out.println("Calculating dialled call duration");
                        checkingCallReg();
                        break;
                    case 5:
                        System.out.println("Clearing calls' timer");
                        checkingCallReg();

                    default:
                        System.out.println("Invalid input");
                        checkingCallReg();
                }
                break;
            case 6:
                System.out.print("""
                            Enter :
                            1 -> Last call
                            2 -> All calls' cost
                            3 -> Clear counter
                            """);
                userInput = scanner.nextInt();
                switch (userInput){
                    case 1:
                        System.out.println("List of last call");
                        checkingCallReg();
                        break;
                    case 2:
                        System.out.println("All calls' cost");
                        checkingCallReg();
                        break;
                    case 3:
                        System.out.println("Clearing counter");
                        checkingCallReg();
                        break;
                    default:
                        System.out.println("An invalid number has been inputted");
                        checkingCallReg();
                }
                break;
            case 7:
                System.out.print("""
                            Enter :
                            1 -> Call cost limit
                            2 -> Show costs in
                            """);
                checkingCallReg();
                break;
            case 8:
                System.out.print("Prepaid credit");
                checkingCallReg();
                break;
            default:
                System.out.println("An invalid number has been inputted");
                checkingCallReg();
        }
    }

    public void tonesMenu(){
        System.out.print("""
                        Enter :
                        1 -> Ringing tone
                        2 -> Ringing volume
                        3 -> Incoming call alert
                        4 -> Message alert tone
                        5 -> Keypad tones
                        6 -> Warning and game tones
                        """);
        userInput = scanner.nextInt();
        switch (userInput){
            case 1:
                System.out.print("""
                        Enter :
                        1 -> Nokia tone
                        2 -> No limit
                        3 -> Noise one
                        4 -> Orion
                        5 -> Paradise Island
                        6 -> Nassau
                        7 -> Pegasus
                        8 - Perseus
                        """);
                checkingTones();
                break;
            case 2:
                System.out.println("Increase or Decrease volume");
                checkingTones();
                break;
            case 3:
                System.out.print("""
                        Enter :
                        1 -> Silent
                        2 -> Ringing
                        3 -> Vibrating
                        """);
                userInput = scanner.nextInt();
                switch (userInput){
                    case 1:
                        System.out.println("Your phone has been placed on silence");
                        checkingTones();
                        break;
                    case 2:
                        System.out.println("Ring tone is ...");
                        checkingTones();
                        break;
                    case 3:
                        System.out.println("Your phone has been placed on vibration");
                        checkingTones();
                        break;
                    default:
                        System.out.println("Invalid input");
                        checkingTones();
                }
                break;
            case 4:
                System.out.print("""
                        Enter :
                        1 -> Nokia tone
                        2 -> No limit
                        3 -> Noise one
                        4 -> Orion
                        5 -> Paradise Island
                        6 -> Nassau
                        7 -> Pegasus
                        8 -> Perseus
                        9 -> silent
                        """);
                checkingTones();
                break;
            case 5:
                System.out.print("""
                        Enter :
                        1 -> Nokia tone
                        2 -> No limit
                        3 -> Noise one
                        4 -> Orion
                        5 -> Paradise Island
                        6 -> Nassau
                        7 -> Pegasus
                        8 -> Perseus
                        9 -> Vibrating
                        """);
                checkingTones();
                break;
            case 6:
                System.out.print("""
                        Enter :
                        1 -> Nokia tone
                        2 -> No limit
                        3 -> Noise one
                        4 -> Orion
                        5 -> Paradise Island
                        6 -> Nassau
                        7 -> Pegasus
                        8 - Perseus
                        9 -> Vibration
                        10 -> Silent
                        """);
                checkingTones();
                break;
            default:
                System.out.print("An invalid number has been inputted");
                checkingTones();
        }
    }

    public void settingMenu(){
        System.out.print("""
                Enter :
                1 -> Call setting
                2 -> Phone setting
                3 -> Security settings
                4 -> Restore factory settings
                """);
        userInput = scanner.nextInt();
        switch (userInput){
            case 1:
                System.out.print("""
                        Enter :
                        1 -> Automatic redial
                        2 -> Speed redial
                        3 -> Call waiting option
                        4 -> Own number sending
                        5 -> Automatic answer
                        """);
                checkingSetting();
                break;
            case 2:
                System.out.print("""
                        Enter :
                        1 -> Language
                        2 -> Cell info display
                        3 -> Welcome note
                        4 -> Network selection
                        5 -> Lights
                        6 -> Confirm  SIM service actions
                        """);
                checkingSetting();
                break;
            case 3:
                System.out.print("""
                        Enter :
                        1 -> PIN code request
                        2 -> Call barring service
                        3 -> Fixed dialling
                        4 -> Closed user group
                        5 -> Phone security
                        6 -> Change access codes
                        """);
                checkingSetting();
                break;
            case 4:
                System.out.print("""
                        Enter :
                        1 -> for factory reset
                        """);
                checkingSetting();
                break;

            default:
                System.out.print("An invalid number has been inputted");
                checkingSetting();
        }
    }

    public void callDivertMenu(){
        System.out.print("Call diverting ");
        checkingCallDivert();
    }

    public void Profile(){
        System.out.println("Enter profile details");
        checkingProfile();
    }

    public void calculatorMenu(){
        System.out.println("Enter any two number for addition ");
        int sum1 = scanner.nextInt();
        int sum2 = scanner.nextInt();
        int total = sum1 + sum2;
        System.out.println(sum1 + sum2 + " = " + total);
        checkingCalculator();
    }
    public void Chats(){
        System.out.print("""
                Enter :
                1 -> Search
                2 -> weChat
             
                """);
        checkingChats();
    }

    public void clockMenu(){
        System.out.print("""
                Enter :
                1 -> Alarm clock
                2 -> Clock settings
                3 -> Date setting
                4 -> Stopwatch
                5 -> Countdown timer
                6 -> date and time
                """);
        userInput = scanner.nextInt();
        switch (userInput){
            case 1:
                System.out.println("Set alarm");
                checkingClock();
                break;
            case 2:
                System.out.println("set clock");
                checkingClock();
                break;
            case 3:
                System.out.println("Set date");
                checkingClock();
                break;
            case 4:
                System.out.println("Stop watch");
                checkingClock();
                break;
            case 5:
                System.out.println("Set countdown timer");
                checkingClock();
                break;
            case 6:
                System.out.println(now + "\n");
                checkingClock();
                break;
            default:
                System.out.print("An invalid number has been inputted");
                checkingClock();
        }
    }

    public void gameMenu(){
        System.out.print("""
                Enter :
                1 -> Snake
                2 -> Sudoku
                3 -> Soccer""");
        userInput = scanner.nextInt();
        switch (userInput){
            case 1:
                System.out.println("Snake games ready to play");
                checkingGames();
                break;
            case 2:
                System.out.println("Sudoku game ready to play");
                checkingGames();
                break;
            case 3:
                System.out.println("Soccer game ready to play");
                checkingGames();
                break;
            default:
                System.out.print("An invalid number has been inputted");
                checkingGames();
        }
    }
    public void simServices(){
        System.out.println("Your are connected to GLO ");
        checkingSimService();

    }

    public void Reminder(){
        System.out.println("Set activity");
        checkingReminder();
    }
    public void checkingPhoneBook(){
        System.out.print("Enter 1 to go back and 0 for main menu");
        userInput = scanner.nextInt();
        if (userInput == 1) {
            phoneBookMenu();
        } else if (userInput == 0) {
            System.out.println(mainMenu());
            phoneMenu();

        }else {
            System.out.println("Invalid input");
        }
    }

    public void checkingMessages(){
        System.out.print("Enter 1 to go back and 0 for main menu");
        userInput = scanner.nextInt();
        if (userInput == 1) {
            messageMenu();
        } else if (userInput == 0) {
            System.out.println(mainMenu());
            phoneMenu();

        }else {
            System.out.println("Invalid input");
        }
    }

    public void checkingCallReg(){
        System.out.print("Enter 1 to go back and 0 for main menu");
        userInput = scanner.nextInt();
        if (userInput == 1) {
            callRegMenu();
        } else if (userInput == 0) {
            System.out.println(mainMenu());
            phoneMenu();

        }else {
            System.out.println("Invalid input");
        }
    }

    public void checkingTones(){
        System.out.print("Enter 1 to go back and 0 for main menu");
        userInput = scanner.nextInt();
        if (userInput == 1) {
            tonesMenu();
        } else if (userInput == 0) {
            System.out.println(mainMenu());
            phoneMenu();

        }else {
            System.out.println("Invalid input");
        }
    }

    public void checkingSetting(){
        System.out.print("Enter 1 to go backand 0 for main menu");
        userInput = scanner.nextInt();
        if (userInput == 1) {
            settingMenu();
        } else if (userInput == 0) {
            System.out.println(mainMenu());
            phoneMenu();

        }else {
            System.out.println("Invalid input");
        }
    }

    public void checkingCallDivert(){
        System.out.print("Enter 1 to go back and 0 for main menu");
        userInput = scanner.nextInt();
        if (userInput == 1) {
            callDivertMenu();
        } else if (userInput == 0) {
            System.out.println(mainMenu());
            phoneMenu();

        }else {
            System.out.println("Invalid input");
        }
    }

    public void checkingProfile(){
        System.out.print("Enter 1 to go back and 0 for main menu");
        userInput = scanner.nextInt();
        if (userInput == 1) {
            Profile();
        } else if (userInput == 0) {
            System.out.println(mainMenu());
            phoneMenu();

        }else {
            System.out.println("Invalid input");
        }
    }

    public void checkingCalculator(){
        System.out.print("Enter 1 to go back and 0 for main menu");
        userInput = scanner.nextInt();
        if (userInput == 1) {
            calculatorMenu();
        } else if (userInput == 0) {
            System.out.println(mainMenu());
            phoneMenu();

        }else {
            System.out.println("Invalid input");
        }
    }

    public void checkingGames(){
        System.out.print("Enter 1 to go back and 0 for main menu");
        userInput = scanner.nextInt();
        if (userInput == 1) {
            gameMenu();
        } else if (userInput == 0) {
            System.out.println(mainMenu());
            phoneMenu();

        }else {
            System.out.println("Invalid input");
        }
    }

    public void checkingChats(){
        System.out.print("Enter 1 to go back and 0 for main menu");
        userInput = scanner.nextInt();
        if (userInput == 1) {
            Chats();
        } else if (userInput == 0) {
            System.out.println(mainMenu());
            phoneMenu();

        }else {
            System.out.println("Invalid input");
        }
    }
    public void checkingClock(){
        System.out.print("Enter 1 to go back and 0 for main menu");
        userInput = scanner.nextInt();
        if (userInput == 1) {
            clockMenu();
        } else if (userInput == 0) {
            System.out.println(mainMenu());
            phoneMenu();

        }else {
            System.out.println("Invalid input");
        }
    }

    public void checkingSimService(){
        System.out.print("Enter 1 to go back to and 0 for main menu");
        userInput = scanner.nextInt();
        if (userInput == 1) {
            simServices();
        } else if (userInput == 0) {
            System.out.println(mainMenu());
            phoneMenu();

        }else {
            System.out.println("Invalid input");
        }
    }
    public void checkingReminder(){
        System.out.print("Enter 1 to go back and 0 for main menu");
        userInput = scanner.nextInt();
        if (userInput == 1) {
            callRegMenu();
        } else if (userInput == 0) {
            System.out.println(mainMenu());
            phoneMenu();

        }else {
            System.out.println("Invalid input");
        }
    }

    public void promptToContinue() {
        String userChoice;

        do {

            System.out.println("Do you wish to continue? Enter yes/no");
            userChoice = scanner.next();
            if (userChoice.equalsIgnoreCase("yes")) {
                System.out.print(mainMenu());
                phoneMenu();
                System.out.print("Do you wish to continue? Enter yes/no");
            } else if (userChoice.equalsIgnoreCase("no")) {
                System.out.println("Thank you Techno your best choice ");
                break;
            } else {
                System.out.println("Invalid input");

            }

        } while(userChoice.equals("yes"));
    }
}
