package model;

public final class Info {

    public static final String CONEXIO_INTERNA = "INTERNA";
    public static final String CONEXIO_EXTERNA = "EXTERNA";

    public static final String TAULA_USUARI = "M6_UF2_USUARIS";
    public static final String USUARI_KEY_NOM = "NOM_USUARI";
    public static final String USUARI_KEY_CONTRASENA = "CONTRASENA_USUARI";

    public static final String TAULA_CLIENT = "M6_UF2_CLIENTS";
    public static final String CLIENT_KEY_ID = "ID_CLIENT";
    public static final String CLIENT_KEY_NIF = "NIF_CLIENT";
    public static final String CLIENT_KEY_NOM = "nomClient";
    public static final String CLIENT_KEY_ADRECA = "ADRECA_CLIENT";
    public static final String NOMBRE_QUERY_CLIENT_BUSCAR = "buscarClientPerNom";
    public static final String QUERY_CLIENT_NOMBRE = "SELECT c FROM Client c WHERE c.nom=:nom";
    public static final String PARAMETRO_QUERY_CLIENT_NOMBRE = "nom";

    public static final String ADRECA_KEY_CARRER = "CARRER_ADRECA";
    public static final String ADRECA_KEY_NUMERO = "NUMERO_ADRECA";
    public static final String ADRECA_KEY_POBLACIO = "POBLACIO_ADRECA";

}
