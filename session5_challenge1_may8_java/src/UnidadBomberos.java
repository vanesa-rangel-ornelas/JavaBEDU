public class UnidadBomberos extends UnidadEmergencia {
    //atributos sacados de las clases auxiliares
    private SistemaGPS gps;
    private Sirena sirena;
    private Operador operador;

    //constructor
    public UnidadBomberos(String nombre,String nombre_operador){
        super (nombre);
        this.gps = new SistemaGPS();
        this.sirena = new Sirena();
        this.operador = new Operador(nombre_operador);
    }

    public void iniciarOperacion(){
        activarUnidad();
        gps.localizar();
        sirena.activarSirena();
        operador.reportarse();
        responder();
    }

    @Override
    public void responder() {
        System.out.println("Unidad de bomberos respondiendo a incendio estructural.");
    }
}