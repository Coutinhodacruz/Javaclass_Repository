package turtle;

public class MultilDimensionalArray {
    public static void main(String[] args) {
        char[][] arrays = new char[3][];
        arrays[0] = new char[]{'O','X','X'};
        arrays[1] = new char[]{'X','O','O'};
        arrays[2] = new char[]{'X','O','X'};
        System.out.println(displayMenu(arrays));
        
        


    }

    public static String displayOneLoop(char[][] charArrays){
        String result = " ";

        for (char[] chars : charArrays){
            result += chars[0] + " " + chars[1] + " " + chars[2] + "\n";
        }
        return result;
    }

//    public static String displayOneLoopSout(){
//        String result = "";
//        for (char[] chars )
//    }


    
    public static  String displaysMain(char[][] charArray){
        String result = "";
        for (int row = 0; row < charArray.length; row++) {
            for (int column = 0; column < charArray.length; column++) {

            }

        }
        return result;
    }




    public static String displayMenu(char[][]charArrays){

        String result = "";
        for (char[] charArray : charArrays){
            for (char character : charArray){
                if (character == '0') result += "O ";
                if (character == 'X') result += "1 ";
                
            }

        }
        return result;
    }
}
