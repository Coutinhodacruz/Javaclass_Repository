package turtle;

public class Position {
    private int row;
    private static int column;

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public  void setColumn(int column) {
        Position.column = column;
    }

    public Position(int row, int column) {
        Position.column = column;
        this.row = row;
    }

    public String toString(){
        return "position{" +
                "row=" + row +
                ", column" + column +
                '}';

    }

    @Override
    public boolean equals(Object anotherObject){
        if (!(anotherObject instanceof Position o)) return  false;
        return this.row == o.row && this.column == o.column;
    }
}
