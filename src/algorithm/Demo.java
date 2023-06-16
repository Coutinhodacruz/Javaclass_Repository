package algorithm;

public class Demo {
    public static void main(String[] args) {
        int value = 1;
        float number = 1.444f;

        Object obj = "Hello";

        StringBuilder name = new StringBuilder("Last String\n");
        name.append(value)
                .append("\n")
                .append(number)
                .append("\n")
                .append(obj);
        System.out.println(name);
    }
}
