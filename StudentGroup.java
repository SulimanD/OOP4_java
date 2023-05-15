import java.util.Iterator;
import java.util.List;
// Создание класса StudentGroup и подключение к интерфейсам Iterable<Student>
public class StudentGroup implements Iterable<Student> {
    private List<Student> students;
// Конструктор класса StudentGroup
    public StudentGroup(List<Student> students) {
        this.students = students;
    }
// Метод для вызова списка экземпляра
    public List<Student> getStudents() {
        return students;
    }
// Метод, который устанавливает список экземпляра
    public void setStudents(List<Student> students) {
        this.students = students;
    }

    // @Override
    // public Iterator<Student> iterator() {
    //     return new StudentGroupIterator(students);
    // }
// Метод, который переопределяет метод итерации Iterator<Student> для класса Student
    @Override
    public Iterator<Student> iterator() {
        return new Iterator<Student>(){
            private int index = 0;
            @Override
            public boolean hasNext() {
               return index<students.size();
            }
            @Override
            public Student next() {
                if(!hasNext())
                {
                    return null;
                }
                //counter++;
                return students.get(index++);        
            }

        };
    }
    
}