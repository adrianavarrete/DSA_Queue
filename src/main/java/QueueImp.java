import org.apache.log4j.Logger;

public class QueueImp<E> implements Queue<E> {

    private final static Logger log = Logger.getLogger(QueueImp.class);

    private E[] cola;
    private int max;
    private int ocupado;



    public QueueImp(int size){

        cola = (E[]) new Object[size];
        this.max = size;
        this.ocupado = 0;

    }



    public void push(E e) {


        if(this.ocupado != max){

           this.cola[ocupado] = e;
           this.ocupado++;
           log.info("Se ha añadido a la cola");
        }else{

            log.fatal("Cola llena");
        }

    }


    public E  pop() {

        if(this.ocupado == 0){
            log.fatal("Cola llena");
            return null;
        }else{

            this.ocupado--;
            log.info("Se ha añadido a la cola");
            return cola[ocupado];

        }

    }


    public int size() {

        return this.ocupado;
    }
}