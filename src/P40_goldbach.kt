fun Int.goldbach(): Pair<Int,Int> {
    var prime = 0
    for (i in listPrimesInRange(2..this)){
        if (i.isPrime() && (this - i).isPrime()){
            prime = i
            break
        }
    }
    return Pair(prime, this - prime)
}

