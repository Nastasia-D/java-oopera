public class Person {
    protected final String name;

    protected final String surname;
    protected final Gender gender;
    public Person(String name, String surname, Gender gender) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
    }

    public String getSurname() {
        return surname;
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
