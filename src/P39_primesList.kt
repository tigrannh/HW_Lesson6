fun listPrimesInRange(r: IntRange): List<Int>{
    var out = mutableListOf<Int>()
    for (i in r)
        if(i.isPrime()) out.add(i)

    return out
}

