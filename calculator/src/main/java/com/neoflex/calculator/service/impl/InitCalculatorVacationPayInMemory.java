package com.neoflex.calculator.service.impl;

import com.neoflex.calculator.model.VacationPayDTO;
import com.neoflex.calculator.service.VacationPayService;
import org.springframework.stereotype.Service;

@Service
public class InitCalculatorVacationPayInMemory implements VacationPayService {
    VacationPayDTO vacationPayDTO;
    final Double DAYS = 29.3; // среднее число дней в месяце

    @Override
    public void initCalculatorVacationPay(Double averageSalary, Integer vacationDays) {
        vacationPayDTO = new VacationPayDTO(getVacationPay( averageSalary, vacationDays));
    }

    @Override
    public VacationPayDTO getVacationPay() {
        return vacationPayDTO;
    }

    public Double getVacationPay(Double averageSalary, Integer vacationDays){
       return (double)Math.round( averageSalary / DAYS *  vacationDays * 100) / 100;
    }

}
