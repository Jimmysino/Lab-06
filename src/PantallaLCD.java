public class PantallaLCD implements Pantalla {
    @Override
    public void mostrarEnPantalla(float numero) {
        System.out.println("La Temperatura en la Pantalla LCD es :" + numero);
    }
}