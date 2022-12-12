package org.example;

/**
 * Сущность для записи информации о человеке.
 * Поля соответствуют полям .scv таблицы.
 * @author Slivkin Sergey
 */


public class Person {
    private int id;
    private String name;
    private String gender;
    private Division division;
    private int salary;
    private String birthDate;
/**
 * Конструктор работающий со строкой таблицы с разделителем ";".
 * @param data Строка, полученная из таблицы.
 * @param i Генерируемый идентификатор поля division.
 */

   public Person(String data, int i){
       String[] words = data.split(";");
       id = Integer.parseInt(words[0].substring(1));
       name = words[1];
       gender = words[2];
       birthDate = words[3];
       division = new Division(i, words[4].charAt(0));
       salary = Integer.parseInt(words[5].substring(0, words[5].length() - 1));
   };

    /**
     * Перегрузка метода Object.toString().
     * @return String Полученная строка.
     */
   @Override
   public String toString() {
       return "[" + id + "]" + "[name=" + name + ", gender=" + gender
               + ", division=" +division.toString() + ", birthDate="
               + birthDate + ", salary=" + salary + "]";
   }
}
