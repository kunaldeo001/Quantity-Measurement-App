package com.quantitymeasurement.UC12;

import com.quantitymeasurement.QuantityMeasurementApp;
import com.quantitymeasurement.Unit;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QuantityMeasurementTest {

    @Test
    public void Uc12_given1FeetAnd12Inch_WhenSubtracted_ShouldReturn0Feet() {
        QuantityMeasurementApp feet = new QuantityMeasurementApp(1.0, Unit.LengthUnit.FEET);
        QuantityMeasurementApp inch = new QuantityMeasurementApp(12.0, Unit.LengthUnit.INCH);
        QuantityMeasurementApp result = feet.subtract(inch);
        assertEquals(0.0, result.getValue(), 0.001);
    }

    @Test
    public void Uc12_given1KgAnd500Gram_WhenSubtracted_ShouldReturn500Gram() {
        QuantityMeasurementApp kg = new QuantityMeasurementApp(1.0, Unit.WeightUnit.KILOGRAM);
        QuantityMeasurementApp gram = new QuantityMeasurementApp(500.0, Unit.WeightUnit.GRAM);
        QuantityMeasurementApp result = kg.subtract(gram);
        // result in Kg: 0.5
        assertEquals(0.5, result.getValue(), 0.001);
    }

    @Test
    public void Uc12_given10Feet_WhenDividedBy2_ShouldReturn5Feet() {
        QuantityMeasurementApp feet = new QuantityMeasurementApp(10.0, Unit.LengthUnit.FEET);
        QuantityMeasurementApp result = feet.divide(2);
        assertEquals(5.0, result.getValue(), 0.001);
    }

    @Test
    public void Uc12_given10Feet_WhenDividedBy0_ShouldThrowException() {
        QuantityMeasurementApp feet = new QuantityMeasurementApp(10.0, Unit.LengthUnit.FEET);
        assertThrows(ArithmeticException.class, () -> feet.divide(0));
    }
}
