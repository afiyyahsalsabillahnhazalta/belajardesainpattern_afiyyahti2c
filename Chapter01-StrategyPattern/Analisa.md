# ANALISA FILE DUCK

1. INTERFACE :
   - QuackBehavior : Pada interface ini mendefinisikan perilaku bersuara bebek. Disini memiliki satu metode abstrak quack() yang dapat diimplementasikan oleh berbagai jenis bebek untuk menghasilkan suara yang berbeda.
   - FlyBahvior : Pada interface ini mendefinisikan untuk perilaku terbang bebek. Ia memiliki metode abstrak fly() yang dapat diimplementasikan oleh berbagai jenis bebek untuk mewakili kemampuan terbang yang berbeda.

2. Implementasi Perilaku Bersuara :
    - Quack : Kelas ini mengimplementasikan interface QuackBehavior dan menyediakan perilaku bersuara dasar dengan mencetak "Qwek - Qwek".
    - Squeak : Kelas ini mengimplementasikan interface QuackBehavior dan menyediakan perilaku bersuara yang berbeda dengan mencetak "Squeak" (berdecit).
    - MuteQuack : Kelas ini mengimplementasikan interface QuackBehavior dan menyediakan perilaku diam dengan mencetak "Tidak Bisa Bersuara".

3. Implementasi Perilaku Terbang:
    - FlyWithWings: Kelas ini mengimplementasikan interface FlyBehavior dan menyediakan perilaku terbang normal dengan mencetak "Terbang".
    - FlyNoWay: Kelas ini mengimplementasikan interface FlyBehavior dan menyediakan perilaku tidak bisa terbang dengan mencetak "Tidak bisa terbang".
    - FlyWithRocketPower: Kelas ini mengimplementasikan interface FlyBehavior dan menyediakan perilaku terbang unik dengan mencetak "Cool, terbang menggunakan rocket".

4. Kelas Abstrak Duck (Bebek):
   - Kelas ini berfungsi sebagai dasar untuk semua jenis bebek. Ini mendefinisikan dua variable member :
        - quackBehavior : Objek bertipe QuackBehavior yang mewakili perilaku bersuara bebek. 
        - flyBehavior : Objek bertipe FlyBehavior yang mewakili perilaku terbang bebek.
   - Kelas ini mendeklarasikan metode abstrak display() yang harus diimplementasikan oleh subkelas untuk menampilkan informasi tentang jenis bebek tertentu. 
   - Kelas ini menyediakan tiga metode konkret:
      - swim() : Metode ini mencetak "Berenang", perilaku umum untuk semua bebek. 
      - performQuack() : Metode ini mendelegasikan perilaku bersuara ke objek quackBehavior yang ditetapkan dengan memanggil metode quack(). 
      - performFly() : Metode ini mendelegasikan perilaku terbang ke objek flyBehavior yang ditetapkan dengan memanggil metode fly(). 
   - Kelas ini menyediakan dua metode setter :
     - setFlyBehavior(FlyBehavior fb) : Metode ini memungkinkan perubahan perilaku terbang bebek secara dinamis saat runtime dengan menetapkan objek FlyBehavior baru. 
     - setQuackBehavior(QuackBehavior qb) : Metode ini memungkinkan perubahan perilaku bersuara bebek secara dinamis saat runtime dengan menetapkan objek QuackBehavior baru.
5. Subkelas Bebek Konkret :
   - MallardDuck : Kelas ini mewakili bebek Mallard, yang mewarisi dari kelas Duck. Ini menetapkan quackBehavior ke Quack dan flyBehavior ke FlyWithWings, menunjukkan bahwa ia bersuara seperti bebek normal dan terbang menggunakan sayap. 
   - RedheadDuck : Kelas ini mewakili bebek Redhead, mirip dengan MallardDuck. Ia juga bersuara seperti bebek normal dan terbang menggunakan sayap. 
   - RubberDuck : Kelas ini mewakili bebek karet, yang mewarisi dari kelas Duck. Ini menetapkan quackBehavior ke Squeak dan flyBehavior ke FlyNoWay, menunjukkan bahwa ia berdecit alih-alih bersuara "quack" dan tidak bisa terbang. 
   - WoodenDuck : Kelas ini mewakili bebek kayu, mirip dengan RubberDuck. Ia juga berdecit alih-alih bersuara "quack" dan tidak bisa terbang. 
   - ModelDuck : Kelas ini mewakili bebek model, yang mewarisi dari kelas Duck. Ini awalnya menetapkan flyBehavior ke FlyNoWay dan quackBehavior ke Quack, menunjukkan bahwa ia tidak bisa terbang tetapi bersuara seperti bebek normal. Namun, perilakunya dapat diubah secara dinamis menggunakan metode setter.

Kode ini menggunakan pola desain strategi untuk memisahkan perilaku (bersuara dan terbang bebek). Dengan mengenkapsulasi perilaku di kelas terpisah dan menggunakan pewarisan, kode ini meningkatkan fleksibilitas dan kemampuan digunakan kembali.
jenis bebek baru dengan perilaku berbeda dapat dengan mudah dibuat dengan mengimplementasikan interface QuackBehavior dan FlyBehavior. Selain itu, kemampuan untuk mengubah perilaku bebek secara dinamis saat tuntime menggunakan metode setter semakin meningkatkan fleksibilitas desain.

# ANALISA FILE TUGAS
Pada file tugas tersebut yaitu mengimplementasikan pola desain strategi untuk memodelkan strategi perjalanan mahasiswa ke kampus.

1. Interface TravelStrategy :
    - Interface ini mendefinisikan kontrak untuk strategi perjalanan.
    - Memiliki satu metode abstrak goToCampus() yang harus diimplementasikan oleh kelas strategi konkret untuk menentukan cara mahasiswa pergi ke kampus.

2. Implementasi Strategi Perjalanan :
    - PublicTranportStrategy : Kelas ini mengimplementasikan strategi naik angkutan umum. Metode goToCampus()-nya mencetak "Naik angkutan umum ke kampus."
    - PrivateVehicleStrategy : Kelas ini mengimplementasikan strategi membawa kendaraan pribadi. Metode goToCampus()-nya mencetak "Mengendarai kendaraan pribadi ke kampus."
    - OnlineTaxiStrategy : Kelas ini mengimplementasikan strategi naik ojek online. Metode goToCampus()-nya mencetak "Memesan ojek online ke kampus."

3. Kelas Context Student :
   - Kelas ini merepresentasikan mahasiswa.
   - Memiliki variabel travelStrategy untuk menampung strategi perjalanan yang dipilih. 
   - Memiliki metode setTravelStrategy(TravelStrategy travelStrategy) untuk mengatur strategi perjalanan. 
   - Memiliki metode goToCampus() yang mendelegasikan tugas pergi ke kampus ke strategi yang dipilih.

Kode ini dengan baik mengimplementasikan strategi pattern untuk memisahkan strategi perjalanan dari kelas Student.