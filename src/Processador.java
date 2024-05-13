import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.regex.Pattern;

public class Processador extends PainelGrafico{

    public Processador () {
        instanciaAcaoBotoes ();
    }
    static double numero_pressionado = 0;
    static double num1 = 0;
    static double num2 = 0;
    char operacao_pressionado;
    public void somar() {

        if (num1 != 0 && num2 != 0)
            System.out.println(" " + (num1 + num2));
    }

    public void lerOpcaoBotao(ActionEvent e) {

        botaoPressionado = (JButton) e.getSource();

        if (botaoPressionado == botao_0) {
            numero_pressionado = 0;
            obterNum1eNum2(false);
        } else if (botaoPressionado == botao_1) {
            numero_pressionado = 1;
            obterNum1eNum2(false);
        } else if (botaoPressionado == botao_2) {
            numero_pressionado = 2;
            obterNum1eNum2(false);
        } else if (botaoPressionado == botao_3) {
            numero_pressionado = 3;
            obterNum1eNum2(false);
        } else if (botaoPressionado == botao_4) {
            numero_pressionado = 4;
            obterNum1eNum2(false);
        } else if (botaoPressionado == botao_5) {
            numero_pressionado = 5;
            obterNum1eNum2(false);
        } else if (botaoPressionado == botao_6) {
            numero_pressionado = 6;
            obterNum1eNum2(false);
        } else if (botaoPressionado == botao_7) {
            numero_pressionado = 7;
            obterNum1eNum2(false);
        } else if (botaoPressionado == botao_8) {
            numero_pressionado = 8;
            obterNum1eNum2(false);
        } else if (botaoPressionado == botao_9) {
            numero_pressionado = 9;
            obterNum1eNum2(false);
        } else if (botaoPressionado == botao_igual) {
            operacao_pressionado = '=';
            obterNum1eNum2(true);
        } else if (botaoPressionado == botao_soma) {
            operacao_pressionado = '+';
            obterNum1eNum2(true);
        } else if (botaoPressionado == botao_subt) {
            operacao_pressionado = '-';
            obterNum1eNum2(true);
        } else if (botaoPressionado == botao_mult) {
            operacao_pressionado = 'x';
            obterNum1eNum2(true);
        } else if (botaoPressionado == botao_div) {
            operacao_pressionado = '/';
            obterNum1eNum2(true);
        } else if (botaoPressionado == botao_porcen) {
            operacao_pressionado = '%';
            obterNum1eNum2(true);
        } else if (botaoPressionado == botao_virg) {
            operacao_pressionado = ',';
            obterNum1eNum2(true);
        } else {
            operacao_pressionado = 'A'; // Abreviação de AC.
            obterNum1eNum2(true);
        }

    }

    /* Quando estiver com zero, se pega o número e coloca no num1
       Quando estiver com um, se pega o número e coloca no num2. */
    static int pegar_num1_ou_num2 = 0;

    public static void obterNum1eNum2(boolean e_operador) {

        if (!e_operador) {

            if (pegar_num1_ou_num2 == 0) {
                // concatenanado os números.

                String str_num1 = Double.toString(numero_pressionado).replaceAll("\\.", "");
                String str_num2 = Double.toString(num1).replaceAll("\\.", "");

                // Convertendo os dois.
                num1 = Double.parseDouble(str_num2 + str_num1);
            } else if (pegar_num1_ou_num2 == 1) {
                // concatenanado os números.

                // Transformando o número pressionado em String.
                String str_num1 = Double.toString(numero_pressionado).replaceAll("\\.", "");
                String str_num2 = Double.toString(num1).replaceAll("\\.", "");

                num2 = Double.parseDouble(str_num2 + str_num1);
            }

        } else if (e_operador) {

            if (pegar_num1_ou_num2 == 0) {
                pegar_num1_ou_num2 = 1;
            } else if (pegar_num1_ou_num2 == 1) {

                /* Chamar o método para fazer a operação de acordo com o operador,
                   pois se chegar a trocar o número que quero preencher depois de
                   pegar algum operador, é por conta que a pessoa quer fazer alguma
                   operação matemática. (após a operação zerar o num1 e num2) */

                System.out.println("num1: " + num1);
                System.out.println("num2: " + num2);
                System.out.println("num1 + num2 = " + (num1+num2));
                pegar_num1_ou_num2 = 0;
            }

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