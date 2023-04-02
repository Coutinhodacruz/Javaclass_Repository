package turtle;

import java.util.Arrays;

public class Movement {

   private char[][] numbers;

      public void display(char[][] count){
            this.numbers = count;
         for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
               numbers = count;
            }

         }

      }

      public char[] displayMain(){
         for (char[] number : numbers) {
            System.out.println(Arrays.toString(number) + " ");
         }
//

         return new char[0];
      }

      public void modifyDisplay(char[][] array){
         for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
               if (numbers[i][j] == '0'){
                  System.out.println('0' + " ");
               }else
                  System.out.println('1' + " ");

            }

         }
      }

}