package com.example.ryan.datakaryawan;

public class konfigurasi {

    //JANGAN LUPA SESUAIKAN IP KOMPUTER DIMANA DATA PHP HTDOCS ANDROIDS BERADA
    public static final String URL_ADD="http://192.168.43.228/androids/tambah.php";
    public static final String URL_GET_ALL = "http://192.168.43.228/androids/tampilSemua.php";
    public static final String URL_GET_EMP = "http://192.168.43.228/androids/tampil.php?id=";
    public static final String URL_UPDATE_EMP = "http://192.168.43.228/androids/update.php";
    public static final String URL_DELETE_EMP = "http://192.168.43.228/androids/hapus.php?id=";

    //Dibawah ini merupakan Kunci yang akan digunakan untuk mengirim permintaan ke Scrip PHP
    public static final String KEY_EMP_ID = "id"; //id itu variabel untuk id
    public static final String KEY_EMP_NAMA = "name"; //name itu variabel untuk name
    public static final String KEY_EMP_POSISI = "desg"; //desg itu variabel untuk posisi
    public static final String KEY_EMP_GAJIH = "salary"; //salary itu variabel untuk gajih

    //JSON Tags
    public static final String TAG_JSON_ARRAY="result";
    public static final String TAG_ID = "id";
    public static final String TAG_NAMA = "name";
    public static final String TAG_POSISI = "desg";
    public static final String TAG_GAJIH = "salary";

    //ID karyawan
    public static final String EMP_ID = "emp_id"; //emp itu singkatan dari Employee
}