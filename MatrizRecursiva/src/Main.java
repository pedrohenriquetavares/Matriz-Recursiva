import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Escolher o tamanho da matriz
        System.out.print("Informe o número de linhas: ");
        int linhas = scanner.nextInt();
        System.out.print("Informe o número de colunas: ");
        int colunas = scanner.nextInt();

        // Preenchendo a matriz
        Matriz matriz = new Matriz(linhas, colunas);
        matriz.preencherMatriz();

        // Mostrar a matriz usando a função recursiva
        MatrizRec exibidor = new MatrizRec();
        System.out.println("Elementos da matriz:");
        exibidor.MatrizRec(matriz.getMatriz(), 0, 0);

        scanner.close();
    }
}
