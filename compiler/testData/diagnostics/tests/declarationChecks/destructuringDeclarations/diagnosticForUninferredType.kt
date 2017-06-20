// !DIAGNOSTICS: -UNUSED_VARIABLE

class X

operator fun <T> X.component1(): T = TODO()

fun main(args: Array<String>) {
    val (x: String) = X()
    val (y) = X()
}