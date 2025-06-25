import java.util.ArrayList;

public class Quarto {

    private boolean lampada;
    private boolean abajur;
    private boolean arcondicionado;
    private boolean tv;
    private ArrayList<Ventilador> ventiladores;

    public Quarto() {
        this.ventiladores = new ArrayList<Ventilador>();
    }

    public void ligarLampada(){
        if (lampada == false){
            System.out.println("\nlâmpada ligada!");
            lampada = true;
        }
        else {
            System.out.println("\nlâmpada já está ligada!");
        }
    }

    public void desligarLampada(){
        if (lampada == true){
            System.out.println("\nlâmpada desligada!");
            lampada = false;
        }
        else {
            System.out.println("\nlâmpada já está desligada!");
        }
    }

    public void ligarAbajur(){
        if (abajur == false){
            System.out.println("\nabajur ligado!");
            abajur = true;
        }
        else {
            System.out.println("\nabajur já está ligado!");
        }
    }

    public void desligarAbajur(){
        if (abajur == true){
            System.out.println("\nabajur desligado!");
            abajur = false;
        }
        else {
            System.out.println("\nabajur já está desligado!");
        }
    }

    public void ligarArcondicionado(){
        if (arcondicionado == false){
            System.out.println("\nar-condicionado ligado!");
            arcondicionado = true;
        }
        else {
            System.out.println("\nar-condicionado já está ligado!");
        }
    }

    public void desligarArcondicionado(){
        if (arcondicionado == true){
            System.out.println("\nar-condicionado desligado!");
            arcondicionado = false;
        }
        else {
            System.out.println("\nar-condicionado já está desligado!");
        }
    }

    public void ligarTv(){
        if (tv == false){
            System.out.println("\nTelevisao ligada!");
            tv = true;
        }
        else {
            System.out.println("\nTelevisao já está ligada!");
        }
    }

    public void desligarTv(){
        if (tv == true){
            System.out.println("\nTelevisao desligada!");
            tv = false;
        }
        else {
            System.out.println("\nTelevisao já está desligada!");
        }
    }

    public void mudarCanalTv(String nomecanal){
        if (tv == true){
            System.out.println("\nAssistindo ao canal " + nomecanal);
        }
        else {
            System.out.println("\nTelevisao está desligada!");
        }
    }

    public void mudarSinalTv(Source source){
        if (tv == true) {
            if (source == Source.IE){
                System.out.println("\nEntrada de sinal alterada para I.E!" );
            }
            else if (source == Source.USB){
                System.out.println("\nEntrada de sinal alterada para USB!" );
            }
            else if (source == Source.HDMI){
                System.out.println("\nEntrada de sinal alterada para HDMI!" );
            }
        }
        else {
            System.out.println("\nA televisao está desligada!");
        } 
    }  

    public boolean ligarVentilador(boolean status){
        if (status == false){
            System.out.println("\nVentilador ligado!");
            return true;
        }
        else {
            System.out.println("\nVentilador já está ligado!");
            return true;
        }
    }

    public boolean desligarVentilador(boolean status){
        if (status == true){
            System.out.println("\nVentilador desligado!");
            return false;
        }
        else {
            System.out.println("\nVentilador já está desligado!");
            return false;
        }
    }


    public boolean isLampada() {
        return lampada;
    }

    public void setLampada(boolean lampada) {
        this.lampada = lampada;
    }

    public boolean isAbajur() {
        return abajur;
    }

    public void setAbajur(boolean abajur) {
        this.abajur = abajur;
    }

    public boolean isArcondicionado() {
        return arcondicionado;
    }

    public void setArcondicionado(boolean arcondicionado) {
        this.arcondicionado = arcondicionado;
    }

    public boolean isTv() {
        return tv;
    }

    public void setTv(boolean tv) {
        this.tv = tv;
    }

    public ArrayList<Ventilador> getVentiladores() {
        return ventiladores;
    }

    public void setVentiladores(ArrayList<Ventilador> ventiladores) {
        this.ventiladores = ventiladores;
    }
    
}
