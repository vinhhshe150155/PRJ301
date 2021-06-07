package dal;

import model.Account;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author ADMIN
 */
public class CustomerAccount extends DBContext{
    public Account getAccount(String customerEmail,String customerPwd){
        String sql="select * from customer where customer_email=? and customer_pwd=?";
        try{
            PreparedStatement st=connection.prepareStatement(sql);
            st.setString(1, customerEmail);
            st.setString(2, customerPwd);
            ResultSet rs=st.executeQuery();
            if(rs.next()){
                return new Account(rs.getString("customer_email"), 
                        rs.getString("customer_pwd"));
            }
        }catch(SQLException e){
            System.out.println(e);
        }
        return null;
    }
    public int create(Account a){
        String sql="insert into customer values(?,?,?,?,?)";
        try{
            PreparedStatement st=connection.prepareStatement(sql);            
            st.setString(1, a.getEmail());
            st.setString(2, a.getPasswowd());
            st.setString(3, a.getName());
            st.setString(4, a.getAddress());
            st.setString(5, a.getPhone());
            return st.executeUpdate();
        }catch(SQLException e){
            System.out.println(e);
        }
        return 0;
    }
    public boolean checkAccountExist(String customerEmail){
        String sql="select * from customer where customer_email=?";
        try{
            PreparedStatement st=connection.prepareStatement(sql);
            st.setString(1, customerEmail);
            ResultSet rs=st.executeQuery();
            return rs.next();
        }catch(SQLException e){
            System.out.println(e);
        }
        return false;
    }
}

