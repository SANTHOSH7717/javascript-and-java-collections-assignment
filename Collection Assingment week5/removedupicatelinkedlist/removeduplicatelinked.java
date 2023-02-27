package Ex;

public class removeduplicatelinked {
    public int data;
    public removeduplicatelinked next;

    public removeduplicatelinked(int data) {
        this.data = data;
        this.next = null;
    }
}

 class LinkedList {
    private removeduplicatelinked head;

    public LinkedList() {
        this.head = null;
    }

    public removeduplicatelinked getHead() {
        return head;
    }

    public void setHead(removeduplicatelinked head) {
        this.head = head;
    }

    public void insert(int data) {
    	removeduplicatelinked newNode = new removeduplicatelinked(data);
        if (head == null) {
            head = newNode;
        } else {
        	removeduplicatelinked currentNode = head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
    }

    public void removeDuplicates() {
        if (head == null) {
            return;
        }
        removeduplicatelinked currentNode = head;
        while (currentNode != null) {
        	removeduplicatelinked runnerNode = currentNode;
            while (runnerNode.next != null) {
                if (runnerNode.next.data == currentNode.data) {
                    runnerNode.next = runnerNode.next.next;
                } else {
                    runnerNode = runnerNode.next;
                }
            }
            currentNode = currentNode.next;
        }
    }

    public void printList() {
    	removeduplicatelinked currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + "->");
            currentNode = currentNode.next;
        }
        System.out.println("");
    }
}
