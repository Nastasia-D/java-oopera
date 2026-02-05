public class Person {
    protected final String name;

    public String getSurname() {
        return surname;
    }

    protected final String surname;
    protected final Gender gender;

    public Person(String name, String surname, Gender gender) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
    }
    @Override
    public String toString() {
        return name + " " + surname;
    }

    public enum Gender {
        FEMALE,
        MALE
    }
}
