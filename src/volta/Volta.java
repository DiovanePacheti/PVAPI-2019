package volta;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Volta {
    public static void main(String[] args) throws IOException {
        /*
        No automobilismo é bastante comum que o líder de uma prova,
        em determinado momento, ultrapasse o último colocado. O líder,
        neste momento, está uma volta à frente do último colocado,
        que se torna, assim, um retardatário. Neste problema, dados
        os tempos que o piloto mais rápido e o piloto mais lento
        levam para completar uma volta, você deve determinar em que
        volta o último colocado se tornará um retardatário, ou seja,
        será ultrapassado pelo líder. Você deve considerar que,
        inicialmente, eles estão lado a lado, na linha de partida
        do circuito, ambos no início da volta de número 1
        (a primeira volta da corrida); e que uma nova volta se
        inicia sempre depois que o líder cruza a linha de partida.

        Entrada
        A única linha da entrada contém dois números inteiros X e Y
        (1 ≤ X < Y ≤ 10000), os tempos, em segundos, que o piloto mais
        rápido e o piloto mais lento levam para completar uma volta,
        respectivamente.

        Saída
        Seu programa deve produzir uma única linha, contendo um único
        inteiro: a volta em que o piloto mais lento se tornará um
        retardatário.
        */

        String valores ="";
        int primeiroPiloto = 0;
        int segundoPiloto = 0;
        int volta = 1;
        int tempoTiradoPorPiloto = 0;

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        valores = in.readLine();//variavel que recebe os valores do dois pilotos

        String[] partes = valores.split(" ");//dividindo os valores em duas partes quando encontrar um espaço " ".

        primeiroPiloto = Integer.parseInt(partes[0]);//atribuindo o primeiro valor convertido em int
        segundoPiloto = Integer.parseInt(partes[1]);

        do {//faça
            //atribuindo tempo que o primeiro piloto tira do segundo
            tempoTiradoPorPiloto += (segundoPiloto - primeiroPiloto);
            if(tempoTiradoPorPiloto >= segundoPiloto){/*se o tempo tirado for maior ou igual a tempo que
                                                        o segundo piloto leva pradar uma volta*/
                break; //quebre
            }
            volta++; //conta quantas voltas estao sendo dadas
        }while(true);
        System.out.println(volta);
    }//fim do method
}//fim da class
