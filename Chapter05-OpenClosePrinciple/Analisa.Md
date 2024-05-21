Program berikut menunjukkan penerapan prinsip OCP (Open-Closed Principle)
dengan baik. Hal ini terlihat dari penggunaan interface dan strategi untuk
memisahkan perilaku umum dan implementasi spesifik. Interface BookRepo
mendefinisikan metode untuk mengambil data buku, sedangkan interface
BookGroupStrategy mendefinisikan metode untuk meringkas data berdasarkan
kriteria tertentu. Implementasi konkret dari interface ini, seperti BookRepoImpl
9
dan kelas-kelas strategi, menyediakan fungsionalitas spesifik tanpa mengubah
interface.
Desain program juga menerapkan prinsip OOP (Object Oriented Programming)
dengan baik. Penggunaan kelas, interface, dan inheritance membantu membuat
program lebih modular, terorganisir, dan mudah dipahami. Penggunaan factory
pattern dalam BookGroupFactory membantu decoupling BookSummaryService
dari strategi spesifik.
Program ini juga memanfaatkan Stream API dengan baik untuk memfilter dan
memproses data buku dengan cara yang efisien. Hal ini membuat kode lebih
ringkas dan mudah dibaca.
Pemisahan tanggung jawab (SoD) pun diterapkan dengan baik. BookRepo
bertanggung jawab untuk mengambil data buku, BookGroupStrategy bertanggung
jawab untuk meringkas data berdasarkan kriteria tertentu, dan
BookSummaryService bertanggung jawab untuk menggabungkan semuanya dan
menampilkan hasilnya. Hal ini membuat kode lebih mudah diuji dan dipelihara.
Program ini juga menerapkan penanganan pengecualian dengan baik. Penggunaan
try-catch block membantu memastikan program berjalan dengan stabil dan
memberikan pesan yang informatif kepada pengguna jika terjadi kesalahan.
Secara keseluruhan, program ini menunjukkan penerapan OCP, OOP, Stream
API, SoD, dan penanganan pengecualian yang baik. Desainnya modular, mudah
dipahami, dan dapat diperluas dengan mudah.
