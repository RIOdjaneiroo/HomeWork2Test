package RIO.example;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class SumCalculatorTest {

//    @BeforeEach
//    public void beforEach(){
//        System.out.println("Create SumCalculator");
//        SumCalculator sumCalculator = new SumCalculator();
//    }
    @Test
    public void testSumWithZero() {
        SumCalculator calculator = new SumCalculator();
        assertThrows(IllegalArgumentException.class, () -> {
        calculator.sum(0);
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
        SumCalculator calculator = new SumCalculator();
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.sum(-5);});
    }

}