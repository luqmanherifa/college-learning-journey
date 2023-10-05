<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="description" content="">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <!-- The above 4 meta tags *must* come first in the head; any other head content must come *after* these tags -->

    <!-- Title  -->
    <title>LUQFE - PET SHOP | CART</title>

    <!-- Favicon  -->
    <link rel="icon" href="img/core-img/icon.PNG">
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
    <!-- Core Style CSS -->
    <link rel="stylesheet" href="css/core-style.css">
    <link rel="stylesheet" href="style.css">

</head>

<body>
    <?php 
// Start the session
error_reporting(0);
session_start();
       if(!isset($_SESSION['Email'])) {
           header('location:Login.php'); 
        } else { 
           $username = $_SESSION['Email']; 
        }
require 'koneksi.php';
require 'item.php';

if(isset($_GET['id']) && !isset($_POST['update']))  { 
    $sql = "SELECT * FROM data_toko WHERE ID_Barang=".$_GET['id'];
    $result = mysqli_query($conn, $sql);
    $product = mysqli_fetch_object($result);
    $item = new Item();
    $item->id = $product->ID_Barang;
    $item->name = $product->Nama_Barang;
    $item->price = $product->Harga;
    $iteminstock = $product->Stok;
    $item->quantity = 1;
    // Check product is existing in cart
    $index = -1;
    $cart = unserialize(serialize($_SESSION['cart'])); // set $cart as an array, unserialize() converts a string into array
    for($i=0; $i<count($cart);$i++)
        if ($cart[$i]->id == $_GET['id']){
            $index = $i;
            break;
        }
        if($index == -1) 
            $_SESSION['cart'][] = $item; // $_SESSION['cart']: set $cart as session variable
        else {
            
            if (($cart[$index]->quantity) < $iteminstock)
                 $cart[$index]->quantity ++;
                 $_SESSION['cart'] = $cart;
        }
}
// Delete product in cart
if(isset($_GET['index']) && !isset($_POST['update'])) {
    $cart = unserialize(serialize($_SESSION['cart']));
    unset($cart[$_GET['index']]);
    $cart = array_values($cart);
    $_SESSION['cart'] = $cart;
}
// Update quantity in cart
if(isset($_POST['update'])) {
  $arrQuantity = $_POST['quantity'];
  $cart = unserialize(serialize($_SESSION['cart']));
  for($i=0; $i<count($cart);$i++) {
     $cart[$i]->quantity = $arrQuantity[$i];
  }
  $_SESSION['cart'] = $cart;
}
?>
    <!-- Search Wrapper Area Start -->
    <div class="search-wrapper section-padding-100">
        <div class="search-close">
            <i class="fa fa-close" aria-hidden="true"></i>
        </div>
        <div class="container">
            <div class="row">
                <div class="col-12">
                    <div class="search-content">
                        <form action="#" method="get">
                            <input type="search" name="search" id="search" placeholder="Type your keyword...">
                            <button type="submit"><img src="img/core-img/search.png" alt=""></button>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- Search Wrapper Area End -->

    <!-- ##### Main Content Wrapper Start ##### -->
    <div class="main-content-wrapper d-flex clearfix">

        <!-- Mobile Nav (max width 767px)-->
        <div class="mobile-nav">
            <!-- Navbar Brand -->
            <div class="amado-navbar-brand">
                <a href="index.php"><img src="img/core-img/logo.png" alt=""></a>
            </div>
            <!-- Navbar Toggler -->
            <div class="amado-navbar-toggler">
                <span></span><span></span><span></span>
            </div>
        </div>

        <!-- Header Area Start -->
        <header class="header-area clearfix">
            <!-- Close Icon -->
            <div class="nav-close">
                <i class="fa fa-close" aria-hidden="true"></i>
            </div>
            <!-- Logo -->
            <div class="logo">
                <a href="index.php"><img src="img/core-img/logo.png" alt=""></a>
            </div>
            <!-- Amado Nav -->
            <nav class="amado-nav">
                <ul>
                    <li><a href="index.php">Home</a></li>
                    <li><a href="shop-aksesoris.php">Shop</a></li>
                    <li class="active"><a href="cart.php">Cart</a></li>
                </ul>
            </nav>
            <br>
            
            <div class="copywrite">
               Selamat Datang, <?php echo $username;?>
                <br>
                <a href="Editdata.php"><b>Edit data</b></a>
                <br>
                <a href="Logout.php"><b>Logout</b></a>
            </div>

            <!-- Button Group -->
            <div class="amado-btn-group mt-30 mb-100">
                <a href="Login.php" class="btn amado-btn mb-15">Login</a>
                <a href="Daftar.php" class="btn amado-btn active">Create Account</a>
            </div>
            
            <!-- Social Button -->
            <div class="social-info d-flex justify-content-between">
                <a href="#"><i class="fa fa-pinterest" aria-hidden="true"></i></a>
                <a href="#"><i class="fa fa-instagram" aria-hidden="true"></i></a>
                <a href="#"><i class="fa fa-facebook" aria-hidden="true"></i></a>
                <a href="#"><i class="fa fa-twitter" aria-hidden="true"></i></a>
            </div>
        </header>
        <!-- Header Area End -->

        <div class="cart-table-area section-padding-100">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-12 col-lg-8">
                        <div class="cart-title mt-50">
                            <h2>Shopping Cart</h2>
                        </div>

                        <div class="cart-table clearfix">
                            <form method="POST">
                                <table class="table table-responsive">
                                <thead>
                                    <tr>
                                        <th></th>
                                        <th>Name</th>
                                        <th>Price</th>
                                        <th>Quantity</th>
                                        <th>Subtotal</th>
                                    </tr>
                                </thead>

                                <tbody>
                                    <?php 
                                     $cart = unserialize(serialize($_SESSION['cart']));
                                     $s = 0;
                                     $index = 0;
                                    for($i=0; $i<count($cart); $i++){
                                        $s += $cart[$i]->price * $cart[$i]->quantity;
                                    ?> 
                                    
                                    <tr>
                                        <td class="cart_product_desc"><a href="cart.php?index=<?php echo $index; ?>" onclick="return confirm('Are you sure?')" >Delete</a> 
                                        </td>
                                        <td class="cart_product_desc">
                                            <h5><?php echo $cart[$i]->name; ?></h5>
                                        </td>
                                        <td class="price">
                                            <span>Rp. <?php echo $cart[$i]->price; ?> </span>
                                        </td>
                                        <td class="qty">
                                            <div class="qty-btn d-flex">
                                                <div class="quantity">
                                                    <input type="number" class="qty-text" id="qty" min="1" max="300" name="quantity[]" value="<?php echo $cart[$i]->quantity; ?>" >
                                                </div>
                                            </div>
                                        </td>
                                        <td> Rp.<?php echo $cart[$i]->price * $cart[$i]->quantity; ?> </td>
                                    </tr>
                                    <?php 
                                        $index++;
                                    } ?>
                                </tbody>
                                <input id="saveimg" type="image" name="update" alt="Refresh Price">
                                         <input type="hidden" name="update">
                                <td><a href="shop-aksesoris.php">Continue Shopping</a></td>
                            </table>
                        </form>
                        </div>
                    </div>
                    <div class="col-12 col-lg-4">
                        <form action="" method="POST" >
                        <div class="cart-summary">
                            <h5>Cart Total</h5>
                            <ul class="summary-table">
                                
                                <li>
                                    <span>total: </span> 
                                    <span>Rp.<?php echo $s; ?></span>
                                </li>
                            </ul>
                            <ul class="summary-table">
                                
                                <li>
                                    <span>bayar: </span> 
                                    <span><input name="bayar" type="bayar" class="form-control" id="bayar" placeholder="Bayar Disini" value=""></span>
                                </li>
                            </ul>
                            <ul class="summary-table">
                                
                                <li>
                                    <span>Kembalian: </span>
                                </li> 
                                    <?php
                                        if(isset($_POST['upkembalian'])) {
                                        $total = $s;
                                        $bayar = $_POST['bayar'];
                                        // Cek textbox input kosong atau tidak
                                        if(empty($bayar)){
                                            echo "<div class='alert alert-warning' role='alert'>Anda Belum Membayar</div>";
                                        
                                        // Cek apakah data sudah ada
                                        }elseif ($bayar>=$s){
                                            $k = $bayar-$s;
                                            echo "<p>Anda Membayar Rp. ". $bayar .". Kembalian ". $k ."<p";
                                        
                                        //Input data ke database
                                        }elseif ($bayar<$s) {
                                            $ku = $s-$bayar;
                                            echo "<div class='alert alert-warning' role='alert'>Uang yang Anda bayar Rp. ". $bayar .". Kurang ". $ku ." Tolong Bayar Ulang</div>";
                                        }

                                        
                                        
                                    }
                                    ?>
                                    
                            </ul>
                            <button type="upkembalian" name="upkembalian" class="btn btn-primary active">Cek Kembalian</button>
                            <br>
                            <p>----------------------------------------------------</p>
                            <h5>Data Anda</h5>
                            <ul class="summary-table">
                                    <?php
                                        $a = $_SESSION['Email'];
                                        $sql1 = "SELECT * FROM data_pelanggan WHERE Email = '$a'";
                                        $query1 = mysqli_query($conn, $sql1);
                                            while ($row = mysqli_fetch_object($query1)){
                                                echo '<p>Nama          : '.$row->Nama.     '</p>';
                                                echo '<p>Email         : '.$row->Email.    '</p>';
                                                echo '<p>Alamat        : '.$row->Alamat.   '</p>';
                                                echo '<p>Kode Pos      : '.$row->kodepos.  '</p>';
                                                echo '<p>Nomer Telepon : '.$row->tlp.      '</p>';
                                            }
                                    ?>
                            </ul>
                            <div class="cart-btn mt-100">
                                <a href="Checkout.php" class="btn amado-btn w-100">Checkout</a>
                            </div>
                        </div>
                        </form>
                    </div>
                    <?php 
                    if(isset($_GET["id"]) || isset($_GET["index"])){  
                    } 
                    ?>
                </div>
            </div>
        </div>
    </div>
    <!-- ##### Main Content Wrapper End ##### -->

    <!-- ##### Footer Area Start ##### -->
    <footer class="footer_area clearfix">
        <div class="container">
            <div class="row align-items-center">
                <!-- Single Widget Area -->
                <div class="col-12 col-lg-4">
                    <div class="single_widget_area">
                        <!-- Logo -->
                        <div class="footer-logo mr-50">
                            <a href="index.php"><img src="img/core-img/logo2.png" alt=""></a>
                        </div>
                        <!-- Copywrite Text -->
                        <p class="copywrite"><!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
