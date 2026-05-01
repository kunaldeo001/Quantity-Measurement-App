package com.quantitymeasurement;

public enum Unit {
    INCH(1.0, MeasurementType.LENGTH),
    FEET(12.0, MeasurementType.LENGTH),
    YARD(36.0, MeasurementType.LENGTH),
    CM(0.4, MeasurementType.LENGTH),

    // Volume units
    GALLON(3.78, MeasurementType.VOLUME),
    LITRE(1.0, MeasurementType.VOLUME),
    ML(0.001, MeasurementType.VOLUME),

    // Weight units
    KILOGRAM(1.0, MeasurementType.WEIGHT),
    GRAM(0.001, MeasurementType.WEIGHT),
    TONNE(1000.0, MeasurementType.WEIGHT);

    public final double conversionFactor;
    public final MeasurementType type;

    Unit(double conversionFactor, MeasurementType type) {
        this.conversionFactor = conversionFactor;
        this.type = type;
    }

    public enum MeasurementType {
        LENGTH, VOLUME, WEIGHT
    }
}
