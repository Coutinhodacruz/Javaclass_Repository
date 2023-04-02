package Assignment;

public class LargestElement {

    // No 1

    public static int getLargest(int[] count, int total){
        int temp;
        for (int counter = 0; counter < total; counter++){
            for (int j = counter + 1; j < total; j++)
            {
                if (count[counter] > count[j])
                {
                    temp = count[counter];
                    count[counter] = count[j];
                    count[j] = temp;
                }
            }
        }
        return count[total-1];
    }
    public static void main(String[] args){
        int[] number={44,66,99,77,33,22,55,10,89,90};
        System.out.println("Largest: "+getLargest(number,10));
    }

}
