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
        testAdditionWithTargetUnit();
        testSubtraction();
        testDivision();
        testTypeValidation();
        System.out.println("All sanity checks passed!");
    }

    private static void testFeetEquality() {
        QuantityMeasurementApp feet1 = new QuantityMeasurementApp(0.0, Unit.LengthUnit.FEET);
        QuantityMeasurementApp feet2 = new QuantityMeasurementApp(0.0, Unit.LengthUnit.FEET);
        assert feet1.equals(feet2) : "0 ft should equal 0 ft";
        
        QuantityMeasurementApp feet3 = new QuantityMeasurementApp(1.0, Unit.LengthUnit.FEET);
        assert !feet1.equals(feet3) : "0 ft should not equal 1 ft";
    }

    private static void testFeetToInchesEquality() {
        QuantityMeasurementApp feet = new QuantityMeasurementApp(1.0, Unit.LengthUnit.FEET);
        QuantityMeasurementApp inches = new QuantityMeasurementApp(12.0, Unit.LengthUnit.INCH);
        assert feet.equals(inches) : "1 ft should equal 12 in";
    }

    private static void testYardToFeetEquality() {
        QuantityMeasurementApp yard = new QuantityMeasurementApp(1.0, Unit.LengthUnit.YARD);
        QuantityMeasurementApp feet = new QuantityMeasurementApp(3.0, Unit.LengthUnit.FEET);
        assert yard.equals(feet) : "1 yd should equal 3 ft";
    }

    private static void testYardToInchesEquality() {
        QuantityMeasurementApp yard = new QuantityMeasurementApp(1.0, Unit.LengthUnit.YARD);
        QuantityMeasurementApp inches = new QuantityMeasurementApp(36.0, Unit.LengthUnit.INCH);
        assert yard.equals(inches) : "1 yd should equal 36 in";
    }

    private static void testVolumeEquality() {
        QuantityMeasurementApp gallon = new QuantityMeasurementApp(1.0, Unit.VolumeUnit.GALLON);
        QuantityMeasurementApp litres = new QuantityMeasurementApp(3.78, Unit.VolumeUnit.LITRE);
        assert gallon.equals(litres) : "1 gallon should equal 3.78 litres";

        QuantityMeasurementApp litre = new QuantityMeasurementApp(1.0, Unit.VolumeUnit.LITRE);
        QuantityMeasurementApp ml = new QuantityMeasurementApp(1000.0, Unit.VolumeUnit.ML);
        assert litre.equals(ml) : "1 litre should equal 1000 ml";
    }

    private static void testWeightEquality() {
        QuantityMeasurementApp kg = new QuantityMeasurementApp(1.0, Unit.WeightUnit.KILOGRAM);
        QuantityMeasurementApp gram = new QuantityMeasurementApp(1000.0, Unit.WeightUnit.GRAM);
        assert kg.equals(gram) : "1 kg should equal 1000 grams";

        QuantityMeasurementApp tonne = new QuantityMeasurementApp(1.0, Unit.WeightUnit.TONNE);
        QuantityMeasurementApp kgs = new QuantityMeasurementApp(1000.0, Unit.WeightUnit.KILOGRAM);
        assert tonne.equals(kgs) : "1 tonne should equal 1000 kg";
    }

    private static void testAddition() {
        QuantityMeasurementApp inch1 = new QuantityMeasurementApp(2.0, Unit.LengthUnit.INCH);
        QuantityMeasurementApp inch2 = new QuantityMeasurementApp(2.0, Unit.LengthUnit.INCH);
        QuantityMeasurementApp result = inch1.add(inch2);
        assert result.equals(new QuantityMeasurementApp(4.0, Unit.LengthUnit.INCH)) : "2 in + 2 in should be 4 in";

        QuantityMeasurementApp feet = new QuantityMeasurementApp(1.0, Unit.LengthUnit.FEET);
        QuantityMeasurementApp inch = new QuantityMeasurementApp(2.0, Unit.LengthUnit.INCH);
        QuantityMeasurementApp result2 = feet.add(inch);
        assert result2.equals(new QuantityMeasurementApp(14.0, Unit.LengthUnit.INCH)) : "1 ft + 2 in should be 14 in";
    }

    private static void testAdditionWithTargetUnit() {
        QuantityMeasurementApp gallon = new QuantityMeasurementApp(1.0, Unit.VolumeUnit.GALLON);
        QuantityMeasurementApp litre = new QuantityMeasurementApp(3.78, Unit.VolumeUnit.LITRE);
        QuantityMeasurementApp result = gallon.add(litre, Unit.VolumeUnit.GALLON);
        assert result.getValue() == 2.0 : "1 gallon + 3.78 litre should be 2 gallon";
        assert result.getUnit() == Unit.VolumeUnit.GALLON;
    }

    private static void testSubtraction() {
        QuantityMeasurementApp feet = new QuantityMeasurementApp(1.0, Unit.LengthUnit.FEET);
        QuantityMeasurementApp inch = new QuantityMeasurementApp(12.0, Unit.LengthUnit.INCH);
        QuantityMeasurementApp result = feet.subtract(inch);
        assert result.getValue() == 0.0 : "1 ft - 12 in should be 0";
    }

    private static void testDivision() {
        QuantityMeasurementApp feet = new QuantityMeasurementApp(10.0, Unit.LengthUnit.FEET);
        QuantityMeasurementApp result = feet.divide(2);
        assert result.getValue() == 5.0 : "10 ft / 2 should be 5 ft";
    }

    private static void testTypeValidation() {
        try {
            QuantityMeasurementApp feet = new QuantityMeasurementApp(1.0, Unit.LengthUnit.FEET);
            QuantityMeasurementApp kg = new QuantityMeasurementApp(1.0, Unit.WeightUnit.KILOGRAM);
            feet.add(kg);
            assert false : "Adding feet and kg should throw exception";
        } catch (IllegalArgumentException e) {
            // Success
        }
    }
}
