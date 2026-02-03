public class Director extends Person{
    int numberOfShows;

    public Director(String name, String surname, PersonGender gender, int numberOfShows){
        super(name, surname, gender);
        this.numberOfShows = numberOfShows;
    }

    @Override
    public String toString() {
        return "Режисёр: " + name + " " + surname;
    }
}
