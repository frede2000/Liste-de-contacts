public class Contact {
    private String nom;
    private String prenom;
    private Adresse adresse;
    private Occupation occupation;
    private Telephone[] telephone;

    public Contact(){
        this.adresse = new Adresse();
        this.occupation = new Occupation();
        this.telephone = new Telephone[10];
    }

    public String getPrenom(){return this.prenom;}
    public String getNom(){return this.nom;}
    public Adresse getAdresse(){return this.adresse;}
    public Occupation getOccup(){return this.occupation;}
    public Telephone getTelephone(int _i){return this.telephone[_i];}

    public void setPrenom(String _prenom){this.prenom = _prenom;}
    public void setNom(String _nom){this.nom = _nom;}


}