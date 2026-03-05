import com.example.Feline;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ParameterizedFelineTest {

    Feline feline = new Feline();

    @Test
    void getKittensReturnsOne() {
        assertEquals(1, feline.getKittens());
    }
}