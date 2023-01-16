package MakingADifference;

import java.util.Scanner;

public class GlobalWarmingFactsQuiz {

    private int correctAnswer;
    Scanner scanner = new Scanner(System.in);

    public void globalWarming(){


            System.out.println("""
                    "Question 1: What is the cause of global warming? \n
                    \n A. Emission of carbon dioxide from car exhaust
                    \n B. Solar radiation trapped by carbon dioxide in the ozone.
                    \n C. Cigarette Smoke, Aerosols, and CFC's
                    \n D. All of the above""");
          String userInput = scanner.next();
          if (userInput.equalsIgnoreCase("d")){
              System.out.println("correct\n");
              correctAnswer++;
          }else
              System.out.println("wrong\n");

        System.out.println("""
                Question 2: Which of the following is the greenhouse gas that is released by human activities and speed up global warming? \n
                \n A. carbon dioxide
                \n B. natural gas
                \n C. petroleum
                \n D. nuclear power""");
        userInput = scanner.next();
        if (userInput.equalsIgnoreCase("a")){
            System.out.println("correct\n");
            correctAnswer++;
        }else
            System.out.println("wrong\n");

        System.out.println("""
                Question 3: Which of the following human activities does NOT release carbon dioxide into the atmosphere? \n
                \n A. burning fossil fuels
                \n B. deforestation
                \n C. driving
                \n D. fishing""");
        userInput =scanner.next();
        if (userInput.equalsIgnoreCase("d")){
            System.out.println("correct\n");
            correctAnswer++;
        }else
            System.out.println("wrong\n");

        System.out.println("""
                Question 4: As global warming continues, the intensity of what type of storm that hits coastlines is predicted to increase? \n
                \n A. tornadoes
                \n B. tsunamis
                \n C. earthquakes
                \n D. hurricanes""");
        userInput =  scanner.next();
        if (userInput.equalsIgnoreCase("d")){
            System.out.println("correct\n");
            correctAnswer++;
        }else
            System.out.println("wrong\n");

        System.out.println("""
                Question 5: Rising water temperatures is a result of global warming and may eventually increase sea levels due to the dissolving of what? \n
                \n A. glaciers
                \n B. river beds
                \n C. wetlands
                \n D. mountains""");
        userInput = scanner.next();
        if (userInput.equalsIgnoreCase("a")){
            System.out.println("correct\n");
            correctAnswer++;
        }else
            System.out.println("wrong\n");


        switch (correctAnswer){

            case 5 -> {
                correctAnswer++;
                System.out.println("Excellent");
                System.out.println("total score is " + correctAnswer);
            }
            case 4 -> {
                correctAnswer++;
                System.out.println("Very Good");
                System.out.println("total score is " + correctAnswer);
            }
            case 3,2,1 -> {
                correctAnswer--;
                System.out.println("Time to brush up on your knowledge of global warming");
                System.out.println("total score is " + correctAnswer);
            }

        }
    }


}
