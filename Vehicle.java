public class Vehicle {
   
    /*
    Revisar que queda pendiente, según el enunciado:
        quedan los marcados como TODO por hacer
        los TOREV los revisamos
    */

    // declaració de les constants

    public static final int ATURAT = 1;
    public static final int EN_MOVIMENT = 2;
    public static final int EN_CARREGA = 3;

    // el valor d'aquest atribut és el mateix per a tots els objectes
    private static int numVehiclesGestionats = 0;

    // atributs

    private String matricula;
    private String marca;
    private String model;
    private int percentatge;
    private int autonomia;
    private int estat;
    private Coordenades ubicacio;

    // Constructors

    Vehicle(String matricula, String marca, String model, int autonomia, Coordenades ubicacio) {
        this.matricula = matricula;
        this.marca = marca;
        this.model = model;
        this.percentatge = 100;
        this.autonomia = autonomia;
        this.estat = ATURAT;
        this.ubicacio = new Coordenades(ubicacio.getLatitud(), ubicacio.getLongitud());
        numVehiclesGestionats++;
    }

    // getters i setters

    public String getMatricula() {
        return this.matricula;
    }

    public String getMarca() {
        return this.marca;
    }

    public String getModel() {
        return this.model;
    }

    public int getPercentatge() {
        return this.percentatge;
    }

    public int getAutonomia() {
        return this.autonomia;
    }

    public int getEstat() {
        return this.estat;
    }
    
    public Coordenades getUbicacio() {
        return this.ubicacio;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPercentatge(int percentatge) {
        this.percentatge = percentatge;
    }

    public void setAutonomia(int autonomia) {
        this.autonomia = autonomia;
    }

    public void setEstat(int estat) {
        this.estat = estat;
    }

    public void setUbicacio(Coordenades ubicacio) {
        this.ubicacio = new Coordenades(ubicacio.getLatitud(), ubicacio.getLongitud());
    }

    // mètodes instància

    public void engegar() {
        this.estat = EN_MOVIMENT;
    }

    public void aturar() {
        this.estat = ATURAT;
    }

    public void carregar() {
        this.estat = EN_CARREGA;
    }

    // mètodes estàtics
    // TODO
/*     public String informacioEstat() {
        switch (this.estat) {
            case DISPONIBLE:
                return "DISPONIBLE";            
            case OCUPAT:
                return "OCUPAT";            
            case AVARIAT:
                return "AVARIAT";            
            default:
                return "Desconegut";
        }
    } */

    public static int getNumVehiclesGestionats() {
        return numVehiclesGestionats;
    }

    // TOREV
    // toString()
    @Override
    public String toString() {
        return "{Matrícula: " + this.matricula + ", Marca: " + this.marca
                + ", Model: " + this.model + ", Percentatge Bateria: " + this.percentatge
                + "%, Autonomia: " + this.autonomia + " km, Estat: " + this.estat + "}";
    }
}
