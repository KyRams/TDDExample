import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class StringCalculatorTest {
    @Test
    void add_emptyString_ReturnZero(){
        assertEquals(0, StringCalculator.add(""));
    }

    @Test
    void add_string_nums_ReturnSum(){
        assertEquals(10, StringCalculator.add("11233"));
    }
}
