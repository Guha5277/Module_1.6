package guhar4k.patterns.sructural.composite;

public class Launcher {
    public static void main(String[] args) {
        Earth earth = new Earth();

        Country countryUSA = new Country("USA");
        Region regionCA = new Region("California");
        City cityLA = new City("Los Angeles", 3_884_307);
        City citySD = new City("San Diego", 1_335_896);
        City citySF = new City("San Francisco", 837_442);

        regionCA.addCity(cityLA);
        regionCA.addCity(citySD);
        regionCA.addCity(citySF);

        countryUSA.addRegion(regionCA);

        Country countryCN = new Country("China");
        Region regionHebei = new Region("Hebei");
        City cityBN = new City("Beijing", 21_710_000);
        regionHebei.addCity(cityBN);
        countryCN.addRegion(regionHebei);

        earth.addCountry(countryUSA);
        earth.addCountry(countryCN);

        System.out.println("Population of Los Angeles is: " + cityLA.getCount());
        System.out.println("Population of USA is: " + countryUSA.getCount());
        System.out.println("Population of China is: " + countryCN.getCount());
        System.out.println("Population of the World is: " + earth.getCount());

    }
}
