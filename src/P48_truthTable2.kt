fun Boolean.and_(vararg others: Boolean): Boolean =
    if (others.isEmpty()) this
    else{
        var x = this
        for(i in others) x = x.and_(i)
        x
    }

fun Boolean.or_(vararg others: Boolean): Boolean =
    if (others.isEmpty()) this
    else{
        var x = this
        for(i in others) x = x.or_(i)
        x
    }

fun Boolean.nand_(vararg others: Boolean): Boolean =
    if (others.isEmpty()) this
    else{
        var x = this
        for(i in others) x = x.nand_(i)
        x
    }

fun Boolean.nor_(vararg others: Boolean): Boolean =
    if (others.isEmpty()) this
    else{
        var x = this
        for(i in others) x = x.nor_(i)
        x
    }


fun Boolean.xor_(vararg others: Boolean): Boolean =
    if (others.isEmpty()) this
    else{
        var x = this
        for(i in others) x = x.xor_(i)
        x
    }

fun Boolean.equ_(vararg others: Boolean): Boolean =
    if (others.isEmpty()) this
    else{
        var x = this
        for(i in others) x = x.equ_(i)
        x
    }

fun Boolean.impl_(vararg others: Boolean): Boolean =
    if (others.isEmpty()) this
    else{
        var x = this
        for(i in others) x = x.impl_(i)
        x
    }

