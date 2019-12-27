package unittest;

import java.util.ArrayList;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class Kategori1841720175FajarTest extends TestCase {

    Kategori1841720175Fajar instance;

    public Kategori1841720175FajarTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        instance = new Kategori1841720175Fajar("Comics", "Comics is combination words and pictures");
        System.out.format("Start testing: %s \n", this.getName());
    }

    @After
    public void tearDown() {
        System.out.format("Finish Test %s\n", this.getName());
    }

    /**
     * Test of searchFajar method, of class Kategori1841720175Fajar.
     */
    @Test
    public void testSearchFajar() {
        System.out.println("searchFajar");
        String keyword = "Comics";
        Kategori1841720175Fajar instance = new Kategori1841720175Fajar();
        ArrayList<Kategori1841720175Fajar> result = instance.searchFajar(keyword);
        ArrayList<Kategori1841720175Fajar> expResult = instance.getByNamaAndKeterangan(keyword, "");
        assertEquals(expResult.size(), result.size());
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of saveFajar method, of class Kategori1841720175Fajar.
     */
    @Test
    public void testSaveFajar() {
        System.out.println("saveFajar");
        this.instance.saveFajar();
        ArrayList<Kategori1841720175Fajar> expResult = instance.getByNamaAndKeterangan(instance.getmNama(), instance.getmKeterangan());
        assertTrue(expResult.size() > 0);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class Kategori1841720175Fajar.
     */
//    @Test
//    public void testDelete() {
//        System.out.println("delete");
//        Kategori1841720175Fajar instance = new Kategori1841720175Fajar();
//        instance.delete();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
}
