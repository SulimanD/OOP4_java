// package Controllers;

// import StudentDomen.Student;
// import StudentService.StudentGroupService;
// import StudentService.StudentService;

//  Создание класса StudentController и подключение к интерфейсу iUserController<Student>
public class StudentController implements iUserController<Student> {

    private final StudentService dataService = new StudentService();
    private final StudentGroupService groupService = new StudentGroupService();

//  Метод для создания экземпляра класса StudentController
    @Override
    public void create(String firstName, String secondName, int age) {
        dataService.create(firstName, secondName, age);
    }
    
}