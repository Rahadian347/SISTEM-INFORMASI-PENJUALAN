/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penjualan.implement;
import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import penjualan.koneksi.koneksi;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import penjualan.entity.transaksi;
import penjualan.interfc.transaksiInterfc;
/**
 *
 * @author Rahadian Permana
 */
public class transaksiImplement implements transaksiInterfc {
    public int urutanDb() {
        Connection con =(Connection)koneksi.getConnection();
        int jml = 0;
        try {
            String sql = "Select count(*) As urutan from penjualan";
            Statement rs = (Statement) con.createStatement();
            ResultSet count = rs.executeQuery(sql);
            while (count.next()) {                
                jml = count.getInt("urutan");
            }
            rs.close();
            count.close();
        }catch (Exception e){
            e.printStackTrace();
        } 
       return ++jml;
    }
    
     public transaksi insert(transaksi o) throws SQLException {
       PreparedStatement st = koneksi.getConnection().prepareStatement
        ("insert into penjualan values(?,?,?,?,?)");
        st.setString(1, o.getKode_faktur());
        st.setString(2, o.getKode_barang());
        st.setString(3, o.getId_pelanggan());
        st.setString(4, o.getJml());
        st.setString(5, o.getHrg());
        st.addBatch();
        st.executeUpdate();
        return o;
    }    
    
    public ArrayList<String> viewKdBarang() throws SQLException{
     ArrayList<String> viewNamaBarang = new ArrayList();
     try { 
         Statement kt = koneksi.getConnection().createStatement();
         ResultSet rsKb = kt.executeQuery("Select kode_barang,nama_barang from tabel_barang");
         while (rsKb.next()) {
             viewNamaBarang.add(rsKb.getString("kode_barang")+"-"+(rsKb.getString("nama_barang")));
            }
         } catch (Exception e){
            e.printStackTrace();
                 }
     return viewNamaBarang;
     }

    public ArrayList<String> viewIdPelanggan() throws SQLException{
        ArrayList<String> viewNamaPelanggan = new ArrayList();
        try { 
            Statement kt = koneksi.getConnection().createStatement();
            ResultSet rsKb = kt.executeQuery("Select id_pelanggan,nama from pelanggan");
            while (rsKb.next()) {
             viewNamaPelanggan.add(rsKb.getString("id_pelanggan")+"-"+(rsKb.getString("nama")));
            }
        } catch (Exception e){
            e.printStackTrace();
                 }
     return viewNamaPelanggan;
    }

}
    
    
    
    
    
    
    
    
    
    
    
    
    
    

