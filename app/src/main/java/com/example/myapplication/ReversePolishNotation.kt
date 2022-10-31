package com.example.myapplication

import java.lang.Exception
import java.util.*

class ReversePolishNotation {

    fun expressionToPostfix(expression: String): String = try {
        val stack = Stack<Char>()
        var calculateText = String()

        for (element in expression) {
            val priority = getPriority(operation = element)

            if (priority == 0) calculateText += element
            else if (priority == 1) stack.push(element)
            else if (priority > 1) {
                calculateText += ' '
                while (!stack.empty()) {
                    if (getPriority(stack.peek()) >= priority) calculateText += stack.pop() else break
                }
                stack.push(element)
            } else if (priority == -1) {
                calculateText += ' '
                while (getPriority(operation = stack.peek()) != 1) calculateText += stack.pop()
                stack.pop()
            }
        }

        while (!stack.empty()) calculateText += stack.pop()

        calculateText
    } catch (e: Exception) {"Invalid input" }


    fun calculatePostfix(postfix: String): String = try {
        var operand = String()
        val stack = Stack<Double>()
        var i = 0
        while (i < postfix.length) {
            if (postfix[i] == ' ') {
                i++
                continue
            }
            if (getPriority(postfix[i]) == 0) {
                while (postfix[i] != ' ' && getPriority(postfix[i]) == 0) {
                    operand += postfix[i++]
                    if (i == postfix.length) break
                }
                stack.push(operand.toDouble())
                operand = String()
            }
            if (getPriority(postfix[i]) > 1) {
                val leftOperand = stack.pop()
                val rightOperand = stack.pop()
                if (postfix[i] == '+') stack.push(leftOperand + rightOperand)
                if (postfix[i] == '-') stack.push(rightOperand - leftOperand)
                if (postfix[i] == '*') stack.push(leftOperand * rightOperand)
                if (postfix[i] == '/'){
                    require(leftOperand != 0.0){"Argument 'divisor' is 0"}
                    stack.push(rightOperand/leftOperand)




                }
            }
            i++
        }
        stack.pop().toString()


    } catch (e: Exception) {"Invalid input"}

    private fun getPriority(operation: Char): Int = when (operation) {
        '*', '/' -> 3
        '+', '-' -> 2
        '(' -> 1
        ')' -> -1
        else -> 0
    }

}
