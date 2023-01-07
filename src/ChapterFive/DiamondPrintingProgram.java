package ChapterFive;

public class DiamondPrintingProgram {
    public static void main(String[] args) {
        int row;
        row = 5;
        upperDiamond(row, 0); // print uper part of triangle
        lowerDiamond(row, 1); // print lower part of diamond

    }

    static void goToNextLine(int k, int i, int z) {
        if (k == i) // base case
            return;
        System.out.print("* ");
        goToNextLine(k + z, i, z);
    }

    static void addBlankSpaceInDiamond(int j, int i, int z) // print blank space of diamond
    {
        if (j == i)
            return;
        System.out.print(" ");
        addBlankSpaceInDiamond(j + z, i, z);
    }

    static void upperDiamond(int row, int i) {
        if (i > row) // base case
            return;
        addBlankSpaceInDiamond(row, i, -1);
        goToNextLine(0, i, 1);
        System.out.print("\n");
        upperDiamond(row, i + 1); // recursive call
    }

    static void lowerDiamond(int row, int i) // print the next line of diamond
    {
        if (i > row) // base case
            return;
        addBlankSpaceInDiamond(0, i, 1);
        goToNextLine(row, i, -1);
        System.out.print("\n");
        lowerDiamond(row, i + 1);
    }


}












//    static void printDiamond(int n)
//    {
//        int space = n - 1;
//
//        // run loop (parent loop)
//        // till number of rows
//        for (int i = 0; i < n; i++)
//        {
//            // loop for initially space,
//            // before star printing
//            for (int j = 0; j < space; j++)
//                System.out.print(" ");
//
//            // Print i+1 stars
//            for (int j = 0; j <= i; j++)
//                System.out.print("* ");
//
//            System.out.print("\n");
//            space--;
//        }
//
//        // Repeat again in
//        // reverse order
//        space = 0;
//
//        // run loop (parent loop)
//        // till number of rows
//        for (int i = n; i > 0; i--)
//        {
//            // loop for initially space,
//            // before star printing
//            for (int j = 0; j < space; j++)
//                System.out.print(" ");
//
//            // Print i stars
//            for (int j = 0; j < i; j++)
//                System.out.print("* ");
//
//            System.out.print("\n");
//            space++;
//        }
//    }
//
//    // Driver Code
//    public static void main(String[] args)
//    {
//        printDiamond(5);
//
//    }
//}



