package guhar4k.patterns.sructural.facade.staff;

import guhar4k.patterns.sructural.facade.common.Plan;

public class Builder {
    public void buildFoundation(Plan plan){
        System.out.println("Worker building the foundation...");
    }

    public void buildWalls(Plan plan){
        System.out.println("Worker building the walls...");
    }

    public void buildRoof(Plan plan){
        System.out.println("Worker building the roofs...");
    }
}
