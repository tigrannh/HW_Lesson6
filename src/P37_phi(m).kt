import kotlin.math.pow

fun Int.toTotient2(): Int {
    val x = this.primeFactorMultiplicity()
    var output: Double = 1.0
    for(element in x){
        val (a, b) = element
        output *= (a - 1) * a.toDouble().pow(b - 1)
    }

    return output.toInt()
}

