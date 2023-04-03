package ProblemStatement;

import java.util.List;

public class Person {
    private List<Problem> problems;

    //To add problem to the list

    public void addProblem(Problem problem){
        problems.add(problem);

    }
    public void tellProblem(){
        for (Problem problem : problems){
            if (problem.isSolved()) System.out.println(problem);
        }
    }
}
