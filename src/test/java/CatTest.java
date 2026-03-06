import com.example.Cat;
import com.example.Predator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class CatTest {

    @Mock
    Predator predator;

    @Test
    void getSoundReturnsMeow() {
        Cat cat = new Cat(predator);

        assertEquals("Мяу", cat.getSound());
    }

    @Test
    void getFoodReturnsPredatorFood() throws Exception {
        List<String> expectedFood = List.of("Животные");

        when(predator.getFood("Хищник")).thenReturn(expectedFood);

        Cat cat = new Cat(predator);

        assertEquals(expectedFood, cat.getFood());

        verify(predator).getFood("Хищник");
    }
}