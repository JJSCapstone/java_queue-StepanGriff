package edu.Shepherd.Queue;
public class Queue<E> {
    Node<E> head;   
    public class Node<F>{
        F data;
        Node<F> link;
        public Node(F data){
            this.data = data;
            link = null;
            }
        }  
        public Queue(){
            head=null;
        }
        public void insert(E data){
            if(head==null){
                head= new Node<E>(data);
            }  else {
                Node<E> current =head;
                while (current.link!=null){
                    current = current.link;
                }
                current.link =new Node<E>(data);
            }
        }
        public Node<E> pop(){
            Node<E> target = head;
            head= head.link;
            return target;
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

        public Node<E> peek(){
            return head;
        }

    }
