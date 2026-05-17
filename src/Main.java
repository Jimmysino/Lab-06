public class Main {
    public static void main(String[] args) {
        MonitorTiempo monitor = new MonitorTiempo(20.0f);

        Pantalla lcd = new PantallaLCD();
        Pantalla ventana = new VentanaDeComputador();
        Pantalla reloj = new PantallaDeRelojInteligente();

        monitor.agregarPantalla(lcd);
        monitor.agregarPantalla(ventana);
        monitor.agregarPantalla(reloj);

        monitor.mostrar();
    }
}