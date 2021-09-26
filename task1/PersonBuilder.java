package task1;

public class PersonBuilder {
    protected String name;
    protected String surname;
    protected int age;
    protected String address;

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        if (age <= 0 || age > 100) throw new IllegalArgumentException("Ввыдены неверные данные");
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() {
        Person person = new Person(name, surname, age);
        person.setAddress(address);
        if (name == null) throw new IllegalStateException("Не хватает обязательных полей");
        return person;
    }
}
