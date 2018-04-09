import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Contact {
    private String nom;
    private String prenom;
    private Adresse adresse;
    private Occupation occupation;
    private List<Telephone> telephones = new ArrayList<Telephone>();
    private Scanner sc = new Scanner(System.in);

    public Contact(){
        this.adresse = new Adresse();
        this.occupation = new Occupation();
    }

    public String getPrenom(){return this.prenom;}
    public String getNom(){return this.nom;}
    public Adresse getAdresse(){return this.adresse;}
    public Occupation getOccup(){return this.occupation;}
    public void getTelephone(){
        for(Telephone telephone : telephones)
        {
            System.out.print(telephone.getInfo() + ": " + telephone.getNumero() + "\n");
        }
    }

    public void setPrenom(String _prenom){
        if(!_prenom.equals("*"))
        this.prenom = _prenom;}
    public void setNom(String _nom){
        if(!_nom.equals("*"))
        this.nom = _nom;}
    public void setTelephones(){
        Telephone telephone = new Telephone();
        this.telephones.add(telephone);
        System.out.print("\nÀ quoi correpond ce numérp (cellulaire, maison, travail, ...) ?");
        telephone.setInfo(sc.next());
        System.out.print("\nQuel est le numéro ? ");
        telephone.setNumero(sc.next());
        }
    public String modifiTelephone(){
        for(Telephone telephone : telephones)
        {
            return telephone.getInfo() + " " + telephone.getNumero() + " :\n Correspondence du numéro: \n"
            telephone.setInfo(sc.next());
            System.out.print("Le numéro:\n");
            telephone.setNumero(sc.next());

        }
    }

    public String getInfo(){
        return " :\n" +
                "--------------\n" +
                "Prénom : " + getPrenom() + "\n" +
                "Nom : " + getNom() + "\n" +
                "Adresse : \n" +
                "\tNuméro de porte : " + getAdresse().getPorte() + "\n" +
                "\tRue : " + getAdresse().getRue() + "\n" +
                "\tAppartement : " + getAdresse().getNumAppart() + "\n" +
                "\tVille : " + getAdresse().getVille() + "\n" +
                "\tProvince : " + getAdresse().getProvince() + " \n" +
                "\tPays : " + getAdresse().getPays() + "\n" +
                "Occupation : \n" +
                "\tPoste : " + getOccup().getPoste() + "\n" +
                "\tEntreprise : \n" +
                "\t\tNom : " + getOccup().getEntreprise().getNom() + "\n" +
                "\t\tAdresse :\n" +
                "\t\t\tNuméro de porte : " + getOccup().getEntreprise().getAdEnt() + "\n" +
                "\t\t\tRue : " + getOccup().getEntreprise().getRue() + "\n" +
                "\t\t\tAppartement : " + getOccup().getEntreprise().getNumApps() + "\n" +
                "\t\t\tVille : " + getOccup().getEntreprise().getVille() + "\n" +
                "\t\t\tProvince : " + getOccup().getEntreprise().getProvince() + "\n" +
                "\t\t\tPays : " + getOccup().getEntreprise().getPays() + "\n" +
                "Téléphone : \n";
    }


}