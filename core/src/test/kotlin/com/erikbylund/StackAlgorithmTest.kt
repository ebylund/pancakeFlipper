package com.erikbylund

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class StackAlgorithmTest {

    @Test
    fun testBottomUpWithTopMinus() {
        assertEquals(
                CaseResult("--+-++", 3, 1),
                StackAlgorithm.bottomUpWithTopMinus("--+-++", 0)
        )

        assertEquals(
                CaseResult("-----", 1, 4),
                StackAlgorithm.bottomUpWithTopMinus("-----", 3)
        )
    }

    @Test
    fun testTopDown() {
        assertEquals(
                CaseResult("+---+-", 4, 3),
                StackAlgorithm.topDown("+---+-", 3)
        )

        assertEquals(
                CaseResult("+", 0, 3),
                StackAlgorithm.topDown("+", 3)
        )

        assertEquals(
                CaseResult("++--++", 2, 3),
                StackAlgorithm.topDown("++--++", 3)
        )
    }
}