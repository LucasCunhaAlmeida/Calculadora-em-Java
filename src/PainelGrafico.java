import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class PainelGrafico extends JFrame{

    // ****** Objetos Globais. *****

    // Botão da igualdade.
    JButton botao_igual;
    // Caixa de texto.
    JTextField text1;
    JTextField text2;
    JLabel titulo;

    //Construtor
    public PainelGrafico(){

        gerarTela();
        botaoIgualdade();
        //botao_igual.addActionListener(this::Processar);// Esse está chamando o método "acao1"



        //Caixa de texto
        text2 = new JTextField();
        text2.setBounds(100,300,100,50);
        text2.setFont(new Font("Arial",Font.ITALIC,30));

        add(text2);

        JLabel num1 = new JLabel("Número 1");
        num1.setBounds(10,200,300,50);
        num1.setFont(new Font("Arial",Font.PLAIN,20));

        add(num1);

        JLabel num2 = new JLabel("Número 2");
        num2.setBounds(10,300,300,50);
        num2.setFont(new Font("Arial",Font.PLAIN,20));

        add(num2);

        titulo = new JLabel("SOMADOR PARA LOREZINHA");
        titulo.setBounds(50,50,700,200);
        titulo.setFont(new Font("Arial", Font.PLAIN, 30));

        add(titulo);
        setVisible(true);

    }

    private void gerarTela() {
        // ***** Gerando a janela do aplicativo. *****

        // Tamanho da tela.
        setSize(335,535);
        // Entitulando
        setTitle("Calculadora Java");
        // Configuração para quando fechar a janela encerrar o programa.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Configuração para não deixar maximizar a tela
        setResizable(false);
        // Configuração para a janela aparecer no meio da tela ao iniciar.
        setLocationRelativeTo(null);
        // Muda a cor do fundo da tela para cinza.
        getContentPane().setBackground(new Color(23, 21, 23, 255));
        //
        setLayout(null);
    }

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

    private void caixaTextoOperacoes() {
        // ***** Gerando um botão. *****
        
        text1 = new JTextField();
        text1.setBounds(100,200,100,50);
        text1.setFont(new Font("Arial",Font.ITALIC,30));
        text1.setEditable(false);
        add(text1);
    }

    //Este é um método para dar alguma ação ao botões
    private void Processar(ActionEvent actionEvent) {

        Float numero1 = Float.parseFloat(text1.getText());
        Float numero2 = Float.parseFloat(text2.getText());


        float soma = numero1 + numero2;

        titulo.setText("A soma é "+ soma);
        /*JOptionPane.showMessageDialog(null,"A soma é: " + soma, "Confirmado!",
                JOptionPane.INFORMATION_MESSAGE);*/
    }
}
