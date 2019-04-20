package com.priya;

import sun.awt.image.ImageWatched;

import java.util.LinkedList;

public class LinkedListImpl<T> {

    private int size=0;
    private Node<T> first;
    private Node<T> last;


    public void add(T data){
        Node<T> node=new Node(data);
        if(first==null){
            first=node;
            last=node;
        }
        Node<T> temp=last;
        last.setNext(node);
        last=node;
        last.setPrev(temp);

//        head=node;
        size++;
    }

    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        return size==0;
    }

    public boolean remove(T data){

        System.out.println("Trying to remove from list: "+data);
        Node<T> node=first;

        while(node!=null){

            if (node.getData()==data) {

                if (node == first) {
                    first = node.getNext();
                    first.setPrev(null);
                    return true;
                }
                if (node == last) {
                    last = node.getPrev();
                    last.setNext(null);
                    return true;
                }

                node.getPrev().setNext(node.getNext());
                node.getNext().setPrev(node.getPrev());
                return true;
            }
            node=node.getNext();
        }

        System.out.println("Element not found :"+data);
        return false;
    }


    public void printList(){

        Node<T> node=first;
        if(node!=null) {
            do {
                System.out.print(node.getData());
                System.out.print("->");
                node = node.getNext();
            } while (node!= null);
        }else{
            System.out.println("Empty list");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        LinkedListImpl<String> linkedList=new LinkedListImpl<>();
        System.out.println("List empty? :"+linkedList.isEmpty());

        linkedList.add("Abhinav");
        linkedList.add("Priya");
        linkedList.add("Billi");
        linkedList.add("Billa");
        linkedList.printList();

        System.out.println(linkedList.getSize());
        System.out.println("List empty? :"+linkedList.isEmpty());

        linkedList.remove("xyz");
        linkedList.printList();
        linkedList.remove("Billa");
        linkedList.printList();
        linkedList.remove("Abhinav");
        linkedList.printList();
    }
}

class Node<T> {
    private Node<T> next;
    private Node<T> prev;
    private T data;

    public Node(T data){
        this.data=data;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public Node<T> getPrev() {
        return prev;
    }

    public void setPrev(Node<T> prev) {
        this.prev = prev;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

}


