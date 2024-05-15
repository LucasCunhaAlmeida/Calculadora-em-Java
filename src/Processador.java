import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.regex.Pattern;

public class Processador extends PainelGrafico{

    public Processador () {
        instanciaAcaoBotoes ();
    }
    static Integer numero_pressionado = 0;
    static double num1 = 0;
    static double num2 = 0;
    static char operacao_pressionado;


    public void lerOpcaoBotao(ActionEvent e) {

        botaoPressionado = (JButton) e.getSource();

        if (botaoPressionado == botao_0) {
            numero_pressionado = 0;
            controleNumeros(false);
        } else if (botaoPressionado == botao_1) {
            numero_pressionado = 1;
            controleNumeros(false);
        } else if (botaoPressionado == botao_2) {
            numero_pressionado = 2;
            controleNumeros(false);
        } else if (botaoPressionado == botao_3) {
            numero_pressionado = 3;
            controleNumeros(false);
        } else if (botaoPressionado == botao_4) {
            numero_pressionado = 4;
            controleNumeros(false);
        } else if (botaoPressionado == botao_5) {
            numero_pressionado = 5;
            controleNumeros(false);
        } else if (botaoPressionado == botao_6) {
            numero_pressionado = 6;
            controleNumeros(false);
        } else if (botaoPressionado == botao_7) {
            numero_pressionado = 7;
            controleNumeros(false);
        } else if (botaoPressionado == botao_8) {
            numero_pressionado = 8;
            controleNumeros(false);
        } else if (botaoPressionado == botao_9) {
            numero_pressionado = 9;
            controleNumeros(false);
        } else if (botaoPressionado == botao_igual) {
            operacao_pressionado = '=';
            controleNumeros(true);
        } else if (botaoPressionado == botao_soma) {
            operacao_pressionado = '+';
            controleNumeros(true);
        } else if (botaoPressionado == botao_subt) {
            operacao_pressionado = '-';
            controleNumeros(true);
        } else if (botaoPressionado == botao_mult) {
            operacao_pressionado = 'x';
            controleNumeros(true);
        } else if (botaoPressionado == botao_div) {
            operacao_pressionado = '/';
            controleNumeros(true);
        } else if (botaoPressionado == botao_porcen) {
            operacao_pressionado = '%';
            controleNumeros(true);
        } else if (botaoPressionado == botao_virg) {
            operacao_pressionado = ',';
            controleNumeros(false);
        } else {
            operacao_pressionado = 'A'; // Abreviação de AC.
            controleNumeros(true);
        }

    }

    static int num1_ou_num2 = 1;
    public static void controleNumeros(boolean operador) {

        // Escolhendo qual variavel vai ser preenchida, 1 para num1 e 2 para num2.
        if (num1_ou_num2 == 1) {
            // A vez aqui é do num1.

            if (!operador) {
                // Se for não for algum dos operadores, mas pode ser uma vírgula.

                // Chamando a o método para preencher o num1
                obterNum1(false);

            } else {
                /* Mandamos um false para obterNum1, pois esse é o sinal para
                   concatenar os números guardados antes e após a vírgula,
                   fazendo com que se preencha o num1 com o número completo. */

                obterNum1(true);

                // Agora trocamos de num1 para num2, a variável a ser preenchida.
                num1_ou_num2 = 2;

            }
        } else if (num1_ou_num2 == 2) {
            // A vez aqui é do num2.

            if (!operador) {
                // Se for não for algum dos operadores, mas pode ser uma vírgula.

                // Chamando a o método para preencher o num2
                obterNum2(false);
            } else {
                /* Mandamos um false para obterNum2, pois esse é o sinal para
                   concatenar os números guardados antes e após a vírgula,
                   fazendo com que se preencha o num2 com o número completo. */

                obterNum2(true);

                // Agora trocamos de num2 para num1, a variável a ser preenchida.
                num1_ou_num2 = 1;

            }

        }

    }

    
    // Variáveis usadas para armazenar os números após a vírgula e antes
    static Integer num_temp = 0, num_virg_temp = 0;
    public static void obterNum1(boolean operador) {

        if (operacao_pressionado != ',') {
            // Se não foi digitado uma vírgula, então pegaremos a parte inteira.

            num_temp = num_temp * 10 + numero_pressionado;
            numero_pressionado = 0;
            System.out.println("num_temp = " + num_temp);

        } else {
            /* Se pressionou para adicionar virgula, precisamos pegar os
               números após a virgula. */

            num_virg_temp = num_virg_temp * 10 + numero_pressionado;
            numero_pressionado = 0;
            System.out.println("num_virg_temp = " + num_virg_temp);

        }

        // Agora testando se foi passado um operador em vez de um número.
        if (operador) {

            /* Se chegou aqui é por conta que foi pressionado algum operador,
               então temos que converter os números após a virgula e antes da vírgula,
               para se colocar eles na variável num1. */

            // Obtendo o número de dígitos na parte decimal
            int numDigitosDecimal = String.valueOf(num_virg_temp).length();

            // Calculando o divisor
            int divisor = (int) Math.pow(10, numDigitosDecimal);

            // Combinando a parte inteira e a parte decimal

            num1 = (num_temp.doubleValue()/10) + ((double) num_virg_temp / divisor);

            // limpando as variáveis que usamos para armazenar números temporários.
            num_virg_temp = 0;
            num_temp = 0;

            System.out.println("num1 após tudo = " + num1);
        }

    }


    public static void obterNum2(boolean operador) {

        if (operacao_pressionado != ',') {
            // Se não foi digitado uma vírgula, então pegaremos a parte inteira.

            num_temp = num_temp * 10 + numero_pressionado;
            numero_pressionado = 0;
            System.out.println("num_temp = " + num_temp);

        } else {
            /* Se pressionou para adicionar virgula, precisamos pegar os
               números após a virgula. */

            num_virg_temp = num_virg_temp * 10 + numero_pressionado;
            numero_pressionado = 0;
            System.out.println("num_virg_temp = " + num_virg_temp);

        }

        // Agora testando se foi passado um operador em vez de um número.
        if (operador) {

            /* Se chegou aqui é por conta que foi pressionado algum operador,
               então temos que converter os números após a virgula e antes da vírgula,
               para se colocar eles na variável num1. */

            // Obtendo o número de dígitos na parte decimal
            int numDigitosDecimal = String.valueOf(num_virg_temp).length();

            // Calculando o divisor
            int divisor = (int) Math.pow(10, numDigitosDecimal);

            // Combinando a parte inteira e a parte decimal

            num2 = (num_temp.doubleValue()/10) + ((double) num_virg_temp / divisor);

            // limpando as variáveis que usamos para armazenar números temporários.
            num_virg_temp = 0;
            num_temp = 0;

            System.out.println("num2 após tudo = " + num2);
        }
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