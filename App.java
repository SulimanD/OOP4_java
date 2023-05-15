
import java.net.NoRouteToHostException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;


public class App {
    public static void main(String[] args) throws Exception {

        List<Student> students = new ArrayList<>();
        students.add(new Student("Антон", "Некрасов", 22, (long)101));
        students.add(new Student("Марина", "Семенова", 23, (long)171));
        AverageAge<Student> studentAverageAge = new AverageAge<>(students);
        System.out.println(studentAverageAge);


        List<Teacher> teachers = new ArrayList<>();
        teachers.add(new Teacher("Андрей", "Патаев", 38, 552, "к.ф.н."));
        teachers.add(new Teacher("Александр", "Пешков", 45, 123, "к.ф.н."));
        AverageAge<Teacher> teacherAverageAge = new AverageAge<>(teachers);
        System.out.println(teacherAverageAge);


        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Оля", "Иванова", 50, 120));
        employees.add(new Employee("Анастасия", "Солнцева", 30, 115));
        AverageAge<Employee> employeeAverageAge = new AverageAge<>(employees);
        System.out.println(employeeAverageAge);

       
    }
}
