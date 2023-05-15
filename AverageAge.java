import java.util.List;
// Создание класса AverageAge
public class AverageAge<T extends MethodAge> {
    private List <T> lst;
// Конструктор класса AverageAge
    public AverageAge(List <T> lst) {
        this.lst = lst;
    }
// Метод для вычисления среднего возраста 
    public double AverageAgeCalc(){
        int sum = 0;
        int age = 0;
        for (T index : lst){
            age = index.getAge();
            sum = sum + index.getAge();
        }
        return (double) sum / lst.size();
    }
// Метод, который переопределяет метод вывода в консоль toString()
    @Override
    public String toString(){
        return "Средний возраст равен: " + AverageAgeCalc();
    }

}