package hospitalManagement;

public class Doctor {

    private String name;
    private String id;

    private String contact;
    private String specialty;
    private int fees;

    public Doctor() {
    }

    public Doctor(String name, String id, String contact, String specialty, int fees) {
        this.name = name;
        this.id = id;
        this.contact = contact;
        this.specialty = specialty;
        this.fees = fees;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public int getFees() {
        return fees;
    }

    public void setFees(int fees) {
        this.fees = fees;
    }

    @Override
    public String toString() {
        String sb = "Doctor{" + "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", contact='" + contact + '\'' +
                ", specialty='" + specialty + '\'' +
                ", fees=" + fees +
                '}';
        return sb;
    }
}
