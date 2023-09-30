package RIO.example;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class SumCalculatorTest {

    private SumCalculator sumCalculator;

    @BeforeEach
    void beforEach(){
        System.out.println("Create SumCalculator");
        sumCalculator = new SumCalculator();

    }
    @Test
    public void testSumWithZero() {
        assertThrows(IllegalArgumentException.class, () -> {
            sumCalculator.sum(0);
    });
}
    @Test
    public void  testSumOne (){
        int result =sumCalculator.sum(1);
        assertEquals(1,result);

    }
    @Test
    public void  testSumSix (){
        int result =sumCalculator.sum(3);
        assertEquals(6,result);

    }
    @Test
    public void testSumWithNegativeNumber() {
        assertThrows(IllegalArgumentException.class, () -> {
            sumCalculator.sum(-5);});
    }

}