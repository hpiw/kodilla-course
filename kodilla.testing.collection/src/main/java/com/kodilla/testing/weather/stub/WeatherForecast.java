package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();
        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }

    public double calculateAverageTemperature() {
        double sum = 0.0;
        Map<String, Double> temperaturesMap = temperatures.getTemperatures();
        for (double temp : temperaturesMap.values()) {
            sum += temp;
        }
        return sum / temperaturesMap.size();
    }

    public double calculateMedianTemperature() {
        List<Double> temps = new ArrayList<>(temperatures.getTemperatures().values());
        Collections.sort(temps);
        int middle = temps.size() / 2;
        if (temps.size() % 2 == 0) {
            return (temps.get(middle - 1) + temps.get(middle)) / 2.0;
        } else {
            return temps.get(middle);
        }
    }
}
