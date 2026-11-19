import java.util.Scanner;

public class Tableau {
    public static void main(String[] args) {

        /*

        System.out.println("création d'un tableau 1");
        int[] notes = {10, 15, 13, 12};
        for (int i = 0; i < notes.length; i++) {
            System.out.println(notes[i]);
        }

        System.out.println("Taille du tableau 1 : " + notes.length);

        System.out.println("Tableau 1 avant le changement :");
        for (int i = 0; i < notes.length; i++) {
            System.out.println(notes[i]);
        }

        notes[1] = 12;

        System.out.println("Tableau 1 après le changement :");
        for (int i = 0; i < notes.length; i++) {
            System.out.println(notes[i]);
        }

        Scanner sc = new Scanner(System.in);
        int[] tab2 = new int[notes.length];

        for (int i = 0; i < tab2.length; i++) {
            System.out.print("Saisir la valeur de la case " + i + " : ");
            tab2[i] = sc.nextInt();
        }

        System.out.println("Le tableau 2 :");
        for (int i = 0; i < tab2.length; i++) {
            System.out.println(tab2[i]);
        }

        int[] tab3 = new int[notes.length];

        for (int i = 0; i < tab3.length; i++) {
            tab3[i] = notes[i] + tab2[i];
        }

        System.out.println("Le tableau 3  :");
        for (int i = 0; i < tab3.length; i++) {
            System.out.println(tab3[i]);
        }

        sc.close();

        ============================================================ */

        Scanner sc = new Scanner(System.in);

        int[] notes = {10, 15, 13, 12};

        int[] tab2 = new int[notes.length];

        int choix;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Afficher le 1er tableau");
            System.out.println("2. Ajouter un deuxième tableau");
            System.out.println("3. Quitter");
            System.out.print("Votre choix (1-3) : ");
            choix = sc.nextInt();

            switch (choix) {

                case 1:
                    System.out.println("Tableau 1 :");
                    for (int i = 0; i < notes.length; i++) {
                        System.out.println(notes[i]);
                    }
                    break;

                case 2:
                    for (int i = 0; i < tab2.length; i++) {
                        System.out.print("Saisir la valeur de la case " + i + " : ");
                        tab2[i] = sc.nextInt();
                    }
                    System.out.println("Tableau 2 :");
                    for (int i = 0; i < tab2.length; i++) {
                        System.out.println(tab2[i]);
                    }
                    break;

                case 3:
                    System.out.println("Au revoir !");
                    break;

                default:
                    System.out.println("Choix incorrect, tapez 1, 2 ou 3.");
            }

        } while (choix != 3);

        sc.close();
    }
}