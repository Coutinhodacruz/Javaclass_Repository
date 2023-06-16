package ChapterFive;

public class StarPrinting {
    public static void main(String[] args) {
        int star = 8;

        for (int row = 1; row <= star; row++) {
            for (int column = 1; column < row; column++) {
                System.out.print("*");
            }
            System.out.print("  ");
            for (int i = star; i >= row; i--) {
                System.out.print("*");

            }
            System.out.println("  ");

        }
    }
}




////        int triangles = 10;
////        for (int i = 1; i <= triangles; i++) {
////            for (int j = 1; j <= i; ++j) {
////                System.out.print("*");
////            }
////            System.out.print("      ");
////            for (int l =  triangles; l >= i; l--) {
////                System.out.print("*");
////            }
////            System.out.print("       ");
////            for (int k = triangles; k >= i; k--) {
////                System.out.print("*");
////            }
////            System.out.print("      ");
////            for (int l = 1;  l <= triangles; l++) {
////                System.out.print("*");
////            }
//            System.out.println();
//        }

