import java.util.ArrayList;
import java.time.LocalDate;

public class MARLAUSMain {
    public static void main(String[] args) {
        System.out.println("--- Test du Système MARLAUS ---");

        // 1. Création d'une équipe
        MARLAUSEquipes equipe1 = new MARLAUSEquipes(1, "PAP", "MEXIQUE");
        System.out.println("Équipe créée : " + equipe1.getNomEquipe());

        // 2. Création d'un client
        MARLAUSClient client1 = new MARLAUSClient(101, "De Tal", "Fulanito", "0601020304", "MEXICO", equipe1.getIdEquipe());
        System.out.println("Client créé : " + client1.getNom() + " " + client1.getPrenom());

        // 3. Création d'articles (Vestiaire et Uniforme)
        MARLAUSVestiaire veste = new MARLAUSVestiaire(501, "Veste d'entrainement", "Veste imperméable");
        veste.setPrixBase(50.0);
        veste.setPersonnalisation(2);

        MARLAUSUniforme maillot = new MARLAUSUniforme(502, "Maillot", "Maillot respirant bleu", 1, 3);
        maillot.setPrixBase(25.0);
        maillot.setPersonnalisation(3);

        System.out.println("Prix Veste (Premium) : " + veste.getPrixFinal() + " EUR.");
        System.out.println("Prix Maillot (Diamond) : " + maillot.getPrixFinal() + " EUR.");

        // 4. Création d'une commande
        MARLAUSCommande commande1 = new MARLAUSCommande(1, client1, LocalDate.now());
        
        commande1.setContenu(new ArrayList<MARLAUSVestiaire>());
        
        commande1.ajouterVestiaire(veste);
        commande1.ajouterVestiaire(maillot);

        // 5. Test des états
        commande1.setEtat(0);
        
        // 6. Affichage final
        System.out.println("\n--- Détails de la Commande ---");
        System.out.println(commande1.toString());
    }
}