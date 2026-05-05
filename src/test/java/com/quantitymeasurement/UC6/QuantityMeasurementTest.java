package com.quantitymeasurement.UC6;

import com.quantitymeasurement.QuantityMeasurementApp;
import com.quantitymeasurement.Unit;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QuantityMeasurementTest {

    @Test
    public void given2InchAnd2Inch_WhenAdded_ShouldReturn4Inch() {
        QuantityMeasurementApp inch1 = new QuantityMeasurementApp(2.0, Unit.LengthUnit.INCH);
        QuantityMeasurementApp inch2 = new QuantityMeasurementApp(2.0, Unit.LengthUnit.INCH);
        QuantityMeasurementApp expected = new QuantityMeasurementApp(4.0, Unit.LengthUnit.INCH);
        QuantityMeasurementApp result = inch1.add(inch2);
        assertEquals(expected, result);
    }

    @Test
    public void given1FeetAnd2Inch_WhenAdded_ShouldReturn14Inch() {
        QuantityMeasurementApp feet = new QuantityMeasurementApp(1.0, Unit.LengthUnit.FEET);
        QuantityMeasurementApp inch = new QuantityMeasurementApp(2.0, Unit.LengthUnit.INCH);
        QuantityMeasurementApp expected = new QuantityMeasurementApp(14.0, Unit.LengthUnit.INCH);
        QuantityMeasurementApp result = feet.add(inch);
        // Note: result will be in Feet because feet was the base object. 
        // 1.1666... feet = 14 inches.
        // My equals method handles base conversion, so it should pass if compared correctly.
        assertEquals(expected, result);
    }

    @Test
    public void given1FeetAnd1Feet_WhenAdded_ShouldReturn24Inch() {
        QuantityMeasurementApp feet1 = new QuantityMeasurementApp(1.0, Unit.LengthUnit.FEET);
        QuantityMeasurementApp feet2 = new QuantityMeasurementApp(1.0, Unit.LengthUnit.FEET);
        QuantityMeasurementApp expected = new QuantityMeasurementApp(24.0, Unit.LengthUnit.INCH);
        QuantityMeasurementApp result = feet1.add(feet2);
        assertEquals(expected, result);
    }
}
