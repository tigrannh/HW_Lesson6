fun grayCodes(count: Int): List<String> {
    if (count == 0) return mutableListOf("")
    else{
        val x = grayCodes(count - 1)
        var out = mutableListOf<String>()
        for (i in x ) {
            out.add("0$i")
        }
        for (i in x ){
            out.add("1$i")
        }
        return out
    }
}

