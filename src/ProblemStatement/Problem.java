package ProblemStatement;

public class Problem {
    private String name;
    private Type type;
    private boolean isSolved;

    public boolean isSolved() {
        return isSolved;
    }
    public void setSolved(boolean solved){
        isSolved = solved;
    }
    public String toString(){
        return String.format("""
                Name: %s
                Type: %s
                isSolved: %s
                """,name, type.name(), isSolved);
    }
}
