/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import junit.framework.TestCase;

/**
 *
 * @author arielle
 */
public class ConvertisseurBasiqueTest extends TestCase {

    public ConvertisseurBasiqueTest(String testName) {
        super(testName);
    }

    public void testConvertisseur() {
        ConvertisseurBasique conv = new ConvertisseurBasique(6.55957);
        // test avec un nombre nul
        assertEquals(0.0, conv.convertirEnFrancs(0));
        assertEquals(0.0, conv.convertirEnEuros(0));
        // test avec le taux de conversion officiel
        assertEquals(6.55957, conv.convertirEnFrancs(1));
        assertEquals(1.0, conv.convertirEnEuros(6.55957));
        // test avec un nombre quelconque (9.9 x 6.55957 = 64.939743)
        assertEquals(9.9, conv.convertirEnEuros(64.939743));
        assertEquals(64.939743, conv.convertirEnFrancs(9.9));
    }

}
