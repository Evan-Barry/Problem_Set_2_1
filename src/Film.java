public class Film {

    private String title;
    private String director;
    private int duration;
    private static int numOfFilms = 0;//added variable to keep track of number of film objects

    public void setTitle(String title)
    {
        this.title = title;
    }

    public void setDirector(String director)
    {
        this.director = director;
    }

    public void setDuration(int duration)
    {
        this.duration = duration;
    }

    private String getTitle()
    {
        return title;
    }

    private String getDirector()
    {
        return director;
    }

    private int getDuration()
    {
        return duration;
    }

    public static int getNumOfFilms()
    {
        return numOfFilms;
    }

    public static void setNumOfFilms(int numOfFilms1)
    {
        numOfFilms = numOfFilms1;
    }

    public static String displayFilms(Film[] filmArray)
    {
        String message = "Number of Films: ";
        message += Film.getNumOfFilms() + "\n\n";

        for(Film f1 : filmArray)
        {
            message += f1.toString();
        }

        return message;
    }
    public String toString()
    {
        return String.format("%-8s\t%-30s\n%-8s\t%-30s\n%-8s\t%3d mins\n\n", "Film:", getTitle(), "Director:", getDirector(), "Duration:", getDuration());
//        return "Title: " + getTitle() +
//                "\nDirector: " + getDirector() +
//                "\nDuration: " + getDuration();
    }

    public Film()
    {
        this("Untitled", "No Director", 0);
    }

    public Film(String title, String director, int duration) {
        setTitle(title);
        setDirector(director);
        setDuration(duration);
    }

}
