
import java.util.Observable;
import java.util.Observer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gabil
 */
public class Atendendente implements Observer {
    
    public void diaguinostico1(){
        System.out.println("O paciente esta indo para o ortopedista!");
    }
     public void diaguinostico2(){
                System.out.println("O paciente esta indo para o cardiologista!");
    }
      public void diaguinostico3(){
                System.out.println("O paciente  esta passando por exames para descobrir o problema!");
    }

    @Override
    public void update(Observable arg0, Object arg1) {
        Samu samuObservado = (Samu)arg0;
        String acao = String.valueOf(arg1);
       if(acao.equals("fratura"))
       {
           this.diaguinostico1();
       }
       if(acao.equals("paradac"))
       {
           this.diaguinostico2();
       }
       if(acao.equals("casoi"))
       {
           this.diaguinostico3();
       }
    }
}

