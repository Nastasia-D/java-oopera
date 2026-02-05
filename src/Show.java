import java.util.ArrayList;
import java.util.Scanner;

public class Show {
    protected String title;
    private int duration;
    private Director director;
    private ArrayList<Actor> listOfActors = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);


    public Show(String title, int duration, Director director, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }

    public ArrayList<Actor> getListOfActors() {

        return listOfActors;
    } // без этого метода IDEA не хочет читать //

    public void printActorList(ArrayList<Actor> listOfActors) {
        System.out.println("Актёр в спектакле " + title + ":");
        for (Actor actor : listOfActors) {
            System.out.println("Актёр: " + actor);
        }
    }

    public void addNewActor(Actor actor) {
        if (listOfActors.contains(actor)) {
            System.out.println("Такой актёр уже есть!");
        } else {
            listOfActors.add(actor);
            System.out.println("Актёр добавлен: " + actor);
        }
    }

    public void setReplacActor(Actor newActor, String surname) {
        for (int i = 0; i < listOfActors.size(); i++) {
            if (listOfActors.get(i).getSurname().equals(surname)) {
                listOfActors.remove(i);
                listOfActors.add(newActor);
                System.out.println("Произошла замена актёра " + surname + " на актёра "
                        + newActor + ".");
            }
        }
            System.out.println("Такого актёра нет в спектакле.");
    }
}