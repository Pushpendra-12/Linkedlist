import java.util.Scanner;
 class Node{
    int data;
    Node next;
}

class list{
    Scanner sc = new Scanner(System.in);
    Node head;
    public void insert(){
        Node N = new Node();
        System.out.println("Enter the data");
        N.data=sc.nextInt();
        // sc.close();
        N.next=null;
        if(head==null){
            head=N;
        }
        else{
            Node p = head;
            while(p.next!=null){
                p=p.next;
            }
            p.next=N;
        }
    }


    public void insertAtFirst(){
        Node N=new Node();
        N.next=null;
        System.out.println("Enter the data");
        N.data=sc.nextInt();
        N.next=head;
        head=N;
    }

    public void insertAtIndex(){
        // Scanner sc = new Scanner(System.in);
        System.out.println("Enter the position");
        int pos = sc.nextInt();
        Node N=new Node();
        System.out.println("Enter the data");
        N.data=sc.nextInt();
        
        N.next=null;
        Node p = head;
        for(int i=0;i<pos-1;i++){
            p=p.next;
        }
        N.next=p.next;
        p.next=N;
        //  sc.close();
    }

    public void deleteAtFirst(){
        if(head==null){
            System.out.println("List is empty");
        }
        else if(head!=null){
            head=head.next;
        }
        else{
            head=null;
        }
    }

    public void show(){
        Node N = head;
        while(N.next!=null){
            System.out.println(N.data);
            N=N.next;
        }
        System.out.println(N.data);
    }
    
}

public class Linkedlist{
    public static void main(String[] args) {
       list ll = new list();
        System.out.println("1 for insert at last");
        System.out.println("2 for insert at between");
        System.out.println("3 for Insert at first");
        System.out.println("4 for delete at first");
        System.out.println("5 for show");
        int ch=0;
        Scanner sc = new Scanner(System.in);
        while(ch!=4){
            System.out.println("Enter your choice");
            ch=sc.nextInt();
           
            switch (ch) {
                case 1:
                    ll.insert();
                    break;
                case 2:
                ll.insertAtIndex();
                break;
                case 3:
                ll.insertAtFirst();
                break;
                case 4:
                ll.deleteAtFirst();
                case 5:
                ll.show();
                default:
                    break;
            }
        }
         sc.close();
    }
}