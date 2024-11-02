package Luis;
import java.util.ArrayList;
import java.util.List;

public class Contador {
    private List <Observer> observadores = new ArrayList<>();
    private int valor = 0;

    // metodo para agregar observadores
    public void agregarObservador(Observer observador){
        observadores.add(observador);
    }
    //Eliminar un observador
    public void eliminarObservador(Observer observador){
        observadores.remove(observador);
    }
    //Notificacion a los observadores
    private void notificarObservadores(){
        for(Observer observador : observadores){
            observador.update(valor);
        }
    }
    // Incrementa el valor del contador
    // Notifica alaos observadores
    public void incrementar(){
        valor += 1;
        notificarObservadores();
    }
    // optener el valor actual del contador
    public int getValor(){
        return valor;
    }
}
