// Создание класса Teacher, наследника User и подключение к интерфейсу MethodAge
public class Teacher extends User implements MethodAge {
    
    private int teacherId;
    private String academicDegree;
// Конструктор класса Teacher
    public Teacher(String firstName, String secondName, int age, int teacherId, String academicDegree ) {
        super(firstName, secondName, age);
       this.teacherId = teacherId;
       this.academicDegree = academicDegree;
    }
// Метод для вызова ID экземпляра
    public int getTeacherId() {
        return teacherId;
    }
// Метод, который устанавливает ID экземпляра
    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }
// Метод для вызова академ. степени экземпляра
    public String getLevel() {
        return academicDegree;
    }
// Метод, который устанавливает академ. степень экземпляра
    public void setLevel(String academicDegree) {
        this.academicDegree = academicDegree;
    }
// Метод для вызова возраста экземпляра
    @Override
    public int getAge() {
        return super.getAge();
    }

}