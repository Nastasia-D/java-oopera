import java.util.ArrayList;

public class Theatre {
    public static void main(String[] args){
        ArrayList<Actor> actors = new ArrayList<>();
        Actor actor1 = new Actor("Иван", "Петров", Person.Gender.MALE,
                175);
        Actor actor2 = new Actor("Мария", "Сидорова",
                Person.Gender.FEMALE, 165);
        Actor actor3 = new Actor("Ольга", "Романова",
                Person.Gender.FEMALE, 158);
        actors.add(actor1);
        actors.add(actor2);
        actors.add(actor3);

        Director director1 = new Director("Елена", "Козлова",
                Person.Gender.FEMALE, 2);
        Director director2 = new Director("Сергей", "Михайлов",
                Person.Gender.MALE, 2);

        Person choreographer = new Person("Дмитрий", "Соловьев",
                Person.Gender.MALE);

        Person musicAuthor = new Person("Жорж", "Бизе", Person.Gender.MALE);

        Opera opera = new Opera("Кармен", 150, director1,
                new ArrayList<>(), musicAuthor, "Лиретто Кармен", 40);
        Ballet ballet = new Ballet("Лебединое озеро", 140,
                director2, new ArrayList<>(), musicAuthor,
                "Либретто балета", choreographer);
        Show show = new Show("Ромео и Джульетта", 120, director1,
                new ArrayList<>());

        opera.getListOfActors().add(actor1);
        ballet.getListOfActors().add(actor3);
        ballet.getListOfActors().add(actor2);
        show.getListOfActors().add(actor2);

        System.out.println("Опера " + opera.title + ": ");
        opera.printActorList(opera.getListOfActors());
        System.out.println("Балет " + ballet.title + ": ");
        ballet.printActorList(ballet.getListOfActors());
        System.out.println("Спектакль " + show.title + ": ");
        show.printActorList(show.getListOfActors());

        System.out.println("Либретто для оперы: ");
        opera.printLibrettoText();
        System.out.println("Либретто для балета: ");
        ballet.printLibrettoText();

        opera.setReplacActor(actor1, actor3.getSurname());
        System.out.println("Опера " + opera.title + ": ");
        opera.printActorList(opera.getListOfActors());

        Actor actor4 = new Actor("Антон", "Иванов",
                Person.Gender.MALE, 180);
        ballet.setReplacActor(actor4, actor2.getSurname());
    }
}
