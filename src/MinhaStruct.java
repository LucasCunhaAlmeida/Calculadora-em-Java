public class MinhaStruct {
    char[] vet_opera = new char[5];
    double[] vet_num = new double[5];

    public MinhaStruct() {
        /*Se nas posições no vetor de char estiver com 'n', então
        * não tem nenhum operador naquela posição. já na posição
        * 1 e 4 que eestão os números, tem a letra 'a'. */

        // Inicializando com 'n' em todas as posições.
        for (int i = 0; i < vet_opera.length; i++) {
            if (i == 1 || i == 4) {
                vet_opera[i] = 'a';
            } else {
                vet_opera[i] = 'n';
            }
        }

    }

}
