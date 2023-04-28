
package com.mycompany.formes_m5;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class RectangleTest {
    
    Rectangle rectangle;

    @org.junit.Before
    public void setUp() throws Exception {
        rectangle = new Rectangle(2.0,2.0);
    }
    
    @org.junit.Test
    public void testEsQuadrat() {
        assertEquals(true, rectangle.esQuadrat());
    }
    
}
