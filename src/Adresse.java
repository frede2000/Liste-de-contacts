public class Adresse {
    private String Rue, ville, province, pays, numAppart, porte;

    public Adresse() {

    }

    public void setRue(String _Rue){
        if(!_Rue.equals("*"))
        {
            this.Rue = _Rue;
        }
    }
    public void setPorte(String _porte){
        if(!_porte.equals("*"))
        this.porte = _porte;}
    public void setNumAppart(String _numApps){
        if(!_numApps.equals("*"))
        this.numAppart = _numApps;}
    public void setVille(String _ville){
        if(!_ville.equals("*"))
        this.ville = _ville;}
    public void setProvince(String _province){
        if(!_province.equals("*"))
        this.province = _province;}
    public void setPays(String _pays){
        if(!_pays.equals("*"))
        this.pays = _pays;}

    public String getPorte(){return this.porte;}
    public String getRue(){return this.Rue;}
    public String getVille(){return this.ville;}
    public String getProvince(){return this.province;}
    public String getPays(){return this.pays;}

}