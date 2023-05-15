// package Controllers;

// import StudentDomen.Emploee;
// import StudentDomen.User;
// import StudentService.EmploeeService;

//  Создание класса EmployeeController и подключение к интерфейсу iUserController<Employee>
public class EmployeeController implements iUserController<Employee> {
    private final EmployeeService empService = new EmployeeService();

//  Метод для создания экземпляра класса EmployeeController
    @Override
    public void create(String firstName, String secondName, int age) {
        empService.create(firstName, secondName, age);
    }
//  Метод для вывода зарплаты
    static public <T extends Employee> void paySalary(T person)
    {
        System.out.println(((User) person).getFirstName()+" зп 10000р ");
    }
// Метод для вычисления среднего арифметического
    static public <T extends Number> Double mean(T[] num)
    {
        double sum = 0.0;
        for(int i =0; i<num.length;i++)
        {
            sum= sum+num[i].doubleValue();
        }
        sum=sum/num.length;
        return sum;
    }
}
