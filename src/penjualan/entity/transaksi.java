/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penjualan.entity;

/**
 *
 * @author Rahadian Permana <mrahadian.permana@gmail.com>
 */
public class transaksi {
    private String kode_faktur;
    private String kode_barang;
    private String id_pelanggan;
    private int jumlah;
    private double harga;
    String jml = String.valueOf(jumlah);
    String hrg = String.valueOf(harga);

    public String getKode_faktur() {
        return kode_faktur;
    }

    public void setKode_faktur(String kode_faktur) {
        this.kode_faktur = kode_faktur;
    }

    public String getKode_barang() {
        return kode_barang;
    }

    public void setKode_barang(String kode_barang) {
        this.kode_barang = kode_barang;
    }

    public String getId_pelanggan() {
        return id_pelanggan;
    }

    public void setId_pelanggan(String id_pelanggan) {
        this.id_pelanggan = id_pelanggan;
    }

    public String getJml() {
        return jml;
    }

    public void setJml(String jml) {
        this.jml = jml;
    }

    public String getHrg() {
        return hrg;
    }

    public void setHrg(String hrg) {
        this.hrg = hrg;
    }
    

        
}
