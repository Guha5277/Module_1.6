package guhar4k.patterns.sructural.composite;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Earth implements Countable{
    private List<Country> countries = new ArrayList<>();

    public void addCountry(Country country){
        countries.add(country);
    }

    @Override
    public int getCount() {
        Optional<Integer> innerCountriesPopulation = countries.stream()
                .map(country -> country.getCount())
                .reduce((c1, c2) -> c1 + c2);
        return innerCountriesPopulation.orElse(0);
    }
}
