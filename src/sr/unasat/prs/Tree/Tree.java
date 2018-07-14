package sr.unasat.prs.Tree;

import sr.unasat.prs.entities.Patient;

public class Tree {
    private Node root;

    public Node find(int key){
        Node current = root;
        while (current.patient.getID() != key){
            if(key < current.patient.getID()) {
                current = current.leftChild;
            } else {
                current = current.rightChild;
            }
            if(current == null) {
                return null;
            }
        }
        return current;
    }

    public void insert(Patient patient){
        Node newNode = new Node();
        newNode.patient = patient;

        if(root == null) {
            root = newNode;
        } else {
            Node current = root;
            Node parent;
            while (true) {
                parent = current;
                if(patient.getID() < current.patient.getID()) {
                    current = current.leftChild;
                    if(current == null) {
                        parent.leftChild = newNode;
                        return;
                    }
                } else {
                    current = current.rightChild;
                    if (current == null) {
                        current.rightChild = newNode;
                        return;
                    }
                }
            }
        }
    }

    public void delete(int id){

    }
}
