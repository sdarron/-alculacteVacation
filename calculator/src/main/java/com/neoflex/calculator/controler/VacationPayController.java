package com.neoflex.calculator.controler;

import com.neoflex.calculator.model.VacationPayDTO;
import com.neoflex.calculator.service.VacationPayService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class VacationPayController {

    private VacationPayService vacationPayService;

    @GetMapping
    public VacationPayDTO getVacationPay(@RequestParam Double averageSalary, @RequestParam Integer vacationDays){
        vacationPayService.initCalculatorVacationPay(averageSalary, vacationDays);
        return vacationPayService.getVacationPay();
    }
}
