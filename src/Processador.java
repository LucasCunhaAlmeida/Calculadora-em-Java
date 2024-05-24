import javax.swing.*;
import java.awt.event.ActionEvent;

public class Processador extends PainelGrafico{

    public Processador () {

        instanciaAcaoBotoes ();

    }

    static Integer numero_pressionado = 0;
    static double num1 = 0;
    static double num2 = 0;
    static char operacao_pressionado = 'n';
    static boolean virgula = false;

    public void lerOpcaoBotao(ActionEvent e) {

        botaoPressionado = (JButton) e.getSource();

        if (botaoPressionado == botao_0) {

            if (chave == 0) {
                controleDeEstrutura();
                numero_pressionado = 0;
                obterNum1(false);
            } else if (chave == 1) {
                numero_pressionado = 0;
                obterNum1(false);
            } else if (chave == 3) {
                controleDeEstrutura();
                numero_pressionado = 0;
                obterNum2(false);
            } else if (chave == 4) {
                numero_pressionado = 0;
                obterNum2(false);
            }

        } else if (botaoPressionado == botao_1) {

            if (chave == 0) {
                controleDeEstrutura();
                numero_pressionado = 1;
                obterNum1(false);
            } else if (chave == 1) {
                numero_pressionado = 1;
                obterNum1(false);
            } else if (chave == 3) {
                controleDeEstrutura();
                numero_pressionado = 1;
                obterNum2(false);
            } else if (chave == 4) {
                numero_pressionado = 1;
                obterNum2(false);
            }

        } else if (botaoPressionado == botao_2) {

            if (chave == 0) {
                controleDeEstrutura();
                numero_pressionado = 2;
                obterNum1(false);
            } else if (chave == 1) {
                numero_pressionado = 2;
                obterNum1(false);
            } else if (chave == 3) {
                controleDeEstrutura();
                numero_pressionado = 2;
                obterNum2(false);
            } else if (chave == 4) {
                numero_pressionado = 2;
                obterNum2(false);
            }

        } else if (botaoPressionado == botao_3) {

            if (chave == 0) {
                controleDeEstrutura();
                numero_pressionado = 3;
                obterNum1(false);
            } else if (chave == 1) {
                numero_pressionado = 3;
                obterNum1(false);
            } else if (chave == 3) {
                controleDeEstrutura();
                numero_pressionado = 3;
                obterNum2(false);
            } else if (chave == 4) {
                numero_pressionado = 3;
                obterNum2(false);
            }

        } else if (botaoPressionado == botao_4) {

            if (chave == 0) {
                controleDeEstrutura();
                numero_pressionado = 4;
                obterNum1(false);
            } else if (chave == 1) {
                numero_pressionado = 4;
                obterNum1(false);
            } else if (chave == 3) {
                controleDeEstrutura();
                numero_pressionado = 4;
                obterNum2(false);
            } else if (chave == 4) {
                numero_pressionado = 4;
                obterNum2(false);
            }

        } else if (botaoPressionado == botao_5) {

            if (chave == 0) {
                controleDeEstrutura();
                numero_pressionado = 5;
                obterNum1(false);
            } else if (chave == 1) {
                numero_pressionado = 5;
                obterNum1(false);
            } else if (chave == 3) {
                controleDeEstrutura();
                numero_pressionado = 5;
                obterNum2(false);
            } else if (chave == 4) {
                numero_pressionado = 5;
                obterNum2(false);
            }

        } else if (botaoPressionado == botao_6) {

            if (chave == 0) {
                controleDeEstrutura();
                numero_pressionado = 6;
                obterNum1(false);
            } else if (chave == 1) {
                numero_pressionado = 6;
                obterNum1(false);
            } else if (chave == 3) {
                controleDeEstrutura();
                numero_pressionado = 6;
                obterNum2(false);
            } else if (chave == 4) {
                numero_pressionado = 6;
                obterNum2(false);
            }

        } else if (botaoPressionado == botao_7) {

            if (chave == 0) {
                controleDeEstrutura();
                numero_pressionado = 7;
                obterNum1(false);
            } else if (chave == 1) {
                numero_pressionado = 7;
                obterNum1(false);
            } else if (chave == 3) {
                controleDeEstrutura();
                numero_pressionado = 7;
                obterNum2(false);
            } else if (chave == 4) {
                numero_pressionado = 7;
                obterNum2(false);
            }

        } else if (botaoPressionado == botao_8) {

            if (chave == 0) {
                controleDeEstrutura();
                numero_pressionado = 8;
                obterNum1(false);
            } else if (chave == 1) {
                numero_pressionado = 8;
                obterNum1(false);
            } else if (chave == 3) {
                controleDeEstrutura();
                numero_pressionado = 8;
                obterNum2(false);
            } else if (chave == 4) {
                numero_pressionado = 8;
                obterNum2(false);
            }

        } else if (botaoPressionado == botao_9) {

            if (chave == 0) {
                controleDeEstrutura();
                numero_pressionado = 9;
                obterNum1(false);
            } else if (chave == 1) {
                numero_pressionado = 9;
                obterNum1(false);
            } else if (chave == 3) {
                controleDeEstrutura();
                numero_pressionado = 9;
                obterNum2(false);
            } else if (chave == 4) {
                numero_pressionado = 9;
                obterNum2(false);
            }

        } else if (botaoPressionado == botao_igual) {

            // Talvez aqui mude
            if (chave == 4) {
                /* Se a chave estiver valendo 4, é para
                 * fazer a operação matemática. */
                obterNum2(true);
            }

        } else if (botaoPressionado == botao_soma) {

            if (chave == 1) {
                obterNum1(true);
                operacao_pressionado = '+';
                controleDeEstrutura();
            } else if (chave == 2) {
                /* Aqui é por conta que está sendo feito uma nova operação,
                 * com um resultado já processado anteriormente. */
                operacao_pressionado = '+';
                controleDeEstrutura();
            }

        } else if (botaoPressionado == botao_subt) {

            if (chave == 0) {
                operacao_pressionado = '-';
                controleDeEstrutura();
            } else if (chave == 1) {
                obterNum1(true);
                operacao_pressionado = '-';
                controleDeEstrutura();
            } else if (chave == 3) {
                operacao_pressionado = '-';
                controleDeEstrutura();
            } else if (chave == 2) {
                /* Aqui é por conta que está sendo feito uma nova operação,
                 * com um resultado já processado anteriormente. */
                operacao_pressionado = '-';
                controleDeEstrutura();
            }


        } else if (botaoPressionado == botao_mult) {

            if (chave == 1) {
                obterNum1(true);
                operacao_pressionado = 'x';
                controleDeEstrutura();
            } else if (chave == 2) {
                /* Aqui é por conta que está sendo feito uma nova operação,
                 * com um resultado já processado anteriormente. */
                operacao_pressionado = 'x';
                controleDeEstrutura();
            }

        } else if (botaoPressionado == botao_div) {

            if (chave == 1) {
                obterNum1(true);
                operacao_pressionado = '/';
                controleDeEstrutura();
            } else if (chave == 2) {
                /* Aqui é por conta que está sendo feito uma nova operação,
                 * com um resultado já processado anteriormente. */
                operacao_pressionado = '/';
                controleDeEstrutura();
            }

        } else if (botaoPressionado == botao_porcen) {

             if (chave == 1) {
                obterNum1(true);
                operacao_pressionado = '%';
                controleDeEstrutura();
             } else if (chave == 2) {
                 /* Aqui é por conta que está sendo feito uma nova operação,
                  * com um resultado já processado anteriormente. */
                 operacao_pressionado = '%';
                 controleDeEstrutura();
             }

        } else if (botaoPressionado == botao_virg) {

            virgula = true;

        } else {

            // Botão de AC

        }

    }


