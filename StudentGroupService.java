import java.util.ArrayList;
import java.util.List;

// Создание класса StudentGroupService
public class StudentGroupService {

    private List<StudentGroup> groups;

// Конструктор класса StudentGroupService
    public StudentGroupService() {
        this.groups = new ArrayList<>();
    }
//  Метод для вызова всех элементов списка
    public List<StudentGroup> getAll()
    {
        return this.groups;
    }

//  Метод для сортировки списка элементов типа Student    
    public List<Student> getSortedByFIOStudentGroup(int numberGroup)
    {
        List<Student> students = new ArrayList<>(groups.get(numberGroup).getStudents());
        students.sort(new UserComparator<Student>());
        return students;
    }
}