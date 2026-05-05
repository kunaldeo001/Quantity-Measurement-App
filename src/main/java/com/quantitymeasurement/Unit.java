package com.quantitymeasurement;

public interface Unit {
    double getConversionFactor();
    MeasurementType getType();

    enum MeasurementType {
        LENGTH, VOLUME, WEIGHT
    }

    enum LengthUnit implements Unit {
        INCH(1.0), FEET(12.0), YARD(36.0), CM(0.4);

        private final double conversionFactor;

        LengthUnit(double conversionFactor) {
            this.conversionFactor = conversionFactor;
        }

        @Override
        public double getConversionFactor() {
            return conversionFactor;
        }

        @Override
        public MeasurementType getType() {
            return MeasurementType.LENGTH;
        }
    }

    enum VolumeUnit implements Unit {
        GALLON(3.78), LITRE(1.0), ML(0.001);

        private final double conversionFactor;

        VolumeUnit(double conversionFactor) {
            this.conversionFactor = conversionFactor;
        }

        @Override
        public double getConversionFactor() {
            return conversionFactor;
        }

        @Override
        public MeasurementType getType() {
            return MeasurementType.VOLUME;
        }
    }

    enum WeightUnit implements Unit {
        KILOGRAM(1.0), GRAM(0.001), TONNE(1000.0);

        private final double conversionFactor;

        WeightUnit(double conversionFactor) {
            this.conversionFactor = conversionFactor;
        }

        @Override
        public double getConversionFactor() {
            return conversionFactor;
        }

        @Override
        public MeasurementType getType() {
            return MeasurementType.WEIGHT;
        }
    }
}
