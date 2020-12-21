

import java.util.Scanner;


 
public class Teste {

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Samu atendente = new Samu();
        String pvalue;
        
        Atendendente recepcionista = new Atendendente();
        atendente.addObserver(recepcionista);
       
        System.out.println("Digite o nome do paciente: ");
        pvalue = scan.next();
        atendente.setPaciente(pvalue);
        System.out.println("Digite o diaguinostico: Opções: 1 = fratura, 2= paradac, 3 = casoi");
        pvalue = scan.next();
        atendente.setDiaguinostico(pvalue);
       
        atendente.paciente(atendente.getPaciente());
        atendente.diaguinosticar(atendente.getDiaguinostico());
        

        
        
        
        
        
        
    }

   
    
}
