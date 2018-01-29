public class Entreprise {
    private String nom, rue, adEnt, numApps, ville, province, pays;

    public Entreprise(){}

    public String getNom(){return this.nom;}
    public String getRue(){return this.rue;}
    public String getAdEnt(){return this.adEnt;}
    public String getNumApps(){return this.numApps;}
    public String getVille(){return this.ville;}
    public String getProvince(){return this.province;}
    public String getPays(){return this.pays;}

    public void setNom(String _nom){
        if(!_nom.equals("*"))
        this.nom = _nom;}
    public void setRue(String _rue){
        if(!_rue.equals("*"))
        this.rue = _rue;}
    public void setAdEnt(String _numAdresse){
        if(!_numAdresse.equals("*"))
        this.adEnt = _numAdresse;}
    public void setNumApps(String _numApps){
        if(!_numApps.equals("*"))
        this.numApps = _numApps;}
    public void setVille(String _ville){
        if(!_ville.equals("*"))
        this.ville = _ville;}
    public void setProvince(String _province){
        if(!_province.equals("*"))
        this.province = _province;}
    public void setPays(String _pays){
        if(!_pays.equals("*"))
        this.pays = _pays;}
}