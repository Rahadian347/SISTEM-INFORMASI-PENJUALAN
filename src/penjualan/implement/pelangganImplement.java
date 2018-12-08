/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penjualan.implement;
import penjualan.entity.pelanggan;
 import penjualan.interfc.pelangganInterfc; 
    import penjualan.koneksi.koneksi;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import penjualan.entity.barang;
import penjualan.interfc.pelangganInterfc;

/**
 *
 * @author Rahadian Permana
 */
public class pelangganImplement implements pelangganInterfc{
    //Insert Barang
    public pelanggan insert(pelanggan o) throws SQLException {
       PreparedStatement st = koneksi.getConnection().prepareStatement
        ("insert into pelanggan values(?,?,?,?,?)");
        st.setString(1, o.getIdPel());
        st.setString(2, o.getNama());
        st.setString(3, o.getJenisKelamin());
        st.setString(4, o.getAlamat());
        st.setString(5, o.getNoTelp());
        st.executeUpdate();
        return o;
    }
    
    //Update Barang
    
    public void update(pelanggan o) throws SQLException {
      PreparedStatement st = koneksi.getConnection().prepareStatement
       ("update pelanggan set nama=?,jenis_kelamin=?,alamat=?,no_telp=? where id_pelanggan=?");
       
       st.setString(1, o.getNama());
        st.setString(2, o.getJenisKelamin());
        st.setString(3, o.getAlamat());
        st.setString(4, o.getNoTelp());
       st.setString(5, o.getIdPel());
       st.executeUpdate();       
    }
    

    //delete Barang
    public void delete(String id_pelanggan) throws SQLException{
    PreparedStatement st = koneksi.getConnection().prepareStatement
        ("delete from pelanggan where id_pelanggan=?");
        st.setString(1, id_pelanggan);
        st.executeUpdate();
        
    }
    
    public List<pelanggan> getAll() throws SQLException{
        Statement st = koneksi.getConnection().createStatement();
        ResultSet rs = st.executeQuery("select * from pelanggan");
        List<pelanggan>list=new ArrayList<pelanggan>();
        while (rs.next()) {
            pelanggan pel = new pelanggan();
             pel.setIdPel(rs.getString("id_pelanggan"));
             pel.setNama(rs.getString("nama"));
             pel.setJenisKelamin(rs.getString("jenis_kelamin"));
             pel.setAlamat(rs.getString("alamat"));
             pel.setNoTelp(rs.getString("no_telp"));
             list.add(pel);
        }        
        return list;
    }

   

 
}
