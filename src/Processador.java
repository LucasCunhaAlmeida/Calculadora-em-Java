import javax.swing.*;
import java.awt.event.ActionEvent;

public class Processador extends PainelGrafico{

    // ***** Construtor *****
    public Processador () {
        instanciaAcaoBotoes ();
    }

    // Variaveis usadas globalmente ao longo da classe.
    static Integer numero_pressionado = 0;
    static double num1 = 0, num2 = 0;
    static char operacao_pressionado = 'n';
    static boolean virgula = false;
    // Chave para navegar entre os indices, começa no 0 e termina no 4.
    static int chave = 0;

    // Armazenar números temporarios (usados nos métodos obterNum1 e obterNum2).
    static Integer num_temp = 0, num_virg_temp = 0;

    // Métodos especiais das variaveis a cima.

    public static Integer getNumero_pressionado() {
        return numero_pressionado;
    }

    public static void setNumero_pressionado(Integer numero_pressionado) {
        Processador.numero_pressionado = numero_pressionado;
    }

    public static double getNum1() {
        return num1;
    }

    public static void setNum1(double num1) {
        Processador.num1 = num1;
    }

    public static double getNum2() {
        return num2;
    }

    public static void setNum2(double num2) {
        Processador.num2 = num2;
    }

    public static char getOperacao_pressionado() {
        return operacao_pressionado;
    }

    public static void setOperacao_pressionado(char operacao_pressionado) {
        Processador.operacao_pressionado = operacao_pressionado;
    }

    public static boolean isVirgula() {
        return virgula;
    }

    public static void setVirgula(boolean virgula) {
        Processador.virgula = virgula;
    }

    public static int getChave() {
        return chave;
    }

    public static void setChave(int chave) {
        Processador.chave = chave;
    }

    public static Integer getNum_temp() {
        return num_temp;
    }

    public static void setNum_temp(Integer num_temp) {
        Processador.num_temp = num_temp;
    }

    public static Integer getNum_virg_temp() {
        return num_virg_temp;
    }

    public static void setNum_virg_temp(Integer num_virg_temp) {
        Processador.num_virg_temp = num_virg_temp;
    }

