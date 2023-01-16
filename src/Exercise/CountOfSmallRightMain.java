package Exercise;

public class CountOfSmallRightMain {

    public static void main(String[] args) {
        CountOfSmallerRight countOfSmallerRight = new CountOfSmallerRight();

        int[] coutinho = {2, 3, 5, 6, 7, 8, 9, 10};
       CountOfSmallerRight.missing2(coutinho, 10);
		int[] arr = countOfSmallerRight.getNewList(coutinho);
        for (int j : arr) System.out.print(j + " ");
        countOfSmallerRight.find(arr.length);

    }
}
