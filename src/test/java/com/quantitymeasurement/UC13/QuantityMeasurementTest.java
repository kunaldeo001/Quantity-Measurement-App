package com.quantitymeasurement.UC13;

import com.quantitymeasurement.QuantityMeasurementApp;
import com.quantitymeasurement.Unit;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QuantityMeasurementTest {

    @Test
    public void given1FeetAnd1Kg_WhenAdded_ShouldThrowException() {
        QuantityMeasurementApp feet = new QuantityMeasurementApp(1.0, Unit.LengthUnit.FEET);
        QuantityMeasurementApp kg = new QuantityMeasurementApp(1.0, Unit.WeightUnit.KILOGRAM);
        assertThrows(IllegalArgumentException.class, () -> feet.add(kg));
    }

    @Test
    public void given1LitreAnd1Kg_WhenSubtracted_ShouldThrowException() {
        QuantityMeasurementApp litre = new QuantityMeasurementApp(1.0, Unit.VolumeUnit.LITRE);
        QuantityMeasurementApp kg = new QuantityMeasurementApp(1.0, Unit.WeightUnit.KILOGRAM);
        assertThrows(IllegalArgumentException.class, () -> litre.subtract(kg));
    }
}
