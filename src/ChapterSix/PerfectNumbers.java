package ChapterSix;

public class PerfectNumbers {
    public static void main(String[] args) {

//        for (int i = 1; i <= 100; i++){
//            isPerfect(i);
//        }

        isPerfect(6);
    }
    private static  void isPerfect(int num) {
        int sum = 0;

        for (int count = 1; count <= num; count++) {
            if (num % count == 0){
                sum += count;
            }

        }
        if (num == sum){
            System.out.printf("%d is a perfect number%n", num);
        }

        else{
            System.out.printf("%d is not a perfect number%n", num);
        }
    }
}

