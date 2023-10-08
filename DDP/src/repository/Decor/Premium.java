package repository.Decor;

import repository.Salary;

public class Premium implements Salary {
    private final Salary salary;

    public Premium(Salary salary) {
        this.salary = salary;
    }

    @Override
    public String getText() {
        return salary.getText() + " + Premium";
    }

    @Override
    public double getSalary() {
        return salary.getSalary() + 1000;
    }
}
