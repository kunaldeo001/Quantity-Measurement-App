package com.quantitymeasurement.UC3;

import com.quantitymeasurement.QuantityMeasurementApp;
import com.quantitymeasurement.Unit;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QuantityMeasurementTest {

    @Test
    public void givenQuantityMeasurementAppClass_WhenRefactoredForDRY_ShouldStillWorkForBasicEquality() {
        QuantityMeasurementApp feet1 = new QuantityMeasurementApp(0.0, Unit.LengthUnit.FEET);
        QuantityMeasurementApp feet2 = new QuantityMeasurementApp(0.0, Unit.LengthUnit.FEET);
        assertEquals(feet1, feet2);
    }
}
