import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Insira as 4 notas");
        Scanner a = new Scanner(System.in);
        int nota1 = a.nextInt();

        Scanner b = new Scanner(System.in);
        int nota2 = a.nextInt();

        Scanner c = new Scanner(System.in);
        int nota3 = a.nextInt();

        Scanner d = new Scanner(System.in);
        int nota4 = a.nextInt();

        int media = (nota1+nota2+nota3+nota4)/4 ;

        System.out.println("A média das notas é: " + media);

        if (media >= 7){
            System.out.println("Aluno aprovado");
        } else if (media >= 5){
            System.out.println("Aluno de recuperação");
        }else{
            System.out.println("Aluno reprovado");
        }
    }
}