package Classes;

/**
 * Класс Работник
 */
public class Emploee extends  Person implements Comparable<Emploee> {
    /**
     * Поле должность
     */
    private String post;
    /**
     * Поле подразделение
     */
    private String departament;

    /**
     * Поле зарплата
     */
    private int salary;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getDepartament() {
        return departament;
    }

    public void setDepartament(String departament) {
        this.departament = departament;
    }

    public Emploee (int id, String name, int age, String post, String departament, int salary)
    {
        super.id = id;
        super.name = name;
        super.age = age;
        this.post = post;
        this.departament = departament;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Сотрудник: " + name + ", возраст: " + age + ", должность: " + post + ", подразделение: " + departament
                + ", зарплата: " + salary;

    }
    /**
     * Переопределение сомпаратора
     */

    @Override
    public int compareTo(Emploee o) {
        return this.getSalary() - o.getSalary();
    }
}
