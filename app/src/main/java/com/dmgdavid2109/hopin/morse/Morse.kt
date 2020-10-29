package com.dmgdavid2109.hopin.morse

class Morse {

    val map = mapOf(
        Pair(".", "E"),
        Pair("..", "I"),
        Pair("...", "S"),
        Pair("....", "H"),
        Pair("...-", "V"),
        Pair("..-", "U"),
        Pair("..-.", "F"),
        Pair(".-", "A"),
        Pair(".-.", "R"),
        Pair(".-..", "L"),
        Pair(".--", "W"),
        Pair(".--.", "P"),
        Pair(".---", "J"),
        Pair("-", "T"),
        Pair("-.", "N"),
        Pair("-..", "D"),
        Pair("-...", "B"),
        Pair("-..-", "X"),
        Pair("-.-", "K"),
        Pair("-.-.", "C"),
        Pair("-.--", "Y"),
        Pair("--", "M"),
        Pair("--.", "G"),
        Pair("--..", "Z"),
        Pair("--.-", "Q"),
        Pair("---", "O")
    )

    fun decode(code: String) : String {
        return if(code.contains("?")) {
            val leftKey = code.replaceFirst("?", ".")
            val rightKey = code.replaceFirst("?", "-")
            decode(leftKey) + decode(rightKey)
        } else {
            map[code]?.let {
                it
            }?: run {
                ""
            }
        }
    }
}
