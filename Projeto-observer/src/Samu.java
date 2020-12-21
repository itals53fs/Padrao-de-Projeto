

import java.util.Observable;

public class Samu extends Observable{
    private  String acao = "";
    private String paciente;
    private String diaguinostico;
   
    public String getPaciente() {
        return paciente;
    }

    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }

    public String getDiaguinostico() {
        return diaguinostico;
    }

    public void setDiaguinostico(String diaguinostico) {
        this.diaguinostico = diaguinostico;
    }
    
     public void paciente(String paciente)
     {
         System.out.println("O paciente : " + paciente + " esta sendo atendido. ");
     }
    public void diaguinosticar(String diaguinostico){
        if(diaguinostico.equals("fratura") || diaguinostico.equals("paradac") || diaguinostico.equals("casoi")){
        acao = diaguinostico;
        this.mudaEstado();
        }
        
    }

    public void mudaEstado(){
    setChanged(); //mudou o esaatdo
    notifyObservers(acao);//Notifica os observadores
}

    
}