import java.io.Serializable;

public class Occupation implements Serializable {
    private String poste;
    private Entreprise entreprise = new Entreprise();

    public Occupation(){}

    public String getPoste(){return this.poste;}
    public Entreprise getEntreprise(){return  this.entreprise;}

    public void setPoste(String _poste){
        if(!_poste.equals("*"))
        this.poste = _poste;}

}