    // Variáveis usadas para armazenar os números após a vírgula e antes
    static Integer num_temp = 0, num_virg_temp = 0;
    public static void obterNum1(boolean operador) {

        if (!virgula) {
            // Se não foi digitado uma vírgula, então pegaremos a parte inteira.

            num_temp = num_temp * 10 + numero_pressionado;
            numero_pressionado = 0;
        } else {
            /* Se pressionou para adicionar virgula, precisamos pegar os
               números após a virgula. */

            num_virg_temp = num_virg_temp * 10 + numero_pressionado;
            numero_pressionado = 0;

        }

        // Agora testando se foi passado um operador em vez de um número.
        if (operador) {

            /* Se chegou aqui é por conta que foi pressionado algum operador,
               então temos que converter os números após a virgula e antes da vírgula,
               para se colocar eles na variável num1. */

            if (num_virg_temp == 0 && !virgula) {

                // Testando para ver se foi pedido um número negativo.
                if (struct.vet_opera[0] == '-') {
                    num1 = ((num_temp.doubleValue()/10) * -1);
                } else {
                    num1 = (num_temp.doubleValue()/10);
                }

            } else {
                // Obtendo o número de dígitos na parte decimal
                int numDigitosDecimal = String.valueOf(num_virg_temp).length();

                // Calculando o divisor
                int divisor = (int) Math.pow(10, numDigitosDecimal);

                // Testando para ver se foi pedido um número negativo.
                if (struct.vet_opera[0] == '-') {
                    // Combinando a parte inteira e a parte decimal
                    num1 = (num_temp.doubleValue() + ((double) num_virg_temp / divisor)) * -1;
                } else {
                    // Combinando a parte inteira e a parte decimal
                    num1 = num_temp.doubleValue() + ((double) num_virg_temp / divisor);
                }

            }

            // Chamando controleDeEstrutura()
            controleDeEstrutura();

            // limpando as variáveis que usamos para armazenar números temporários.
            num_virg_temp = 0;
            num_temp = 0;
            virgula = false;

        }

    }