    public void lerOpcaoBotao(ActionEvent e) {

        botaoPressionado = (JButton) e.getSource();

        if (botaoPressionado == botao_0) {

            if (getChave() == 0) {
                controleDeEstrutura();
                setNumero_pressionado(0);
                obterNum1(false);
            } else if (getChave() == 1) {
                setNumero_pressionado(0);
                obterNum1(false);
            } else if (getChave() == 3) {
                controleDeEstrutura();
                setNumero_pressionado(0);
                obterNum2(false);
            } else if (getChave() == 4) {
                setNumero_pressionado(0);
                obterNum2(false);
            }

        } else if (botaoPressionado == botao_1) {

            if (getChave() == 0) {
                controleDeEstrutura();
                setNumero_pressionado(1);
                obterNum1(false);
            } else if (getChave() == 1) {
                setNumero_pressionado(1);
                obterNum1(false);
            } else if (getChave() == 3) {
                controleDeEstrutura();
                setNumero_pressionado(1);
                obterNum2(false);
            } else if (getChave() == 4) {
                setNumero_pressionado(1);
                obterNum2(false);
            }

        } else if (botaoPressionado == botao_2) {

            if (getChave() == 0) {
                controleDeEstrutura();
                setNumero_pressionado(2);
                obterNum1(false);
            } else if (getChave() == 1) {
                setNumero_pressionado(2);
                obterNum1(false);
            } else if (getChave() == 3) {
                controleDeEstrutura();
                setNumero_pressionado(2);
                obterNum2(false);
            } else if (getChave() == 4) {
                setNumero_pressionado(2);
                obterNum2(false);
            }

        } else if (botaoPressionado == botao_3) {

            if (getChave() == 0) {
                controleDeEstrutura();
                setNumero_pressionado(3);
                obterNum1(false);
            } else if (getChave() == 1) {
                setNumero_pressionado(3);
                obterNum1(false);
            } else if (getChave() == 3) {
                controleDeEstrutura();
                setNumero_pressionado(3);
                obterNum2(false);
            } else if (getChave() == 4) {
                setNumero_pressionado(3);
                obterNum2(false);
            }

        } else if (botaoPressionado == botao_4) {

            if (getChave() == 0) {
                controleDeEstrutura();
                setNumero_pressionado(4);
                obterNum1(false);
            } else if (getChave() == 1) {
                setNumero_pressionado(4);
                obterNum1(false);
            } else if (getChave() == 3) {
                controleDeEstrutura();
                setNumero_pressionado(4);
                obterNum2(false);
            } else if (getChave() == 4) {
                setNumero_pressionado(4);
                obterNum2(false);
            }

        } else if (botaoPressionado == botao_5) {

            if (getChave() == 0) {
                controleDeEstrutura();
                setNumero_pressionado(5);
                obterNum1(false);
            } else if (getChave() == 1) {
                setNumero_pressionado(5);
                obterNum1(false);
            } else if (getChave() == 3) {
                controleDeEstrutura();
                setNumero_pressionado(5);
                obterNum2(false);
            } else if (getChave() == 4) {
                setNumero_pressionado(5);
                obterNum2(false);
            }

        } else if (botaoPressionado == botao_6) {

            if (getChave() == 0) {
                controleDeEstrutura();
                setNumero_pressionado(6);
                obterNum1(false);
            } else if (getChave() == 1) {
                setNumero_pressionado(6);
                obterNum1(false);
            } else if (getChave() == 3) {
                controleDeEstrutura();
                setNumero_pressionado(6);
                obterNum2(false);
            } else if (getChave() == 4) {
                setNumero_pressionado(6);
                obterNum2(false);
            }

        } else if (botaoPressionado == botao_7) {

            if (getChave() == 0) {
                controleDeEstrutura();
                setNumero_pressionado(7);
                obterNum1(false);
            } else if (getChave() == 1) {
                setNumero_pressionado(7);
                obterNum1(false);
            } else if (getChave() == 3) {
                controleDeEstrutura();
                setNumero_pressionado(7);
                obterNum2(false);
            } else if (getChave() == 4) {
                setNumero_pressionado(7);
                obterNum2(false);
            }

        } else if (botaoPressionado == botao_8) {

            if (getChave() == 0) {
                controleDeEstrutura();
                setNumero_pressionado(8);
                obterNum1(false);
            } else if (getChave() == 1) {
                setNumero_pressionado(8);
                obterNum1(false);
            } else if (getChave() == 3) {
                controleDeEstrutura();
                setNumero_pressionado(8);
                obterNum2(false);
            } else if (getChave() == 4) {
                setNumero_pressionado(8);
                obterNum2(false);
            }

        } else if (botaoPressionado == botao_9) {

            if (getChave() == 0) {
                controleDeEstrutura();
                setNumero_pressionado(9);
                obterNum1(false);
            } else if (getChave() == 1) {
                setNumero_pressionado(9);
                obterNum1(false);
            } else if (getChave() == 3) {
                controleDeEstrutura();
                setNumero_pressionado(9);
                obterNum2(false);
            } else if (getChave() == 4) {
                setNumero_pressionado(9);
                obterNum2(false);
            }

        } else if (botaoPressionado == botao_igual) {

            // Talvez aqui mude
            if (getChave() == 4) {
                /* Se a chave estiver valendo 4, é para
                 * fazer a operação matemática. */
                obterNum2(true);
            }

        } else if (botaoPressionado == botao_soma) {

            if (getChave() == 1) {
                obterNum1(true);
                setOperacao_pressionado('+');
                controleDeEstrutura();
            } else if (getChave() == 2) {
                /* Aqui é por conta que está sendo feito uma nova operação,
                 * com um resultado já processado anteriormente. */
                setOperacao_pressionado('+');
                controleDeEstrutura();
            }

        } else if (botaoPressionado == botao_subt) {

            if (getChave() == 0) {
                setOperacao_pressionado('-');
                controleDeEstrutura();
            } else if (getChave() == 1) {
                obterNum1(true);
                setOperacao_pressionado('-');
                controleDeEstrutura();
            } else if (getChave() == 3) {
                setOperacao_pressionado('-');
                controleDeEstrutura();
            } else if (getChave() == 2) {
                /* Aqui é por conta que está sendo feito uma nova operação,
                 * com um resultado já processado anteriormente. */
                setOperacao_pressionado('-');
                controleDeEstrutura();
            }


        } else if (botaoPressionado == botao_mult) {

            if (getChave() == 1) {
                obterNum1(true);
                setOperacao_pressionado('x');
                controleDeEstrutura();
            } else if (getChave() == 2) {
                /* Aqui é por conta que está sendo feito uma nova operação,
                 * com um resultado já processado anteriormente. */
                setOperacao_pressionado('x');
                controleDeEstrutura();
            }

        } else if (botaoPressionado == botao_div) {

            if (getChave() == 1) {
                obterNum1(true);
                setOperacao_pressionado('/');
                controleDeEstrutura();
            } else if (getChave() == 2) {
                /* Aqui é por conta que está sendo feito uma nova operação,
                 * com um resultado já processado anteriormente. */
                setOperacao_pressionado('/');
                controleDeEstrutura();
            }

        } else if (botaoPressionado == botao_porcen) {

             if (getChave() == 1) {
                obterNum1(true);
                 setOperacao_pressionado('%');
                controleDeEstrutura();
             } else if (getChave() == 2) {
                 /* Aqui é por conta que está sendo feito uma nova operação,
                  * com um resultado já processado anteriormente. */
                 setOperacao_pressionado('%');
                 controleDeEstrutura();
             }

        } else if (botaoPressionado == botao_virg) {

            virgula = true;

            if (getChave() == 1 || getChave() == 4) {
                atualizarCaixaOp(",");
            }

        } else if (botaoPressionado == botao_ac){

            // Botão de AC
            setOperacao_pressionado('A');
            controleDeOperacoes();
        }

    }

