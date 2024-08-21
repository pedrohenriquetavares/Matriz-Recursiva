public class MatrizRec {

    public void MatrizRec(int[][] matriz, int linha, int coluna) {
        if (linha == matriz.length) { //Verifica se a linha atual está fora dos limites da matriz
            return;
        }

        if (coluna == matriz[linha].length) { //Verifica se a coluna atual está fora dos limites da linha
            System.out.println();
            MatrizRec(matriz, linha + 1, 0); // Move para a próxima linha e reinicia a coluna
            return;
        }

        System.out.print(matriz[linha][coluna] + " ");
        MatrizRec(matriz, linha, coluna + 1);
        // Chama recursivamente a função para exibir o próximo elemento na mesma linha
    }
}