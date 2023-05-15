import java.util.Comparator;
// Создание класса UserComparator, наследника User и подключение к интерфейсу Comparator<T>
public class UserComparator<T extends User> implements Comparator<T> {

// Метод, который переопределяет исходный метод compare для наследников класса User
    @Override
    public int compare(T o1, T o2) {
        int resultOfComparing = o1.getFirstName().compareTo(o2.getFirstName());
        if (resultOfComparing == 0) {
            resultOfComparing = o1.getSecondName().compareTo(o2.getSecondName());
            return resultOfComparing;
        } else {
            return resultOfComparing;
        }
    }

}