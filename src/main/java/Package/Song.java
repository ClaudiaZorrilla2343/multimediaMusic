package Package;

import java.util.Objects;
import java.util.Scanner;

public class Song {

    private final Genders gender;
    private String tittle;
    private Integer ID;
    private Integer date;
    private Double duration;
    private String cover;
    private String description;

    public Song(
            Genders gender,
            String tittle,
            Integer ID,
            Integer date,
            Double duration,
            String caratula,
            String description

            )
    {
        this.gender = Objects.requireNonNull(gender);
        this.tittle = Objects.requireNonNull(tittle);
        this.ID = Objects.requireNonNull(ID);
        this.date = Objects.requireNonNull(date);
        this.duration = Objects.requireNonNull(duration);
        this.cover = Objects.requireNonNull(caratula);
        this.description = Objects.requireNonNull(description);
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Integer getDate() {
        return date;
    }

    public void setDate(Integer date) {
        this.date = date;
    }

    public Double getDuration() {
        return duration;
    }

    public void setDuration(Double duration) {
        this.duration = duration;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Genders gender() {
        return gender;
    }

    public enum Genders {
        URBANO,
        SALSA,
        POP,
        RAP,
        VALADA
    }

    public void chooseGender() {
        Scanner read = new Scanner(System.in);
        Genders[] gend = Genders.values();
        for (int i = 0; i < gend.length; i ++) {
            System.out.println((i) + ")" + gend[i]);
        }
        System.out.println("Seleccione el género del cual pertenece la canción: ");
        int choiceUserGender = read.nextInt();
        System.out.println(gend[choiceUserGender]);
    }

    @Override
    public String toString() {
        return "Song{" +
                "gender=" + gender +
                ", tittle='" + tittle + '\'' +
                ", ID=" + ID +
                ", date=" + date +
                ", duration=" + duration +
                ", caratula='" + cover + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}


