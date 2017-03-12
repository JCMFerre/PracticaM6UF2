package practicam6uf2;

import vista.LoginPrincipalGUI;

public class PracticaM6UF2 {

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPrincipalGUI().setVisible(true);
            }
        });
    }

}
