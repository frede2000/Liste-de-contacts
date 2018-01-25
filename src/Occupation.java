public class Occupation {
    private String poste;
    Entreprise entreprise = new Entreprise();

    public Occupation(){}

    public String getPoste(){return this.poste;}

    public void setPoste(String _poste){this.poste = _poste;}
}