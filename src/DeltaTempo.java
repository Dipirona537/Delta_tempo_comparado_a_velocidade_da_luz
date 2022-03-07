import java.util.Scanner;
import java.lang.*;

public class DeltaTempo {
    public static void main(String[] args) {
        final double luz = 299792458;
        char escolha;
        double T, VelocidadeComparativa, deltaT;
        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha se deseja porcentagem da luz ou velocidade em m/s");
        escolha = sc.nextLine().charAt(0);
        System.out.println("Digite o tempo que deseja saber");
        T = sc.nextDouble();
        if (T < 0) {
            System.out.println("Não existe tempo negativo");
            System.exit(0);
        }
        switch (escolha) {
            case 'p' -> {
                System.out.println("Digite a velocidade do corpo comparada em porcentagem a da luz");
                double porcentagemluz = sc.nextDouble();
                if (porcentagemluz < 0 || porcentagemluz > 100) {
                    System.out.println("Velocidade impossível");
                    System.exit(0);
                }
                VelocidadeComparativa = luz * (porcentagemluz / 100);
                deltaT = T / (1 - (VelocidadeComparativa / luz));
                if (VelocidadeComparativa >= luz) {
                    System.out.println("A velocidade comparativa é igual ou maior que a luz, impossível realizar esta operação. ("+deltaT+")");
                    System.exit(0);
                }
                System.out.format("A diferença de tempo é %.8f", deltaT);
            }
            case 'm' -> {
                System.out.println("Digite a velocidade do corpo em m/s");
                double velocidadems = sc.nextDouble();
                if (velocidadems < 0) {
                    System.out.println("Velocidade impossível");
                    System.exit(0);
                }
                deltaT = T / (1 - (velocidadems/ luz));
                if (velocidadems >= luz) {
                    System.out.println("A velocidade comparativa é igual ou maior que a luz, impossível realizar esta operação.("+deltaT+")");
                    System.exit(0);
                }
                System.out.format("A diferença de tempo é %.8f", deltaT);
            }
            case 'v' -> {
                System.out.println("Digite a velocidade do corpo em m/s");
                double velocidadems = sc.nextDouble();
                if (velocidadems < 0) {
                    System.out.println("Velocidade impossível");
                    System.exit(0);
                }
                deltaT = T / (1 - (velocidadems / luz));
                if (velocidadems >= luz) {
                    System.out.println("A velocidade comparativa é igual ou maior que a luz, impossível realizar esta operação.");
                    System.exit(0);
                }
                System.out.format("A diferença de tempo é %.8f", deltaT);
            }
        }
    }
}
