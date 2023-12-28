package gb;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {

        Person person = new Person("Artem", "Maklashev", 45);
        System.out.printf("Создан объект класса Person: %s\n", person);

        Gson gson = new Gson();
        String serializedPerson = gson.toJson(person);
        System.out.printf("Сериализованный объект: %s\n", serializedPerson);

        Person deserializedPerson = gson.fromJson(serializedPerson, Person.class);
        System.out.printf("Десериализованный объект: %s\n", deserializedPerson);
    }
}