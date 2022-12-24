package CharpterTwo;

public class Integers {
    public static void main(String[] args) {
        int x = 7;
        int y = 3;
        while (y <= x){
            y = x + 7;
              ++y;
            x = y++;
            x += y;
            System.out.println(x);
            if (x == y){
                System.out.println(y);
            }else {
                System.out.println(x);
            }
        }
    }
}
