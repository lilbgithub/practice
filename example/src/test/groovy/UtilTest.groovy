import spock.lang.Specification
import spock.lang.Unroll

class UtilTest extends Specification {

    @Unroll
    def "check invalidate input "(String str1, String str2) {
        given: "invalid input strings"
        when: "I call isAnagram"
        Util.isAnagram(str1, str2)

        then: "throws illegal argument exception"
        Exception e = thrown(IllegalArgumentException)
        e.message == Util.INVALID_ARGUMENT

        where: " invalid inputs are"
        str1 | str2
        null | null
        null | "st"
        "st" | null
    }

    @Unroll
    def "check strings "(String str1, String str2, boolean expectedResult) {
        given: "valid string inputs"
        when: "I call isAnagram"
        Boolean actualResult = Util.isAnagram(str1, str2)

        then: "Expected results"
        actualResult == expectedResult

        where: "input and expected results are"
        str1  | str2  | expectedResult
        "abc" | "cba" | true
        "abc" | "cd"  | false
        "abc" | "abc" | false


    }
}
