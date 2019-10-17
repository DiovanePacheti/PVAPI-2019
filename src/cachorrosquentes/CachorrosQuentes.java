package cachorrosquentes;

import java.io.*;

public class CachorrosQuentes {
    public static void main(String[] args) throws IOException {
        /*
        Em 2012 foi alcançado um novo recorde mundial na famosa Competição de
        Cachorros-Quentes do Nathan: o campeão, Joey Chestnut, devorou 68
        cachorros-quentes em dez minutos, um aumento incrível em relação
        aos 62 sanduíches devorados pelo mesmo Chestnut em 2011.

        O restaurante Nathan’s Famous Corporation, localizado no Brooklyn,
        NY, é o responsável pela competição. Eles produzem deliciosos
        cachorros-quentes, mundialmente famosos, mas quando o assunto é
        matemática eles não são tão bons. Eles desejam ser listados no
        Livro de Recordes do Guinness, mas para isso devem preencher um
        formulário descrevendo os fatos básicos da competição. Em particular,
        eles devem informar o número médio de cachorros-quentes consumidos
        pelos participantes durante a competição.

        Você pode ajudá-los? Eles prometeram pagá-lo com um dos seus
        saborosos cachorros-quentes. Dados o número total de cachorros-quentes
        consumidos e o número total de participantes na competição,
        você deve escrever um programa para determinar o número médio de
        cachorros-quentes consumidos pelos participantes.

        Entrada
        A entrada consiste de uma única linha que contém dois inteiros H e P
        (1 ≤ H, P ≤ 1000) indicando respectivamente o número total de
        cachorros-quentes consumidos e o número total de participantes na competição.

        Saída
        Seu programa deve produzir uma única linha com um número racional
        representando o número médio de cachorros-quentes consumidos pelos
        participantes. O resultado deve ser escrito como um número racional
        com exatamente dois dígitos após o ponto decimal, arredondado se necessário.
        */

        String valores;
        String[] partes;
        double totalConsumidoCQ = 0;
        double totalParticipantes = 0;
        double media;
        //isntanciando o objeto in
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        valores = in.readLine();//lendo os valores em uma linha

        partes = valores.split(" ");//usando split para dividir a string em partes quando encontrar um espaço

        totalConsumidoCQ = Integer.parseInt(partes[0]);//primeira parte antes do espaço
        totalParticipantes = Integer.parseInt(partes[1]);//segunda parte depois do espaço

        media = totalConsumidoCQ / totalParticipantes;//atribuindo a divisao de total de Pa
        System.out.printf("%.2f",media);
    }//fim do method
}//fim da class
