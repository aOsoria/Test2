package com.capgemini.academia.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CompoundInterestController {
    @GetMapping("/calculate")
    public ResponseEntity<String> calculateCompoundInterest(
            @RequestParam double initialInvestment,
            @RequestParam double annualContribution,
            @RequestParam double annualContributionIncrease,
            @RequestParam int investmentYears,
            @RequestParam double investmentReturn
    ) {
        // Validar la cantidad de "Inversión Inicial"
        if (initialInvestment < 1000) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("La cantidad de 'Inversión Inicial' debe ser mayor o igual a $1,000.00");
        }

        // Lógica para calcular el interés compuesto
        double amount = calculateAmount(initialInvestment, annualContribution, annualContributionIncrease, investmentYears, investmentReturn);

        return ResponseEntity.ok("El monto generado es: " + amount);
    }

    private double calculateAmount(double initialInvestment, double annualContribution,
                                   double annualContributionIncrease, int investmentYears,
                                   double investmentReturn) {
        // Lógica para calcular el monto utilizando los parámetros proporcionados
        // ...
        double amount = 0.0;
        return amount;
    }

}
