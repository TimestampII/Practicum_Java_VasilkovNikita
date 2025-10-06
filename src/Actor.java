import java.util.Objects;

public class Actor extends Person {
    private Show show;

    public Actor(String name, String surname, Gender gender, int height) {
        super(name, surname, gender, height);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Actor actor = (Actor) obj;
        return getHeight() == actor.getHeight() &&
                Objects.equals(getName(), actor.getName()) &&
                Objects.equals(getSurname(), actor.getSurname());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSurname(), getHeight());
    }

    @Override
    public String toString() {
        return getName() + " " + getSurname() + " (" + getHeight() + " см)";
    }
}

