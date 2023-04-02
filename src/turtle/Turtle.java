package turtle;

import static turtle.Direction.*;

public class Turtle {
    private Position position = new Position(0,0);

private boolean penIsDown;
private Direction direction = EAST;


    public Direction getDirection() {
        return direction;
    }

    public void turnRight() {
        if (direction == EAST)  face(SOUTH);
       else if (direction == SOUTH) face(WEST);
       else if (direction == WEST) face(NORTH);
    }

    private void face(Direction newDirection){
        direction = newDirection;
    }

    public boolean isPenDown() {
        return penIsDown;
    }

    public void movePenDown() {
        penIsDown = true;
    }

    public void movePenUp() {
        penIsDown = false;
    }


    public void turnLeft() {
        switch (direction){
            case EAST -> face(NORTH);
            case NORTH -> face(WEST);
            case WEST -> face(SOUTH);
        }
//        if (direction == EAST) face(NORTH);
//        else if (direction == NORTH) face(WEST);
//        else if (direction == WEST) face(SOUTH);



    }

    private void moveForward(int numberOfSteps) {
        if (direction == EAST) moveHorizontalyBy(numberOfSteps);
        if (direction == WEST) moveHorizontalyBy(-numberOfSteps);
        if ( direction == SOUTH) moveHorizontalyBy(+numberOfSteps);
    }

    public void moveForward(int numberOfSteps, SketchPad sketchPad) {
        if (penIsDown) writeOn(sketchPad,numberOfSteps);
        
        moveForward(numberOfSteps);
    }

    private void writeOn(SketchPad sketchPad, int numberOfSteps) {
        var floor = sketchPad.getFloor();
        if (direction== EAST) writeEastWards(numberOfSteps, floor);



    }
    private void writeEastWards(int numberOfSteps, int[][] floor){
        int row = position.getRow();
        int currentColumn = position.getColumn();
        for (int column = currentColumn; column < numberOfSteps+currentColumn; column++) floor[row][column] =1;


    }


    public Position getPosition() {
        return position;
    }
    public void moveHorizontalyBy(int numberOfSteps){
        position.setColumn(numberOfSteps + position.getColumn());

    }



}
