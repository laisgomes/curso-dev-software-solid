package liskov.employee;

public class Employee {
    protected double salario;

    public double bonus(){
        return this.salario * 0.2;
    }
}
