import com.example.Animal;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

class AnimalTest {

    Animal animal = new Animal();

    @Test
    void getFoodReturnsHerbivoreFood() throws Exception {
        List<String> food = animal.getFood("Травоядное");
        assertEquals(List.of("Трава", "Различные растения"), food);
    }

    @Test
    void getFoodReturnsPredatorFood() throws Exception {
        List<String> food = animal.getFood("Хищник");
        assertEquals(List.of("Животные", "Птицы", "Рыба"), food);
    }

    @Test
    void getFoodThrowsExceptionWhenUnknownType() {
        Exception exception = assertThrows(Exception.class, () ->
                animal.getFood("Неизвестно")
        );

        assertEquals(
                "Неизвестный вид животного, используйте значение Травоядное или Хищник",
                exception.getMessage()
        );
    }

    @Test
    void getFamilyReturnsCorrectString() {
        assertTrue(animal.getFamily().contains("кошачьи"));
    }
}