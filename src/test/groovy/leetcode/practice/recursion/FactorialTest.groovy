package leetcode.practice.recursion

import leetcode.recursion.Factorial
import spock.lang.Specification
import spock.lang.Unroll

class FactorialTest extends Specification {
    def 'invalid input tests'(int number) {
        given: 'invalid input '

        when: 'I call the factorial function'
        Factorial.factorial(number)

        then: 'expected results'
        Exception e = thrown(IllegalArgumentException)
        e.message == Factorial.INVALID_INPUT

        where: 'inputs and expected results are'
        number << [-1, 0]
    }

    @Unroll
    def ' successful factorial calculation '(int number, int expectedResult) {
        given: 'a number'

        when: 'I call calclate factorial '
        int actualResult = Factorial.factorial(number)

        then: 'expected results'
        actualResult == expectedResult

        where: 'input and expected results are'
        number | expectedResult
        5      | 120
        1      | 1
    }
}
