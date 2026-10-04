import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class MARLAUSCommande {
    private int nbCommande;
    private MARLAUSClient client;
    private ArrayList<MARLAUSVestiaire> contenu; 
    private LocalDate dateDemande;
    private LocalDateTime dateLivraison;
    private String etat; 

    // Constructeurs :

    public MARLAUSCommande(int nbCommande, MARLAUSClient c1, LocalDate dateDemande) {
        this.nbCommande = nbCommande;
        this.client = c1;
        this.dateDemande = dateDemande;
        this.etat = "En création";
    }

    public MARLAUSCommande copierCommande(MARLAUSCommande c2) {
        MARLAUSCommande copie = new MARLAUSCommande(c2.nbCommande, c2.client, c2.dateDemande);
        this.contenu = 0;
        if (c2.getContenu() != null) {
            this.setContenu(c2.getContenu());
        }
        if (c2.getEtat() != null) {
            this.etat = c2.getEtat();
        }
        return copie;
    }

    // Getters : 
    
    public int getNbCommande() {
        return nbCommande;
    }
    public MARLAUSClient getClient() {
        return client;
    }
    public ArrayList<MARLAUSVestiaire> getContenu() {
        return contenu;
    }
    public LocalDate getDateDemande() {
        return dateDemande;
    }
    public LocalDateTime getDateLivraison() {
        return dateLivraison;
    }
    public String getEtat() {
        return etat;
    }

    // Setters :

    public void setNbCommande(int nbCommande) {
        this.nbCommande = nbCommande;
    }
    public void setClient(MARLAUSClient client) {
        this.client = client;
    }
    public void setContenu(ArrayList<MARLAUSVestiaire> contenu) {
        this.contenu = contenu;
    }
    public void setDateLivraison(LocalDateTime dateLivraison) {
        this.dateLivraison = dateLivraison;
    }
    public void setEtat(int n) {
        if (n == 3) {
            this.etat = "Livraison.";
        }
        else if (n == 2) {
            this.etat = "Attente de paiement.";
        }
        else {
            this.etat = "Création.";
        }
    }

    // Fonctions utilisables : 
 
    public void ajouterVestiaire(MARLAUSVestiaire v1) {
        this.contenu.add(v1);
    }
    public double getTotalPayer() {
        double sommePayer = 0;
        for (MARLAUSVestiaire article : contenu) {
            sommePayer += article.getPrixFinal();
        }
        return sommePayer; 
    }
    public String toString() { //Afficher les objets dans la commande
        String commandeContenu = "Vestiaires dans la commande : \n";
        for (MARLAUSVestiaire article : contenu) {
            commandeContenu += article.getNom() + ", " + article.getPrixFinal() + ". \n";
        }
        commandeContenu += "Commande en état de : " + this.getEtat() + ". \n";
        commandeContenu += "Prix total de la commande : " + this.getTotalPayer();
        return commandeContenu; 
    }
}