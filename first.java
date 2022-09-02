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
   public void addLast(int val){
        if(head==null){
            Node newNode=new Node(val);
            head=newNode;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        Node newNode=new Node(val);
        newNode.next=temp.next;
        temp.next=newNode;
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
    while(fast!=null && fast.next!=null&& fast.next.next!=null){
        slow =slow.next;
        fast=fast.next.next;
    }
    slow.next=slow.next.next;
   }
   public void reverse(){
    Node curr=head;
    Node next=null;
    Node prev=null;
    while(curr!=null){
        next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
    }
    head=prev;
   }
    public void addInMiddle( int val){
      Node slow=head;
       Node fast=head;
       while(fast!=null&&fast.next!=null&&fast.next.next!=null){
             slow=slow.next;
              fast=fast.next.next;
        }
       Node newNode=new Node(val);
       newNode.next=slow.next;
        slow.next=newNode;
    }
    
}




class first{
    public static  Node Merge(Node list1,Node list2){
        Node dummyNode=new Node(0);
        Node tail=dummyNode;
        while(true){
            if(list1==null){
                tail.next=list2;
                break;
            }
            if(list2==null){
                tail.next=list1;
                break;
            }
            if(list1.val<=list2.val){
                tail.next=list1;
                list1=list1.next;
            }
            else{
                tail.next=list2;
                list2=list2.next;
            } 
            tail=tail.next;
        }
        return dummyNode.next;
    }
    
    public static void main(String[] args) {
        Linkedlist list=new Linkedlist();
       Linkedlist list1=new Linkedlist();
       Linkedlist list2=new Linkedlist();
       list.add(5);
       list.add(4);
       list.add(3);
       list.add(2);
       list.add(1);
       list.print();
       list.removeMid();
       list.print();
       list.reverse();
       list.print();
       list.addInMiddle(9);
       list.print();
    
    list1.addLast(1);
    list1.addLast(2);
    list1.addLast(5);
    list1.addLast(6);
    list1.addLast(7);
    list1.addLast(9);
    list1.addLast(10);
    list2.addLast(11);
    list2.addLast(13);
    list2.addLast(16);
    list2.addLast(19);
    list2.addLast(20);
    list1.print();
    list2.print();
    list1.head=Merge(list1.head, list2.head);
    list1.print();
    }
   
}



