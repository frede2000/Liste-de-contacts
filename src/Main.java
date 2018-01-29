import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean arret = false, finish = false;
        int choice = 0;
        int position = 0, positionTel = 0, numContact = 0;

        Scanner sc = new Scanner(System.in);
        Contact[] tabContact = new Contact[20];


        System.out.print("Bienvenue!\n");

        do{
            System.out.print("1. Ajouter un contact\n" +
                             "2. Mosifier un contact\n" +
                             "3. Afficher les contacts\n" +
                             "Que souhaitez-vous faire ?\n");
            choice = sc.nextInt();
            if(choice <= 0 || choice > 3)
                choice = 3;
            switch (choice)
            {
                // Ajoutter
                case 1:
                    tabContact[position] = new Contact();
                    System.out.print("Ce contact sera entré à la position #" + (position + 1) + "." +
                            "\nVeuillez entrer les informations suivantes :\n");
                    System.out.print("Prénom : ");
                    tabContact[position].setPrenom(sc.next());
                    System.out.print("\nNom : ");
                    tabContact[position].setNom(sc.next());

                    System.out.print("\nAdresse : \n\tNuméro de porte : ");
                    tabContact[position].getAdresse().setPorte(sc.next());
                    System.out.print("\n\tRue : ");
                    tabContact[position].getAdresse().setRue(sc.next());
                    System.out.print("\n\tAppartement : ");
                    tabContact[position].getAdresse().setNumAppart(sc.next());
                    System.out.print("\n\tVille : ");
                    tabContact[position].getAdresse().setVille(sc.next());
                    System.out.print("\n\tProvince : ");
                    tabContact[position].getAdresse().setProvince(sc.next());
                    System.out.print("\n\tPays : ");
                    tabContact[position].getAdresse().setPays(sc.next());

                    System.out.print("\nOccupation : \n\tPoste : ");
                    tabContact[position].getOccup().setPoste(sc.next());
                    System.out.print("\n\tEntreprise : \n\t\tNom: ");
                    tabContact[position].getOccup().getEntreprise().setNom(sc.next());
                    System.out.print("\n\t\tAdresse : \n\t\t\tNuméro de porte : ");
                    tabContact[position].getOccup().getEntreprise().setAdEnt(sc.next());
                    System.out.print("\n\t\t\tRue : ");
                    tabContact[position].getOccup().getEntreprise().setRue(sc.next());
                    System.out.print("\n\t\t\tAppartement : ");
                    tabContact[position].getOccup().getEntreprise().setNumApps(sc.next());
                    System.out.print("\n\t\t\tVille : ");
                    tabContact[position].getOccup().getEntreprise().setVille(sc.next());
                    System.out.print("\n\t\t\tProvince : ");
                    tabContact[position].getOccup().getEntreprise().setProvince(sc.next());
                    System.out.print("\n\t\t\tPays : ");
                    tabContact[position].getOccup().getEntreprise().setPays(sc.next());

                    System.out.print("\nEntrer un numéro de téléphone ?\t( 1.oui / 2.non )");
                    positionTel = 0;
                    while(sc.nextInt() == 1)
                    {
                        System.out.print("\nÀ quoi correpond ce numérp (cellulaire, maison, travail, ...) ?");
                        tabContact[position].getTelephone(positionTel).setInfo(sc.next());
                        System.out.print("\nQuel est le numéro ? ");
                        tabContact[position].getTelephone(positionTel).setNumero(sc.next());
                        System.out.print("\nEntrer un autre numéro de téléphone ?\t( 1.oui / 2.non )");
                    }

                    break;
                case 2:
                    // Modifier
                    System.out.print("\nQuel est le numéro du contact ?");
                    numContact = sc.nextInt()-1;
                    System.out.print("\nVeuillez entrer les informations suivantes (mettre un * si correct) :" +
                            "\nPrénom (" + tabContact[numContact].getPrenom() + ") : ");
                    tabContact[numContact].setPrenom(sc.next());
                    System.out.print("\nNom (" + tabContact[numContact].getNom() + ") : ");
                    tabContact[numContact].setNom(sc.next());
                    break;
                case 3:
                    break;
                default: break;
            }


        }while(!arret);

    }
}