public class MARLAUSVestiaire {
    private int idVestiaire;
    private String nomVestiaire;
    private String description;
    private int niveauPersonnalisation;
    private String niveauDescription;
    private double prix;
    private double prixfinal;
    
    // Constructeur :
    public MARLAUSVestiaire(int idVestiaire, String nomVestiaire, String description) {
        this.idVestiaire = idVestiaire;
        this.nomVestiaire = nomVestiaire;
        this.description = description;
    }

    // Setters : 

    public void setNom(String nom) {
        this.nomVestiaire = nom;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setPersonnalisation(int niveau) {
        if (niveau == 3) {
            this.niveauPersonnalisation = niveau;
            this.niveauDescription = "Niveau diamond"; 
        }
        else if (niveau == 2) {
            this.niveauPersonnalisation = niveau;
            this.niveauDescription = "Niveau premium"; 
        }
        else {
            this.niveauPersonnalisation = niveau;
            this.niveauDescription = "Niveau base"; 
        }
    } 
    public void setPrixBase(double prix) {
        this.prix = prix;
    }
    
    // Getters : 

    public String getNom() {
        return this.nomVestiaire;
    }
    public int getNiveau() {
        return this.niveauPersonnalisation;
    }
    public double getPrixFinal() {
        if (this.niveauPersonnalisation == 3) {
            this.prixfinal = prix * 2;
            return prixfinal;
        }
        else if (this.niveauPersonnalisation == 2) {
            this.prixfinal = prix * 1.5; 
            return this.prixfinal;
        }
        this.prixfinal = prix;
        return prixfinal;
    }
}