import java.util.Objects;

public class Author {
    private String firstName;
    private String surName;

    public Author () {

    }
    public Author (String firstName, String surName) {

        this.firstName = firstName;
        this.surName = surName;
    }

    @Override
    public String toString() {
        return "автор : " + firstName + " " + surName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(firstName, author.firstName) && Objects.equals(surName, author.surName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, surName);
    }
}