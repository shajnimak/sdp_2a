package repository.Decor;

import repository.Salary;

public class Penalty implements Salary {
    private final Salary salary;

    public Penalty(Salary salary) {
        this.salary = salary;
    }

    @Override
    public String getText() {
        return salary.getText() + " - Penalty";
    }

    @Override
    public double getSalary() {
        return salary.getSalary() - 500;
    }
}
