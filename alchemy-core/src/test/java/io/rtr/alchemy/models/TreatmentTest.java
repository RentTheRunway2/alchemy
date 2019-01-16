package io.rtr.alchemy.models;

import nl.jqno.equalsverifier.EqualsVerifier;
import nl.jqno.equalsverifier.Warning;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TreatmentTest {
    @Test
    public void testEqualsHashCode() {
        EqualsVerifier
            .forClass(Treatment.class)
            .suppress(Warning.STRICT_INHERITANCE)
            .verify();
    }

    @Test
    public void testGoodTreatmentName() {
        final Treatment treatment = new Treatment("abc", "a good treatment with a good name");
        assertEquals(treatment.getName(), "abc");
    }

    @Test(expected = NameException.class)
    public void testBadTreatmentName() {
        final Treatment treatment = new Treatment(";;;", "a good treatment with a troublesome name");
    }

}
