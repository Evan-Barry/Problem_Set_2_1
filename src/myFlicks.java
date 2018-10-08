import javax.swing.*;

public class myFlicks {
    public static void main(String[] args) {

        Film f;

        Film[] filmArray = new Film[2];

        JTextArea jta = new JTextArea();

        //System.out.println(f.toString());

        for(int i = 0; i < filmArray.length; i++)
        {
            f = new Film();

            f.setTitle(JOptionPane.showInputDialog("Please enter the name of the movie"));
            f.setDirector(JOptionPane.showInputDialog("Please enter the name of the director"));
            f.setDuration(Integer.parseInt(JOptionPane.showInputDialog("How long is the movie")));

            filmArray[i] = f;

            Film.setNumOfFilms(Film.getNumOfFilms() + 1);
        }

        //JOptionPane.showMessageDialog(null, message);
        jta.setText(Film.displayFilms(filmArray));
        JOptionPane.showMessageDialog(null, jta);

    }
}
