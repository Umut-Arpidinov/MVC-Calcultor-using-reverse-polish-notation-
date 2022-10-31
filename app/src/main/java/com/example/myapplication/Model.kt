package com.example.myapplication



class Model {
    private val reversePolishNotation = ReversePolishNotation()

    var text = ""
        set(value) {
            if (isValidInput(value)) {
                field = value

            }

        }

    private fun isValidInput(text: String): Boolean {
        if (text.isEmpty()) {
            return true
        }
        if (text.length > 1 && text[text.lastIndex - 1] == '+' && text.last() == '+') {
            return false
        }
        if (text.length > 1 && text[text.lastIndex - 1] == '/' && text.last() == '/') {
            return false

        }
        if (text.length > 1 && text[text.lastIndex - 1] == '*' && text.last() == '*') {
            return false

        }
        if (text.length > 1 && text[text.lastIndex - 1] == '.' && text.last() == '.') {
            return false

        }
        if (text.length > 1 && text[text.lastIndex - 1] == '-' && text.last() == '-') {

            return false

        }
        if (text.isNotEmpty() && text[0] == '.' && text.last() == '.') {
            return false
        }
        //if (text.count { it == '.' } > 1) {
          //  return false




        return true
    }

    fun calculateResults():String {
        var result = ""
        if (text.contains("*") || text.contains("+") ||
            text.contains("-") || text.contains("/")
        ) {
            val expressionToPrefix =
                reversePolishNotation.expressionToPostfix(expression = text)


            val rpnResult =
                reversePolishNotation.calculatePostfix(postfix = expressionToPrefix)

            result = if (rpnResult == "") "Invalid input"
            else rpnResult




        }
        return result




    }


}