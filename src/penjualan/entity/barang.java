/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package penjualan.entity;

/**
 *
 * @author Rahadian Permana
 */
public class barang {
    private String kode_Barang;
    private String nama_Barang;
    private int jumlah;
    private double harga;
    String jml = String.valueOf(jumlah);
    String hrg = String.valueOf(harga);
    
    public String getKodeBarang() {
        return kode_Barang;
    }

    public void setKodeBarang(String kodeBarang) {
        this.kode_Barang = kodeBarang;
    }

    public String getNamaBarang() {
        return nama_Barang;
    }

    public void setNamaBarang(String namaBarang) {
        this.nama_Barang = namaBarang;
    }

    public String getJml() {
        return jml;
    }

    public void setJml(String jml) {
        this.jml = jml;
    }

    public String getHarga() {
        return hrg;
    }

    public void setHarga(String hrg) {
        this.hrg = hrg;
    }
}
