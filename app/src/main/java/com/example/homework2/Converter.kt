package com.example.homework2


    var tens = arrayOf(
        "",
        "Ten",
        "Twenty",
        "Thirty",
        "Forty",
        "Fifty",
        "Sixty",
        "Seventy",
        "Eighty",
        "Ninety"
    )
    var ones = arrayOf(
        "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven",
        "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"
    )

    fun numberToWords(num: Int): String? {
        return helper(num).trim { it <= ' ' }
    }

    private fun helper(num: Int): String {
        if (num >= 1000000000) return helper(num / 1000000000) + " Billion " + helper(num % 1000000000)
        if (num >= 1000000) return helper(num / 1000000) + " Million " + helper(num % 1000000)
        if (num >= 1000) return helper(num / 1000) + " Thousand " + helper(num % 1000)
        if (num >= 100) return (helper(num / 100) + " Hundred " + helper(num % 100)).trim { it <= ' ' }
        return if (num >= 20) (tens[num / 10] + " " + helper(num % 10)).trim { it <= ' ' } else ones[num]
    }
