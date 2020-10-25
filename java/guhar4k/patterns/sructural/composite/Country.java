package guhar4k.patterns.sructural.composite;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Country implements Countable{
    private String name;
    private List<Region> regions = new ArrayList<>();

    public Country(String name) {
        this.name = name;
    }

    public void addRegion(Region region){
        regions.add(region);
    }

    @Override
    public int getCount() {
        Optional<Integer> innerRegionsPopulation = regions.stream()
                .map(region -> region.getCount())
                .reduce((r1, r2) -> r1 + r2);
        return innerRegionsPopulation.orElse(0);
    }
}
