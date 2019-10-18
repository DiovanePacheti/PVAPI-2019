package asaida;
import java.util.Scanner;
public class ASaida {
    public static void main(String[] args) {

        int qtdPergustas = 0;
        String concatenandoGzuz = "";

        Scanner scan = new Scanner(System.in);

        qtdPergustas = scan.nextInt();

        for(int i = 0; i < qtdPergustas; i++){
            String pergutou = scan.nextLine();
            concatenandoGzuz += "gzuz\n";
        }
        System.out.println(concatenandoGzuz);
    }//fim do method
}//fim da class
