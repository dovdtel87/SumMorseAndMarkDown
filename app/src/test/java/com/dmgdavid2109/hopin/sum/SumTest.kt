package com.dmgdavid2109.hopin.sum

import junit.framework.Assert.assertEquals
import org.junit.Test

class SumTest {

    @Test
    fun input10output33() {
        assertEquals(33, sum(10))
    }

    @Test
    fun input20output83() {
        assertEquals(83, sum(20))
    }
}
