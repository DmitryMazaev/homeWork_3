package Classes;

/**
 * Класс Директор
 */
public class Director extends Emploee{

    /**
     * Количество сотрудников в подчинении
     */
    private int subordinates;

    public int getSubordinates() {
        return subordinates;
    }

    public void setSubordinates(int subordinates) {
        this.subordinates = subordinates;
    }

    public Director(int id, String name, int age, String post, String departament, int salary) {
        super(id, name, age, post, departament, salary);
        this.subordinates = subordinates;
    }

    @Override
    public String toString() {
        return "Сотрудник: " + name + ", возраст: " + super.age + ", должность: " + super.getPost() + ", подразделение: " + super.getDepartament()
                + ", зарплата: " + super.getSalary();
    }
}
