import java.io.Serializable;
import java.lang.invoke.SerializedLambda;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Contact implements Serializable {
    private String nom;
    private String prenom;
    private Adresse adresse;
    private Occupation occupation;
    private List<Telephone> telephones = new ArrayList<Telephone>();


    public Contact(){
        this.adresse = new Adresse();
        this.occupation = new Occupation();
    }

    public String getPrenom(){return this.prenom;}
    public String getNom(){return this.nom;}
    public String getPrenomEtNom(){return this.prenom + " " + this.nom;}
    public Adresse getAdresse(){return this.adresse;}
    public Occupation getOccup(){return this.occupation;}
    public String getAllTelephone(){
        String phone = String.valueOf(0);
        for(Telephone telephone : telephones)
        {
            phone += telephone.getInfo() + ": " + telephone.getNumero() + "\n";
        }
        return phone;
    }
    public String getTelephone(int i) {
        return " Correspondence du numéro: " + telephones.get(i).getInfo() + "\n" + "Le numéro: " + telephones.get(i).getNumero();
    }
    public String getInfo(){
        return " \n" +
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

    public void setPrenom(String _prenom){
        if(!_prenom.isEmpty())
        this.prenom = _prenom;}
    public void setNom(String _nom){
        if(!_nom.equals("*"))
        this.nom = _nom;}
    public void setNewTelephones(){
        Scanner sc = new Scanner(System.in);
        Telephone telephone = new Telephone();
        this.telephones.add(telephone);
        System.out.print("\nÀ quoi correpond ce numérp (cellulaire, maison, travail, ...) ?");
        telephone.setInfo(sc.next());
        System.out.print("\nQuel est le numéro ? ");
        telephone.setNumero(sc.next());
        }
    public int getSizeTel(){return telephones.size();}
    public void setInfoTel(int i){
        Scanner sc = new Scanner(System.in);
        telephones.get(i).setInfo(sc.next());
        }
    public void setNumTel(int i){
        Scanner sc = new Scanner(System.in);
        telephones.get(i).setNumero(sc.next());
    }
    public String getInfoTel(int i){
        return telephones.get(i).getInfo() + "\n";
    }
    public String getNumTel(int i){return telephones.get(i).getNumero() + "\n";}


}