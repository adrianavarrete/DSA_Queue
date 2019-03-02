public class Main {


    public static void main(String[] args){

        QueueImp<Integer> cola = new QueueImp(10);

        cola.pop();
        cola.push(1);
        cola.push(6);
        cola.push(6);
        cola.push(6);
        cola.push(6);
        cola.push(6);
        cola.push(6);
        cola.push(6);
        cola.push(6);
        cola.push(6);
        cola.push(6);
        cola.pop();

        System.out.println("El tamaño actual de la cola es de " + cola.size());
        cola.pop();
        System.out.println("El tamaño actual de la cola es de " + cola.size());




    }
}
