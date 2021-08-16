fun Int.isPrime(): Boolean {
   if (this <= 1 ) return false
   if (this == 2 ) return true
   if (this % 2 == 0) return false

    var i = 2
    while (i * i <= this) {
        if (this % i == 0) return false
        i++
    }
    return true
}

