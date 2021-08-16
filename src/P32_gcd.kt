fun gcd(a: Int, b: Int): Int {
    var x = a
    var y = b
    while (x != y) {
        if ( x > y) x -= y
        else y -= x
    }
    return x
}

