import java.util.Scanner;
class Node{
        public Object item;
        public Node next;
    }
class linkedlist
{
    private int size = 0;
    private Node head;
    public linkedlist()
    {
        this.size = 0;
        this.head = null;
    }
    void addatEnd(String i)
    {
        Node node = new Node();
        node.item = i;
        Node current = this.head;
        if(this.head == null)
        {
            this.head = node;
            this.head.next = null;
            this.size = 1;
            System.out.println(this.head.toString());
        }
        else
        {
            while(current.next != null)
            {
                current = current.next;
            }
            current.next = node;
            node.next = null;
            this.size += 1;
        }
    }
    void addatStart(String i)
    {
        Node n1 = new Node();
        n1.item = i;
        n1.next  = this.head;
        this.head = n1;
        this.size += 1;
        
    }
    public void addatMiddle(String i,int pos)
    {
        Node node = new Node();
        Node current = this.head;
        if(this.head!= null && pos <= this.size)
        {
            for(int j = 2;j < pos ; j++)
            {
                current = current.next;
            }
            node.item=i;
            node.next = current.next;
            current.next = node;
            this.size += 1;
        }
        else{
            System.out.println("position is greater than the size");
        }
    }
    void traverse()
    {
        Node current = this.head;

        if(this.head == null)
        {
            System.out.println("null");
        }
        else
        {
            System.out.print("List : ");
            while(current.next != null)
            {
                System.out.print(current.item+"->");
                current = current.next;
                
            }
            System.out.println(current.item+".");
        }
    }
    public void deleteatFirst()
    {
        if(this.head == null)
        {
            System.out.println("Nothing");
        }
        System.out.println("Deleted node: "+this.head.item);
        this.head = this.head.next;
        this.size -= 1;
    }
    public void deleteatMiddle(int pos)
    {
        Node current = this.head;
        Node prevnode ;
        if(this.head!= null && pos <= this.size)
        {
            for(int j=2;j < pos ; j++)
            {
                current = current.next;
            }
            prevnode= current;
            System.out.println("Deleting the node : "+current.next.item);
            prevnode.next = current.next.next; 
            this.size -= 1;
        }
        else
        {
            System.out.println("position is greater than the size");
        }
    }
    public void deleteatEnd()
    {
        Node current = this.head;
        while(current.next != null)
        {
            current = current.next;
            if(current.next.next == null)
            {
                current.next = null;
            }
        } 
        this.size -= 1;      
    }
    public void listLength()
    {
        System.out.println("Size :"+this.size);
    }
}
public class Linkedlistimplementation{
    public static void main(String[] args)
    {
        linkedlist sll = new linkedlist();
        Scanner s = new Scanner(System.in);
        while(true)
        {
            System.out.print("Enter 1: Exit \nEnter 2: Traverse\nEnter 3: Size\nEnter 4: Add at Start\nEnter 5: Add at Middle\nEnter 6: Add at Endt\nEnter 7: Delete at Start\nEnter 8: Delete at Middle\nEnter 9: Delete at End\nEnter input : ");
            int userInput = Integer.parseInt(s.nextLine());
            switch (userInput) 
            {
                 case 1:
                    return;
                case 2:
                    sll.traverse();
                    break;
                case 3:
                    sll.listLength();
                    break;
                case 4:
                    System.out.print("Enter the data:");
                    String s1 = s.nextLine();
                    sll.addatStart(s1);
                    sll.traverse();
                    break;
                case 5:
                    System.out.print("Enter the data and the position:");
                    String s2 = s.nextLine();
                    int j = Integer.parseInt(s.nextLine());
                    sll.addatMiddle(s2,j);
                    sll.traverse();
                    break;
                case 6:
                    System.out.print("Enter the data:");
                    String s3 = s.nextLine();
                    sll.addatEnd(s3);
                    sll.traverse();
                    break;
                case 7:
                    sll.deleteatFirst();
                    sll.traverse();
                    break;
                case 8:
                    System.out.print("Enter the position:");
                    int i = Integer.parseInt(s.nextLine());
                    sll.deleteatMiddle(i);
                    sll.traverse();
                    break;
                case 9:
                    sll.deleteatEnd();
                    sll.traverse();
                    break;
                default:                    
                    System.out.println("Invalid input");
                    // Perform action for invalid input
                    break;
            }
        }
    }
}