package org.example;


/**
 * Сущность для записи информации о подразделении.
 * @author Slivkin Sergey
 */

public class Division {

    int id;
    char name;
    /**
     * Конструктор записи информации о подразделении.
     * @param _id Генерируемый идентификатор.
     * @param _name Строка, полученная из таблицы.
     */

    public Division(int _id, char _name){
        id = _id;
        name = _name;
    };

    /**
     * Перегрузка метода Object.toString().
     * @return String Полученная строка.
     */
    @Override
    public String toString() {
        return "[" + id + ", " + name + "]";
    }
}
