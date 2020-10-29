package com.dmgdavid2109.hopin.markdown

class MarkDown {

    private val regex = "\\A\\s*(#{1,6})\\s+([^#]*)\\s*".toRegex()
    private val htmlFormat = "<h%s>%s</h%s>"

    fun converter(input: String) : String {
        return regex.find(input)?.let {
            val (hashes, text) = it.destructured
            String.format(htmlFormat, hashes.count(), text, hashes.count())
        } ?: kotlin.run {
            "Invalid input"
        }
    }
}
