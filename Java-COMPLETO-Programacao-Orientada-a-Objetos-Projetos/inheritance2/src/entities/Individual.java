package entities;

public class Individual extends TaxPayer {
    private Double healthExpenditures;

    public Individual(String name, Double annualIncome, Double healthExpenditures) {
        super(name, annualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public double tax() {
        double tax;
        if (this.annualIncome < 20_000)
            tax = this.annualIncome * 0.15 - this.healthExpenditures * 0.5;
        else
            tax = this.annualIncome * 0.25 - this.healthExpenditures * 0.5;
        return tax;
    }

    public String toString() {
        return this.name
                +": $ "
                + String.format("%.2f",tax());
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }
}
