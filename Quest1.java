
import java.util.Scanner;
public class Quest1
{
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Informe sua idade");
        int idade = input.nextInt();
        
        if(idade<16){
            System.out.println("Você ainda não vota!");
        }else if(idade>65 || idade<=17){
            System.out.println("Seu voto não é obrigatorio!");
        }else{
            System.out.println("Seu voto é obrigatorio!");
        }
    }
}
