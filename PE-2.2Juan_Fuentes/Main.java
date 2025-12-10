public class Main {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        System.out.print("Lista vacia: " + list.isEmpty());

        //anadir un unico elemento
        list.insertAtEnd(10);
        list.insertAtEnd(9);
        list.insertAtEnd(8);
        list.insertAtEnd(7);
        list.insertAtEnd(6);
        list.insertAtEnd(5);
        System.out.print("Lista creada: ");
        list.display();

        System.out.println("Parte 2");
        System.out.print("Lista original ");
        list.display();
        System.out.println("Lista reverse ");
        list.reversa();
        list.display();

        DoublyLinkedList singleList = new DoublyLinkedList();

        System.out.println("Un solo elemento (caso borde)");
        singleList.insertAtEnd(60);
        singleList.display();
        System.out.println("Reversa");
        singleList.reversa();
        singleList.display();


        System.out.println("Parte 3");
        System.out.println("Parte 3.1");
        System.out.println("Lista original ");
        list.display();
        System.out.println("Nodo eliminado ");
        list.deleteValue(8);
        list.display();


    }
}
