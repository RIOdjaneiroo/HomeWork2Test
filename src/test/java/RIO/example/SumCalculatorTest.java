package RIO.example;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class SumCalculatorTest {

    private SumCalculator sumCalculator;

    @BeforeEach
    void beforEach(){
        System.out.println("Create SumCalculator");
        SumCalculator sumCalculator = new SumCalculator();
    }
    @Test
    public void testSumWithZero() {
        SumCalculator sumCalculator = new SumCalculator();
        assertThrows(IllegalArgumentException.class, () -> {
            sumCalculator.sum(0);
    });
}
    @Test
    public void  testSumOne (){
        SumCalculator sumCalculator = new SumCalculator();
        int result =sumCalculator.sum(1);
        assertEquals(1,result);

    }
    @Test
    public void  testSumSix (){
        SumCalculator sumCalculator = new SumCalculator();
        int result =sumCalculator.sum(3);
        assertEquals(6,result);

    }
    @Test
    public void testSumWithNegativeNumber() {
        SumCalculator sumCalculator = new SumCalculator();
        assertThrows(IllegalArgumentException.class, () -> {
            sumCalculator.sum(-5);});
    }

}