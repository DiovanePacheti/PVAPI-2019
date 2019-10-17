package inseto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Inseto {
    public static void main(String[] args) throws IOException {
        /*
        Devita é o príncipe dos Calsadins. Juntamente com Pana, eles vão atrás de Tataroko, o nome de nascimento de Kogu, para tentar dominar o mundo. Ele possui um rastreador que mede o nível de energia de qualquer ser vivo. Todos os seres com o nível menor ou igual a 8000, ele considera como se fosse um inseto. Quando passa deste valor, que foi o caso de Kogu, ele se espanta e grita “Mais de 8000”. Baseado nisso, utilize a mesma tecnologia e analise o nível de energia dos seres vivos.

Entrada
A entrada é composta por vários casos de teste. A primeira linha contém um número inteiro C relativo ao número de casos de teste. Em seguida, haverá C linhas, com um número inteiro N (100 <= N <= 100000) relativo ao nível de energia de um ser vivo.

Saída
Para cada valor lido, imprima o texto correspondente.
        * */
        int vezes = 0;
        String saida="";
        Scanner scan = new Scanner(System.in);

        vezes = scan.nextInt();

        for (int i = 0; i < vezes ; i++) {
            int num = scan.nextInt();
            if(num>8000){
                saida +="Mais de 8000!\n";
            }else{
                saida += "Inseto!\n";
            }
        }//fim do for
        System.out.print(saida);

    }//fim domethod

}//fim da class
