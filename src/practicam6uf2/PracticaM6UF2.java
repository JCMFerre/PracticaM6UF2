package practicam6uf2;

import controlador.UsuariControlador;
import model.Usuari;

public class PracticaM6UF2 {

    public static void main(String[] args) {
        Usuari usuario = new Usuari("Joan", "Contrasena");
        UsuariControlador controlador = new UsuariControlador();
        if (controlador.validarSesio(usuario)){
            System.out.println("Si que existe el usuario.");
        } else{
            System.out.println("No existe el usuario.");
            System.out.println("Añadiendo usuario...");
            controlador.insertarUsuari(usuario);
            System.out.println("Usuario añadido.");
        }
    }

}
