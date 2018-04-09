import java.util.*;

public class Main {
    public static void main(String[] args) {

        boolean arret = false;
        int position = 0, positionTel = 0, numContact = 0, choice = 0, nombreContact = 0;
        String nomComplet;
        Scanner sc = new Scanner(System.in);

        Map<String, Contact> contacts = new HashMap<String, Contact>();


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
                    Contact contact = new Contact();
                    System.out.print("Ce contact sera entré à la position #" + (position + 1) + "." +
                            "\nVeuillez entrer les informations suivantes :\n");
                    System.out.print("Prénom : ");
                    contact.setPrenom(sc.next());
                    System.out.print("\nNom : ");
                    contact.setNom(sc.next());
                    if(contacts.containsKey(contact.getPrenom()+ " " + contact.getNom()))
                        contacts.put(contact.getPrenom() + " " + contact.getNom() + "(1)", contact);
                    else
                        contacts.put(contact.getPrenom() + " " + contact.getNom(), contact);

                    System.out.print("\nAdresse : \n\tNuméro de porte : ");
                    contact.getAdresse().setPorte(sc.next());
                    System.out.print("\n\tRue : ");
                    contact.getAdresse().setRue(sc.next());
                    System.out.print("\n\tAppartement : ");
                    contact.getAdresse().setNumAppart(sc.next());
                    System.out.print("\n\tVille : ");
                    contact.getAdresse().setVille(sc.next());
                    System.out.print("\n\tProvince : ");
                    contact.getAdresse().setProvince(sc.next());
                    System.out.print("\n\tPays : ");
                    contact.getAdresse().setPays(sc.next());

                    System.out.print("\nOccupation : \n\tPoste : ");
                    contact.getOccup().setPoste(sc.next());
                    System.out.print("\n\tEntreprise : \n\t\tNom: ");
                    contact.getOccup().getEntreprise().setNom(sc.next());
                    System.out.print("\n\t\tAdresse : \n\t\t\tNuméro de porte : ");
                    contact.getOccup().getEntreprise().setAdEnt(sc.next());
                    System.out.print("\n\t\t\tRue : ");
                    contact.getOccup().getEntreprise().setRue(sc.next());
                    System.out.print("\n\t\t\tAppartement : ");
                    contact.getOccup().getEntreprise().setNumApps(sc.next());
                    System.out.print("\n\t\t\tVille : ");
                    contact.getOccup().getEntreprise().setVille(sc.next());
                    System.out.print("\n\t\t\tProvince : ");
                    contact.getOccup().getEntreprise().setProvince(sc.next());
                    System.out.print("\n\t\t\tPays : ");
                    contact.getOccup().getEntreprise().setPays(sc.next());

                    System.out.print("\nEntrer un numéro de téléphone ?\t( 1.oui / 2.non )");
                    positionTel = 0;
                    while(sc.nextInt() == 1)
                    {
                        contact.setTelephones();
                        System.out.print("\nEntrer un autre numéro de téléphone ?\t( 1.oui / 2.non )");
                    }

                    break;
                case 2:

                    // Modifier
                    System.out.print("\nQuel est le nom ([prénom] [nom]) du contact ?");
                    nomComplet = sc.next();
                    System.out.print("\nVeuillez entrer les informations suivantes (mettre un * si correct) :" +
                            "\nPrénom (" + contacts.get(nomComplet).getPrenom() + ") : ");
                    contacts.get(nomComplet).setPrenom(sc.next());
                    System.out.print("\nNom (" + contacts.get(nomComplet).getNom() + ") : ");
                    contacts.get(nomComplet).setNom(sc.next());
                    System.out.print("\nAdresse : \n\tNuméro de porte : " + contacts.get(nomComplet).getAdresse().getPorte() + ") : ");
                    contacts.get(nomComplet).getAdresse().setPorte(sc.next());
                    System.out.print("\n\tRue (" + contacts.get(nomComplet).getAdresse().getRue() + ") : ");
                    contacts.get(nomComplet).getAdresse().setRue(sc.next());
                    System.out.print("\n\tAppartement (" + contacts.get(nomComplet).getAdresse().getNumAppart() + ") : ");
                    contacts.get(nomComplet).getAdresse().setNumAppart(sc.next());
                    System.out.print("\n\tVille (" + contacts.get(nomComplet).getAdresse().getVille() + ") : ");
                    contacts.get(nomComplet).getAdresse().setVille(sc.next());
                    System.out.print("\n\tProvince (" + contacts.get(nomComplet).getAdresse().getProvince() + ") : ");
                    contacts.get(nomComplet).getAdresse().setProvince(sc.next());
                    System.out.print("\n\tPays (" + contacts.get(nomComplet).getAdresse().getPays() + ") : ");
                    contacts.get(nomComplet).getAdresse().setPays(sc.next());

                    System.out.print("\nOccupation : \n\tPoste (" + contacts.get(nomComplet).getOccup().getPoste() + ") : ");
                    contacts.get(nomComplet).getOccup().setPoste(sc.next());
                    System.out.print("\n\tEntreprise : \n\t\tNom (" + contacts.get(nomComplet).getOccup().getEntreprise().getNom() + ") : ");
                    contacts.get(nomComplet).getOccup().getEntreprise().setNom(sc.next());
                    System.out.print("\n\t\tAdresse : \n\t\t\tNuméro de porte (" + contacts.get(nomComplet).getOccup().getEntreprise().getAdEnt() + ") : ");
                    contacts.get(nomComplet).getOccup().getEntreprise().setAdEnt(sc.next());
                    System.out.print("\n\t\t\tRue (" + contacts.get(nomComplet).getOccup().getEntreprise().getRue() + ") : ");
                    contacts.get(nomComplet).getOccup().getEntreprise().setRue(sc.next());
                    System.out.print("\n\t\t\tAppartement (" + contacts.get(nomComplet).getOccup().getEntreprise().getNumApps() + ") : ");
                    contacts.get(nomComplet).getOccup().getEntreprise().setNumApps(sc.next());
                    System.out.print("\n\t\t\tVille (" + contacts.get(nomComplet).getOccup().getEntreprise().getVille() + ") : ");
                    contacts.get(nomComplet).getOccup().getEntreprise().setVille(sc.next());
                    System.out.print("\n\t\t\tProvince (" + contacts.get(nomComplet).getOccup().getEntreprise().getProvince() + ") : ");
                    contacts.get(nomComplet).getOccup().getEntreprise().setProvince(sc.next());
                    System.out.print("\n\t\t\tPays (" + contacts.get(nomComplet).getOccup().getEntreprise().getPays() + ") : ");
                    contacts.get(nomComplet).getOccup().getEntreprise().setPays(sc.next());
                    System.out.print("\nTéléphones : ");
                    contacts.get(nomComplet).modifiTelephone();
                    break;
                case 3:

                    // nombre e contact
                    // Afficher contact(s)
                    System.out.print("\nVous avez " + contacts.size() + " contact(s)\n");

                    contacts.get("frederick bouchard");

                    //         for(Contact contact1 : contacts.entrySet())
                    //          {

                    //      }
                    //    for(int i = 0; i < contacts.size(); i++)
                    //     {
                    //         System.out.print("Contacte #" + (i+1) );
                    //  contacts.get().getInfo();
                    //  contacts.get(i).getTelephone();
                    //  }
                    //  break;
                case 4:

                    //Quitter
                    arret = true;
                    break;

                default: break;
            }


        }while(!arret);

    }
}