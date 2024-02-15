package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChristmasGUI extends JFrame {
    private JPanel panel;
    public JLabel title;
    private JComboBox iconsComboBox;
    private JPanel panel2;
    private JTextField numberTries;
    private JButton selectBtn;
    private int min = 1;
    private int max = 4;
    private int iconMatrix[][]= new int[4][4];

    public ChristmasGUI() {
        setContentPane(panel);

        for (int r=0; r<4; r++) {
            for( int c=0; c<4; c++) {
                iconMatrix[r][c] = (int)Math.floor(Math.random() * (max - min+1) + min);
                System.out.print(iconMatrix[r][c]);
            }
            System.out.print("\n");
        }

        DefaultComboBoxModel iconsComboBoxModel = new DefaultComboBoxModel();
        iconsComboBox.setModel(iconsComboBoxModel);
        iconsComboBoxModel.addElement('1');
        iconsComboBoxModel.addElement('2');
        iconsComboBoxModel.addElement('3');
        iconsComboBoxModel.addElement('4');
        selectBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedIcon = Integer.parseInt(iconsComboBoxModel.getSelectedItem().toString());
                int guessNumber = Integer.parseInt(numberTries.getText());

                int quantity = 0;
                for (int r=0; r<4; r++) {
                    for( int c=0; c<4; c++) {
                        if(iconMatrix[r][c] == selectedIcon) {
                            quantity++;
                        }
                    }
                }
                if (quantity == guessNumber) {
                    JOptionPane.showMessageDialog(null, "Has adivinado correctamente");
                }else {
                    JOptionPane.showMessageDialog(null, "Sigue intentando");
                }

            }
        });
    }
}
