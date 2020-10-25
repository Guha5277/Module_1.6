package guhar4k.patterns.sructural.composite;

public class City implements Countable{
    private String name;
    private int population;

    public City(String name, int population) {
        this.population = population;
    }

    @Override
    public int getCount() {
        return population;
    }
}
