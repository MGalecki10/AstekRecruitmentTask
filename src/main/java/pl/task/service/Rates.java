package pl.task.service;

public enum Rates {
    DAILY_ALLOWANCE(15.0),
    MILEAGE(0.3);

    private final double value;

    Rates(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}
