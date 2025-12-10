import java.time.format.SignStyle;

public class DoublyLinkedList {
  private DDL_Node head;
  private DDL_Node tail;

  //inicializa la lista doble
  //head null
  //head tail
    public DoublyLinkedList(){
        this.head = null;
        this.tail = null;
    }   

  //head es null
    public boolean isEmpty(){
        return head == null;
    }

  // insertar un nodo al final
    public void insertAtEnd(int data){
        DDL_Node newNode = new DDL_Node(data);

        if(isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void display(){
        if(isEmpty()){
            System.out.print("Lista Vacia: ");
        }
        DDL_Node current = head;

        while (current != null){
            System.out.print(current.data);
            if(current.next != null){
                System.out.print("<-->");
            }
            current = current.next;
        }
        System.out.println();
    }
    public void reversa(){
        if(isEmpty() || head == tail){
            return; // finalizo el metodo
        }
        DDL_Node current = head; // es cabeza porque necesito saber en donde inicia
        DDL_Node temp = null;

        while (current != null) {
            temp = current.prev; // almacenamos los punteros anteriores para que sean el next
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }
        temp = head;//en la variable temporal va a guardar temporales
        head = tail;
        tail = temp;
    }

    public boolean deleteValue(int data){
        if(isEmpty()){
            return false;
        }
        DDL_Node current = head;
        while (current != null && current.data != data) {
            //mientras no encuentee un valor yo sigo buscando en el nodo
            current = current.next;

            
        }
        if(current == null) return false;//no se puede eliminar porque no encontramos ningun valor

        // Caso 1: valor a eliminar es el head
        if(current == head){
            head = head.next;
            if(head != null){
                head.prev = null;
            }else{
                tail = null; // la cola sera nula
            }

        }else if(current == tail) {
             //Caso 2: Eliminar tail/cola
             tail = tail.prev;
             tail.next = null;

        } else{
            // si el nodo es intermedio 
            current.prev.next =  current.next;
            current.next.prev =  current.prev;
        }
        return true;

    }
       
}

// en java se definen que variables van a ser publicas o privadas
//cuando creamos una variable privada solo se ejecuta en una misma clase
// el this es para indicar que esa variable es propia de una clase por lo tanto, se puede usar en otras
// el metodo void solo ejecuta alguna operacion


//psvm