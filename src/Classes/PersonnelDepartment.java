package Classes;

import java.util.ArrayList;
import java.util.Collections;

import Classes.Director;
import Classes.Emploee;

public class PersonnelDepartment {

    private ArrayList<Emploee> personalList;

    /**
     *
     * Метод повышения зарплаты сотрудникам за исключением экземпляров класса Director
     */
    public void increaseSalary (ArrayList<Emploee> personalList)
    {
        for (Person person: personalList)
        {
            if (person instanceof Director)
            {
                System.out.println(person.toString() + ", зарплата директора не повышалась");
            }
            else if (person instanceof Emploee)
            {
                double instance = ((Emploee) person).getSalary() * 0.2;
                System.out.println(person.toString() + ". Повышение зарплаты на 20%");
                ((Emploee) person).setSalary(((Emploee) person).getSalary() + (int)instance);

            }
        }
    }


}
