public class PopulationProjection {
    public static void main(String[] args) {
        // This is the current population.
        int currentPopulation = 312_032_486;
        // This is the variable for the number of years.
        int year = 1;
        // Figure out how many births, deaths, and immigrations happen in a year. There are 31,536,000 seconds in 365 days.
        int births = year * 31_536_000 / 7;
        int deaths = year * 31_536_000 / 13;
        int immigrations = year * 31_536_000 / 45;
        // Total population change.
        int populationChange = births + immigrations - deaths;
        // Print the population for the first year.
        System.out.println("The population after " + year + " year is " + (currentPopulation + populationChange) + ".");
        // Print the population for the second year.
        year = 2;
        births = year * 31_536_000 / 7;
        deaths = year * 31_536_000 / 13;
        immigrations = year * 31_536_000 / 45;
        populationChange = births + immigrations - deaths;
        System.out.println("The population after " + year + " years is " + (currentPopulation + populationChange) + ".");
        // Print out the population for the third year.
        year = 3;
        births = year * 31_536_000 / 7;
        deaths = year * 31_536_000 / 13;
        immigrations = year * 31_536_000 / 45;
        populationChange = births + immigrations - deaths;
        System.out.println("The population after " + year + " years is " + (currentPopulation + populationChange) + ".");
        // Print up the population for the fourth year.
        year = 4;
        births = year * 31_536_000 / 7;
        deaths = year * 31_536_000 / 13;
        immigrations = year * 31_536_000 / 45;
        populationChange = births + immigrations - deaths;
        System.out.println("The population after " + year + " years is " + (currentPopulation + populationChange) + ".");
        // Find the population for the fifth year.
        year = 5;
        births = year * 31_536_000 / 7;
        deaths = year * 31_536_000 / 13;
        immigrations = year * 31_536_000 / 45;
        populationChange = births + immigrations - deaths;
        System.out.println("The population after " + year + " years is " + (currentPopulation + populationChange) + ".");
        // My population projection isn't exactly correct because the numbers don't take into account some factors, such as emigration.
    }
}
