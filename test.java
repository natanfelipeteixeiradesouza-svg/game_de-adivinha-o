import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\nCalculadora simples");
            System.out.println("1) Adição");
            System.out.println("2) Subtração");
            System.out.println("3) Multiplicação");
            System.out.println("4) Divisão");
            System.out.println("5) Módulo (resto)");
            System.out.println("6) Potência");
            System.out.println("7) Raiz quadrada");
            System.out.println("0) Sair");
            System.out.print("Escolha uma opção: ");

            String opt = sc.nextLine().trim();
            switch (opt) {
                case "1":
                    double a1 = readDouble(sc, "Digite o primeiro número: ");
                    double b1 = readDouble(sc, "Digite o segundo número: ");
                    System.out.println("Resultado: " + (a1 + b1));
                    break;
                case "2":
                    double a2 = readDouble(sc, "Digite o primeiro número: ");
                    double b2 = readDouble(sc, "Digite o segundo número: ");
                    System.out.println("Resultado: " + (a2 - b2));
                    break;
                case "3":
                    double a3 = readDouble(sc, "Digite o primeiro número: ");
                    double b3 = readDouble(sc, "Digite o segundo número: ");
                    System.out.println("Resultado: " + (a3 * b3));
                    break;
                case "4":
                    double a4 = readDouble(sc, "Digite o dividendo: ");
                    double b4 = readDouble(sc, "Digite o divisor: ");
                    if (b4 == 0) {
                        System.out.println("Erro: divisão por zero.");
                    } else {
                        System.out.println("Resultado: " + (a4 / b4));
                    }
                    break;
                case "5":
                    double a5 = readDouble(sc, "Digite o primeiro número: ");
                    double b5 = readDouble(sc, "Digite o segundo número: ");
                    if (b5 == 0) {
                        System.out.println("Erro: módulo por zero.");
                    } else {
                        System.out.println("Resultado: " + (a5 % b5));
                    }
                    break;
                case "6":
                    double base = readDouble(sc, "Digite a base: ");
                    double expo = readDouble(sc, "Digite o expoente: ");
                    System.out.println("Resultado: " + Math.pow(base, expo));
                    break;
                case "7":
                    double v = readDouble(sc, "Digite o número: ");
                    if (v < 0) {
                        System.out.println("Erro: raiz de número negativo.");
                    } else {
                        System.out.println("Resultado: " + Math.sqrt(v));
                    }
                    break;
                case "0":
                    System.out.println("Encerrando.");
                    sc.close();
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    private static double readDouble(Scanner sc, String prompt) {
        while (true) {
            System.out.print(prompt);
            String line = sc.nextLine().trim();
            try {
                return Double.parseDouble(line.replace(',', '.'));
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Digite um número válido.");
            }
        }
    }
}