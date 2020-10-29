package com.dmgdavid2109.hopin.sum

private fun Int.isDivisibleBy(divider: Int) = this % divider == 0

fun sum(input: Int) : Int {
    return (1..input).filter { number ->
        with(number) {
            (isDivisibleBy(3) && isDivisibleBy(5)).not()
                    && (isDivisibleBy(3) || isDivisibleBy(5))
        }
    }.sum()
}
