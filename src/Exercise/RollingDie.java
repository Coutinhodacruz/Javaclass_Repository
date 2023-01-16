package Exercise;

import java.security.SecureRandom;

public class RollingDie {
    public static void main(String[] args) {

        SecureRandom random = new SecureRandom();

        for (int i = 0; i < 10; i++) {
            if (i == 7)
                continue;
            if (i == 5)
                break;
            int num = 1 + random.nextInt(10);
            System.out.println(num);

        }
    }
}
