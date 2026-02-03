import java.util.ArrayList;

public class Theatre {
    public static void main(String[] args){
        ArrayList<Actor> actors = new ArrayList<>();
        Actor actor1 = new Actor("Иван", "Петров", Person.PersonGender.MALE,
                175);
        Actor actor2 = new Actor("Мария", "Сидорова",
                Person.PersonGender.FEMALE, 165);
        Actor actor3 = new Actor("Ольга", "Романова",
                Person.PersonGender.FEMALE, 158);
        actors.add(actor1);
        actors.add(actor2);
        actors.add(actor3);

        Director director1 = new Director("Елена", "Козлова",
                Person.PersonGender.FEMALE, 2);
        Director director2 = new Director("Сергей", "Михайлов",
                Person.PersonGender.MALE, 2);

        Opera opera = new Opera("Кармен", 150, "Елена Козлова",
                new ArrayList<>(), "Жорж Бизе", "Лиретто Кармен", 40);
        Ballet ballet = new Ballet("Лебединое озеро", 140,
                "Сергей Михайлов", new ArrayList<>(), "Жорж Бизе",
                "Либретто балета", "Дмитрий Соловьев");
        Show show = new Show("Ромео и Джульетта", 120, "Елена Козлова",
                new ArrayList<>());

        opera.listOfActors.add(actor1);
        ballet.listOfActors.add(actor3);
        ballet.listOfActors.add(actor2);
        show.listOfActors.add(actor2);

        System.out.println("Опера " + opera.title + ": ");
        opera.printActorList(opera.listOfActors);
        System.out.println("Балет " + ballet.title + ": ");
        ballet.printActorList(ballet.listOfActors);
        System.out.println("Спектакль " + show.title + ": ");
        show.printActorList(show.listOfActors);

        System.out.println("Либретто для оперы: ");
        opera.printLibrettoText();
        System.out.println("Либретто для балета: ");
        ballet.printLibrettoText();

        opera.setReplacActor(actor1, actor3);
        System.out.println("Опера " + opera.title + ": ");
        opera.printActorList(opera.listOfActors);

        Actor actor4 = new Actor("Антон", "Иванов",
                Person.PersonGender.MALE, 180);
        ballet.setReplacActor(actor4, actor2);
    }
}
