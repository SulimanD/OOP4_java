// package StudentService;

import java.util.ArrayList;
import java.util.List;

// import StudentDomen.Student;

// Создание класса StudentService и подключение к интерфейсу iUserService<Student>
public class StudentService implements iUserService<Student> {
    private int count;
    private List<Student> students;
    public StudentService() {
        this.students = new ArrayList<Student>();
    }

//  Метод для создания экземпляра класса StudentService
    @Override
    public void create(String firstName, String secondName, int age) {
       Student per = new Student(firstName, secondName, age, count);
       count++;  
       students.add(per);      
    }
    
//  Метод для вызова всех элементов списка
    @Override
    public List<Student> getAll() {
        return students;
    }   

    // public List<Student> getAll()
    // {
    //     return students;
    // }


}