package sr.unasat.prs.services;

import sr.unasat.prs.entities.Patient;

public class DoublyList {
    private Link first;
    private Link last;

    public DoublyList() {
        this.first = null;
        this.last = null;
    }

    public boolean isEmpty(){
        return first == null;
    }

    public void insertFirst(Patient patient){
        Link newLink = new Link(patient);
        if(isEmpty()) {
            last = newLink;
        } else {
            newLink.next = first;
        }
        first = newLink;
    }

    public void insertLast(Patient patient){
        Link newLink = new Link(patient);
        if(isEmpty()) {
            first = newLink;
        } else {
            last.next = newLink;
        }
        last = newLink;
    }

    public Patient deleteFirst(){
        Patient temp = first.patient;
        if(first.next == null) {
            last = null;
        }
        first = first.next;
        return temp;
    }

    public void displayList(){
        Link current = first;
        while (current != null) {
            current.displayLink();
            current = current.next;
        }
    }
}
