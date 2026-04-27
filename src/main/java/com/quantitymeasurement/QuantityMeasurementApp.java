package com.quantitymeasurement;

import java.util.Objects;

public class QuantityMeasurementApp {
    private final double value;
    private final Unit unit;

    public QuantityMeasurementApp(double value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuantityMeasurementApp that = (QuantityMeasurementApp) o;
        if (this.unit.type != that.unit.type) return false;
        double thisValueInBase = this.value * this.unit.conversionFactor;
        double thatValueInBase = that.value * that.unit.conversionFactor;
        return Double.compare(thisValueInBase, thatValueInBase) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value * unit.conversionFactor, unit.type);
    }
}
