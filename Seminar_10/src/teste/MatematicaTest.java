package teste;

import clase.Matematica;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class MatematicaTest {

    private Matematica matematica;

    @BeforeClass
    public static void beforeClass(){
        System.out.println("BeforeClass");
    }
    @Before
    public void setup() {
        this.matematica = Matematica.getInstance();
    }

    @Test
    public void testSumaCorecta() {
        assertEquals(8, matematica.suma(5, 3));
    }

    @Test
    public void testSumaNrIdentice() {
        assertEquals(4, matematica.suma(2, 2));
    }

    @Test
    public void testRaportCorect() {
        assertEquals(6, matematica.raport(12, 2), 0.01);
    }

    @Test
    public void testRaportRezultatReal() {
        assertEquals(2.5f, matematica.raport(5, 2), 0.1);
    }

    @Test
    public void testRaportShouldThrowException() {
        try {
            matematica.raport(2, 0);
            fail("Metoda raport nu arunca exceptie");
        } catch (IllegalArgumentException e) {

        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRaportThrowException() {
        matematica.raport(30, 0);
    }

    @Test
    public void testPar() {
        assertTrue(matematica.estePar(16));
        assertFalse(matematica.estePar(17));
        assertTrue(matematica.estePar(0));
        assertTrue(matematica.estePar(-16));
        assertFalse(matematica.estePar(-19));
    }

    @Test
    public void testListaPare() {
        assertEquals(4, matematica.nNumerePare(4).size());
    }

    @Test
    public void testListaNumere(){
        List<Integer> lista = matematica.nNumerePare(4);
        for(Integer i : lista){
            //assertTrue(matematica.estePar(i));
            assertTrue(i % 2 == 0);
        }
    }

    @Test
    public void testListaNull(){
        assertNull(matematica.nNumerePare(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testListaIndexNegativ(){
        matematica.nNumerePare(-3);
    }

    @Test
    public void testSingleTon() {
        assertSame(matematica, Matematica.getInstance());
    }

    @Test
    public void testListaCrescatoare() {
        List<Integer> lista = matematica.nNumerePare(4);
        for (int i = 1; i < lista.size(); i++) {
            assertTrue(lista.get(i - 1) < lista.get(i));
        }
    }

}