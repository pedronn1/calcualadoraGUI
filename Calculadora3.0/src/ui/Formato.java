package ui;

import modelo.Calculadora;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Formato {
    public JPanel JavaCalculator;
    private JTextField textDisplay;
    private JButton btSete;
    private JButton btOito;
    private JButton btCinco;
    private JButton btDois;
    private JButton btQuatro;
    private JButton btUm;
    private JButton btNove;
    private JButton btDivide;
    private JButton btSeis;
    private JButton btMultiplica;
    private JButton btTres;
    private JButton btMenos;
    private JButton btIgual;
    private JButton btMais;
    private JButton btZero;
    private JButton btClear;

    public Formato() {

        Calculadora calculadora = new Calculadora();

        btSete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btSeteText = textDisplay.getText() + btSete.getText();
                textDisplay.setText(btSeteText);
            }
        });
        btOito.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btOitoText = textDisplay.getText() + btOito.getText();
                textDisplay.setText(btOitoText);
            }
        });
        btNove.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btNoveText = textDisplay.getText() + btNove.getText();
                textDisplay.setText(btNoveText);
            }
        });
        btQuatro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btQuatroText = textDisplay.getText() + btQuatro.getText();
                textDisplay.setText(btQuatroText);
            }
        });
        btCinco.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btCincoText = textDisplay.getText() + btCinco.getText();
                textDisplay.setText(btCincoText);
            }
        });
        btSeis.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btSeisText = textDisplay.getText() + btSeis.getText();
                textDisplay.setText(btSeisText);
            }
        });
        btUm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btUmText = textDisplay.getText() + btUm.getText();
                textDisplay.setText(btUmText);
            }
        });
        btDois.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btDoisText = textDisplay.getText() + btDois.getText();
                textDisplay.setText(btDoisText);
            }
        });
        btTres.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btTresText = textDisplay.getText() + btTres.getText();
                textDisplay.setText(btTresText);
            }
        });
        btZero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btZeroText = textDisplay.getText() + btZero.getText();
                textDisplay.setText(btZeroText);
            }
        });
        btMais.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculadora.setOperador1(Double.parseDouble(textDisplay.getText()));
                calculadora.setOperacao(Calculadora.OPERACAO.ADICAO);
                textDisplay.setText("");

            }
        });
        btClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculadora.setOperador1(0);
                calculadora.setOperador2(0);
                textDisplay.setText("");
            }
        });
        btIgual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculadora.setOperador2(Double.parseDouble(textDisplay.getText()));
                textDisplay.setText(String.valueOf(calculadora.calcular()));
            }
        });
        btMenos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculadora.setOperador1(Double.parseDouble(textDisplay.getText()));
                calculadora.setOperacao(Calculadora.OPERACAO.SUBTRACAO);
                textDisplay.setText("");
            }
        });
        btMultiplica.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculadora.setOperador1(Double.parseDouble(textDisplay.getText()));
                calculadora.setOperacao(Calculadora.OPERACAO.MULTIPLICACAO);
                textDisplay.setText("");
            }
        });
        btDivide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculadora.setOperador1(Double.parseDouble(textDisplay.getText()));
                calculadora.setOperacao(Calculadora.OPERACAO.DIVISAO);
                textDisplay.setText("");
            }
        });
    }

}
