public class MARLAUSUniforme extends MARLAUSVestiaire {
    private int nbEquipe;
    private int niveau;
    private String description;

    // Constructeur : 

    public MARLAUSUniforme(int idVestiaire, String nomVestiaire, String description, int nbEquipe, int niveau) {
        super(idVestiaire, nomVestiaire, description);
        this.nbEquipe = nbEquipe;
        this.niveau = niveau;
    }

    // Getters : 

    public int getNbEquipe() {
        return nbEquipe;
    }

    public int getNiveau() {
        return niveau;
    }

    public String getDescription() {
        return description;
    }

    // Setters :
    
    public void setNbEquipe(int nbEquipe) {
        this.nbEquipe = nbEquipe;
    }

    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}