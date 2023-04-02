package hospitalManagement;

public class CheckUp {
    Doctor doctor;
    Patient patient;
    int priority;
    String recommendation;

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
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

    public String getRecommendation() {
        return recommendation;
    }

    public void setRecommendation(String recommendation) {
        this.recommendation = recommendation;
    }

    public CheckUp(Doctor doctor, Patient patient, int priority, String recommendation) {
        this.doctor = doctor;
        this.patient = patient;
        this.priority = priority;
        this.recommendation = recommendation;
    }

    @Override
    public String toString() {
        String sb = "CheckUp{" + "doctor=" + doctor +
                ", patient=" + patient +
                ", priority=" + priority +
                ", recommendation='" + recommendation + '\'' +
                '}';
        return sb;
    }
}