    public static void obterNum2(boolean operador) {

        if (!virgula) {
            // Se não foi digitado uma vírgula, então pegaremos a parte inteira.

            num_temp = num_temp * 10 + numero_pressionado;
            numero_pressionado = 0;

        } else {
            /* Se pressionou para adicionar virgula, precisamos pegar os
               números após a virgula. */

            num_virg_temp = num_virg_temp * 10 + numero_pressionado;
            numero_pressionado = 0;

        }

        // Agora testando se foi passado um operador em vez de um número.
        if (operador) {

            /* Se chegou aqui é por conta que foi pressionado algum operador,
               então temos que converter os números após a virgula e antes da vírgula,
               para se colocar eles na variável num1. */

            if (num_virg_temp == 0 && !virgula) {

                // Testando para ver se foi pedido um número negativo.
                if (struct.vet_opera[3] == '-') {
                    num2 = (num_temp.doubleValue()/10) * -1;
                } else {
                    num2 = (num_temp.doubleValue()/10);
                }

            } else {
                // Obtendo o número de dígitos na parte decimal
                int numDigitosDecimal = String.valueOf(num_virg_temp).length();

                // Calculando o divisor
                int divisor = (int) Math.pow(10, numDigitosDecimal);

                // Testando para ver se foi pedido um número negativo.
                if (struct.vet_opera[3] == '-') {
                    num2 = (num_temp.doubleValue() + ((double) num_virg_temp / divisor)) * -1;
                } else {
                    // Combinando a parte inteira e a parte decimal
                    num2 = num_temp.doubleValue() + ((double) num_virg_temp / divisor);
                }

            }

            // Chamando controleDeEstrutura()
            controleDeEstrutura();

            // limpando as variáveis que usamos para armazenar números temporários.
            num_virg_temp = 0;
            num_temp = 0;
            virgula = false;

        }
    }

    // Instanciando um objeto da classe MinhaStruct.
    static MinhaStruct struct = new MinhaStruct();

    // Chave para navegar entre os indices, começa no 0 e termina no 4.
    static int chave = 0;

    public static void controleDeEstrutura () {

        if (chave == 0 && operacao_pressionado == '-') {
            struct.vet_opera[0] = operacao_pressionado;
            System.out.println("ControleDeEstrutura [0] = " + struct.vet_opera[0]);
            operacao_pressionado = 'n';
            chave = 1;
        } else if (chave == 0 && struct.vet_opera[0] == 'n') {
            chave = 1;
        } else if (chave == 1) {
            struct.vet_num[1] = num1;
            System.out.println("ControleDeEstrutura [1] = " + struct.vet_num[1]);
            chave = 2;
        } else if (chave == 2) {
            struct.vet_opera[2] = operacao_pressionado;
            System.out.println("ControleDeEstrutura [2] = " + struct.vet_opera[2]);
            operacao_pressionado = 'n';

            if (struct.vet_opera[2] == '%') {
                controleDeOperacoes();
            } else {
                chave = 3;
            }

        } else if (chave == 3 && operacao_pressionado == '-') {
            struct.vet_opera[3] = operacao_pressionado;
            System.out.println("ControleDeEstrutura [3] = " + struct.vet_opera[3]);
            chave = 4;
        } else if (chave == 3) {
            chave = 4;
        } else if (chave == 4) {
            struct.vet_num[4] = num2;
            System.out.println("ControleDeEstrutura [4] = " + struct.vet_num[4]);
            controleDeOperacoes(); // Atenção aqui
        }

    }

    public static void controleDeOperacoes () {

        if (struct.vet_opera[2] == '+') {
            // Se deseja fazer uma soma.

            double resul = struct.vet_num[1] + (struct.vet_num[4]);
            resetaOpera(resul);

        } else if (struct.vet_opera[2] == '-') {
            // Se deseja fazer uma subtração.

            double resul = struct.vet_num[1] - (struct.vet_num[4]);
            resetaOpera(resul);
        } else if (struct.vet_opera[2] == 'x') {
            // Se deseja fazer uma multiplicação.

            double resul = struct.vet_num[1] * (struct.vet_num[4]);
            resetaOpera(resul);
        } else if (struct.vet_opera[2] == '/') {
            // Se deseja fazer uma divisão.

            double resul = struct.vet_num[1] / (struct.vet_num[4]);
            resetaOpera(resul);
        } else if (struct.vet_opera[2] == '%') {
            // Se deseja dividir por 100.

            double resul = struct.vet_num[1] / 100;
            resetaOpera(resul);
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

        for (int i = 0; i < 5; i++) {
            System.out.printf("Número: %.2f\tOperador %c\n", struct.vet_num[i], struct.vet_opera[i]);
        }
        chave = 2;
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
}