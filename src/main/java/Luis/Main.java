package Luis;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // creamos una instancia del contador
        Contador contador = new Contador();

        // creamos dos tipos de observadores

        ObservadorContador observador1 = new ObservadorContador("Observador 1");
        ObservadorContador observador2 = new ObservadorContador("Observador 2");

        // ejm de suscripcion de observadores al contar

        contador.agregarObservador(observador1);
        contador.agregarObservador(observador2);
        // incrementar el observador y ver las notificaciones
        System.out.println("Inicializando el contador en: "+contador.getValor());
        contador.incrementar();
        contador.incrementar();
        contador.incrementar();

    }
}