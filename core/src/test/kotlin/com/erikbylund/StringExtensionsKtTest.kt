package com.erikbylund

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class StringExtensionsKtTest {
    @Test
    fun testIsAllMinuses() {
        assertTrue("----".isAllMinuses())
        assertFalse("---+".isAllMinuses())
    }

    @Test
    fun testIsHomogenous() {
        assertTrue("++++".isHomogenous())
        assertTrue("----".isHomogenous())
        assertTrue("-".isHomogenous())
        assertTrue("".isHomogenous())
    }

    @Test
    fun testIsNotHomogenous() {
        assertFalse("++++-+".isHomogenous())
        assertFalse("-+-+-".isHomogenous())
    }

    @Test
    fun indexOfNextAlternate() {
        assertTrue("---++".indexOfNextAlternate() == 3)
        assertTrue("+-+-".indexOfNextAlternate() == 1)
        assertTrue("+++++--++-+-++".indexOfNextAlternate() == 5)
    }

    @Test
    fun indexOfNextAlternateIsNull() {
        assertTrue("--".indexOfNextAlternate() == null)
        assertTrue("++++++++++".indexOfNextAlternate() == null)
        assertTrue("".indexOfNextAlternate() == null)
    }
}