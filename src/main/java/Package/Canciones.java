package Package;
public class Canciones {

    private String tittle;
    private Long ID;
    private Integer date;
    private Double duration;
    private Integer gender;
    private String caratula;
    private String description;

    public static final Integer GENDER_URBANO = 1;
    public static final Integer GENDER_SALSA = 2;
    public static final Integer GENDER_POP = 3;

    public Canciones(
            String tittle,
            Long ID,
            Integer date,
            Double duration,
            Integer gender,
            String caratula,
            String description)
    {
        this.tittle = tittle;
        this.ID = ID;
        this.date = date;
        this.duration = duration;
        this.gender = gender;
        this.caratula = caratula;
        this.description = description;
    }
}
