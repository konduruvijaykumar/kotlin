// WITH_RUNTIME

fun Runnable.test(f: Runnable.(Int) -> Unit) {
    f(<error descr="[TYPE_MISMATCH] Type mismatch: inferred type is String but Int was expected">""</error>)
}

fun test(f: Runnable.(Int) -> Unit) {
    val runnable = Runnable {}
    runnable.f(<error descr="[TYPE_MISMATCH] Type mismatch: inferred type is String but Int was expected">""</error>)
    with (runnable) {
        f(<error descr="[TYPE_MISMATCH] Type mismatch: inferred type is String but Int was expected">""</error>)
    }
}