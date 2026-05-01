package com.quantitymeasurement;

public class TestRunner {
    public static void main(String[] args) {
        testFeetEquality();
        testFeetToInchesEquality();
        testYardToFeetEquality();
        testYardToInchesEquality();
        testVolumeEquality();
        testWeightEquality();
        testAddition();
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

    private static void testVolumeEquality() {
        QuantityMeasurementApp gallon = new QuantityMeasurementApp(1.0, Unit.GALLON);
        QuantityMeasurementApp litres = new QuantityMeasurementApp(3.78, Unit.LITRE);
        assert gallon.equals(litres) : "1 gallon should equal 3.78 litres";

        QuantityMeasurementApp litre = new QuantityMeasurementApp(1.0, Unit.LITRE);
        QuantityMeasurementApp ml = new QuantityMeasurementApp(1000.0, Unit.ML);
        assert litre.equals(ml) : "1 litre should equal 1000 ml";
    }

    private static void testWeightEquality() {
        QuantityMeasurementApp kg = new QuantityMeasurementApp(1.0, Unit.KILOGRAM);
        QuantityMeasurementApp gram = new QuantityMeasurementApp(1000.0, Unit.GRAM);
        assert kg.equals(gram) : "1 kg should equal 1000 grams";

        QuantityMeasurementApp tonne = new QuantityMeasurementApp(1.0, Unit.TONNE);
        QuantityMeasurementApp kgs = new QuantityMeasurementApp(1000.0, Unit.KILOGRAM);
        assert tonne.equals(kgs) : "1 tonne should equal 1000 kg";
    }

    private static void testAddition() {
        QuantityMeasurementApp inch1 = new QuantityMeasurementApp(2.0, Unit.INCH);
        QuantityMeasurementApp inch2 = new QuantityMeasurementApp(2.0, Unit.INCH);
        QuantityMeasurementApp result = inch1.add(inch2);
        assert result.equals(new QuantityMeasurementApp(4.0, Unit.INCH)) : "2 in + 2 in should be 4 in";

        QuantityMeasurementApp feet = new QuantityMeasurementApp(1.0, Unit.FEET);
        QuantityMeasurementApp inch = new QuantityMeasurementApp(2.0, Unit.INCH);
        QuantityMeasurementApp result2 = feet.add(inch);
        assert result2.equals(new QuantityMeasurementApp(14.0, Unit.INCH)) : "1 ft + 2 in should be 14 in";
    }
}
