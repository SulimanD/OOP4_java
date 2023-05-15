// package Controllers;

// import StudentDomen.User;

// Создание интерфейса iUserController<T extends User> для наследников User и метода для создания экземпляра класса
public interface iUserController<T extends User> {
    void create(String firstName, String secondName, int age);
}