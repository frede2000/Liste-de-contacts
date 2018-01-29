public class Telephone {
    private String info, numero;

    public Telephone(){
        this.info = "*";
        this.numero = "*";
    }
    public String getInfo(){return this.info;}
    public String getNumero(){return this.numero;}

    public void setInfo(String _info){
        if(!_info.equals("*"))
        this.info = _info;}
    public void setNumero(String _numero){
        if(!_numero.equals("*"))
        this.numero = _numero;}
}