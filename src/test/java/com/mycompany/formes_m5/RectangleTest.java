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
    
    @Test
    public void testGetArea() {
        Rectangle rectangle = new Rectangle(3.0, 4.0);
        double expectedArea = 12.0;
        double actualArea = rectangle.getArea();
        assertEquals(expectedArea, actualArea, 0.0001);
    }
    
}
