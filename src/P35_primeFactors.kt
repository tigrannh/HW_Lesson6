fun Int.primeFactors(): List<Int> {
    if (this.isPrime()) return listOf(this)

    var primes = mutableListOf<Int>()
    var x = this

    for(i in 2..x/2){
        if (i.isPrime() && x % i == 0) {
            while (x % i == 0){
                primes.add(i)
                x /= i
            }
        }
    }

    return primes

}