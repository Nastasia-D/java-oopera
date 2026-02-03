public class Person {
    protected final String name;
    protected final String surname;
    protected final PersonGender gender;

    public Person(String name, String surname, PersonGender gender) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
    }


    enum PersonGender {
        FEMALE,
        MALE
    }
}
