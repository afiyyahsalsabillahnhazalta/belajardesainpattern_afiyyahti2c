Single Responsibility Principle (SRP) adalah salah satu dari lima prinsip desain
SOLID dalam pengembangan perangkat lunak. SRP menyatakan bahwa sebuah kelas atau
modul harus memiliki satu, dan hanya satu, alasan untuk berubah, yang berarti ia harus
memiliki satu tanggung jawab atau tujuan yang jelas.
SRP menekankan bahwa setiap kelas atau modul dalam sebuah aplikasi harus
memiliki satu tanggung jawab utama. Memisahkan tanggung jawab ke dalam kelas-kelas
atau modul-modul yang berbeda. Misalnya, satu kelas mungkin bertanggung jawab atas
penyimpanan data, sementara kelas lain bertanggung jawab atas validasi data. Dengan
memiliki satu tanggung jawab, kelas atau modul menjadi lebih fokus dan sederhana

Pada Project App berikut memiliki beberapa kelas yaitu :

1. Kelas Repositori
- BookRepository : Bertanggung jawab atas penyimpanan dan pengambilan data
  buku. Di dalam repositori ini ada terdapat beberapa meotde yang digunakan yaitu
  :
  • findByAuthorIdAndBookName : Temukan buku berdasarkan ID penulis
  dan nama buku.
  • Save : Simpan buku baru.
  • findByBookIds : Temukan buku menurut daftar ID.
- AuthorRepository : Mengelola penyimpanan dan pengambilan data penulis. Ini
  menyediakan metode untuk:
  • checkAuthorId : Periksa apakah penulis ada berdasarkan ID.
  • Save : Simpan penulis baru.
2. Kelas Entitas
   Ada dua kelas yang digunakan
- Book : Mewakili buku dengan atribut seperti ID (dibuat), ID penulis, nama, nama
  penerbit, dan tanggal rilis (secara otomatis ditetapkan ke tanggal saat ini).
- Author : Mewakili penulis dengan atribut seperti ID dan nama (default "tidak
  diketahui" jika tidak disediakan).
3. Kelas Layanan atau services
   8
- BookServices : Mengatur fungsionalitas terkait buku. Ini menyediakan metode
  untuk:
  • Simpan buku baru, lakukan validasi :
  Nama buku tidak boleh nol
  Buku duplikad (ID penulis dan nama yang sama) tidak diizinkan
  • Buku rilis (perbarui tanggal rilis ke tanggal saat ini) berdasarkan daftar ID.
  • Buku yang dirilis grup menurut penulis (mengembalikan peta dengan ID
  penulis sebagai kunci dan daftar buku sebagai nilai).
- AuthorServices : Menangani fungsionalitas terkait penulis. Ini menyediakan
  metode untuk:
  • Simpan penulis jika belum ada (mengatur nama menjadi "tidak diketahui"
  secara default).
4. Kelas App (kelas utama)
- Menunjukkan cara menggunakan layanan App
- Menciptakan contoh repositori dan layanan
- Menghemat tiga buku dengan penulis dan penerbit yang berbeda (satu dengan
  penerbit yang hilang)
- Mengambil dan merilis buku berdasarkab ID mereka (simulasi menandai mereka
  sebagai dirilis)
- Mengelompokkan buku-buku yang dirilis oleh penulis dan mencetak informasinya.