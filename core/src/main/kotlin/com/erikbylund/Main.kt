package com.erikbylund

import java.io.File

val sampleInput = """
    10
    -
    -+
    +-
    +++
    --+-
    --++-+
    ++--+-
    ------
    ++++-
    --+++--
""".trimIndent()

fun main(args: Array<String>) {
    if (args.size > 0) {
        run(File(args[0]).readLines().drop(1))
    } else {
        run(sampleInput.split("\n").drop(1))
    }
}

fun run(stacks: List<String>) {
//    map list of case lines into a list of CaseResult classes
//    val caseResults1 = stacks.mapIndexed { index, stack -> StackAlgorithm.bottomUpWithTopMinus(stack, index) }
//    caseResults1.sortedBy { it.caseNumber }.forEach { it.printResults() }

    val caseResults2 = stacks.mapIndexed { index, stack -> StackAlgorithm.topDown(stack, index) }
    caseResults2.sortedBy { it.caseNumber }.forEach { it.printResults() }
}




