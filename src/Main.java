import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean arret = false;
        int position = 0, positionTel = 0, numContact = 0, choice = 0, nombreContact = 0;

        Scanner sc = new Scanner(System.in);
        Contact[] tabContact = new Contact[20];


        System.out.print("Bienvenue!\n");

        do{
            System.out.print("1. Ajouter un contact\n" +
                             "2. Mosifier un contact\n" +
                             "3. Afficher les contacts\n" +
                             "4. Quitter\n" +
                             "Que souhaitez-vous faire ?\n");
            choice = sc.nextInt();
            if(choice <= 0 || choice > 4)
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
                        positionTel++;
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
                    System.out.print("\nAdresse : \n\tNuméro de porte : " + tabContact[numContact].getAdresse().getPorte() + ") : ");
                    tabContact[numContact].getAdresse().setPorte(sc.next());
                    System.out.print("\n\tRue (" + tabContact[numContact].getAdresse().getRue() + ") : ");
                    tabContact[numContact].getAdresse().setRue(sc.next());
                    System.out.print("\n\tAppartement (" + tabContact[numContact].getAdresse().getNumAppart() + ") : ");
                    tabContact[numContact].getAdresse().setNumAppart(sc.next());
                    System.out.print("\n\tVille (" + tabContact[numContact].getAdresse().getVille() + ") : ");
                    tabContact[numContact].getAdresse().setVille(sc.next());
                    System.out.print("\n\tProvince (" + tabContact[numContact].getAdresse().getProvince() + ") : ");
                    tabContact[numContact].getAdresse().setProvince(sc.next());
                    System.out.print("\n\tPays (" + tabContact[numContact].getAdresse().getPays() + ") : ");
                    tabContact[numContact].getAdresse().setPays(sc.next());

                    System.out.print("\nOccupation : \n\tPoste (" + tabContact[numContact].getOccup().getPoste() + ") : ");
                    tabContact[position].getOccup().setPoste(sc.next());
                    System.out.print("\n\tEntreprise : \n\t\tNom (" + tabContact[numContact].getOccup().getEntreprise().getNom() + ") : ");
                    tabContact[position].getOccup().getEntreprise().setNom(sc.next());
                    System.out.print("\n\t\tAdresse : \n\t\t\tNuméro de porte (" + tabContact[numContact].getOccup().getEntreprise().getAdEnt() + ") : ");
                    tabContact[position].getOccup().getEntreprise().setAdEnt(sc.next());
                    System.out.print("\n\t\t\tRue (" + tabContact[numContact].getOccup().getEntreprise().getRue() + ") : ");
                    tabContact[position].getOccup().getEntreprise().setRue(sc.next());
                    System.out.print("\n\t\t\tAppartement (" + tabContact[numContact].getOccup().getEntreprise().getNumApps() + ") : ");
                    tabContact[position].getOccup().getEntreprise().setNumApps(sc.next());
                    System.out.print("\n\t\t\tVille (" + tabContact[numContact].getOccup().getEntreprise().getVille() + ") : ");
                    tabContact[position].getOccup().getEntreprise().setVille(sc.next());
                    System.out.print("\n\t\t\tProvince (" + tabContact[numContact].getOccup().getEntreprise().getProvince() + ") : ");
                    tabContact[position].getOccup().getEntreprise().setProvince(sc.next());
                    System.out.print("\n\t\t\tPays (" + tabContact[numContact].getOccup().getEntreprise().getPays() + ") : ");
                    tabContact[position].getOccup().getEntreprise().setPays(sc.next());
                    positionTel = 0;
                    System.out.print("\nTéléphones : ");
                    while(!tabContact[numContact].getTelephone(positionTel).getNumero().equals("*"))
                    {
                        System.out.print(tabContact[numContact].getTelephone(positionTel).getInfo() + " " + tabContact[numContact].getTelephone(positionTel).getNumero() + " : ");
                        tabContact[numContact].getTelephone(positionTel).setNumero(sc.next());
                        positionTel++;
                    }

                    System.out.print("\nEntrer un numéro de téléphone ?\t( 1.oui / 2.non )");
                    while(sc.nextInt() == 1)
                    {
                        System.out.print("\nÀ quoi correpond ce numérp (cellulaire, maison, travail, ...) ?");
                        tabContact[position].getTelephone(positionTel).setInfo(sc.next());
                        System.out.print("\nQuel est le numéro ? ");
                        tabContact[position].getTelephone(positionTel).setNumero(sc.next());
                        System.out.print("\nEntrer un autre numéro de téléphone ?\t( 1.oui / 2.non )");
                        positionTel++;
                    }

                    break;
                case 3:

                    // nombre e contact
                    // Afficher contact(s)
                    nombreContact = 0;
                    for(int i = 0; i < tabContact.length; i++)
                    {
                        if(!tabContact[i].getPrenom().isEmpty())
                            nombreContact++;
                    }
                    System.out.print("\nVous avez " + tabContact.length + " contact (s)");
                    for(int i = 0; i < nombreContact; i++)
                    {
                        System.out.print("Contact #" + (i+1) + " :\n" +
                                "--------------\n" +
                                "Prénom : " + tabContact[i].getPrenom() + "\n" +
                                "Nom : " + tabContact[i].getNom() + "\n" +
                                "Adresse : \n" +
                                "\tNuméro de porte : " + tabContact[i].getAdresse().getPorte() + "\n" +
                                "\tRue : " + tabContact[i].getAdresse().getRue() + "\n" +
                                "\tAppartement : " + tabContact[i].getAdresse().getNumAppart() + "\n" +
                                "\tVille : " + tabContact[i].getAdresse().getVille() + "\n" +
                                "\tProvince : " + tabContact[i].getAdresse().getProvince() + " \n" +
                                "\tPays : " + tabContact[i].getAdresse().getPays() + "\n" +
                                "Occupation : \n" +
                                "\tPoste : " + tabContact[i].getOccup().getPoste() + "\n" +
                                "\tEntreprise : \n" +
                                "\t\tNom : " + tabContact[i].getOccup().getEntreprise().getNom() + "\n" +
                                "\t\tAdresse :\n" +
                                "\t\t\tNuméro de porte : " + tabContact[i].getOccup().getEntreprise().getAdEnt() + "\n" +
                                "\t\t\tRue : " + tabContact[i].getOccup().getEntreprise().getRue() + "\n" +
                                "\t\t\tAppartement : " + tabContact[i].getOccup().getEntreprise().getNumApps() + "\n" +
                                "\t\t\tVille : " + tabContact[i].getOccup().getEntreprise().getVille() + "\n" +
                                "\t\t\tProvince : " + tabContact[i].getOccup().getEntreprise().getProvince() + "\n" +
                                "\t\t\tPays : " + tabContact[i].getOccup().getEntreprise().getPays() + "\n" +
                                "Téléphone : \n");
                        for(int f = 0; f < 10; f++)
                        {
                            if(!tabContact[i].getTelephone(f).getNumero().equals("*"))
                            {
                                System.out.print(tabContact[i].getTelephone(f).getInfo() + " : " + tabContact[i].getTelephone(f).getNumero() + "\n");
                            }
                        }
                    }

                    break;
                case 4:

                    //Quitter
                    arret = true;
                    break;

                default: break;
            }


        }while(!arret);

    }
}