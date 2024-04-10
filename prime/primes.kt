//package com.slawicek

import kotlin.math.sqrt
import kotlin.time.*

var platform = ""

fun main(args: Array<String>) {
    platform = args[0]

    calculatePrimes()
    calculatePrimes()
    calculatePrimes()
    calculatePrimes()
    calculatePrimes()
}

fun calculatePrimes() {
    val start = TimeSource.Monotonic.markNow()
    var count = 0
    for (i in 1..10_000_000) {
        if (isPrime(i)) {
            count++
        }
    }
    println("$platform:\tThere are $count prime numbers between 1 and 10_000_000. It took ${start.elapsedNow() / 1000.0} s.")
}

fun isPrime(n: Int): Boolean {
    if (n <= 1) {
        return false
    }
    for (i in 2..sqrt(n.toDouble()).toInt() + 1) {
        if (n % i == 0) {
            return false
        }
    }
    return true
}