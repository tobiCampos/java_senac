
import java.util.Scanner;
public class NAME{
    public static void main(String[]args){
        Scanner scannerTxt = new Scanner(System.in);
        System.out.println("Seu nome:\n");  
        String nome = scannerTxt.nextLine();
        System.out.println("Seu nome é: " + nome);
        scannerTxt.close();
    }
}