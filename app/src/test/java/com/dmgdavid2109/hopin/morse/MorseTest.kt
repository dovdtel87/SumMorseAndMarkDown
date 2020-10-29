package com.dmgdavid2109.hopin.morse

import junit.framework.Assert.assertEquals
import org.junit.Test

class MorseTest {

    val morse = Morse()

    @Test
    fun codeShouldReturnB() {
        assertEquals("B", morse.decode("-..."))
    }

    @Test
    fun codeShouldReturnL() {
        assertEquals("L", morse.decode(".-.."))
    }

    @Test
    fun codeShouldReturnY() {
        assertEquals("Y", morse.decode("-.--"))
    }

    @Test
    fun codeShouldReturnN() {
        assertEquals("N", morse.decode("-."))
    }

    @Test
    fun codeShouldReturnNM() {
        assertEquals("NM", morse.decode("-?"))
    }

    @Test
    fun codeShouldReturnDKGO() {
        assertEquals("DKGO", morse.decode("-??"))
    }

    @Test
    fun codeShouldReturnBXCYZQ() {
        assertEquals("BXCYZQ", morse.decode("-???"))
    }

    @Test
    fun codeShouldReturnHVFLPJ() {
        assertEquals("HVFLPJ", morse.decode(".???"))
    }
}
