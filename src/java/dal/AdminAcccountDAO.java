/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.AdminAccount;

/**
 *
 * @author Admin
 */
public class AdminAcccountDAO extends DBContext{
    public int insertAccount(AdminAccount ad){
        String sql = "insert into admin values(?, ?)";
        try{
            PreparedStatement st=connection.prepareStatement(sql);
            st.setString(1, ad.getUsername());
            st.setString(2, ad.getPassword());
            return st.executeUpdate();
        }catch(SQLException e){
            System.out.println(e);
        } 
        return 0;
    }
    public AdminAccount getAccount(AdminAccount ad){
        String sql = "select * from admin where admin_username = ? and admin_pwd = ?";
        try{
            PreparedStatement st=connection.prepareStatement(sql);
            st.setString(1, ad.getUsername());
            st.setString(2, ad.getPassword());
            ResultSet rs = st.executeQuery();
            if(rs.next()){
                return new AdminAccount(rs.getInt(1),rs.getString(2), rs.getString(3));
            }
        }catch(SQLException e){
            System.out.println(e);
        }
        return null;
    }
//    public static void main(String[] args) {
//        AdminAccount ad = new AdminAccount("admin12", "admin1");
//        AdminAcccountDAO a = new AdminAcccountDAO();
//        a.insertAccount(ad);
//        System.out.println(a.getAccount(ad).getUsername());
//    }
}
