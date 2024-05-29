import javax.swing.*;
import java.awt.*;

public class PainelGrafico extends JFrame{

    // ****** Objetos Globais. *****

    protected JButton botaoPressionado;
    protected JButton botao_igual;
    protected JButton botao_soma;
    protected JButton botao_subt;
    protected JButton botao_mult;
    protected JButton botao_div;
    protected JButton botao_0;
    protected JButton botao_virg;
    protected JButton botao_1;
    protected JButton botao_2;
    protected JButton botao_3;
    protected JButton botao_4;
    protected JButton botao_5;
    protected JButton botao_6;
    protected JButton botao_7;
    protected JButton botao_8;
    protected JButton botao_9;
    protected JButton botao_ac;
    protected JButton botao_porcen;

    protected static JTextField caixa_operacoes;

    // ***** Construtor *****
    public PainelGrafico(){

        iconeJanela();
        gerarTela();
        botaoIgualdade();
        botaoSoma();
        botaoSubt();
        botaoMult();
        botaoDiv();
        botaoNum0();
        botaoVirgula();
        botaoNum1();
        botaoNum2();
        botaoNum3();
        botaoNum4();
        botaoNum5();
        botaoNum6();
        botaoNum7();
        botaoNum8();
        botaoNum9();
        botaoAC();
        botaoPorcen();
        caixaTextoOperacoes();
        setVisible(true);
    }

    // Este método serve para mudar o Icone do aplicativo que aparece na janela
    protected void iconeJanela() {
        ImageIcon img = new ImageIcon("C:\\Users\\lucas\\OneDrive\\Documentos\\" +
                "Calculadora gráfica com java\\out\\production\\Calculadora gráfica com java\\" +
                "\\resources\\Icone Calculadora em Java.png");

        this.setIconImage(img.getImage());
    }

    // Este método permite criar a janela da calculadora.
    protected void gerarTela() {
        // ***** Gerando a janela do aplicativo. *****

        // Tamanho da tela.
        setSize(330,535);
        // Entitulando
        setTitle("Calculadora");
        // Método para quando fechar a janela encerrar o programa.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Método para não deixar maximizar a tela
        setResizable(false);
        // Método para a janela aparecer no meio da tela ao iniciar.
        setLocationRelativeTo(null);
        // Muda a cor do fundo da tela para cinza.
        getContentPane().setBackground(new Color(23, 21, 23, 255));
        // Deixa livre a escolha da posição, tamanho e etc..
        setLayout(null);

    }

    // Este método permite adicionar o botão de igualdade.
    protected void botaoIgualdade() {
        // ***** Gerando um botão. *****

        // Criando um objeto JButton e nomeando diretamente pelo construtor.
        botao_igual = new JButton("=");
        // Coordenadas para adicionar na tela.
        botao_igual.setBounds(245,442,65,50);
        // Nome da fonte e tamanho da letra por uma classe.
        botao_igual.setFont(new Font("Arial",Font.PLAIN,40));
        // Cor dos characteres do botão.
        botao_igual.setForeground(new Color(255, 255, 255));
        // Cor do fundo do botão.
        botao_igual.setBackground(new Color(0x7807E5));
        // Adicionando ele na tela.
        add(botao_igual);

    }

    // Este método permite adicionar o botão de soma.
    protected void botaoSoma() {
        // ***** Gerando um botão. *****

        // Criando um objeto JButton e nomeando diretamente pelo construtor.
        botao_soma = new JButton("+");
        // Coordenadas para adicionar na tela.
        botao_soma.setBounds(245,385,65,50);
        // Nome da fonte e tamanho da letra através de uma classe.
        botao_soma.setFont(new Font("Arial",Font.PLAIN,40));
        // Cor dos characteres do botão.
        botao_soma.setForeground(new Color(255, 255, 255));
        // Cor do fundo do botão.
        botao_soma.setBackground(new Color(0x7807E5));
        // Adicionando ele na tela.
        add(botao_soma);
    }

