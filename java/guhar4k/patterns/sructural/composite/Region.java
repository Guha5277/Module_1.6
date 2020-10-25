package guhar4k.patterns.sructural.composite;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Region implements Countable {
    private String name;
    private List<City> cities = new ArrayList();

    public Region(String name) {
        this.name = name;
    }

    public void addCity(City city){
        cities.add(city);
    }

    @Override
    public int getCount() {
        Optional<Integer> innerCitiesPopulation = cities.stream()
                .map(city -> city.getCount())
                .reduce((p1, p2) -> p1 + p2);
        return innerCitiesPopulation.orElse(0);
    }
}
