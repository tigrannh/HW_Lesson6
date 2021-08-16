fun printGoldbachList(range: IntRange) {
//    for (i in range){
//        if (i % 2 == 0) {
//            val (a, b) = i.goldbach()
//            println("$i = $a + $b")
//        }
//    }
    printGoldbachListLimited(range, 0)
}

fun printGoldbachListLimited(range: IntRange, min: Int) {
    for (i in range){
        if (i % 2 == 0) {
            val (a, b) = i.goldbach()
            if (a > min && b > min)
                println("$i = $a + $b")
        }
    }
}

