package Exercise;

public class ArrayPractice {

    public static int sumArray(int ... numbers){
        int total = 1;
        for (int number : numbers){
            total += number;
        }
        return total;
    }
    public static void main(String[] args) {
        System.out.println(sumArray(4,8,6,5,3,2,7,1,66,45,32,87,73));
    }

}



//    int []grades = new int[6];
//
//            grades[0] = 78;
//            grades[1] = 43;
//            grades[2] = 56;
//            grades[3] = 34;
//            grades[4] = 90;
//            grades[5] = 78;
//
//        Arrays.sort(grades);
//
//        System.out.println("Maximum is " + grades[5]);
//        System.out.println("Minimum is " + grades[0]);
//
//        int total = 0;
//
//        for (int grade : grades) {
//            total += grade;
//        }
//        int average;
//        average = total / grades.length;
//        average = total / grades.length;
//        System.out.println("Average is " + average);
//
//        }
