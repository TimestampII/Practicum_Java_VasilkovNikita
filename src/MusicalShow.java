public class MusicalShow extends Show {
    private String musicAuthor;
    private String librettoText;


    public MusicalShow(String title, int duration, Director director,
                       String musicAuthor, String librettoText) {
        super(title, duration, director);
        this.librettoText = librettoText;
        this.musicAuthor = musicAuthor;
    }

    public void printLibretto() {
        System.out.println("Либретто спектакля \"" + getTitle() + "\":");
        System.out.println(librettoText);
    }

    public String getMusicAuthor() {
        return musicAuthor;
    }

    public String getLibrettoText() {
        return librettoText;
    }
}
