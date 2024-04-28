package tugas;

public class Main {
    public static void main (String[] args) {
        Student student = new Student();

        // Set strategi pertama : membawa kendaraan pribadi
        student.setTravelStrategy(new PrivateVehicleStrategy());
        student.goToCampus();

        // Set strategi kedua : naik angkutan umum
        student.setTravelStrategy(new PublicTransportStrategy());
        student.goToCampus();

        // Set strategi ketiga : naik ojek online
        student.setTravelStrategy(new OnlineTaxiStrategy());
        student.goToCampus();
    }
}