    // Variáveis usadas para armazenar os números após a vírgula e antes

    public static void obterNum1(boolean operador) {

        if (!virgula) {
            // Se não foi digitado uma vírgula, então pegaremos a parte inteira.

            setNum_temp(num_temp * 10 + numero_pressionado);
            if (!operador) {
                atualizarCaixaOp(String.valueOf(numero_pressionado));
            }
            setNumero_pressionado(0);

        } else {
            /* Se pressionou para adicionar virgula, precisamos pegar os
               números após a virgula. */

            setNum_virg_temp(num_virg_temp * 10 + numero_pressionado);
            if (!operador) {
                atualizarCaixaOp(String.valueOf(numero_pressionado));
            }
            setNumero_pressionado(0);

        }

        // Agora testando se foi passado um operador em vez de um número.
        if (operador) {

            /* Se chegou aqui é por conta que foi pressionado algum operador,
               então temos que converter os números após a virgula e antes da vírgula,
               para se colocar eles na variável num1. */

            if (getNum_virg_temp() == 0 && !virgula) {

                // Testando para ver se foi pedido um número negativo.
                if (struct.vet_opera[0] == '-') {
                    setNum1(((num_temp.doubleValue()/10) * -1));
                } else {
                    setNum1((num_temp.doubleValue()/10));
                }

            } else {
                // Obtendo o número de dígitos na parte decimal
                int numDigitosDecimal = String.valueOf(num_virg_temp).length();

                // Calculando o divisor
                int divisor = (int) Math.pow(10, numDigitosDecimal);

                // Testando para ver se foi pedido um número negativo.
                if (struct.vet_opera[0] == '-') {
                    // Combinando a parte inteira e a parte decimal
                    setNum1((num_temp.doubleValue() + ((double) num_virg_temp / divisor)) * -1);
                } else {
                    // Combinando a parte inteira e a parte decimal
                    setNum1(num_temp.doubleValue() + ((double) num_virg_temp / divisor));
                }

            }

            // Chamando controleDeEstrutura()
            controleDeEstrutura();

            // limpando as variáveis que usamos para armazenar números temporários.
            setNum_virg_temp(0);
            setNum_temp(0);
            virgula = false;

        }

    }


