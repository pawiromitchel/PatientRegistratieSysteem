package sr.unasat.prs.entities;

public class Poli {
    private Patient patient;
    private int priority;

    public Poli(Patient patient, int priority) {
        this.patient = patient;
        this.priority = priority;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
}
