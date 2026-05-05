package com.quantitymeasurement.UC11;

import com.quantitymeasurement.QuantityMeasurementApp;
import com.quantitymeasurement.Unit;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QuantityMeasurementTest {

    @Test
    public void Uc11_given1GallonAnd3Litre78_WhenCompared_ShouldReturnTrue() {
        QuantityMeasurementApp gallon = new QuantityMeasurementApp(1.0, Unit.VolumeUnit.GALLON);
        QuantityMeasurementApp litre = new QuantityMeasurementApp(3.78, Unit.VolumeUnit.LITRE);
        assertEquals(gallon, litre);
    }

    @Test
    public void Uc11_given1LitreAnd1000Ml_WhenCompared_ShouldReturnTrue() {
        QuantityMeasurementApp litre = new QuantityMeasurementApp(1.0, Unit.VolumeUnit.LITRE);
        QuantityMeasurementApp ml = new QuantityMeasurementApp(1000.0, Unit.VolumeUnit.ML);
        assertEquals(litre, ml);
    }

    @Test
    public void Uc11_given1GallonAnd3Litre78_WhenAdded_ShouldReturn7Litre56() {
        QuantityMeasurementApp gallon = new QuantityMeasurementApp(1.0, Unit.VolumeUnit.GALLON);
        QuantityMeasurementApp litre = new QuantityMeasurementApp(3.78, Unit.VolumeUnit.LITRE);
        QuantityMeasurementApp result = gallon.add(litre, Unit.VolumeUnit.LITRE);
        assertEquals(7.56, result.getValue(), 0.001);
    }
}