    public static void obterNum2(boolean operador) {

        if (!virgula) {
            // Se não foi digitado uma vírgula, então pegaremos a parte inteira.

            setNum_temp(num_temp * 10 + numero_pressionado);
            if (!operador) {
                atualizarCaixaOp(String.valueOf(numero_pressionado));
            }
            setNumero_pressionado(0);

        } else {
            /* Se pressionou para adicionar virgula, precisamos pegar os
               números após a virgula. */

            setNum_virg_temp(num_virg_temp * 10 + numero_pressionado);
            if (!operador) {
                atualizarCaixaOp(String.valueOf(numero_pressionado));
            }
            setNumero_pressionado(0);

        }

        // Agora testando se foi passado um operador em vez de um número.
        if (operador) {

            /* Se chegou aqui é por conta que foi pressionado algum operador,
               então temos que converter os números após a vírgula e antes da vírgula,
               para se colocar eles na variável num1. */

            if (getNum_virg_temp() == 0 && !virgula) {

                // Testando para ver se foi pedido um número negativo.
                if (struct.vet_opera[3] == '-') {
                    setNum2((num_temp.doubleValue()/10) * -1);
                } else {
                    setNum2((num_temp.doubleValue()/10));
                }

            } else {
                // Obtendo o número de dígitos na parte decimal
                int numDigitosDecimal = String.valueOf(num_virg_temp).length();

                // Calculando o divisor
                int divisor = (int) Math.pow(10, numDigitosDecimal);

                // Testando para ver se foi pedido um número negativo.
                if (struct.vet_opera[3] == '-') {
                    setNum2((num_temp.doubleValue() + ((double) num_virg_temp / divisor)) * -1);
                } else {
                    // Combinando a parte inteira e a parte decimal
                    setNum2(num_temp.doubleValue() + ((double) num_virg_temp / divisor));
                }

            }

            // Chamando controleDeEstrutura()
            controleDeEstrutura();

            // limpando as variáveis que usamos para armazenar números temporários.
            setNum_virg_temp(0);
            setNum_temp(0);
            virgula = false;

        }
    }

    // Instanciando um objeto da classe MinhaStruct.
    static MinhaStruct struct = new MinhaStruct();


    public static void controleDeEstrutura () {

        if (getChave() == 0 && getOperacao_pressionado() == '-') {
            struct.vet_opera[0] = getOperacao_pressionado();
            atualizarCaixaOp(String.valueOf(struct.vet_opera[0]));
            setOperacao_pressionado('n');
            setChave(1);
        } else if (getChave() == 0 && struct.vet_opera[0] == 'n') {
            setChave(1);
        } else if (getChave() == 1) {
            struct.vet_num[1] = getNum1();
            setChave(2);
        } else if (getChave() == 2) {
            struct.vet_opera[2] = operacao_pressionado;
            atualizarCaixaOp(String.valueOf(struct.vet_opera[2]));
            setOperacao_pressionado('n');

            if (struct.vet_opera[2] == '%') {
                controleDeOperacoes();
            } else {
                setChave(3);
            }

        } else if (getChave() == 3 && getOperacao_pressionado() == '-') {
            struct.vet_opera[3] = getOperacao_pressionado();
            atualizarCaixaOp(String.valueOf(struct.vet_opera[3]));
            setChave(4);
        } else if (getChave() == 3) {
            setChave(4);
        } else if (getChave() == 4) {
            struct.vet_num[4] = getNum2();
            controleDeOperacoes();
        }

    }

