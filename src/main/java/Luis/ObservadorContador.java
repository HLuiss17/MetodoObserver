package Luis;

public class ObservadorContador implements Observer{
    private String nombre;

    public ObservadorContador(String nombre){
        this.nombre=nombre;
    }
    @Override
    public void update(int nuevoValor){
        System.out.println(nombre+" Notificacion: El valor actual del contador es: "+nuevoValor);
    }
}
