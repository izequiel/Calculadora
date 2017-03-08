
package calculadora;
import javax.swing.*;
import java.awt.event.*;
import java.math.*;

public class Calculadora extends JFrame {
    private JButton numero1;
    private JButton numero2;
    private JButton numero3;
    private JButton numero4;
    private JButton numero5;
    private JButton numero6;
    private JButton numero7;
    private JButton numero8;
    private JButton numero9;
    private JButton somar;
    private JButton subtrair;
    private JButton multiplicar;
    private JButton dividir;
    private JButton raiz;
    private JButton igual;
    private JButton limpar;
    private JTextField display;
    private double leitura;
    private double memoria;
    private char operacao;
    
    public Calculadora() {
        this.setTitle("Exemplo Calculadora");
        this.setBounds(0, 0, 400, 400);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.getContentPane().setLayout(null);

        leitura = 0;
        memoria = 0;

        somar = new JButton();
        somar.setText("+");
        somar.setBounds(270, 70, 100, 50);
        this.add(somar);
        
        subtrair = new JButton();
        subtrair.setText("-");
        subtrair.setBounds(270, 125, 100, 50);
        this.add(subtrair);
        
        multiplicar = new JButton();
        multiplicar.setText("x");
        multiplicar.setBounds(270, 180, 100, 50);
        this.add(multiplicar);
        
        dividir = new JButton();
        dividir.setText("/");
        dividir.setBounds(270, 235, 100, 50);
        this.add(dividir);
        
        raiz = new JButton();
        raiz.setText("R");
        raiz.setBounds(270, 290, 100, 50);
        this.add(raiz);
        
        igual = new JButton();
        igual.setText("=");
        igual.setBounds(115, 290, 80, 50);
        this.add(igual);
        
        limpar = new JButton();
        limpar.setText("C");
        limpar.setBounds(25, 290, 80, 50);
        this.add(limpar);

        numero1 = new JButton();
        numero1.setText("1");
        numero1.setBounds(25, 70, 50, 50);
        this.add(numero1);

        numero2 = new JButton();
        numero2.setText("2");
        numero2.setBounds(85, 70, 50, 50);
        this.add(numero2);
        
        numero3 = new JButton();
        numero3.setText("3");
        numero3.setBounds(145,70, 50, 50);
        this.add(numero3);
        
        numero4 = new JButton();
        numero4.setText("4");
        numero4.setBounds(25, 135, 50, 50);
        this.add(numero4);

        numero5 = new JButton();
        numero5.setText("5");
        numero5.setBounds(85, 135, 50, 50);
        this.add(numero5);
        
        numero6 = new JButton();
        numero6.setText("6");
        numero6.setBounds(145,135, 50, 50);
        this.add(numero6);
        
        numero7 = new JButton();
        numero7.setText("7");
        numero7.setBounds(25, 200, 50, 50);
        this.add(numero7);

        numero8 = new JButton();
        numero8.setText("8");
        numero8.setBounds(85, 200, 50, 50);
        this.add(numero8);
        
        numero9 = new JButton();
        numero9.setText("9");
        numero9.setBounds(145,200, 50, 50);
        this.add(numero9);

        display = new JTextField();
        display.setBounds(25, 25, 200, 30);
        this.add(display);

        numero1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                //leitura *= 10;
                leitura += 1;
                display.setText(display.getText() + "1");
            }
        });

        numero2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                leitura *= 10;
                leitura += 2;
                display.setText(display.getText() + "2");
            }
        });
        
        numero3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                leitura *= 10;
                leitura += 3;
                display.setText(display.getText() + "3");
            }
        });
        
        numero4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                leitura *= 10;
                leitura += 4;
                display.setText(display.getText() + "4");
            }
        });

        somar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                operacao = '+';
                memoria += leitura;
                leitura = 0;
                display.setText("");
            }
        });
        
        subtrair.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                operacao = '-';
                memoria -= leitura;
                leitura = 0;
                display.setText("");
            }
        });

        igual.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                switch (operacao) {
                    case '+': {
                        memoria += leitura;
                        break;
                    }
                }
                leitura = 0;
                display.setText("" + memoria);
            }
        });
    
        raiz.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                switch (operacao) {
                    case 'R': {
                        memoria += Math.sqrt(leitura);
                        break;
                    }
                }
                leitura = 0;
                display.setText("" + memoria);
            }
        });
        
        limpar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                switch (operacao) {
                    case 'C': {
                        memoria = 0;
                        leitura = 0;
                    }
                }
                leitura = 0;
                display.setText("" + memoria);
            }
        });
        
    }
    
    
    public static void main(String[] args) {
        Calculadora exemplo = new Calculadora();
        exemplo.setVisible(true);
    }
    
}
