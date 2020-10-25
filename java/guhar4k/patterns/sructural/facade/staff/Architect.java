package guhar4k.patterns.sructural.facade.staff;

import guhar4k.patterns.sructural.facade.common.Plan;

public class Architect {
    public Plan makePlan(int area, int floors) {
        System.out.println("Architect making the plan...");
        return new Plan(area, floors);
    }
}
