import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        boolean arret = false;
        String nomComplet;
        Scanner sc = new Scanner(System.in);
        File file = new File("ListeDeContacts/src/Save.dat");
        Map<String, Contact> contacts = new HashMap<String, Contact>();
        Queue<String> listRappel = new LinkedList<String>();

        SaisieTest saisieTest = new SaisieTest();
        SaisiePays saisiePays = new SaisiePays();

        do{
            System.out.print("1. Ajouter un contact\n" +
                             "2. Mosifier un contact\n" +
                             "3. Afficher les contacts\n" +
                             "4. Supprimer un contacts\n" +
                             "5. Gérer la liste de rappel\n" +
                             "6. Charger une sauvegarde\n" +
                             "7. Quitter\n" +
                             "Que souhaitez-vous faire ?\n");

            switch (saisieTest.intTest())
            {
                case 1:
                    // Ajoutter
                    Contact contact = new Contact();
                    System.out.print("Veuillez entrer les informations suivantes :\n");
                    System.out.print("Prénom : ");
                    contact.setPrenom(sc.next());
                    System.out.print("\nNom : ");
                    contact.setNom(sc.next());

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
                    contact.getAdresse().setPays(saisiePays.testPays());

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
                    contact.getOccup().getEntreprise().setPays(saisiePays.testPays());

                    System.out.print("\nEntrer un numéro de téléphone ?\t( 1.oui / 2.non )");
                    while(saisieTest.intTest() == 1)
                    {
                        contact.setNewTelephones();
                        System.out.print("\nEntrer un autre numéro de téléphone ?\t( 1.oui / 2.non )");
                    }
                    contacts.put(contact.getPrenom(), contact);
                    break;

                case 2:
                    // Modifier
                    System.out.print("\nQuel est le prénom du contact que vous voulez modifier ?");
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
                    contacts.get(nomComplet).getAdresse().setPays(saisiePays.testPays());

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
                    contacts.get(nomComplet).getOccup().getEntreprise().setPays(saisiePays.testPays());
                    System.out.print("\nTéléphones : \n");

                    for(int i = 0; i < contacts.get(nomComplet).getSizeTel(); i++)
                    {
                        System.out.print("\tNuméro de téléphone pour ( " );
                        contacts.get(nomComplet).getInfoTel(i);
                        System.out.print(" ) : ");
                        contacts.get(nomComplet).setInfoTel(i);
                        System.out.print("\tLe numéro est ( ");
                        contacts.get(nomComplet).getNumTel(i);
                        System.out.print(" ) : ");
                        contacts.get(nomComplet).setNumTel(i);
                    }
                    System.out.print("\nEntrer un nouveau numéro de téléphone ?\t( 1.oui / 2.non )");
                    while(saisieTest.intTest() == 1)
                    {
                        contacts.get(nomComplet).setNewTelephones();
                        System.out.print("\nEntrer un autre numéro de téléphone ?\t( 1.oui / 2.non )");
                    }
                    break;

                case 3:
                    // Afficher contact(s)
                    System.out.print("\nVous avez " + contacts.size() + " contact(s)\n");
                    for(Map.Entry<String, Contact> contactEntry : contacts.entrySet())
                    {
                    System.out.print(contactEntry.getValue().getPrenom() + " " + contactEntry.getValue().getNom() + "\n");
                    }
                    if(contacts.size() != 0)
                        System.out.print("Afficher plus d'information de l'un de vos contactes ? (1.oui / 2.non)\n");
                         if(saisieTest.intTest() == 1)
                          {
                              System.out.print("Lequel ? (prénom)\n");
                              nomComplet = sc.next();
                              System.out.print(contacts.get(nomComplet).getInfo());
                              System.out.print(contacts.get(nomComplet).getAllTelephone());
                          }
                    break;

                case 4:
                    // Supprimer un contact
                    System.out.print("Supprimer tous les contactes ou choisir un contacte à supprimer ? (1.tous/2.un seul)\n");
                    switch(saisieTest.intTest())
                {
                    case 1:
                        System.out.print("Etes-vous sur de vouloir supprimer tous vos contactes ? (1.oui/2.non)\n");
                        if(saisieTest.intTest() == 1)
                        {
                            contacts.clear();
                            System.out.print("Tous les contactes supprimé\n");
                        }
                        break;
                    case 2:
                        for(Map.Entry<String, Contact> contactEntry : contacts.entrySet())
                        {
                            System.out.print(contactEntry.getValue().getNom() + " " + contactEntry.getValue().getPrenom() + "\n");
                        }
                        System.out.print("Supprimer quel contact ? (nom)\n\n");
                        nomComplet = sc.next();
                        contacts.remove(nomComplet);
                        System.out.print("Le contacte a été supprimer\n");
                        break;
                }
                    break;

                case 5:
                    // Liste de rappel
                    System.out.print("\t1. Ajouter un contact à la liste\n" +
                                    "\t2. Voir le contacte vous devez appeler\n" +
                                    "\t3. Annuler\n");
                    switch (saisieTest.intTest())
                    {
                        // Ajouter contacte
                        case 1:
                            for(Map.Entry<String, Contact> contactEntry : contacts.entrySet())
                            {
                                System.out.print(contactEntry.getValue().getNom() + " " + contactEntry.getValue().getPrenom() + "\n");
                            }
                            System.out.print("Quel contact voulez-vous ajouter à la liste ? (nom)\n");
                            nomComplet = sc.next();
                            if(contacts.containsKey(nomComplet))
                                listRappel.add(nomComplet);
                            else
                                System.out.print("Ce contacte n'existe pas ou Prénom incorecte\n");
                            break;

                        // Voir contacte
                        case 2:
                            System.out.print("Vous allez devoir appeler " + contacts.get(listRappel.peek()).getPrenomEtNom() + "\n\tVoulez-vous l'appeler maintenant ? (.oui / 2.non\n");
                            if(saisieTest.intTest() == 1)
                            {
                                System.out.print("*Vous appelez " + contacts.get(listRappel.poll()).getPrenomEtNom() + "*\nIl vous reste " + listRappel.size() + " à appeler\n");
                            }
                            break;
                            default:
                    }
                    break;

                case 6:
                    // Sauvegarder
                    try {
                        ObjectInputStream entree = new ObjectInputStream(
                                new BufferedInputStream(
                                        new FileInputStream("Save.dat")));
                        try {
                            contacts = (HashMap) entree.readObject();
                            listRappel = (LinkedList<String>) entree.readObject();
                        } catch (ClassNotFoundException e) {
                            e.printStackTrace();
                        }

                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;

                case 7:
                    // Quitter
                    try {
                        ObjectOutputStream sortie = new ObjectOutputStream(
                                new BufferedOutputStream(
                                        new FileOutputStream("Save.dat")));
                        sortie.writeObject(contacts);
                        sortie.writeObject(listRappel);
                        sortie.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    arret = true;
                    break;

                default:
                    System.out.print("CE CHIFFRE N'EST PAS COMPRIS DANS LES CHOIX\n");
            }


        }while(!arret);

    }
}