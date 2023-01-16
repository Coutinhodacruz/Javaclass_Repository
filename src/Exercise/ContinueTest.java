package Exercise;

public class ContinueTest {
    public static void main(String[] args) {

        for (int count = 1; count <= 10; count++) {
            if (count == 5 || count == 6){
                continue;
            }
            System.out.printf("%d ", count);
        }
    }
}
