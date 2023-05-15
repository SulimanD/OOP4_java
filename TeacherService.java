import java.util.ArrayList;
import java.util.List;

// Создание класса TeacherService и подключение к интерфейсу iUserService<Teacher>
public class TeacherService implements iUserService<Teacher> {
    private int count;
    private int teacherId;
    private String academicDegree;
    private List<Teacher> teachers;

// Конструктор класса TeacherService
    public TeacherService() {
        this.teachers = new ArrayList<Teacher>();
    }
    
//  Метод для создания экземпляра класса TeacherService
    public void create(String firstName, String secondName, int age) {
        Teacher per = new Teacher(firstName, secondName, age, teacherId, academicDegree);
        count = count + 1;
       teachers.add(per);
    }
//  Метод для вызова всех элементов списка
    @Override
    public List<Teacher> getAll()
    {
        return teachers;
    }
//  Метод для сортировки списка элементов типа Teacher
    public List<Teacher> getSortedByFIOStudentGroup(int numberGroup)
    {
        List<Teacher> teach = new ArrayList<>(teachers);
        teach.sort(new UserComparator<Teacher>());
        return teach;
    }
}