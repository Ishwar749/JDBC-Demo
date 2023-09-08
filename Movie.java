public class Movie {
    private int id;
    private String name;
    private String hero;
    private int yearOfRelease;
    private Double rating;

    // Constructor with all arguments
    public Movie(int id, String name, String hero, int yearOfRelease, Double rating) {
        this.id = id;
        this.name = name;
        this.hero = hero;
        this.yearOfRelease = yearOfRelease;
        this.rating = rating;
    }

    // No-argument constructor
    public Movie() {
        // Initialize with default values or leave them as null/0.0
    }

    // Getter and setter methods
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHero() {
        return hero;
    }

    public void setHero(String hero) {
        this.hero = hero;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", hero='" + hero + '\'' +
                ", yearOfRelease=" + yearOfRelease +
                ", rating=" + rating +
                '}';
    }
}
