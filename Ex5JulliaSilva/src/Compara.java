import java.util.Comparator;

public class Compara implements Comparator<Musica>{
 
    @Override
    public int compare(Musica musica1, Musica musica2) {
        return musica1.getTitulo().compareTo(musica2.getTitulo());
    }
     
}