package com.stiki.luqman.katalogtokobuku;

public class DataBuku {

    private String judul;
    private String penulis;
    private String penerbit;
    private String harga;
    private String urlgambar;

    public DataBuku(String judul, String penulis, String penerbit, String harga, String urlgambar) {
        this.judul = judul;
        this.penulis = penulis;
        this.penerbit = penerbit;
        this.harga = harga;
        this.urlgambar = urlgambar;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public String getUrlgambar() {
        return urlgambar;
    }

    public void setUrlgambar(String urlgambar) {
        this.urlgambar = urlgambar;
    }

}