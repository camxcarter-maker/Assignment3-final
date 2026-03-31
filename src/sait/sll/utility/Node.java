package sait.sll.utility;

import java.io.Serializable;

/**
 * Name: Cam Carter
 * Date: March 30, 2026
 * Description: Acts as the fundamental building block for the Singly Linked List. 
 * Each node encapsulates a data object and a reference to the next node in the chain. 
 * It is marked as Serializable to ensure the entire linked structure can be 
 * saved and loaded as a single object.
 */

public class Node implements Serializable {
	
	private static final long serialVersionUID = 1L;
    private Object data;
    private Node next;

    public Node(Object data) {
        this.data = data;
        this.next = null;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
