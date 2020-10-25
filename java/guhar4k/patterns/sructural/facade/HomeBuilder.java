package guhar4k.patterns.sructural.facade;

import guhar4k.patterns.sructural.facade.common.Plan;
import guhar4k.patterns.sructural.facade.staff.Architect;
import guhar4k.patterns.sructural.facade.staff.Builder;
import guhar4k.patterns.sructural.facade.staff.Foreman;
import guhar4k.patterns.sructural.facade.staff.Worker;

public class HomeBuilder {
    private Plan plan;
    private Architect architect = new Architect();
    private Foreman foreman = new Foreman();
    private Worker worker = new Worker();
    private Builder builder = new Builder();

    void buildHouse(int area, int floors){
        System.out.println("House development in progress...");
        plan = architect.makePlan(area, floors);
        foreman.buyConstructionMaterials(plan);
        worker.bringMaterials();
        builder.buildFoundation(plan);
        builder.buildWalls(plan);
        builder.buildRoof(plan);
        System.out.println("The house is built");
    }
}
