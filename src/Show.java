import java.util.ArrayList;
import java.util.Scanner;

public class Show {
    String title;
    int duration;
    String director;
    ArrayList<Actor> listOfActors = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public Show(String title, int duration, String director, ArrayList<Actor> listOfActors){
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }

    public void printActorList (ArrayList<Actor> actors) {
        System.out.println("Актёр в спектакле " + title + ":");
        for(Actor actor : actors){
            System.out.println(" " + actor);
        }
    }

    public void printActors () {
        System.out.println("Актёр: " + listOfActors);
    }

    public void addNewActor(){
       System.out.println("Введите имя");
        String newName = scanner.nextLine();
        System.out.println("Введите фамилию");
        String newSurname = scanner.nextLine();
        System.out.println("Введите рост");
        int newHeight = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Выберети пол: MALE / FEMALE");
        String newGender = scanner.nextLine();
        Person.PersonGender gender = Person.PersonGender.valueOf(newGender);
        Actor newActor = new Actor(newName, newSurname, gender, newHeight);
        if(listOfActors.contains(newActor)){
            System.out.println("Такой актёр уже есть!");
        } else {
            listOfActors.add(newActor);
            System.out.println("Актёр добавлен: " + newActor);
        }
    }

    public void setReplacActor(Actor oldActor, Actor newActor){
        if(listOfActors.contains(oldActor)){
            listOfActors.remove(oldActor);
            listOfActors.add(newActor);
            System.out.println("Произошла замена актёра " + oldActor + " на актёра " + newActor + ".");
        } else {
            System.out.println("Такого актёра нет в спектакле.");
        }
    }
   }
