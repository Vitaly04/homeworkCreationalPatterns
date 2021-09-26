package task1;

import java.util.Objects;
import java.util.OptionalInt;

public class Person {
    protected final String name;
    protected final String surname;
    protected int age;
    protected String address;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
    public boolean hasAge() {
        return getAge().isPresent();
    }
    public boolean hasAddress() {
        return address != null;
    }

    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public OptionalInt getAge() {
        if (age != 0) return OptionalInt.of(age);
        return OptionalInt.empty();
    }
    public String getAddress() {
        return address;
    }

    public String setAddress(String address) {
        return this.address = address;
    }
    public void happyBirthday() {
        if (hasAge()) age++;
    }

    @Override
    public String toString() {
        if(surname == null && age == 0 && address == null) return "имя='" + name + '\'';
        return  "имя ='" + name + '\'' +
                ", фамилия ='" + surname + '\'' +
                ", возраст ='" + age + '\'' +
                ", адрес ='" + address + '\'';
    }
    public PersonBuilder newChildBuilder() {
        return new PersonBuilder().setName(name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, address);
    }

}
