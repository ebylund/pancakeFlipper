package com.erikbylund

object StackAlgorithm {
    fun bottomUpWithTopMinus(stack: String, index: Int): CaseResult {
        var newElement = stack
        var count = 0

        // loop while there are no '-'
        while (newElement.lastIndexOf("-") != -1) {
            val lastIndex = newElement.lastIndexOf('-')
            val leftGroup = newElement.substring(startIndex = 0, endIndex = lastIndex + 1)
            val rightGroup = newElement.substring(startIndex = lastIndex + 1)
            val (newLeftGroup, newCount) = leftGroup.swapFirstIfPlus()
            val flippedLeftGroup = newLeftGroup.reverseOrderAndSigns().also { count++ }
            newElement = flippedLeftGroup + rightGroup
            count += newCount
        }

        return CaseResult(stack, count, index)
    }

    fun topDown(stack: String, index: Int): CaseResult {
        var newStack = stack
        var count = 0

        while (!newStack.isHomogenous()) {
            newStack = newStack.swapAtFirstAlternate().also { count++ }
        }

        if (newStack.isAllMinuses()) count++

        return CaseResult(stack, count, index)
    }
}


