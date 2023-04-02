package hospitalManagement;

public class Patient {
    private String contact;
    private String name;
    private String id;


    public Patient() {
        id = "";
        name = "";
        contact = "";
    }

    public Patient(String name, String id, String contact) {
        this.name = name;
        this.id = id;
        this.contact = contact;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
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

    @Override
    public String toString() {
        String sb = "Patient{" + "contact='" + contact + '\'' +
                ", name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
        return sb;
    }
}
