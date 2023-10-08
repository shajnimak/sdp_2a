package repository.Decor;

import repository.Salary;

public class Bonus implements Salary {
    private final Salary salary;

    public Bonus(Salary salary) {
        this.salary = salary;
    }

    @Override
    public String getText() {
        return salary.getText() + " + Bonus";
    }

    @Override
    public double getSalary() {
        return salary.getSalary() * 1.5;
    }
}
