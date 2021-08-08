package entities;

public class Company extends TaxPayer {
    private Integer numberOfEmployees;

    public Company(String name, Double annualIncome, Integer numberOfEmployees) {
        super(name, annualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public double tax() {
        double tax;
        if (this.numberOfEmployees > 10)
            tax = this.annualIncome * 0.14;
        else
            tax = this.annualIncome * 0.16;
        return tax;
    }

    public String toString() {
        return this.name
                +": $ "
                + String.format("%.2f",tax());
    }

    public Integer getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(Integer numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }
}
