package com.epam.task1.assignment10.entity;

import java.text.DecimalFormat;
import java.util.List;
import java.util.Objects;

public class Data {
    private List<Double> numbers;

    public Data(List<Double> numbers) {
        this.numbers = numbers;
    }

    public List<Double> getNumbers() {
        return numbers;
    }

    public void setNumbers(List<Double> numbers) {
        this.numbers = numbers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Data data = (Data) o;

        if (numbers.size() != data.numbers.size()) {
            return false;
        }

        DecimalFormat df = new DecimalFormat("#.####");
        for (int i = 0; i < numbers.size(); i++) {
            if (!df.format(numbers.get(i)).equals(df.format(data.numbers.get(i)))) {
                return false;
            }
        }

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numbers);
    }

}
