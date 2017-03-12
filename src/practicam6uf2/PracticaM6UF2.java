package practicam6uf2;

public class PracticaM6UF2 {

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new vista.IniciSessioGUI().setVisible(true);
            }
        });
    }

}
