import java.util.ArrayList;

public class Show {
    String title;
    int duration;
    String director;
    ArrayList<String> listOfActors;

    public Show() {
    }

    public Show(String title, int duration, String director, ArrayList<String> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }
}


