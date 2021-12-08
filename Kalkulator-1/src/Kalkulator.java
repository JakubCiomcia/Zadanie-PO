import javax.swing.*;
import java.awt.event.ActionListener;

public class Kalkulator extends JFrame {
    private JPanel panelTop;
    private JRadioButton prostokątRadioButton;
    private JRadioButton kwadratRadioButton;
    private JRadioButton trójkątRadioButton;
    private JRadioButton trapezRadioButton;
    private JRadioButton sześcianRadioButton;
    private JRadioButton prostopadłościanRadioButton;
    private JRadioButton walecRadioButton;
    private JRadioButton kulaRadioButton;
    private JTextField textA;
    private JTextField textB;
    private JTextField textH;
    private JTextField textR;
    private JTextField textPole;
    private JTextField textObwód;
    private JTextField textObjętość;
    private JLabel Obwód;
    private JButton obliczButton;
    private JButton wyczyśćButton;
    private JPanel panelBottom;
    private JPanel panelMiddle;
    private JPanel mainPanel;

    public static void main(String[] args) {
        Kalkulator kal = new Kalkulator();
        kal.setVisible(true);
    }

    private void clearRadioButton() {
        if (prostokątRadioButton.isSelected()) prostokątRadioButton.setSelected(false);
        if (kwadratRadioButton.isSelected()) kwadratRadioButton.setSelected(false);
        if (trójkątRadioButton.isSelected()) trójkątRadioButton.setSelected(false);
        if (trapezRadioButton.isSelected()) trapezRadioButton.setSelected(false);
        if (sześcianRadioButton.isSelected()) sześcianRadioButton.setSelected(false);
        if (prostopadłościanRadioButton.isSelected()) prostopadłościanRadioButton.setSelected(false);
        if (walecRadioButton.isSelected()) walecRadioButton.setSelected(false);
        if (kulaRadioButton.isSelected()) kulaRadioButton.setSelected(false);
    }

    private void clearText() {
        textA.setText("");
        textB.setText("");
        textH.setText("");
        textR.setText("");
        textPole.setText("");
        textObwód.setText("");
        textObjętość.setText("");
        textR.setText("");
    }

    private void disableTextField() {
        textA.setEnabled(false);
        textB.setEnabled(false);
        textH.setEnabled(false);
        textR.setEnabled(false);
        textPole.setEnabled(false);
        textObwód.setEnabled(false);
        textObjętość.setEnabled(false);
        textR.setEnabled(false);
    }

    private void KalkuatorKwadrat() {
        try {
            double a = Double.parseDouble(textA.getText());
            if (a > 0) {
                double pole = a * a;
                double obw = a * 4;
                textPole.setText(String.valueOf(pole));
                textObwód.setText(String.valueOf(Obwód));
            } else {
                textPole.setText("error");
                textObwód.setText("error");
            }
        } catch (Exception e) {
            System.out.println(e.toString());
            textPole.setText("error");
            textObwód.setText("error");
        }


    }

    private void KalkulatorKula() {
        try {
            double promien = Double.parseDouble(textR.getText());
            if (promien > 0) {
                double pole = 4 * Math.PI * Math.pow(promien, 2);
                double objętość = 4.0 / 3.0 * Math.PI * Math.pow(promien, 3);
                textPole.setText(String.valueOf(pole));
                textObjętość.setText(String.valueOf(objętość));
            } else {
                textPole.setText("error");
                textObwód.setText("error");
            }
        } catch (Exception e) {
            System.out.println(e.toString());
            textPole.setText("error");
            textObwód.setText("error");
        }
    }

    private void KalkulatorProstopadłościan() {
        try {
            double a = Double.parseDouble(textA.getText());
            double b = Double.parseDouble(textB.getText());
            double h = Double.parseDouble(textH.getText());
            if (a > 0 && b > 0 && h > 0) {
                double pole = (2 * a * b) + (2 * b * h) + (2 * a * h);
                double objętość = a * b * h;
                textPole.setText(String.valueOf(pole));
                textObjętość.setText(String.valueOf(objętość));

            } else {
                textPole.setText("error");
                textObjętość.setText("error");
            }
        } catch (Exception e) {
            System.out.println(e.toString());
            textPole.setText("error");
            textObjętość.setText("error");
        }
    }

    private void KalkulatorProstokąt() {
        try {
            double a = Double.parseDouble(textA.getText());
            double b = Double.parseDouble(textB.getText());
            if (a > 0 && b > 0) {
                double pole = a * b;
                double obwód = (2 * a) + (2 * b);
                textPole.setText(String.valueOf(pole));
                textObwód.setText(String.valueOf(obwód));
            } else {
                textPole.setText("error");
                textObwód.setText("error");
            }
        } catch (Exception e) {
            System.out.println(e.toString());
            textPole.setText("error");
            textObwód.setText("error");
        }
    }

    private void KalkulatorTrójkąt() {
        try {
            double a = Double.parseDouble(textA.getText());
            double h = Double.parseDouble(textH.getText());
            if (a > 0 && h > 0) {
                double pole = 1.0 / 2.0 * a * h;
                textPole.setText(String.valueOf(pole));
            } else {
                textPole.setText("error");
            }
        } catch (Exception e) {
            System.out.println(e.toString());
            textPole.setText("error");
        }
    }

