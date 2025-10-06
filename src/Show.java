import java.util.ArrayList;

public class Show {
    private String title;
    private int duration;
    private Director director;
    private ArrayList<Actor> listOfActors;

    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    public Director getDirector() {
        return director;
    }

    public ArrayList<Actor> getListOfActors() {
        return listOfActors;
    }

    // Распечатать информацию о режиссёре
    public void printDirector() {
        System.out.println("Режиссёр: " + director);
    }

    // Распечатать список всех актёров
    public void printAllActors() {
        System.out.println("Актёры спектакля \"" + title + "\":");
        if (listOfActors.isEmpty()) {
            System.out.println("  Список актёров пуст");
        } else {
            for (Actor actor : listOfActors) {
                System.out.println("  " + actor);
            }
        }
    }

    // Добавить нового актёра
    public void addActor(Actor actor) {
        if (listOfActors.contains(actor)) {
            System.out.println("Актёр " + actor + " уже добавлен в спектакль!");
        } else {
            listOfActors.add(actor);
        }
    }

    // Заменить актёра
    public void replaceActor(Actor newActor, String surnameToReplace) {
        boolean found = false;
        for (int i = 0; i < listOfActors.size(); i++) {
            if (listOfActors.get(i).getSurname().equals(surnameToReplace)) {
                listOfActors.set(i, newActor);
                System.out.println("Актёр с фамилией " + surnameToReplace + " заменён на " + newActor);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Актёр с фамилией " + surnameToReplace + " не найден!");
        }
    }
}