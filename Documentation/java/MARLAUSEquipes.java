public class MARLAUSEquipes {
    private int idEquipe;
    private String nomEquipe;
    private String adresse; 

    // Constructeur :

    public MARLAUSEquipes(int idEquipe, String nomEquipe, String adresse) {
        this.idEquipe = idEquipe;
        this.nomEquipe = nomEquipe;
        this.adresse = adresse;
    }

    // Setters :

    public void setNomEquipe(String nomEquipe) {
        this.nomEquipe = nomEquipe;
    }
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    // Getters :

    public int getIdEquipe() {
        return this.idEquipe;
    }
    public String getNomEquipe() {
        return this.nomEquipe;
    }
    public String getAdresseEquipe() {
        return this.adresse;
    }
}