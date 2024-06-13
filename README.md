Test

![Screenshot 2024-06-14 004716](https://github.com/mdimasfirmansyah/Java-Test/assets/57607971/c4e4daca-0858-4ee5-841a-eb681ac202fa)

Berapa kali String hello dicetak setelah pemanggilan rusak(1000)?

<p align="justify"> Untuk setiap panggilan rusak(n), kita mencetak "Hello" sebanyak n kali, dan kemudian melakukan panggilan rekursif dengan nilai n dibagi 2. Proses ini berlanjut sampai n menjadi 0. pertama fungsi rusak(1000) akan mencetak hello sebanyak 1000 kali, selanjutnya memanggil fungsi rusak(500) dan mencetak 500 kali hello dan selanjutnya memanggil fungsi rusak(250) dan terus sampai nilai n menjadi 0 yakni disaat fungsi rusak(0). 
Pada saat rusak(0) dipanggil, fungsi akan mengembalikan tanpa mencetak apapun. Jadi, String hello akan dipanggil sebanyak 1994 kali, ini diperoleh dengan menjumlahkan nilai n pada setiap recursive call.</p>


![Screenshot 2024-06-14 010550](https://github.com/mdimasfirmansyah/Java-Test/assets/57607971/dad40cfb-bf60-41da-a208-6267d2567c66)

Berapakah return value dari pemanggilan roger(8,8)?
<p align="justify"> Program ini mengembalikan jumlah bilangan dalam rentang 1 hingga b yang merupakan pembagi dari k. menggunakan rekursi untuk memeriksa setiap nilai dari b ke 1, menambah 1 jika k habis dibagi b dan 0 jika tidak. Basis rekursi tercapai saat b sama dengan 1, yang selalu mengembalikan 1 karena 1 adalah pembagi semua bilangan. Return value yang dihasilkan dari pemanggilan roger(8,8) adalah 4.   </p>

![image](https://github.com/mdimasfirmansyah/Java-Test/assets/57607971/5044defe-b996-4dc6-89dd-cb10b4f4c413)
<p align="justify"> Program ini menghitung jumlah karakter uppercase, lowercase, angka, dan simbol dalam string input. Program memulai dengan mendefinisikan variabel penghitung untuk masing-masing kategori. Kemudian, melalui loop, setiap karakter dalam string diperiksa: jika karakter adalah huruf kapital, penghitung uppercaseCount ditambah satu; jika huruf kecil, penghitung lowercaseCount ditambah satu; jika angka, penghitung digitCount ditambah satu; dan jika bukan ketiganya, dianggap sebagai simbol dan penghitung symbolCount ditambah satu. Hasil perhitungan untuk input kata "pemrogramanDasarJava1" adalah sebagai berikut:  </p>

![Screenshot 2024-06-14 012102](https://github.com/mdimasfirmansyah/Java-Test/assets/57607971/b5e70050-0bc1-4714-b0b4-a5f97e4bbc52)
