import Homework4.Triangle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static Homework4.Triangle.*;
import static org.assertj.core.api.Assertions.assertThat;

public class TriangleTests {

    @Test
    @DisplayName("Расчет площади треугольника")
     void triangleTest () throws Exception {
        Assertions.assertEquals(Triangle.calculateSquare(3, 4, 5), 6);
    }

    @Test
    @DisplayName("Негативная проверка расчета площади треугольника")
    public void triangleNegativeTest(){
        Assertions.assertThrows(Exception.class, () -> Triangle.calculateSquare(3, -4, 5));
    }

}
