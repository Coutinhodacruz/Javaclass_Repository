package hospitalManagement;

public class Main {
    public static void main(String[] args) {
        Patient patient = new Patient("Coutinho", "10", "080");
        Patient patient2 = new Patient("Dacruz", "30", "081");
        Patient patient3 = new Patient("Bobby", "11", "090");

        PatientList patientList = new PatientList();
        patientList.insert(patient);
        patientList.insert(patient2);
        patientList.insert(patient3);

        System.out.println(patientList.searchById("10").getId());
    }
}
