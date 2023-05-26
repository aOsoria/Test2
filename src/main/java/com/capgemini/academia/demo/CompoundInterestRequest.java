package com.capgemini.academia.demo;

public class CompoundInterestRequest {
    private double initialInvestment;
    private double annualContribution;
    private double annualContributionIncrease;
    private int investmentYears;
    private double investmentReturn;

    // Agrega los getters y setters para los campos

    public double getInitialInvestment() {
        return initialInvestment;
    }

    public void setInitialInvestment(double initialInvestment) {
        this.initialInvestment = initialInvestment;
    }

    public double getAnnualContribution() {
        return annualContribution;
    }

    public void setAnnualContribution(double annualContribution) {
        this.annualContribution = annualContribution;
    }

    public double getAnnualContributionIncrease() {
        return annualContributionIncrease;
    }

    public void setAnnualContributionIncrease(double annualContributionIncrease) {
        this.annualContributionIncrease = annualContributionIncrease;
    }

    public int getInvestmentYears() {
        return investmentYears;
    }

    public void setInvestmentYears(int investmentYears) {
        this.investmentYears = investmentYears;
    }

    public double getInvestmentReturn() {
        return investmentReturn;
    }

    public void setInvestmentReturn(double investmentReturn) {
        this.investmentReturn = investmentReturn;
    }
}