    // Este método permite adicionar o botão de subtração.
    protected void botaoSubt() {
        // ***** Gerando um botão. *****

        // Criando um objeto JButton e nomeando diretamente pelo construtor.
        botao_subt = new JButton("-");
        // Coordenadas para adicionar na tela.
        botao_subt.setBounds(245,328,65,50);
        // Nome da fonte e tamanho da letra através de uma classe.
        botao_subt.setFont(new Font("Arial",Font.PLAIN,40));
        // Cor dos characteres do botão.
        botao_subt.setForeground(new Color(255, 255, 255));
        // Cor do fundo do botão.
        botao_subt.setBackground(new Color(0x7807E5));
        // Adicionando ele na tela.
        add(botao_subt);
    }

    // Este método permite adicionar o botão de multiplicação.
    protected void botaoMult() {
        // ***** Gerando um botão. *****

        // Criando um objeto JButton e nomeando diretamente pelo construtor.
        botao_mult = new JButton("x");
        // Coordenadas para adicionar na tela.
        botao_mult.setBounds(245,271,65,50);
        // Nome da fonte e tamanho da letra através de uma classe.
        botao_mult.setFont(new Font("Arial",Font.PLAIN,40));
        // Cor dos characteres do botão.
        botao_mult.setForeground(new Color(255, 255, 255));
        // Cor do fundo do botão.
        botao_mult.setBackground(new Color(0x7807E5));
        // Adicionando ele na tela.
        add(botao_mult);
    }

    // Este método permite adicionar o botão de divisão.
    protected void botaoDiv() {
        // ***** Gerando um botão. *****

        // Criando um objeto JButton e nomeando diretamente pelo construtor.
        botao_div = new JButton("/");
        // Coordenadas para adicionar na tela.
        botao_div.setBounds(245,214,65,50);
        // Nome da fonte e tamanho da letra através de uma classe.
        botao_div.setFont(new Font("Arial",Font.PLAIN,40));
        // Cor dos characteres do botão.
        botao_div.setForeground(new Color(255, 255, 255));
        // Cor do fundo do botão.
        botao_div.setBackground(new Color(0x7807E5));
        // Adicionando ele na tela.
        add(botao_div);
    }

    // Este método permite adicionar o botão de número 0.
    protected void botaoNum0() {
        // ***** Gerando um botão. *****

        // Criando um objeto JButton e nomeando diretamente pelo construtor.
        botao_0 = new JButton("0 ");
        // Coordenadas para adicionar na tela.
        botao_0.setBounds(5,442,145,50);
        // Nome da fonte e tamanho da letra através de uma classe.
        botao_0.setFont(new Font("Arial",Font.PLAIN,40));
        // Cor dos characteres do botão.
        botao_0.setForeground(new Color(255, 255, 255));
        // Cor do fundo do botão.
        botao_0.setBackground(new Color(0x171618));
        // Adicionando ele na tela.
        add(botao_0);
    }

    // Este método permite adicionar o botão de vírgula.
    protected void botaoVirgula() {
        // ***** Gerando um botão. *****

        // Criando um objeto JButton e nomeando diretamente pelo construtor.
        botao_virg = new JButton(",");
        // Coordenadas para adicionar na tela.
        botao_virg.setBounds(165,442,65,50);
        // Nome da fonte e tamanho da letra através de uma classe.
        botao_virg.setFont(new Font("Arial",Font.PLAIN,40));
        // Cor dos characteres do botão.
        botao_virg.setForeground(new Color(255, 255, 255));
        // Cor do fundo do botão.
        botao_virg.setBackground(new Color(0x171618));
        // Adicionando ele na tela.
        add(botao_virg);
    }

    // Este método permite adicionar o botão de número 1.
    protected void botaoNum1() {
        // ***** Gerando um botão. *****

        // Criando um objeto JButton e nomeando diretamente pelo construtor.
        botao_1 = new JButton("1");
        // Coordenadas para adicionar na tela.
        botao_1.setBounds(5,385,65,50);
        // Nome da fonte e tamanho da letra através de uma classe.
        botao_1.setFont(new Font("Arial",Font.PLAIN,40));
        // Cor dos characteres do botão.
        botao_1.setForeground(new Color(255, 255, 255));
        // Cor do fundo do botão.
        botao_1.setBackground(new Color(0x171618));
        // Adicionando ele na tela.
        add(botao_1);
    }

