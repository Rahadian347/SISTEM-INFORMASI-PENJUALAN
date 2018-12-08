/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penjualan.implement;
import penjualan.entity.barang;
    import penjualan.interfc.barangInterfc;
    import penjualan.koneksi.koneksi;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import penjualan.interfc.barangInterfc;
import penjualan.view.barangView;

/**
 *
 * @author Rahadian Permana
 */
public class barangImplement implements barangInterfc{
     //Inser Barang
    public barang insert(barang o) throws SQLException {
       PreparedStatement st = koneksi.getConnection().prepareStatement
        ("insert into tabel_barang values(?,?,?,?)");
        st.setString(1, o.getKodeBarang());
        st.setString(2, o.getNamaBarang());
        st.setString(3, o.getJml());
        st.setString(4, o.getHarga());
        st.executeUpdate();
        return o;
    }
    
    //Update Barang
    public void update(barang o) throws SQLException {
       PreparedStatement st = koneksi.getConnection().prepareStatement
        ("update tabel_barang set nama_barang=?,jumlah=?,harga=? where kode_barang=?");
        
        st.setString(1, o.getNamaBarang());
        st.setString(2, o.getJml());
        st.setString(3, o.getHarga());
        st.setString(4, o.getKodeBarang());
        st.executeUpdate();
      
    }

   //delete Barang
    public void delete(String Kode_Barang) throws SQLException{
    PreparedStatement st = koneksi.getConnection().prepareStatement
        ("delete from tabel_barang where kode_barang=?");
        st.setString(1, Kode_Barang);
        st.executeUpdate();
        
    }
    
     public  List<barang> getAll() throws SQLException{
        Statement st = koneksi.getConnection().createStatement();
        ResultSet rs = st.executeQuery("select * from tabel_barang");
        List<barang>list=new ArrayList<barang>();
        while (rs.next()) {
            barang brg = new barang();
             brg.setKodeBarang(rs.getString("kode_barang"));
             brg.setNamaBarang(rs.getString("nama_barang"));
             brg.setJml(rs.getString("jumlah"));
             brg.setHarga(rs.getString("harga"));
             list.add(brg);
        }
        
        return list;
    }
 
}
