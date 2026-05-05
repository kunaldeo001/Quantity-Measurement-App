package com.quantitymeasurement.UC7;

import com.quantitymeasurement.QuantityMeasurementApp;
import com.quantitymeasurement.Unit;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QuantityMeasurementTest {

    @Test
    public void Uc7_given1GallonAnd3Litre78_WhenAddedInGallon_ShouldReturn2Gallon() {
        QuantityMeasurementApp gallon = new QuantityMeasurementApp(1.0, Unit.VolumeUnit.GALLON);
        QuantityMeasurementApp litre = new QuantityMeasurementApp(3.78, Unit.VolumeUnit.LITRE);
        QuantityMeasurementApp result = gallon.add(litre, Unit.VolumeUnit.GALLON);
        assertEquals(2.0, result.getValue(), 0.001);
        assertEquals(Unit.VolumeUnit.GALLON, result.getUnit());
    }

    @Test
    public void Uc7_given1FeetAnd12Inch_WhenAddedInFeet_ShouldReturn2Feet() {
        QuantityMeasurementApp feet = new QuantityMeasurementApp(1.0, Unit.LengthUnit.FEET);
        QuantityMeasurementApp inch = new QuantityMeasurementApp(12.0, Unit.LengthUnit.INCH);
        QuantityMeasurementApp result = feet.add(inch, Unit.LengthUnit.FEET);
        assertEquals(2.0, result.getValue(), 0.001);
        assertEquals(Unit.LengthUnit.FEET, result.getUnit());
    }
}
