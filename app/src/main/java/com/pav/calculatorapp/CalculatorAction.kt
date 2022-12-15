package com.pav.calculatorapp

sealed class CalculatorAction {
        data class Number(val number: Int) : CalculatorAction()
        object Clear : CalculatorAction()
        object Delete : CalculatorAction()
        object Calculate : CalculatorAction()
        object DecimalPoint : CalculatorAction()
        data class Operation(val operation: CalculatorOperation): CalculatorAction()
}
