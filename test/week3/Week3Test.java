package week3;



import org.junit.Test;
import static org.junit.Assert.*;


/**
 *
 * @author Administrator
 */
public class Week3Test {
    
    
   
    /**
     * Test of max method, of class Week3.
     */
    @Test
    public void testMax() {
        
        assertEquals(10,Week3.max(10,4));
        assertEquals(2,Week3.max(2,1));
        assertEquals(3,Week3.max(3, 2));
        assertEquals(4,Week3.max(4,3));
        assertEquals(1,Week3.max(1,0));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of minOfArray method, of class Week3.
     */
    @Test
    public void testMinOfArray() {
       int a[]={1,2,3,4,5,7};
       int b[]={2,4,5,1,7};
       int c[]={0,2,4,6,8};
       int d[]={10,20,30,7};
       int e[]={ 100,200,300,400};
        assertEquals(1,Week3.minOfArray(a));
        assertEquals(1,Week3.minOfArray(b));
        assertEquals(0,Week3.minOfArray(c));
        assertEquals(7,Week3.minOfArray(d));
        assertEquals(100,Week3.minOfArray(e));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of calculateBMI method, of class Week3.
     */
    @Test
    public void testCalculateBMI() {
        assertEquals("thiếu cân",Week3.calculateBMI(45, 1.56));
        assertEquals("béo phì",Week3.calculateBMI(80, 1.65));
        assertEquals("thiếu cân",Week3.calculateBMI(50, 1.75));
        assertEquals("thừa cân",Week3.calculateBMI(68, 1.68));
        assertEquals("bình thường",Week3.calculateBMI(53, 1.68));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
