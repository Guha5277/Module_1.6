package guhar4k.patterns.sructural.adapter;

public class ProblemSolveRunner {
    public static void main(String[] args) {
        ProblemSolver problemSolver = new WorldProblemsSolver();
        problemSolver.stopTheWars();
        problemSolver.saveTheWorld();
    }
}
