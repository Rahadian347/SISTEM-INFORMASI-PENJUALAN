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
public class pelanggan {
    private int id_pelanggan;
    private String nama;
    private String jenis_kelamin;
    private String Alamat;
    private String no_telp;
    String idPel = String.valueOf(id_pelanggan);


    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenisKelamin() {
        return jenis_kelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenis_kelamin = jenisKelamin;
    }

    public String getAlamat() {
        return Alamat;
    }

    public void setAlamat(String alamat) {
        this.Alamat = alamat;
    }

    public String getNoTelp() {
        return no_telp;
    }

    public void setNoTelp(String noTelp) {
        this.no_telp = noTelp;
    }

    public String getIdPel() {
        return idPel;
    }

    public void setIdPel(String idPel) {
        this.idPel = idPel;
    }
    
}
