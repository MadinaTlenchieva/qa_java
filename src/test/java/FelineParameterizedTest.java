import com.example.Feline;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FelineParameterizedTest {

    @ParameterizedTest
    @ValueSource(ints = {1})
    void getKittensReturnsCorrectValue(int expected) {
        Feline feline = new Feline();
        assertEquals(expected, feline.getKittens());
    }
}