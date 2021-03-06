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
    public static final String QUERY_TODOS_LOS_CLIENTES = "todosLosClientes";
    public static final String QUERY_CLIENT_TODOS = "SELECT c FROM Client c";

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
    public static final String NOMBRE_QUERY_VEHICLE_BUSCAR = "buscarVehiclePerMatricula";
    public static final String QUERY_VEHICLE_MATRICULA = "SELECT v FROM Vehicle v WHERE v.matricula=:matricula";
    public static final String PARAMETRO_QUERY_VEHICLE_MATRICULA = "matricula";
    public static final String QUERY_VEHICLES_TODOS = "SELECT v FROM Vehicle v";

    public static final String TAULA_ASSEGURADORA = "M6_UF2_ASSEGURADORES";
    public static final String ASSEGURADORA_KEY_ID = "ID_ASSEGURADORA";
    public static final String ASSEGURADORA_KEY_CIF = "CIF_ASSEGURADORA";
    public static final String ASSEGURADORA_KEY_NOM = "NOM_ASSEGURADORA";
    public static final String NOMBRE_QUERY_ASSEGURADORA_PER_NOM = "buscarAsseguradoraPerNom";
    public static final String QUERY_ASSEGURADORA_PER_NOM = "SELECT a FROM Asseguradora a WHERE a.nom=:nom";
    public static final String PARAMETRO_QUERY_ASSEGURADORA_PER_NOM = "nom";
    public static final String QUERY_ASSEGURADORA_TODOS = "SELECT a FROM Asseguradora a";

    public static final String TAULA_POLISSSA = "M6_UF2_POLISSAS";
    public static final String POLISSA_KEY_ID = "ID_POLISSA";
    public static final String POLISSA_KEY_NUMERO_POLISSA = "NUMERO_POLISSA";
    public static final String POLISSA_KEY_DATA_INICI = "DATA_INICI_POLISSA";
    public static final String POLISSA_KEY_DATA_FI = "DATA_FI_POLISSA";
    public static final String POLISSA_KEY_TIPUS = "TIPUS_POLISSA";
    public static final String POLISSA_KEY_PRIMA = "PRIMA_POLISSA";
    public static final String INDEX_PRENEDOR_POLISSA = "INDEX_PRENEDOR";
    public static final String QUERY_POLISSA_TODOS = "SELECT p FROM Polissa p";
    public static final String QUERY_POLISSA_POR_ID_CLIENTE = "SELECT p FROM Polissa p WHERE p.prenedor.id=:id";
    public static final String NOM_QUERY_POLISSA_CLIENTE = "buscarPolizaPorIdCliente";
    public static final String QUERY_POLISSA_POR_ID_VEHICLE = "SELECT p FROM Polissa p WHERE p.vehicle.id=:id";
    public static final String NOM_QUERY_POLISSA_VEHICLE = "buscarPolizaPorIdVehicle";
    public static final String PARAMETRO_QUERY_POLISSA_ID = "id";

    public static final String RELACION_VEHICLE_POLISSA = "vehicle";
    public static final String RELACION_ASSEGURADORA_POLISSA = "asseguradora";
    public static final String RELACION_POLISSA_VEHICLE = "propietari";
    public static final String RELACION_POLISSA_CLIENT = "prenedor";

}
