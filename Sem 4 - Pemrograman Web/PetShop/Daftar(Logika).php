<?php
   require_once("koneksi.php");
   $nama = $_POST['name'];
   $username = $_POST['eemail'];
   $pass = $_POST['password'];
   $alamat = $_POST['address'];
   $kodepos = $_POST['code'];
   $telp = $_POST['number'];
   $sql = "SELECT * FROM data_pelanggan WHERE Email = '$username'";
   $query = $conn->query($sql);
   if($query->num_rows != 0) {
     echo "<div align='center'>Username Sudah Terdaftar! <a href='Daftar.php'>Back</a></div>";
   } else {
     if(!$username || !$pass) {
       echo "<div align='center'>Data Email dan Password Tidak Boleh Kosong! <a href='Daftar.php'>Back</a>";
     } else {

       $data = "INSERT INTO data_pelanggan(Nama, Email, Password, Alamat, kodepos, tlp) VALUES('$nama','$username','$pass','$alamat','$kodepos','$telp')";
       $simpan = $conn->query($data);
       if($simpan) {
         echo "<div align='center'>Pendaftaran Sukses, Silahkan <a href='Login.php'>Login</a></div>";
       } else {
         echo "<div align='center'>Proses Gagal!</div>";
       }
     }
   }
?>