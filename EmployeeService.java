import java.util.ArrayList;
import java.util.List;

// Создание класса EmployeeService и подключение к интерфейсу iUserService<Employee>
public class EmployeeService implements iUserService<Employee> {
    private int count;
    private List<Employee> emploees;

// Конструктор класса EmployeeService
    public EmployeeService() {
        this.emploees = new ArrayList<Employee>();
    }

//  Метод для создания экземпляра класса EmployeeService
    @Override
    public void create(String firstName, String secondName, int age) {
       Employee per = new Employee(firstName, secondName, age, count);
       count++;
       emploees.add(per);
    }
//  Метод для вызова всех элементов списка
    @Override
    public List<Employee> getAll()
    {
        return emploees;
    }
//  Метод для сортировки списка элементов типа Employee
    public List<Employee> getSortedByFIOStudentGroup(int numberGroup)
    {
        List<Employee> emps = new ArrayList<>(emploees);
        emps.sort(new UserComparator<Employee>());
        return emps;
    }
}