    // Este método permite adicionar o botão de número 2.
    protected void botaoNum2() {
        // ***** Gerando um botão. *****

        // Criando um objeto JButton e nomeando diretamente pelo construtor.
        botao_2 = new JButton("2");
        // Coordenadas para adicionar na tela.
        botao_2.setBounds(85,385,65,50);
        // Nome da fonte e tamanho da letra através de uma classe.
        botao_2.setFont(new Font("Arial",Font.PLAIN,40));
        // Cor dos characteres do botão.
        botao_2.setForeground(new Color(255, 255, 255));
        // Cor do fundo do botão.
        botao_2.setBackground(new Color(0x171618));
        // Adicionando ele na tela.
        add(botao_2);
    }

    // Este método permite adicionar o botão de número 3.
    protected void botaoNum3() {
        // ***** Gerando um botão. *****

        // Criando um objeto JButton e nomeando diretamente pelo construtor.
        botao_3 = new JButton("3");
        // Coordenadas para adicionar na tela.
        botao_3.setBounds(165,385,65,50);
        // Nome da fonte e tamanho da letra através de uma classe.
        botao_3.setFont(new Font("Arial",Font.PLAIN,40));
        // Cor dos characteres do botão.
        botao_3.setForeground(new Color(255, 255, 255));
        // Cor do fundo do botão.
        botao_3.setBackground(new Color(0x171618));
        // Adicionando ele na tela.
        add(botao_3);
    }

    // Este método permite adicionar o botão de número 4.
    protected void botaoNum4() {
        // ***** Gerando um botão. *****

        // Criando um objeto JButton e nomeando diretamente pelo construtor.
        botao_4 = new JButton("4");
        // Coordenadas para adicionar na tela.
        botao_4.setBounds(5,328,65,50);
        // Nome da fonte e tamanho da letra através de uma classe.
        botao_4.setFont(new Font("Arial",Font.PLAIN,40));
        // Cor dos characteres do botão.
        botao_4.setForeground(new Color(255, 255, 255));
        // Cor do fundo do botão.
        botao_4.setBackground(new Color(0x171618));
        // Adicionando ele na tela.
        add(botao_4);
    }

    // Este método permite adicionar o botão de número 5.
    protected void botaoNum5() {
        // ***** Gerando um botão. *****

        // Criando um objeto JButton e nomeando diretamente pelo construtor.
        botao_5 = new JButton("5");
        // Coordenadas para adicionar na tela.
        botao_5.setBounds(85,328,65,50);
        // Nome da fonte e tamanho da letra através de uma classe.
        botao_5.setFont(new Font("Arial",Font.PLAIN,40));
        // Cor dos characteres do botão.
        botao_5.setForeground(new Color(255, 255, 255));
        // Cor do fundo do botão.
        botao_5.setBackground(new Color(0x171618));
        // Adicionando ele na tela.
        add(botao_5);
    }

    // Este método permite adicionar o botão de número 6.
    protected void botaoNum6() {
        // ***** Gerando um botão. *****

        // Criando um objeto JButton e nomeando diretamente pelo construtor.
        botao_6 = new JButton("6");
        // Coordenadas para adicionar na tela.
        botao_6.setBounds(165,328,65,50);
        // Nome da fonte e tamanho da letra através de uma classe.
        botao_6.setFont(new Font("Arial",Font.PLAIN,40));
        // Cor dos characteres do botão.
        botao_6.setForeground(new Color(255, 255, 255));
        // Cor do fundo do botão.
        botao_6.setBackground(new Color(0x171618));
        // Adicionando ele na tela.
        add(botao_6);
    }

    // Este método permite adicionar o botão de número 7.
    protected void botaoNum7() {
        // ***** Gerando um botão. *****

        // Criando um objeto JButton e nomeando diretamente pelo construtor.
        botao_7 = new JButton("7");
        // Coordenadas para adicionar na tela.
        botao_7.setBounds(5,271,65,50);
        // Nome da fonte e tamanho da letra através de uma classe.
        botao_7.setFont(new Font("Arial",Font.PLAIN,40));
        // Cor dos characteres do botão.
        botao_7.setForeground(new Color(255, 255, 255));
        // Cor do fundo do botão.
        botao_7.setBackground(new Color(0x171618));
        // Adicionando ele na tela.
        add(botao_7);
    }

