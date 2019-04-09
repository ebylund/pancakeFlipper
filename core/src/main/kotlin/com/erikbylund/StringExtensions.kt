package com.erikbylund

fun String.isAllMinuses() = this.all { it == '-' }

fun String.isHomogenous(): Boolean {
    if (isEmpty()) return true
    val initialChar = this[0]
    this.forEach { if (initialChar != it) return false }
    return true
}

fun String.indexOfNextAlternate(): Int? {
    if (isEmpty()) return null
    var initialChar = this[0]
    this.forEachIndexed() { index, char ->
        if (initialChar != char) return index
    }
    return null
}

fun String.isFirstPlus() = try { this.first() == '+' } catch (e: NoSuchElementException) { false }
fun String.swapFirstIfPlus(): Pair<String, Int> {
    if (isEmpty()) return Pair(this,0)
    var count = 0
    if (this.isFirstPlus()) {
        val builder = StringBuilder(this)
        builder[0] = '-'
        count++
        return Pair(builder.toString(), count)
    }
    return Pair(this, count)
}

fun String.reverseOrderAndSigns() = buildString(length) {
    this@reverseOrderAndSigns.reversed().forEach { element ->
        append(when (element) {
            '-' -> '+'
            '+' -> '-'
            else -> error("Method reverseSign() should only be used with '-' and '+' characters")
        })
    }
}

fun String.swapAtFirstAlternate() = buildString(length) {
    val nextAlternate = this@swapAtFirstAlternate.indexOfNextAlternate()!!
    val left = this@swapAtFirstAlternate.substring(0, nextAlternate).reverseOrderAndSigns()
    val right = this@swapAtFirstAlternate.substring(startIndex = nextAlternate)
    return left + right
}
