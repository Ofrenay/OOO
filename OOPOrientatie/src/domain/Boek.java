package domain;

public class Boek extends Geschenk implements HeeftMinLeeftijd {
    private String titel;
    private String auteur;
    private int aantalPaginas;
    private double prijs;

    public Boek(String titel, String auteur, int aantalPaginas, double prijs){
        super(prijs);
        if(aantalPaginas > 0)
            this.aantalPaginas = aantalPaginas;

        if(!titel.trim().isEmpty())
            this.titel = titel;
        else
            throw new IllegalArgumentException("de titel mag niet leeg zijn");

        if(!auteur.trim().isEmpty())
            this.auteur = auteur;
        else
            throw new IllegalArgumentException("De auteur mag niet leeg zijn");
    }

    @Override
    public String toString(){
        return "Titel: " + titel + "\nAuteur: " + auteur + "\nAantal pagina's: " + aantalPaginas + '\n' + super.toString();
    }

    @Override
    public int getMinLeeftijd() {
        int result = 0;

        if(aantalPaginas >= 10){
            for(int i = 0; i < aantalPaginas/50; i++)
                result += 1;
        }

        return result;
    }
}
