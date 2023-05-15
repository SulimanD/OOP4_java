// Создание класса Employee, наследника User и подключение к интерфейсу MethodAge
public class Employee extends User implements MethodAge {

    private int empId;
// Конструктор класса Employee
    public Employee(String firstName, String secondName, int age, int empId) {
        super(firstName, secondName, age);
        this.empId = empId;
    }

// Метод для вызова ID экземпляра
    public int getEmpId() {
        return empId;
    }
// Метод, который устанавливает ID экземпляра
    public void setEmpId(int empId) {
        this.empId = empId;
    }
// Метод для вызова возраста экземпляра
    @Override
    public int getAge() {
        return super.getAge();
    }

}
