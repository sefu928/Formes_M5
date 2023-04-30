package com.mycompany.formes_m5;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Edgar Sanchez
 */
public class RectangleTest {

    /**
     * Test del mètode getPerimeter
     */
    @Test
    public void testGetPerimeter() {
        Rectangle rectangle = new Rectangle(5.0, 8.0);
        double expectedPerimeter = (26.0);
        double actualPerimeter = rectangle.getPerimeter();
        assertEquals(expectedPerimeter, actualPerimeter, 0.0001);
    }

}
