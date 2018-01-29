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
        for(int i = 0; i < telephone.length; i++)
        {
            telephone[i] = new Telephone();
        }
    }

    public String getPrenom(){return this.prenom;}
    public String getNom(){return this.nom;}
    public Adresse getAdresse(){return this.adresse;}
    public Occupation getOccup(){return this.occupation;}
    public Telephone getTelephone(int _i){return this.telephone[_i];}

    public void setPrenom(String _prenom){
        if(!_prenom.equals("*"))
        this.prenom = _prenom;}
    public void setNom(String _nom){
        if(!_nom.equals("*"))
        this.nom = _nom;}


}