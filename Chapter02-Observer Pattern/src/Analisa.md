# ANALISA FILE SUBSCRIBER
Program Observer Pattern tersebut yaitu dimana channel dalam suatu aplikasi streaming dihadapkan dengan banyaknya penonton 
yang ingin selalu up-to-date dengan kontennya.
Terdapat dua class utama yaitu : Channe dan User.
Channel mewakili saluran yang dapat memberitahukan penggunanya tentang update, sedangkan User mewakili pengguna yang ingin menerima notifikasi dari saluran.
Saluran memiliki metode addSubscriber untuk menambahkan pengguna yang ingin brlangganan, dan notofyUser untuk mengirimkan pesan notifikasi ke semua pengguna yang berlangganan.
pengguna memiliki metode subscribe untuk berlangganan ke saluran.
dalam fungsi utama, sebuah saluran "Budi Setiawan Channel" dibuat ada 3 pengguna dibuat. Dua pengguna pertama "Wika Wika" dan "Jobot TV", berlangganan ke saluran menggunakan metode addSubscriber.
Kemudian, saluran mengirimkan notifikasi pertama kepada semua pengguna yang berlanggannan dengan pean "Ada video baru buat anda! Jangan lupa di subscribe ya!".
Pengguna ketiga "Jinjit Karunia", berlangganan ke saluran menggunakan metode subscribe pada objek pengguna. Kemudian, saluran mengirimkan notifikasi kedua kepada semua pengguna yang berlangganan dengan pesan yang lebih sederhana yaitu "Video Baru!".
Class User saat ini tidak memiliki metode untuk menangani notifikasi yang diterima.
Hal ini perlu ditambahkan agar pengguna dapat memproses pesan yang diterima dari saluran.
Secara keseluruhan, program ini memberikan contoh dasar bagaimana pola Observer dapat digunakan untuk mengimplementasikan sistem notifikasi antar objek.


# ANALISA FILE TUGAS (ORDER)
Pada program tersebut yaitu menerapkan pemrosesn pemesanan sederhana yang memanfaatkan pole observer untuk memberi tahu pihak-pihak yang berkepentingan tentang perubahan status pesanannya.
Pada clss "Order" bertindak sebagai subjek, memelihara daftar pengamat dan memberi tahu mereka tentang perubahan status. 
Class "Customer" dan "LogisticSystem" bertindak sebagai pengamat, mengimplementasikan interface "OrderObserver" dan menerima pemberitahuan.
