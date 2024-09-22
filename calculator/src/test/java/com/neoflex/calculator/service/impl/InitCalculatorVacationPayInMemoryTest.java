package com.neoflex.calculator.service.impl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InitCalculatorVacationPayInMemoryTest {

    private InitCalculatorVacationPayInMemory initCalculatorVacationPayInMemory;
    @Test
    public void testCalcVacationPay(){
        initCalculatorVacationPayInMemory = new InitCalculatorVacationPayInMemory();
        Double result1 = initCalculatorVacationPayInMemory.getVacationPay(100000.00, 20);
        Double result2 = initCalculatorVacationPayInMemory.getVacationPay(500000.00, 20);
        Double result3 = initCalculatorVacationPayInMemory.getVacationPay(5000000000.00, 20);
        Double result4 = initCalculatorVacationPayInMemory.getVacationPay(0.00, 0);
        Assertions.assertNotNull(result1);
        Assertions.assertEquals(68259.39, result1);
        Assertions.assertEquals(341296.93, result2);
        Assertions.assertEquals(3.41296928328E9, result3);
        Assertions.assertEquals(0, result4);
    }

}
