package Classes;

import static org.junit.jupiter.api.Assertions.*;

class MyMathTest {
    private MyMath myMath;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        myMath=new MyMath();
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void isPrimeNumber() {
        assertTrue(myMath.isPrimeNumber(2));
        assertTrue(myMath.isPrimeNumber(3));
        assertTrue(myMath.isPrimeNumber(7));
        assertTrue(myMath.isPrimeNumber(31));
        assertTrue(myMath.isPrimeNumber(47));
        assertTrue(myMath.isPrimeNumber(997));

        assertFalse(myMath.isPrimeNumber(0));
        assertFalse(myMath.isPrimeNumber(1));
        assertFalse(myMath.isPrimeNumber(4));
        assertFalse(myMath.isPrimeNumber(6));
        assertFalse(myMath.isPrimeNumber(9));
    }

    @org.junit.jupiter.api.Test
    void min() {
    }

    @org.junit.jupiter.api.Test
    void isExistingTriangle() {
    }
}