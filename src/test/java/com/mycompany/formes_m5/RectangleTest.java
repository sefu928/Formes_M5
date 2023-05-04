/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

package com.mycompany.formes_m5;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alumne
 */
public class RectangleTest {

    Rectangle rectangle;

    @org.junit.Before
    public void setUp() throws Exception {
        rectangle = new Rectangle(2.0, 2.0);
    }

    @org.junit.Test
    public void testEsQuadrat() {
        assertEquals(true, rectangle.esQuadrat());
    }

    @Test
    public void testGetArea() {
        Rectangle rectangle = new Rectangle(3.0, 4.0);
        double expectedArea = 12.0;
        double actualArea = rectangle.getArea();
        assertEquals(expectedArea, actualArea, 0.0001);
    }

    @Test
    public void testGetPerimeter() {
        Rectangle rectangle = new Rectangle(5.0, 8.0);
        double expectedPerimeter = (26.0);
        double actualPerimeter = rectangle.getPerimeter();
        assertEquals(expectedPerimeter, actualPerimeter, 0.0001);
    }

}
