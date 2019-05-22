package Tests;

import MathUtils.Vector;
import MathUtils.VectorField;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestVectorField {

    @Test
    public void testAdd() {

        VectorField allOnes = new VectorField(
                (Vector v) -> 1,
                (Vector v) -> 1,
                (Vector v) -> 1
        );

        VectorField allTwos = new VectorField(
                (Vector v) -> 2,
                (Vector v) -> 2,
                (Vector v) -> 2
        );
        VectorField addedField = allOnes.add(allTwos);

        Vector v1 = new Vector(1,1, 1);
        assertEquals(new Vector(3, 3, 3), addedField.vectorAt(v1));
    }





}
