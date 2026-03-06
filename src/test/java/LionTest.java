import com.example.Lion;
import com.example.Predator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class LionTest {

    @Mock
    Predator predator;

    @Test
    void getFoodReturnsPredatorFood() throws Exception {
        when(predator.getFood("Хищник")).thenReturn(List.of("Животные"));

        Lion lion = new Lion("Самец", predator);

        assertEquals(List.of("Животные"), lion.getFood());

        verify(predator).getFood("Хищник");
    }

    @Test
    void getKittensReturnsValueFromPredator() throws Exception {
        when(predator.getKittens()).thenReturn(3);

        Lion lion = new Lion("Самка", predator);

        assertEquals(3, lion.getKittens());
    }

    @Test
    void constructorThrowsExceptionWhenSexInvalid() {
        assertThrows(Exception.class, () ->
                new Lion("Неизвестно", predator)
        );
    }
}