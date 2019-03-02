public class QueueImp<E> implements Queue<E> {

    private E[] cola;
    private int max;
    private int ocupado;



    public QueueImp(int size){

        cola = (E[]) new Object[size];
        this.max = size;
        this.ocupado = 0;

    }


    @Override
    public void push(E e) {


        if(this.ocupado != max){

           this.cola[ocupado] = e;
           this.ocupado++;
           System.out.println("Elemento añadido al final de la cola");
        }else{

            System.out.println("Cola llena");
        }

    }

    @Override
    public E  pop() {

        if(this.ocupado == 0){
            System.out.println("Cola Vacia");
            return null;
        }else{

            this.ocupado--;
            System.out.println("Elemento quitado de la cola");
            return cola[ocupado];

        }

    }

    @Override
    public int size() {

        return this.ocupado;
    }
}