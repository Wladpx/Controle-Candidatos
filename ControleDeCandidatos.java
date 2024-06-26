import java.util.concurrent.ThreadLocalRandom;

public class ControleDeCandidatos{

    public static void main(String[] args){
        System.out.println("Processo seletivo");
       selecaoCandidatos();
   }

    static void imprimirSelecionados() {
        String[] candidatos = {"FELIPE","MARCIA","JULIA","PAULO","AUGUSTO","MONICA","FABRICIO","MIRELA","DANIELA","JORGE"};
        System.out.println("Imprimindo lista de candidatos informando o indice de elemento");
        
        for (int indice = 0; indice < candidatos.length; indice++) {
            System.out.println("O candidato de nº " + (indice+1) + " é o " + candidatos[indice]);
        }

        System.out.println("Forma abreviada de interação for each");
        
        for(String candidato: candidatos ) {
            System.out.println("O candidato selecionado foi " + candidato);
        } 
    }

    public static void selecaoCandidatos() {
        String[] candidatos = {"FELIPE","MARCIA","JULIA","PAULO","AUGUSTO","MONICA","FABRICIO","MIRELA","DANIELA","JORGE"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " Solicitou este valor de salário " + salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " Foi selecionado para vaga.");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }
    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

        static void analisarCandidato(double salarioPretendido) {
            double salarioBase = 2000.0;
            if(salarioBase > salarioPretendido) {
                System.out.println("LIGAR PARA O CANDIDATO!");}
                else if(salarioBase == salarioPretendido)
             System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
            else{
                System.out.println("AGUARDANDO OS DEMAIS CANDIDATOS"); 
        }   
     }
}