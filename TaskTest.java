import org.junit.jupiter.api.Test;
import sk.kosickaakademia.stovcikova.rodnecislo.StringReverse;
import sk.kosickaakademia.stovcikova.rodnecislo.Task;

import static org.junit.jupiter.api.Assertions.*;

class TaskTest {

    @Test
    void suc() {
        Task task = new Task();
        assertEquals(0, task.suc(0,0)); //equal ynamena yhoda musi bzt
        assertEquals(0, task.suc(5,-5));
        assertEquals(0, task.suc(-999,999 ));
    }

        @Test
        public void test() {
            StringReverse s = new StringReverse();
            assertEquals("cba", s.reverse("abc"));
            assertEquals("", s.reverse(""));
            assertNotEquals("abc", s.reverse("abc"));

        }
}