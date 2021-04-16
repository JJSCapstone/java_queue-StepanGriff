package edu.Shepherd.Queue;
public class Node<E>{
    E data;
    Node<E> link;
    public Node(E data){
        this.data = data;
        link = null;
        }
    }