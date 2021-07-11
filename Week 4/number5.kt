fun main() {
    var firstResult = evenlySpaced(2,4,6)
    var secondResult = evenlySpaced(4,6,2)
    var thirdResult = evenlySpaced(4,6,3)
    println (firstResult)
    println (secondResult)
    println (thirdResult)
}

fun evenlySpaced(a: Int, b: Int, c: Int): Boolean{
    var large = a.coerceAtLeast(b.coerceAtLeast(c))
    var small = a.coerceAtMost(b.coerceAtMost(c))
    var medium = (a + b + c) - large - small
    return (large - medium) == (medium - small)
}