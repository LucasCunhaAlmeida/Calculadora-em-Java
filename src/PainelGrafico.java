import javax.swing.*;
import java.awt.*;

public class PainelGrafico extends JFrame{

    // ****** Objetos Globais. *****

    // Botão da igualdade.
    JButton botao_igual;
    // Caixa de texto.
    JTextField caixa_operacoes;
    JLabel titulo;

    //Construtor
    public PainelGrafico(){

        gerarTela();
        botaoIgualdade();
        //botao_igual.addActionListener(this::Processar);// Esse está chamando o método "acao1"

        JLabel num1 = new JLabel("Número 1");
        num1.setBounds(10,200,300,50);
        num1.setFont(new Font("Arial",Font.PLAIN,20));

        add(num1);

        JLabel num2 = new JLabel("Número 2");
        num2.setBounds(10,300,300,50);
        num2.setFont(new Font("Arial",Font.PLAIN,20));

        add(num2);

        titulo = new JLabel("");
        titulo.setBounds(50,50,700,200);
        titulo.setFont(new Font("Arial", Font.PLAIN, 30));

        add(titulo);
        setVisible(true);

    }

    // Este método serve para criar a janela da calculadora.
    private void gerarTela() {
        // ***** Gerando a janela do aplicativo. *****

        // Tamanho da tela.
        setSize(335,535);
        // Entitulando
        setTitle("Calculadora Java");
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

    // Este método serve para adicionar o botão de igualdade.
    private void botaoIgualdade() {
        // ***** Gerando um botão. *****

        // Criando um objeto JButton e nomeando diretamente pelo construtor.
        botao_igual = new JButton("=");
        // Coordenadas para adicionar na tela.
        botao_igual.setBounds(250,250,100,50);
        // Nome da fonte e tamanho da letra através de uma classe.
        botao_igual.setFont(new Font("Arial",Font.ITALIC,30));
        // Cor dos characteres do botão.
        botao_igual.setForeground(new Color(255, 255, 255));
        // Cor do fundo do botão.
        botao_igual.setBackground(new Color(0x2A2626));
        // Adicionando ele na tela.
        add(botao_igual);

    }

    // Este método serve para adicionar a caixa de texto que mostra as operações
    private void caixaTextoOperacoes() {
        // ***** Gerando a caixa de texto das operações. *****

        // Instancia o obejto localmente.
        caixa_operacoes = new JTextField();
        // Coordenadas dessa caixa de texto.
        caixa_operacoes.setBounds(100,200,100,50);
        // Fonte e tamanho da letra.
        caixa_operacoes.setFont(new Font("Arial",Font.ITALIC,30));
        // Método para o usuário não interagir com a caixa de texto.
        caixa_operacoes.setEditable(false);
        // Adiciona o objeto.
        add(caixa_operacoes);
    }

}
