import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
      Scanner entrada = new Scanner(System.in);

        // ENTRADA
        System.out.print("Digite o preço unitário: ");
        double precoUnitario = entrada.nextDouble();

        System.out.print("Digite a quantidade: ");
        int quantidade = entrada.nextInt();

        // PROCESSAMENTO INICIAL
        double subtotal = precoUnitario * quantidade;
        double desconto = 0.0;

        // DECISÃO
        if (subtotal >= 200.0) {
            desconto = subtotal * 0.05;
        }

        double valorFinal = subtotal - desconto;

        // SAÍDA
        System.out.println("Subtotal: R$ " + subtotal);
        System.out.println("Desconto: R$ " + desconto);
        System.out.println("Valor Final: R$ " + valorFinal);

        entrada.close();
    }
}
