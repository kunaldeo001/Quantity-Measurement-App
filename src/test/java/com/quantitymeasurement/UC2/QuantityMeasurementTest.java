package com.quantitymeasurement.UC2;

import com.quantitymeasurement.QuantityMeasurementApp;
import com.quantitymeasurement.Unit;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QuantityMeasurementTest {

    @Test
    public void given1FeetAnd12Inches_WhenCompared_ShouldReturnTrue() {
        QuantityMeasurementApp feet = new QuantityMeasurementApp(1.0, Unit.FEET);
        QuantityMeasurementApp inches = new QuantityMeasurementApp(12.0, Unit.INCH);
        assertEquals(feet, inches);
    }

    @Test
    public void given1FeetAnd10Inches_WhenCompared_ShouldReturnFalse() {
        QuantityMeasurementApp feet = new QuantityMeasurementApp(1.0, Unit.FEET);
        QuantityMeasurementApp inches = new QuantityMeasurementApp(10.0, Unit.INCH);
        assertNotEquals(feet, inches);
    }
}
