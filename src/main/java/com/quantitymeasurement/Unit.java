package com.quantitymeasurement;

public enum Unit {
    INCH(1.0, MeasurementType.LENGTH),
    FEET(12.0, MeasurementType.LENGTH),
    YARD(36.0, MeasurementType.LENGTH);

    public final double conversionFactor;
    public final MeasurementType type;

    Unit(double conversionFactor, MeasurementType type) {
        this.conversionFactor = conversionFactor;
        this.type = type;
    }

    public enum MeasurementType {
        LENGTH
    }
}
