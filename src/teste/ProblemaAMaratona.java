package teste;

import java.util.Scanner;

public class ProblemaAMaratona {


    public static void main(String[] args) {
        
        Participantes p1 = new Participantes();
        Participantes p2 = new Participantes();
        Participantes p3 = new Participantes();
        
        p1.nome = "Alice";
        p2.nome = "Beto";
        p3.nome = "Clara";
        
        
        Scanner ler = new Scanner(System.in);
        p1.valor = ler.nextInt();
        p2.valor = ler.nextInt();
        p3.valor = ler.nextInt();
        
        
        if(p1.valor + p2.valor + p3.valor > 2 || p1.valor + p2.valor + p3.valor == 0){
            System.out.println("*");
        }else{
        
        if(p1.valor + p2.valor + p3.valor == 2){
            if(p1.valor == 0){
                System.out.println("O vencedor é:" + p1.nome);
            }
            
            if(p2.valor == 0){
                System.out.println("O vencdor é: " + p2.nome);
            }
            
            if(p3.valor == 0){
                System.out.println("O vencedor é: " + p3.nome);
            }else if(p1.valor + p2.valor + p3.valor == 1){
                if(p1.valor == 1){
                    System.out.println("O vencedor é: " + p1.nome);
                }
                
                if(p2.valor == 1){
                    System.out.println("O vencedor é: " + p2.nome);
                }
                
                if(p3.valor == 1){
                    System.out.println("O vencedor é: " + p3.nome);
                }
            }
        }
    }
    }

}