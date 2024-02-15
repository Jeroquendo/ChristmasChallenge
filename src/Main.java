import gui.ChristmasGUI;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Main {
    public static void main(String[] args) {
        int min = 1;
        int max = 4;
        int randomIcon = (int)Math.floor(Math.random() * (max - min+1) + min);

        int iconMatrix[][]= new int[4][4];

//        for (int r=0; r<4; r++) {
//            for( int c=0; c<4; c++) {
//                iconMatrix[r][c] = (int)Math.floor(Math.random() * (max - min+1) + min);
//                System.out.print(iconMatrix[r][c]);
//            }
//            System.out.print("\n");
//        }

        ChristmasGUI app = new ChristmasGUI();
        app.setVisible(true);
        app.setLocationRelativeTo(null);
        app.setTitle("Agenda Electronica APP");
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setSize(500, 450);

//        System.out.println("Matriz creada"+ iconMatrix);
    }
}