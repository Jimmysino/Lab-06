public class VentanaDeComputador implements Pantalla {
    @Override
    public void mostrarEnPantalla(float numero) {
        System.out.println("La Temperatura en la Ventana es :" + numero);
    }
}