package com.quantitymeasurement.UC5;

import com.quantitymeasurement.QuantityMeasurementApp;
import com.quantitymeasurement.Unit;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QuantityMeasurementTest {

    @Test
    public void given1YardAnd36Inches_WhenCompared_ShouldReturnTrue() {
        QuantityMeasurementApp yard = new QuantityMeasurementApp(1.0, Unit.YARD);
        QuantityMeasurementApp inches = new QuantityMeasurementApp(36.0, Unit.INCH);
        assertEquals(yard, inches);
    }

    @Test
    public void given1YardAnd3Feet_WhenCompared_ShouldReturnTrue() {
        QuantityMeasurementApp yard = new QuantityMeasurementApp(1.0, Unit.YARD);
        QuantityMeasurementApp feet = new QuantityMeasurementApp(3.0, Unit.FEET);
        assertEquals(yard, feet);
    }

    @Test
    public void given1FootAnd12Inches_WhenCompared_ShouldReturnTrue() {
        QuantityMeasurementApp feet = new QuantityMeasurementApp(1.0, Unit.FEET);
        QuantityMeasurementApp inches = new QuantityMeasurementApp(12.0, Unit.INCH);
        assertEquals(feet, inches);
    }
}
