package edu.Shepherd.Queue;
public class Queue<E> {
    Node<E> head;     
        public Queue(){
            head=null;
        }
        public void insert(E data){
            if(head==null){
                head= new Node(data);
            }  else {
                Node<E> current =head;
                while (current.link!=null){
                    current = current.link;
                }
                current.link =new Node(data);
            }
        }
        public E pop(){
            Node<E> target = head;
            head= head.link;
            return target.data;
        }

        public int size(){
            int size =0;
            Node<E> current =head;
            while (current!=null){
                size++;
                current= current.link;
            }
            return size;
        }

        public boolean isEmpty(){
            if (head ==null){
                return true;
            }
            return false; 
        }

        public E peek(){
            return head.data;
        }

    }
