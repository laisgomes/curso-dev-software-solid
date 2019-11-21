package liskov.employee;

public class Manager extends Employee {

    public double bonus(){
        return super.bonus() + this.salario * 0.1;
    }
}
