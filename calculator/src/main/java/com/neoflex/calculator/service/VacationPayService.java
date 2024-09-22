package com.neoflex.calculator.service;

import com.neoflex.calculator.model.VacationPayDTO;

public interface VacationPayService {
    void initCalculatorVacationPay( Double averageSalary, Integer vacationDays);
    VacationPayDTO getVacationPay();
}
