<?php
   session_start();
   require_once("koneksi.php");
   $username = $_POST['email'];
   $pass = $_POST['pass'];   
   $sql = "SELECT * FROM data_pelanggan WHERE Email = '$username'";
   $query = $conn->query($sql);
   $hasil = $query->fetch_assoc();
   if($query->num_rows == 0) {
     echo "<div align='center'>Username Belum Terdaftar! <a href='Login.php'>Back</a></div>";
   } else {
     if($pass <> $hasil['Password']) {
       echo "<div align='center'>Password salah! <a href='Login.php'>Back</a></div>";
     } else {
       $_SESSION['Email'] = $hasil['Email'];
       header('location:index.php');
     }
   }
?>