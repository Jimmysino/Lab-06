import java.util.ArrayList;
import java.util.List;

public class MonitorTiempo {
    private float temperatura;
    private List<Pantalla> pantallas;

    public MonitorTiempo(float temperatura) {
        this.temperatura = temperatura;
        this.pantallas = new ArrayList<>();
    }


    public void agregarPantalla(Pantalla p) {
        pantallas.add(p);
    }


    public void removerPantalla(Pantalla p) {
        pantallas.remove(p);
    }

    public float getTemperatura() {
        return temperatura;
    }


    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
    }


    public void mostrar() {
        for (Pantalla p : pantallas) {
            p.mostrarEnPantalla(this.temperatura);
        }
    }
}