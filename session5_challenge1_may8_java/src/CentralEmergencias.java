public class CentralEmergencias{
    public static void main(String[]args) {
        //creando objetos
        Patrulla patrulla1 = new Patrulla("Patrulla","Vanesa");
        Ambulancia ambulancia1 = new Ambulancia("Ambulancia","Jesus");
        UnidadBomberos bomberos = new UnidadBomberos("Bomberos","Kevin");

        //metodos
        patrulla1.iniciarOperacion();
        System.out.println("\n");
        ambulancia1.iniciarOperacion();
        System.out.println("\n");
        bomberos.iniciarOperacion();
    }
}