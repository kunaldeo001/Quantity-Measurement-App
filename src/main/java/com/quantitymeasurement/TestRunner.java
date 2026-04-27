package com.quantitymeasurement;

public class TestRunner {
    public static void main(String[] args) {
        testFeetEquality();
        testFeetToInchesEquality();
        testYardToFeetEquality();
        testYardToInchesEquality();
        System.out.println("All sanity checks passed!");
    }

    private static void testFeetEquality() {
        QuantityMeasurementApp feet1 = new QuantityMeasurementApp(0.0, Unit.FEET);
        QuantityMeasurementApp feet2 = new QuantityMeasurementApp(0.0, Unit.FEET);
        assert feet1.equals(feet2) : "0 ft should equal 0 ft";
        
        QuantityMeasurementApp feet3 = new QuantityMeasurementApp(1.0, Unit.FEET);
        assert !feet1.equals(feet3) : "0 ft should not equal 1 ft";
    }

    private static void testFeetToInchesEquality() {
        QuantityMeasurementApp feet = new QuantityMeasurementApp(1.0, Unit.FEET);
        QuantityMeasurementApp inches = new QuantityMeasurementApp(12.0, Unit.INCH);
        assert feet.equals(inches) : "1 ft should equal 12 in";
    }

    private static void testYardToFeetEquality() {
        QuantityMeasurementApp yard = new QuantityMeasurementApp(1.0, Unit.YARD);
        QuantityMeasurementApp feet = new QuantityMeasurementApp(3.0, Unit.FEET);
        assert yard.equals(feet) : "1 yd should equal 3 ft";
    }

    private static void testYardToInchesEquality() {
        QuantityMeasurementApp yard = new QuantityMeasurementApp(1.0, Unit.YARD);
        QuantityMeasurementApp inches = new QuantityMeasurementApp(36.0, Unit.INCH);
        assert yard.equals(inches) : "1 yd should equal 36 in";
    }
}
