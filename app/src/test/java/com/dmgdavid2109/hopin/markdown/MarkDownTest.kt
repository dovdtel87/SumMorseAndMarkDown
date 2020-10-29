package com.dmgdavid2109.hopin.markdown

import junit.framework.TestCase.assertEquals
import org.junit.Test

class MarkDownTest {

    private val markDown = MarkDown()

    @Test
    fun itReturnsValidH1() {
        assertEquals("<h1>This is a test</h1>", markDown.converter("# This is a test"))
    }
    @Test
    fun itReturnsValidH2() {
        assertEquals("<h2>This is a test</h2>", markDown.converter("## This is a test"))
    }

    @Test
    fun itReturnsValidH3() {
        assertEquals("<h3>This is a test</h3>", markDown.converter("### This is a test"))
    }

    @Test
    fun itReturnsValidH4() {
        assertEquals("<h4>This is a test</h4>", markDown.converter("#### This is a test"))
    }

    @Test
    fun itReturnsValidH5() {
        assertEquals("<h5>This is a test</h5>", markDown.converter("##### This is a test"))
    }

    @Test
    fun itReturnsValidH6() {
        assertEquals("<h6>This is a test</h6>", markDown.converter("###### This is a test"))
    }

    @Test
    fun itReturnsInvalidWhen7Hash() {
        assertEquals("Invalid input", markDown.converter("####### This is a test"))
    }


    @Test
    fun returnsInvalidInputWhenNoSpaceAfterHash() {
        assertEquals("Invalid input", markDown.converter("####Test"))
    }

    @Test
    fun whenThereIsMoreThanOneSpace() {
        assertEquals("<h2>This is a test</h2>", markDown.converter("##    This is a test"))
    }

    @Test
    fun whenThereIsSpaceBeforeHash() {
        assertEquals("<h4>This is a test</h4>", markDown.converter(" #### This is a test"))
    }
}
