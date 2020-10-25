package guhar4k.patterns.sructural.facade;

public class BuilderLaunch {
    public static void main(String[] args) {
        HomeBuilder homeBuilder = new HomeBuilder();
        homeBuilder.buildHouse(50, 2);
    }
}
