import java.util.Objects;

public class Actor extends Person {
    private int height;
    private Object obj;

    public int getHeight() {
        return height;
    }

    public Actor(String name, String surname, PersonGender gender, int height) {
        super(name, surname, gender);
        this.height = height;
    }
    @Override
    public String toString() {
        return name + " " + surname + " " + height;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        Actor actor = (Actor) obj;
        return Objects.equals(name, actor.name) && Objects.equals(surname, actor.surname)
                && Objects.equals(height, actor.height);
    }
    @Override
    public int hashCode() {
        int result = Objects.hash(name, surname, height);
        return result;
    }

}
