def multiply(a: BigInt, b: BigInt) = {a * b}
def add(a: BigInt, b: BigInt) = {a + b}

@annotation.tailrec
def sigma(f: (BigInt, BigInt) => BigInt, x: BigInt, accumulator: BigInt = 1): BigInt = {
    if (x <= 1) {
        accumulator
    }
    else {
        sigma(f, x-1, f(accumulator, x))
    }
}

val values = 1 to args(0).toInt
for(n <- values) println(s"Summation $n = ${sigma(add, n)}      Factorial $n = ${sigma(multiply, n)}")