    // Este método permite adicionar o botão de número 8.
    protected void botaoNum8() {
        // ***** Gerando um botão. *****

        // Criando um objeto JButton e nomeando diretamente pelo construtor.
        botao_8 = new JButton("8");
        // Coordenadas para adicionar na tela.
        botao_8.setBounds(85,271,65,50);
        // Nome da fonte e tamanho da letra através de uma classe.
        botao_8.setFont(new Font("Arial",Font.PLAIN,40));
        // Cor dos characteres do botão.
        botao_8.setForeground(new Color(255, 255, 255));
        // Cor do fundo do botão.
        botao_8.setBackground(new Color(0x171618));
        // Adicionando ele na tela.
        add(botao_8);
    }

    // Este método permite adicionar o botão de número 9.
    protected void botaoNum9() {
        // ***** Gerando um botão. *****

        // Criando um objeto JButton e nomeando diretamente pelo construtor.
        botao_9 = new JButton("9");
        // Coordenadas para adicionar na tela.
        botao_9.setBounds(165,271,65,50);
        // Nome da fonte e tamanho da letra através de uma classe.
        botao_9.setFont(new Font("Arial",Font.PLAIN,40));
        // Cor dos characteres do botão.
        botao_9.setForeground(new Color(255, 255, 255));
        // Cor do fundo do botão.
        botao_9.setBackground(new Color(0x171618));
        // Adicionando ele na tela.
        add(botao_9);
    }

    // Este método permite adicionar o botão de AC (limpar).
    protected void botaoAC() {
        // ***** Gerando um botão. *****

        // Criando um objeto JButton e nomeando diretamente pelo construtor.
        botao_ac = new JButton("AC");
        // Coordenadas para adicionar na tela.
        botao_ac.setBounds(5,214,145,50);
        // Nome da fonte e tamanho da letra através de uma classe.
        botao_ac.setFont(new Font("Arial",Font.PLAIN,40));
        // Cor dos characteres do botão.
        botao_ac.setForeground(new Color(255, 255, 255));
        // Cor do fundo do botão.
        botao_ac.setBackground(new Color(0x7807E5));
        // Adicionando ele na tela.
        add(botao_ac);
    }

    // Este método permite adicionar o botão de porcentagem.
    protected void botaoPorcen() {
        // ***** Gerando um botão. *****

        // Criando um objeto JButton e nomeando diretamente pelo construtor.
        botao_porcen = new JButton("%");
        // Coordenadas para adicionar na tela.
        botao_porcen.setBounds(165,214,65,50);
        // Nome da fonte e tamanho da letra através de uma classe.
        botao_porcen.setFont(new Font("Arial",Font.PLAIN,35));
        // Cor dos characteres do botão.
        botao_porcen.setForeground(new Color(255, 255, 255));
        // Cor do fundo do botão.
        botao_porcen.setBackground(new Color(0x7807E5));
        // Adicionando ele na tela.
        add(botao_porcen);
    }

    // Este método permite adicionar a caixa de texto que mostra as operações.
    protected void caixaTextoOperacoes() {
        // ***** Gerando a caixa de texto das operações. *****

        // Instancia o obejto localmente.
        caixa_operacoes = new JTextField();
        // Coordenadas dessa caixa de texto.
        caixa_operacoes.setBounds(10,50,300,100);
        // Fonte e tamanho da letra.
        caixa_operacoes.setFont(new Font("Arial",Font.ITALIC,45));
        // Cor do texto
        caixa_operacoes.setForeground(Color.WHITE); // Texto em branco
        // Cor de fundo
        caixa_operacoes.setBackground(new Color(0x2A2626));
        // Método para o usuário não interagir com a caixa de texto.
        caixa_operacoes.setEditable(false);
        // Adiciona o objeto.
        add(caixa_operacoes);
    }

}