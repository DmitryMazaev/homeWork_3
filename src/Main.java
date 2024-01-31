import Classes.Director;
import Classes.Emploee;
import Classes.Person;
import Classes.PersonnelDepartment;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Написать компаратор - метод внутри класса сотрудника, сравнивающий сотрудников по произвольному параметру.
 * (Код пишется на основе задачек из презентации.) Опишите класс руководителя, наследник от сотрудника.
 * Перенесите статический метод повышения зарплаты в класс руководителя, модифицируйте метод таким образом,
 * чтобы он мог поднять заработную плату всем, кроме руководителей (использовать instanceof).
 * В основной программе создайте руководителя и поместите его в общий массив сотрудников.
 * Повысьте зарплату всем сотрудникам и проследите, чтобы зарплата руководителя не повысилась.
 */
public class Main {
    public static void main(String[] args) {
        Emploee emploee1 = new Emploee(1, "Иванов В.А.", 18, "Охранник", "Служба безопасности",50000);
        Emploee emploee2 = new Emploee(2, "Петров Д.С..", 56, "Сторож", "Служба безопасности",45000);
        Emploee emploee3 = new Emploee(3, "Семенов К.К.", 38, "Инженер", "ПТО",90000);
        Emploee emploee4 = new Emploee(4, "Казанцева Я.Н.", 31, "Сметчик", "ПТО",85000);
        Director director1 = new Director(412, "Петровский А.А.", 35, "начальник", "Служба безопасности",180000);
        Director director2 = new Director(412, "Кузьмин Л.Д.", 35, "начальник", "ПТО",210000);

        ArrayList<Emploee> personalList = new ArrayList<>();

        PersonnelDepartment personnelDepartment = new PersonnelDepartment();
        personalList.add(emploee1);
        personalList.add(emploee2);
        personalList.add(emploee3);
        personalList.add(emploee4);
        personalList.add(director1);
        personalList.add(director2);
        System.out.println("=========Общий список сотрудников========");
        for (Person person: personalList)
        {
            System.out.println(person);
        }
        System.out.println("=========Повышение зарплаты========");
        personnelDepartment.increaseSalary(personalList);
        System.out.println("=========Общий список сотрудников после повышения зарплаты========");
        for (Person person: personalList)
        {
            System.out.println(person);
        }

        System.out.println("=========Работа компаратора========");

        Collections.sort(personalList);
        for (Person person: personalList)
        {
            System.out.println(person);
        }

    }
}