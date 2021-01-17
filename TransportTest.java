package sk.kosickaakademia.stovcikova.rodnecislo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransportTest {
    TransportTest task = new TransportTest();


    @Test
    void priceForTransport() {
    }

    @BeforeEach
    void setUp() {
        System.out.println("test started");

    }

    @AfterEach
    void tearDown() {
        System.out.println("test finished");
    }

    @Test
    void testPriceForTransport() {
        assertEquals(5, task.priceForTransport(100,5,1));

    }

    private double priceForTransport(int i, double v, double i1) {
        return 0;
    }
}