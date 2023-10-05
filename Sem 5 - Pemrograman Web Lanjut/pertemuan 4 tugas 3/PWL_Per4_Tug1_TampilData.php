<?php
    echo "Data Mahasiswa";
    $i=0;
    foreach($data as $tab){
        if($tab['Kelas']!=$daftar){
            continue;
        }else{
            echo "<ul>
        <li>".$tab['NRP']."</li>
        <li>".$tab['Nama']."</li>
        <li>".$tab['Kode_MK']."</li>
        <li>".$tab['Kelas']."</li>
        </ul>";
        }
    }
?>