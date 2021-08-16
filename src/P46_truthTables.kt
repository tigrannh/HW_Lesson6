fun Boolean.not_() = !this
fun Boolean.and_(other: Boolean) = this && other
fun Boolean.or_(other: Boolean) = this || other
fun Boolean.nand_(other: Boolean) = this.and_(other).not_()
fun Boolean.nor_(other: Boolean) = this.or_(other).not_()
fun Boolean.xor_(other: Boolean) = this.xor(other)
fun Boolean.equ_(other: Boolean) = this.xor_(other).not_()
fun Boolean.impl_(other: Boolean) = this.or_(other.not_())

fun printTruthTable(func: (Boolean, Boolean) -> Boolean) {
    println("a       b       result")
    println("true    true    ${func(true,true)}")
    println("true    false   ${func(true,false)}")
    println("false   true    ${func(false,true)}")
    println("false   false   ${func(false,false)}")

}

