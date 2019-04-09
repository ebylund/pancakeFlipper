package com.erikbylund

data class CaseResult(val originalStack: String, val count: Int, val caseNumber: Int) {
    fun printResults() {
        println("Case #${caseNumber + 1}: $count -> $originalStack")
    }
}
