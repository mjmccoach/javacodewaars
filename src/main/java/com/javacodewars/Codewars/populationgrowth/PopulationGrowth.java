package com.javacodewars.Codewars.populationgrowth;

public class PopulationGrowth {

    public static int nbYear(int p0, double percent, int newPeople, int targetPopulation) {
        double percentAgeGain = percent / 100;

        int currentPopulation = p0;
        int yearsRequired = 0;
        while (currentPopulation < targetPopulation) {
            double percentOfCurrentPopulation = currentPopulation * percentAgeGain;
            currentPopulation += (int) Math.round(percentOfCurrentPopulation);
            currentPopulation += newPeople;
            yearsRequired += 1;
        }

        return yearsRequired;
    }
}
