import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

public class MyTests {
    @Test
    public void testCalculateLengthWithOptional() {
        assertEquals(Optional.of(5), MyMain.calculateLengthWithOptional("12345"));
        assertEquals(Optional.of(0), MyMain.calculateLengthWithOptional(""));
        assertFalse(MyMain.calculateLengthWithOptional(null).isPresent());
    }

    @Test
    public void testDivide() {
        assertEquals(Optional.of(2.0), MyMain.divide(10, 5));
        assertFalse(MyMain.divide(10, 0).isPresent());
    }

    @Test
    public void testCalculateTotalPrice() {
        assertEquals(99.0, MyMain.calculateTotalPrice(new double[]{10, 100}, Optional.of(.1)));
        assertEquals(110, MyMain.calculateTotalPrice(new double[]{10, 100}, Optional.empty()));
    }

    @Test
    public void testSortByLength() {
        List<String> words = Arrays.asList("do", "you", "ever", "feel", "like", "a", "plastic", "bag");
        MyMain.sortByLength(words);
        assertEquals(Arrays.asList("a", "do", "bag", "you", "ever", "feel", "like", "plastic"), words);
    }

    @Test
    public void testGetClosestFiveTo100() {
        assertEquals(Arrays.asList(99, 98, 102, 90, 115), MyMain.getClosestFiveTo100(Arrays.asList(1, 2, 3, 90, 40, 500, 99, 115, 98, 102)));
    }
}