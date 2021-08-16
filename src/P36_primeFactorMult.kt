fun Int.primeFactorMultiplicity(): List<Pair<Int, Int>> {
    val x = this.primeFactors()

    var output = mutableListOf<Pair<Int, Int>>()
    for (i in x) {
        val y = (i to x.count { it == i })
        if (!output.contains(y)) output.add(y)
    }
    return output
}
