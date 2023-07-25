package ChapterFive;

public class ModifiedTriangle {
    public static void main(String[] args) {

        int size = 10;

        for (int i = 1; i <= size; i++) {
            StringBuilder row = new StringBuilder();
            int j = 1;
            while (j <= i) {
                row.append("*");
                j++;
            }
            int k = 1;
            while (k <= size -1) {
                row.append(" ");
                k++;
            }
            int p = 1;
            while (p <= i) {
                row.append("*");
                p++;
            }
            System.out.println(row);
        }

        for (int i = size; i >= 1; i--) {
            StringBuilder newRow = new StringBuilder();

            int j = 1;
            while (j <= i) {
                newRow.append("*");
                j++;
            }
            int k = 1;
            while (k <= size - 1) {
                newRow.append(" ");
                k++;
            }
            int a = 1;
            while (a <= i) {
                newRow.append("*");
                a++;
            }
            System.out.println(newRow);
        }
    }
}
