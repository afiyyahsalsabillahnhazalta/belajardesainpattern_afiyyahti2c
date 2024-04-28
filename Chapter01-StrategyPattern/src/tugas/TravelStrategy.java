package tugas;

interface TravelStrategy {
    void goToCampus();
}

// Implementasi untuk naik angkutan umum
class PublicTransportStrategy implements TravelStrategy {

    @Override
    public void goToCampus() {
        System.out.println("Naik angkutan umum ke kampus.");
    }
}

// Implementasi untuk membawa kendaraan pribadi
class PrivateVehicleStrategy implements TravelStrategy{

    @Override
    public void goToCampus() {
        System.out.println("Mengendarai kendaraan pribadi ke kampus. ");
    }
}

// Implementasi untuk naik ojek online
class OnlineTaxiStrategy implements TravelStrategy{

    @Override
    public void goToCampus() {
        System.out.println("Memesan ojek online ke kampus.");
    }
}

// Kelas context yang akan menggunakan strategi yang dipilih

class Student {
    private TravelStrategy travelStrategy;

    public void setTravelStrategy(TravelStrategy travelStrategy){
        this.travelStrategy = travelStrategy;
    }
    public void goToCampus(){
        travelStrategy.goToCampus();
    }
}