    private void KalkulatorTrapez() {
        try {
            double a = Double.parseDouble(textA.getText());
            double b = Double.parseDouble(textB.getText());
            double h = Double.parseDouble(textH.getText());
            if (a > 0 && b > 0 && h > 0) {
                double pole = 1.0 / 2.0 * (a + b) * h;
                textPole.setText(String.valueOf(pole));
            } else {
                textPole.setText("error");
            }
        } catch (Exception e) {
            System.out.println(e.toString());
            textPole.setText("error");
        }
    }

    private void KalklulatorSześcian() {
        try {
            double a = Double.parseDouble(textA.getText());
            if (a > 0) {
                double pole = a * a * 6;
                double objętość = a * a * a;
                textPole.setText(String.valueOf(pole));
                textObjętość.setText(String.valueOf(pole));
            } else {
                textPole.setText("error");
                textObjętość.setText("error");
            }
        } catch (Exception e) {
            System.out.println(e.toString());
            textPole.setText("error");
            textObjętość.setText("error");
        }
    }

    private void KalkulatorWalec() {
        try {
            double promien = Double.parseDouble(textR.getText());
            double h = Double.parseDouble(textH.getText());
            if (promien > 0 && h > 0) {
                double pole = 2 * Math.PI * Math.pow(promien, 2) + 2 * Math.PI * promien * h;
                double objętość = h * Math.PI * Math.pow(promien, 2);
                textPole.setText(String.valueOf(pole));
                textObjętość.setText(String.valueOf(objętość));
            } else {
                textPole.setText("error");
                textObjętość.setText("error");
            }
        } catch (Exception e) {
            System.out.println(e.toString());
            textPole.setText("error");
            textObjętość.setText("error");
        }
    }

    public Kalkulator() {
        super("Figury geometryczne - kalkulator");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
        this.setLayout(null);

        ActionListener listener = e -> {
            Object ob1 = e.getSource();

            if (ob1 == kwadratRadioButton) {
                clearRadioButton();
                disableTextField();
                kwadratRadioButton.setSelected(true);
                textA.setEnabled(true);

            } else if (ob1 == prostokątRadioButton) {
                clearRadioButton();
                disableTextField();
                prostokątRadioButton.setSelected(true);
                textA.setEnabled(true);
                textB.setEnabled(true);

            } else if (ob1 == trójkątRadioButton) {
                clearRadioButton();
                disableTextField();
                trójkątRadioButton.setSelected(true);
                textA.setEnabled(true);
                textH.setEnabled(true);

            } else if (ob1 == trapezRadioButton) {
                clearRadioButton();
                disableTextField();
                trapezRadioButton.setSelected(true);
                textA.setEnabled(true);
                textB.setEnabled(true);
                textH.setEnabled(true);

            } else if (ob1 == sześcianRadioButton) {
                clearRadioButton();
                disableTextField();
                sześcianRadioButton.setSelected(true);
                textA.setEnabled(true);

            } else if (ob1 == prostopadłościanRadioButton) {
                clearRadioButton();
                disableTextField();
                prostopadłościanRadioButton.setSelected(true);
                textA.setEnabled(true);
                textB.setEnabled(true);
                textH.setEnabled(true);

            } else if (ob1 == walecRadioButton) {
                clearRadioButton();
                disableTextField();
                walecRadioButton.setSelected(true);
                textR.setEnabled(true);
                textH.setEnabled(true);

            } else if (ob1 == kulaRadioButton) {
                clearRadioButton();
                disableTextField();
                kulaRadioButton.setSelected(true);
                textR.setEnabled(true);

            } else if (ob1 == obliczButton) {
                if (kwadratRadioButton.isSelected() || prostokątRadioButton.isSelected()) {
                    textPole.setEnabled(true);
                    textObwód.setEnabled(true);
                } else if (sześcianRadioButton.isSelected() || prostopadłościanRadioButton.isSelected()) {
                    textPole.setEnabled(true);
                    textObwód.setEnabled(true);
                } else if (trapezRadioButton.isSelected() || trójkątRadioButton.isSelected() || walecRadioButton.isSelected() || kulaRadioButton.isSelected()) {
                    textPole.setEnabled(true);
                }

                if (kwadratRadioButton.isSelected()) KalkuatorKwadrat();
                else if (prostokątRadioButton.isSelected()) KalkulatorProstokąt();
                else if (trójkątRadioButton.isSelected()) KalkulatorTrójkąt();
                else if (trapezRadioButton.isSelected()) KalkulatorTrójkąt();
                else if (sześcianRadioButton.isSelected()) KalklulatorSześcian();
                else if (prostopadłościanRadioButton.isSelected()) KalkulatorProstopadłościan();
                else if (walecRadioButton.isSelected()) KalkulatorWalec();
                else if (kulaRadioButton.isSelected()) KalkulatorKula();

            } else if (ob1 == wyczyśćButton) {
                clearRadioButton();
                clearText();
                disableTextField();
            }
        };

        kwadratRadioButton.addActionListener(listener);
        prostokątRadioButton.addActionListener(listener);
        trójkątRadioButton.addActionListener(listener);
        trapezRadioButton.addActionListener(listener);
        sześcianRadioButton.addActionListener(listener);
        prostopadłościanRadioButton.addActionListener(listener);
        walecRadioButton.addActionListener(listener);
        kulaRadioButton.addActionListener(listener);

    }
}

