class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
        this.next=null;
    }
}
class Linkedlist{
    Node head;
    Linkedlist(){
        head=null;
    }
    public void add(int val){
        if(head==null){
         Node newNode=new Node(val);
        }
    Node newNode=new Node(val);
    newNode.next = head;
    head=newNode;
   }
   public void print(){
    Node temp=head;
    while(temp!=null){
        System.out.print(temp.val+" ");
        temp=temp.next;
    }
    System.out.println();
   }
   public void remove(){
     if(head==null){
        return ;
     }
     head=head.next;
   }
   public void removeMid(){
    //Node curr=head;
    Node slow=head;
    Node fast=head;
    while(fast!=null && fast.next!=null){
        slow =slow.next;
        fast=fast.next.next;
    }
    slow=slow.next.next;
    
   }
}




class first{
    public static void main(String[] args) {
       Linkedlist list=new Linkedlist();
       list.add(5);
       list.add(4);
       list.add(3);
       list.add(2);
       list.add(1);
       list.print();
       list.removeMid();
       list.print();

    }
}