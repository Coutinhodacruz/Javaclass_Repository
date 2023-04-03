package hospitalManagement;

class Node{
    Patient patient;
    Node next,prev;

    public Node() {
    }

    public Node(Patient patient) {
        this.patient = patient;
        next = null;
        prev = null;
    }
}


public class PatientList {
    Node head, tail;

    public PatientList() {
        head = null;
        tail = null;
    }
    public void insert(Patient patient){
        Node node = new Node(patient);

        if (head == null || tail == null){
            head = node;
            tail = node;
        }else {
            head.next = node;
            node.prev = node;
            head = node;
        }

    }

    public Patient searchById(String id) {
        Node temp = head;
        while (temp != null) {

        }

        if (temp.patient.getId().equals(id))
            return temp.patient;

        temp = temp.prev;

        return null;
    }
}
