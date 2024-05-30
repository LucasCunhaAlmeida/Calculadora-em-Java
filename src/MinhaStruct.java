public class MinhaStruct {

    /**
     * Precisamos desses dois vetores, pois a estrutura calculadora está basicamente neles.
     * O vet_opera guarda o símbolo da operação a ser feita, e os simbolos de negativo
     * para saber se o num1 e num2 são números negativos. Já o vet_num guarda os
     * números para serem processados, eles ficam na posição 1 e 4, o resto das
     * posições é colocado 0 no lugar.
     */
    char[] vet_opera = new char[5];

    double[] vet_num = new double[5];

    // ***** Construtor *****
    public MinhaStruct() {

        /**
         * Se nas posições do vetor de vet_opera estiver com 'n', então
         * não tem nenhum operador naquela posição. Já na posição
         * 1 e 4 que estão os números, tem a letra 'a'.
         */

        /**
         * Inicializando com 'n' em todas as posições.
         * Menos a 1 e 4 por conta que são números.
         */

        for (int i = 0; i < vet_opera.length; i++) {
            if (i == 1 || i == 4) {
                vet_opera[i] = 'a';
            } else {
                vet_opera[i] = 'n';
            }
        }

    }

}
