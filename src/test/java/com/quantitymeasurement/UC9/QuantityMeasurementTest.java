package com.quantitymeasurement.UC9;

import com.quantitymeasurement.QuantityMeasurementApp;
import com.quantitymeasurement.Unit;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QuantityMeasurementTest {

    @Test
    public void Uc9_given1KgAnd1000Gram_WhenCompared_ShouldReturnTrue() {
        QuantityMeasurementApp kg = new QuantityMeasurementApp(1.0, Unit.WeightUnit.KILOGRAM);
        QuantityMeasurementApp gram = new QuantityMeasurementApp(1000.0, Unit.WeightUnit.GRAM);
        assertEquals(kg, gram);
    }

    @Test
    public void Uc9_given1TonneAnd1000Kg_WhenCompared_ShouldReturnTrue() {
        QuantityMeasurementApp tonne = new QuantityMeasurementApp(1.0, Unit.WeightUnit.TONNE);
        QuantityMeasurementApp kg = new QuantityMeasurementApp(1000.0, Unit.WeightUnit.KILOGRAM);
        assertEquals(tonne, kg);
    }

    @Test
    public void Uc9_given1TonneAnd1000Gram_WhenAdded_ShouldReturn1001Kg() {
        QuantityMeasurementApp tonne = new QuantityMeasurementApp(1.0, Unit.WeightUnit.TONNE);
        QuantityMeasurementApp gram = new QuantityMeasurementApp(1000.0, Unit.WeightUnit.GRAM);
        QuantityMeasurementApp result = tonne.add(gram, Unit.WeightUnit.KILOGRAM);
        assertEquals(1001.0, result.getValue(), 0.001);
    }
}
