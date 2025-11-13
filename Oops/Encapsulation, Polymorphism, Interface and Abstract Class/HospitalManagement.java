public class HospitalManagement {
    public static void main(String[] args) {
        Patient[] patients = {
            new InPatient(101, "Rakesh", 45, 5000),
            new OutPatient(102, "Sita", 30, 800)
        };
        for (Patient p : patients) {
            p.getPatientDetails();
            System.out.println("Bill: " + p.calculateBill());
            if (p instanceof MedicalRecord) {
                ((MedicalRecord) p).addRecord("Checked on 2025-11-13");
                ((MedicalRecord) p).viewRecords();
            }
            System.out.println("---");
        }
    }
}

abstract class Patient {
    private int patientId;
    private String name;
    private int age;

    public Patient(int patientId, String name, int age) { this.patientId = patientId; this.name = name; this.age = age; }
    public int getPatientId() { return patientId; }
    public String getName() { return name; }
    public int getAge() { return age; }

    public void getPatientDetails() { System.out.println("ID:" + patientId + ", Name:" + name + ", Age:" + age); }
    public abstract double calculateBill();
}

interface MedicalRecord {
    void addRecord(String record);
    void viewRecords();
}

class InPatient extends Patient implements MedicalRecord {
    private double roomCharge;
    private java.util.List<String> records = new java.util.ArrayList<>();
    public InPatient(int id, String name, int age, double roomCharge) { super(id, name, age); this.roomCharge = roomCharge; }
    public double calculateBill() { return roomCharge + 2000; }
    public void addRecord(String record) { records.add(record); }
    public void viewRecords() { System.out.println(records); }
}

class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;
    private java.util.List<String> records = new java.util.ArrayList<>();
    public OutPatient(int id, String name, int age, double consultationFee) { super(id, name, age); this.consultationFee = consultationFee; }
    public double calculateBill() { return consultationFee; }
    public void addRecord(String record) { records.add(record); }
    public void viewRecords() { System.out.println(records); }
}
