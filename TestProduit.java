import java.util.Scanner;

public class TestProduit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Instanciation initiale d'un produit (ex: clavier)
        Produit p = new Produit("01", "clavier", 50.0, 10);

        int choix;

        do {
            System.out.println("\n========== MENU PRODUIT ==========");
            System.out.println("1. Consulter les détails du produit");
            System.out.println("2. Calculer le montant du stock");
            System.out.println("3. Appliquer une remise");
            System.out.println("4. Quitter");
            System.out.print("Votre choix (1-4) : ");
            choix = sc.nextInt();

            switch (choix) {
                case 1:
                    System.out.println("\nRéférence   : " + p.getref());
                    System.out.println("Désignation : " + p.getdes());
                    System.out.println("Prix HT     : " + p.getprix() + " TND");
                    System.out.println("Quantité    : " + p.getqte());
                    break;

                case 2:
                    System.out.println("\nMontant total du stock : " + p.calculer() + " TND");
                    break;

                case 3:
                    System.out.print("\nDonner le pourcentage de remise : ");
                    double remise = sc.nextDouble();

                    // Calcul de la remise et mise à jour du prix
                    double nouveauPrix = p.getprix() - (p.getprix() * remise / 100);
                    p.setprix(nouveauPrix);

                    System.out.println("Nouveau prix HT : " + p.getprix() + " TND");
                    System.out.println("Nouveau montant du stock : " + p.calculer() + " TND");
                    break;

                case 4:
                    System.out.println("\nAu revoir !");
                    break;

                default:
                    System.out.println("\nChoix incorrect, veuillez saisir une option entre 1 et 4.");
            }

        } while (choix != 4);

        sc.close();
    }
}