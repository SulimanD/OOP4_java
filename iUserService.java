// package StudentService;

import java.util.List;

// Создание интерфейса iUserService<T> и методов для вызова всех элементов и создания экземпляра класса
public interface iUserService<T> {
    List<T> getAll();
    void create(String firstName, String secondName, int age);
}

MethodAge.java***
//Создание интерфейса MethodAge и метода для вызова возраста экземпляра
public interface MethodAge {
    int getAge();
}