import com.example.Animal;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    Animal animal = new Animal();

    @ParameterizedTest
    @MethodSource("foodProvider")
    void getFoodReturnsCorrectFood(String animalType, List<String> expectedFood) throws Exception {
        List<String> food = animal.getFood(animalType);
        assertEquals(expectedFood, food);
    }

    static Stream<Arguments> foodProvider() {
        return Stream.of(
                Arguments.of(
                        "Травоядное",
                        List.of("Трава", "Различные растения")
                ),
                Arguments.of(
                        "Хищник",
                        List.of("Животные", "Птицы", "Рыба")
                )
        );
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
        String family = animal.getFamily();
        assertTrue(family.contains("кошачьи"));
    }
}