fun Int.toTotient(): Int {
    var count = 0
    for (i in 1..this){
        if (this.isCoprimeTo(i)) ++count
    }

    return count
}

