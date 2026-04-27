package com.quantitymeasurement.UC4;

import com.quantitymeasurement.QuantityMeasurementApp;
import com.quantitymeasurement.Unit;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QuantityMeasurementTest {

    @Test
    public void given3FeetAnd1Yard_WhenCompared_ShouldReturnTrue() {
        QuantityMeasurementApp feet = new QuantityMeasurementApp(3.0, Unit.FEET);
        QuantityMeasurementApp yard = new QuantityMeasurementApp(1.0, Unit.YARD);
        assertEquals(feet, yard);
    }

    @Test
    public void given1FeetAnd1Yard_WhenCompared_ShouldReturnFalse() {
        QuantityMeasurementApp feet = new QuantityMeasurementApp(1.0, Unit.FEET);
        QuantityMeasurementApp yard = new QuantityMeasurementApp(1.0, Unit.YARD);
        assertNotEquals(feet, yard);
    }

    @Test
    public void given1InchAnd1Yard_WhenCompared_ShouldReturnFalse() {
        QuantityMeasurementApp inch = new QuantityMeasurementApp(1.0, Unit.INCH);
        QuantityMeasurementApp yard = new QuantityMeasurementApp(1.0, Unit.YARD);
        assertNotEquals(inch, yard);
    }
}
