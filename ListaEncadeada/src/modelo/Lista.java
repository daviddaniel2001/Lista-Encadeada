package modelo;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    private Node head;
    private int tamanho;

    public LinkedList() {
        this.head = null;
        this.tamanho = 0;
    }
}