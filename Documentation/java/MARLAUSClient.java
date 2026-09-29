import java.util.ArrayList;

public class MARLAUSClient {
    private int idClient;
    private String nom;
    private String prenom;
    private String telephone;
    private String adresse;
    private int idEquipe;
    private ArrayList<MARLAUSCommande> commandesFaites;

    public MARLAUSClient(int idClient, String nom, String prenom, String telephone, String adresse, int idEquipe) {
        this.idClient = idClient;
        this.nom = nom;
        this.prenom = prenom;
        this.telephone = telephone;
        this.adresse = adresse;
        this.idEquipe = idEquipe;
    }

    // Setters : 

    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
    public void setEquipe(int idEquipe) {
        this.idEquipe = idEquipe;
    }

    // Getters: 

    public String getNom() {
        return this.nom;
    }
    public String getPrenom() {
        return this.prenom;
    }
    public String getTelephone() {
        return this.telephone;
    }
    public int getEquipe() {
        return this.idEquipe;
    }

    // Fonctions utilisables : 

    public void ajouterCommande(MARLAUSCommande c1) {
        this.commandesFaites.add(c1);
    }
    public String toString() { //Afficher les objets dans la commande
        String commandesFClient = "Commandes faites par ce client : \n";
        for (MARLAUSClient article : commandesFaites) {
            commandesFClient += article + ". \n";
        }
        return commandesFClient; 
    }
}