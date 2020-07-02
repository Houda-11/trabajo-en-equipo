import java.util.Scanner;

public class factoriales {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("escribe un numero");
        int num;
        num = entrada.nextInt();
        int contador = 1;
        int resultado = 1;

        while(contador <= num)
        {
            resultado = resultado* contador;
            contador = contador + 1;
        }
        System.out.println(resultado);
    }
}
