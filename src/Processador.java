import javax.swing.*;
import java.awt.event.ActionEvent;

public class Processador extends PainelGrafico{

    public Processador () {
        instanciaAcaoBotoes ();
    }

    double numeroPressionado = 0;
    public void lerOpcaoBotao(ActionEvent e) {

        botaoPressionado = (JButton) e.getSource();

        if (botaoPressionado == botao_0) {
            numeroPressionado = 0;
        } else if (botaoPressionado == botao_1) {
            numeroPressionado = 1;
        } else if (botaoPressionado == botao_2) {
            numeroPressionado = 2;
        } else if (botaoPressionado == botao_3) {
            numeroPressionado = 3;
        } else if (botaoPressionado == botao_4) {
            numeroPressionado = 4;
        } else if (botaoPressionado == botao_5) {
            numeroPressionado = 5;
        } else if (botaoPressionado == botao_6) {
            numeroPressionado = 6;
        } else if (botaoPressionado == botao_7) {
            numeroPressionado = 7;
        } else if (botaoPressionado == botao_8) {
            numeroPressionado = 8;
        } else if (botaoPressionado == botao_9) {
            numeroPressionado = 9;
        }
        System.out.println(numeroPressionado);
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
