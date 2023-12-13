public class Bottiglia{
    String materiale;
    double capacita;
    String colore;
    String etichetta;
    double residuo;
    public Bottiglia(String materiale, double capacita, String colore){
        this.materiale = materiale;
        this.capacita = capacita;
        this.colore = colore;
        this.residuo = 0;
    }
    public Bottiglia(Bottiglia b){                      //suppongo che i dati siano già ottimizzati dato che sono presi da un'altra bottiglia
        this.materiale = b.materiale;
        this.capacita = b.capacita;
        this.colore = b.colore;
        this.etichetta = b.etichetta;
        this.residuo = b.residuo;
    }
    
    private boolean setEtichetta(String etichetta){
        if(etichetta == "olio"){
            if(colore == "trasparente"){
                return false;
            }
        }
        if(etichetta == "birra"){
            if(colore == "trasparente" || materiale == "plastica"){
                return false;
            }
        }
        this.etichetta = etichetta;
        return true;
    }
    
    public void riempi(String etichetta){
        if(this.residuo!=0){
            if(this.etichetta!=etichetta){
                return;
            }
        }
        if(setEtichetta(etichetta)){
            residuo = capacita;
        }
    }
    public double usa(double daUsare){
        if(daUsare > residuo){
            return residuo;
        }
        residuo -= daUsare;
        return residuo;
    }
    public String toString(){
        String info = "";
        info += "\tmateriale:\t"+materiale+"\n";
        info += "\tcapacita:\t"+capacita+"\n";
        info += "\tcolore:\t\t"+colore+"\n";
        info += "\tetichetta:\t"+etichetta+"\n";
        info += "\tresiduo:\t"+residuo+"\n";
        return info;
    }
    
    
}