Copyright &copy;<script>document.write(new Date().getFullYear());</script> All rights reserved | This template is made with <i class="fa fa-heart-o" aria-hidden="true"></i> by <a href="https://colorlib.com" target="_blank">Colorlib</a>
<!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. --></p>
                    </div>
                </div>
                <!-- Single Widget Area -->
                <div class="col-12 col-lg-8">
                    <div class="single_widget_area">
                        <!-- Footer Menu -->
                        <div class="footer_menu">
                            <nav class="navbar navbar-expand-lg justify-content-end">
                                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#footerNavContent" aria-controls="footerNavContent" aria-expanded="false" aria-label="Toggle navigation"><i class="fa fa-bars"></i></button>
                                <div class="collapse navbar-collapse" id="footerNavContent">
                                    <ul class="navbar-nav ml-auto">
                                        <li class="nav-item active">
                                            <a class="nav-link" href="index.html">Home</a>
                                        </li>
                                        <li class="nav-item">
                                            <a class="nav-link" href="shop-aksesoris.php">Shop</a>
                                        </li>
                                        <li class="nav-item">
                                            <a class="nav-link" href="cart.php">Cart</a>
                                        </li>
                                    </ul>
                                </div>
                            </nav>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </footer>
    <!-- ##### Footer Area End ##### -->

    <!-- ##### jQuery (Necessary for All JavaScript Plugins) ##### -->
    <script src="js/jquery/jquery-2.2.4.min.js"></script>
    <!-- Popper js -->
    <script src="js/popper.min.js"></script>
    <!-- Bootstrap js -->
    <script src="js/bootstrap.min.js"></script>
    <!-- Plugins js -->
    <script src="js/plugins.js"></script>
    <!-- Active js -->
    <script src="js/active.js"></script>

</body>

</html>