package turtle;

public class SketchPad {

    private final int[][] floor;
    public SketchPad(int floorRow, int floorColumn){
        floor = new int[floorRow][floorColumn];

    }

    public int[][] getFloor() {
        return floor;
    }
    public void display(){
        for (var row : floor){
            for (var column : row){
                if (column == 1) System.out.print("* ");
                if (column == 0) System.out.println(" ");
            }
            System.out.println();
        }
    }
}
