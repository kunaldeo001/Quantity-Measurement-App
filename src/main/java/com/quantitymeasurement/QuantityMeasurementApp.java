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
        if (this.unit.getType() != that.unit.getType()) return false;
        double thisValueInBase = this.value * this.unit.getConversionFactor();
        double thatValueInBase = that.value * that.unit.getConversionFactor();
        return Math.abs(thisValueInBase - thatValueInBase) < 0.0001; // Using a small epsilon for double comparison
    }

    @Override
    public int hashCode() {
        return Objects.hash(value * unit.getConversionFactor(), unit.getType());
    }

    private void validateSameType(QuantityMeasurementApp that) {
        if (this.unit.getType() != that.unit.getType()) {
            throw new IllegalArgumentException("Cannot perform operation on different measurement types");
        }
    }

    private double getValueInBase() {
        return this.value * this.unit.getConversionFactor();
    }

    public QuantityMeasurementApp add(QuantityMeasurementApp that) {
        validateSameType(that);
        double sumInBase = this.getValueInBase() + that.getValueInBase();
        return new QuantityMeasurementApp(sumInBase / this.unit.getConversionFactor(), this.unit);
    }

    public QuantityMeasurementApp add(QuantityMeasurementApp that, Unit targetUnit) {
        validateSameType(that);
        double sumInBase = this.getValueInBase() + that.getValueInBase();
        return new QuantityMeasurementApp(sumInBase / targetUnit.getConversionFactor(), targetUnit);
    }

    public QuantityMeasurementApp subtract(QuantityMeasurementApp that) {
        validateSameType(that);
        double diffInBase = this.getValueInBase() - that.getValueInBase();
        return new QuantityMeasurementApp(diffInBase / this.unit.getConversionFactor(), this.unit);
    }

    public QuantityMeasurementApp divide(double divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return new QuantityMeasurementApp(this.value / divisor, this.unit);
    }

    public double getValue() {
        return value;
    }

    public Unit getUnit() {
        return unit;
    }
}
