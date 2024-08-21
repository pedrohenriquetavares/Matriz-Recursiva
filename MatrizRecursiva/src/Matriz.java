import java.util.Scanner;

public class Matriz {
    private int[][] matriz;
    private int linhas;
    private int colunas;

    public Matriz(int linhas, int colunas) {
        this.linhas = linhas;
        this.colunas = colunas;
        this.matriz = new int[linhas][colunas];
    }

    public void preencherMatriz() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print("Informe o valor para a posição [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }
    }

    public int[][] getMatriz() {
        return matriz;
    }
}
