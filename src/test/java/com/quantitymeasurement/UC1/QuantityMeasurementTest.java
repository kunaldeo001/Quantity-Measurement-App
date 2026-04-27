package com.quantitymeasurement.UC1;

import com.quantitymeasurement.QuantityMeasurementApp;
import com.quantitymeasurement.Unit;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QuantityMeasurementTest {

    @Test
    public void given0FeetAnd0Feet_WhenCompared_ShouldReturnTrue() {
        QuantityMeasurementApp feet1 = new QuantityMeasurementApp(0.0, Unit.FEET);
        QuantityMeasurementApp feet2 = new QuantityMeasurementApp(0.0, Unit.FEET);
        assertEquals(feet1, feet2);
    }

    @Test
    public void given0FeetAnd1Feet_WhenCompared_ShouldReturnFalse() {
        QuantityMeasurementApp feet1 = new QuantityMeasurementApp(0.0, Unit.FEET);
        QuantityMeasurementApp feet2 = new QuantityMeasurementApp(1.0, Unit.FEET);
        assertNotEquals(feet1, feet2);
    }

    @Test
    public void givenFeet_WhenComparedWithNull_ShouldReturnFalse() {
        QuantityMeasurementApp feet = new QuantityMeasurementApp(0.0, Unit.FEET);
        assertNotEquals(null, feet);
    }

    @Test
    public void givenFeet_WhenComparedWithOtherType_ShouldReturnFalse() {
        QuantityMeasurementApp feet = new QuantityMeasurementApp(0.0, Unit.FEET);
        assertNotEquals("0.0", feet);
    }

    @Test
    public void givenFeet_WhenComparedWithSameObject_ShouldReturnTrue() {
        QuantityMeasurementApp feet = new QuantityMeasurementApp(0.0, Unit.FEET);
        assertEquals(feet, feet);
    }
}
