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

    public static final String TAULA_VEHICLE = "VEHICLES";
    public static final String VEHICLE_KEY_ID = "ID_VEHICLE";
    public static final String VEHICLE_KEY_MATRICULA = "MATRICULA_VEHICLE";
    public static final String VEHICLE_KEY_MARCA_MODEL = "MARCA_MODEL_VEHICLE";
    public static final String VEHICLE_KEY_ANY_FABRICACIO = "ANY_FABRICACIO_VEHICLE";
    public static final String VEHICLE_KEY_PROPIETARI = "PROPIETARI_VEHICLE";
    public static final String INDEX_MATRICULA_VEHICLE = "INDEX_MATRICULA";

    public static final String TAULA_ASSEGURADORA = "M6_UF2_ASSEGURADORES";
    public static final String ASSEGURADORA_KEY_ID = "ID_ASSEGURADORA";
    public static final String ASSEGURADORA_KEY_CIF = "CIF_ASSEGURADORA";
    public static final String ASSEGURADORA_KEY_NOM = "NOM_ASSEGURADORA";

}
