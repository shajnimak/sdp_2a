package repository.Decor;

import repository.Salary;

public class BaseSalary implements Salary {
    private final Long salary;

    public BaseSalary(Long salary) {
        this.salary = salary;
    }

    @Override
    public String getText() {
        return "Base Salary";
    }

    @Override
    public double getSalary() {
        return salary;
    }
}