    public static void controleDeOperacoes () {

        if (getOperacao_pressionado() == 'A'){
            // AC, (limpar tudo).
            caixa_operacoes.setText(null);
            setChave(0);
            setNum1(0);
            setNum2(0);
            setNumero_pressionado(0);
            setNum_temp(0);

            for (int i = 0; i < struct.vet_num.length; i++) {
                struct.vet_num[i] = 0;

                if (i != 1 && i != 4) {
                    struct.vet_opera[i] = 'n';
                }

            }

        } else if (struct.vet_opera[2] == '+') {
            // Se deseja fazer uma soma.

            caixa_operacoes.setText(null);

            double resul = struct.vet_num[1] + (struct.vet_num[4]);
            resetaOpera(resul);

            if (ehInteiro(resul)) {
                int resul_int = (int)resul;
                atualizarCaixaOp(String.valueOf(resul_int));
            } else {
                atualizarCaixaOp(String.valueOf(resul));
            }

        } else if (struct.vet_opera[2] == '-') {
            // Se deseja fazer uma subtração.

            caixa_operacoes.setText(null);

            double resul = struct.vet_num[1] - (struct.vet_num[4]);
            resetaOpera(resul);

            if (ehInteiro(resul)) {
                int resul_int = (int)resul;
                atualizarCaixaOp(String.valueOf(resul_int));
            } else {
                atualizarCaixaOp(String.valueOf(resul));
            }

        } else if (struct.vet_opera[2] == 'x') {
            // Se deseja fazer uma multiplicação.

            caixa_operacoes.setText(null);

            double resul = struct.vet_num[1] * (struct.vet_num[4]);
            resetaOpera(resul);

            if (ehInteiro(resul)) {
                int resul_int = (int)resul;
                atualizarCaixaOp(String.valueOf(resul_int));
            } else {
                atualizarCaixaOp(String.valueOf(resul));
            }

        } else if (struct.vet_opera[2] == '/') {
            // Se deseja fazer uma divisão.

            caixa_operacoes.setText(null);

            double resul = struct.vet_num[1] / (struct.vet_num[4]);
            resetaOpera(resul);

            if (ehInteiro(resul)) {
                int resul_int = (int)resul;
                atualizarCaixaOp(String.valueOf(resul_int));
            } else {
                atualizarCaixaOp(String.valueOf(resul));
            }

        } else if (struct.vet_opera[2] == '%') {
            // Se deseja dividir por 100.

            caixa_operacoes.setText(null);

            double resul = struct.vet_num[1] / 100;
            resetaOpera(resul);

            if (ehInteiro(resul)) {
                int resul_int = (int)resul;
                atualizarCaixaOp(String.valueOf(resul_int));
            } else {
                atualizarCaixaOp(String.valueOf(resul));
            }
        }
    }

    public static void resetaOpera(double resul) {

        if (resul >= 0) {
            struct.vet_opera[0] = 'n';
        }

        struct.vet_num[1] = resul;
        struct.vet_num[4] = 0;
        struct.vet_opera[2] = 'n';
        struct.vet_opera[3] = 'n';

        setChave(2);
    }

    public static void atualizarCaixaOp(String texto) {

        // Obtém o texto atual na caixa e adiciona o novo texto.
        String textoAtual = caixa_operacoes.getText();
        caixa_operacoes.setText(textoAtual + texto);
    }

    public void instanciaAcaoBotoes () {

        botao_igual.addActionListener(this::lerOpcaoBotao);
        botao_soma.addActionListener(this::lerOpcaoBotao);
        botao_subt.addActionListener(this::lerOpcaoBotao);
        botao_mult.addActionListener(this::lerOpcaoBotao);
        botao_div.addActionListener(this::lerOpcaoBotao);
        botao_0.addActionListener(this::lerOpcaoBotao);
        botao_virg.addActionListener(this::lerOpcaoBotao);
        botao_1.addActionListener(this::lerOpcaoBotao);
        botao_2.addActionListener(this::lerOpcaoBotao);
        botao_3.addActionListener(this::lerOpcaoBotao);
        botao_4.addActionListener(this::lerOpcaoBotao);
        botao_5.addActionListener(this::lerOpcaoBotao);
        botao_6.addActionListener(this::lerOpcaoBotao);
        botao_7.addActionListener(this::lerOpcaoBotao);
        botao_8.addActionListener(this::lerOpcaoBotao);
        botao_9.addActionListener(this::lerOpcaoBotao);
        botao_ac.addActionListener(this::lerOpcaoBotao);
        botao_porcen.addActionListener(this::lerOpcaoBotao);

    }

    // Serve apenas para saber se é um número inteiro ou não.
    public static boolean ehInteiro(double num) {
        return num == Math.floor(num);
    }
    
}