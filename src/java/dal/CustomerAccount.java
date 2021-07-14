package dal;
import model.Account;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
public class CustomerAccount extends DBContext{
    
    public List<Account> listAccount(String sql){
        List<Account> l = new ArrayList<>();
        try{
            PreparedStatement st=connection.prepareStatement(sql);
            ResultSet rs=st.executeQuery();
            System.out.println(sql);
            while(rs.next()){
                System.out.println(rs.getString(1));
                int id = Integer.parseInt(rs.getString(1));
                String email = rs.getString(2);
                String pwd = rs.getString(3);
                String name = rs.getString(4);
                String address = rs.getString(5);
                String phone = rs.getString(6);
                String date = rs.getString(7);

                Account a = new Account(id, email, pwd, name, address, phone, date);
                l.add(a);
            }
            return l;
        }catch(SQLException e){
            System.out.println(e);
        }
        return null;
    }
    public List<Account> getAllAccount(){
        String sql = "select * from customer order by createdDate desc";
        List<Account> l = listAccount(sql);
        return l;
    }
    public Account getAccount(String customerEmail,String customerPwd){
        String sql="select * from customer where customer_email= '"+customerEmail+"' and customer_pwd = '"+customerPwd+"'";
        List<Account> l = listAccount(sql);
//        System.out.println(l);
        return l.isEmpty()?null:l.get(0);
    }
        public List<Account> searchAccount(String search){
            search = "'%"+search+"%'";
        String sql="select * from customer where customer_name like"+search;
        System.out.println("GETACCOUNT:"+ sql);
        List<Account> l = listAccount(sql);
//        System.out.println(l);
        return l.isEmpty()?null:l;
    }
    public int create(Account a){
        String sql="insert into customer(customer_email, customer_pwd, customer_name, customer_address, customer_phone) values(?,?,?,?,?)";
        try{
            PreparedStatement st=connection.prepareStatement(sql);            
            st.setString(1, a.getEmail());
            st.setString(2, a.getPassword());
            st.setString(3, a.getName());
            st.setString(4, a.getAddress());
            st.setString(5, a.getPhone());
            System.out.println(st);
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
    public int getAccountIdByEmail(String email){
        String sql="select customer_id from customer where customer_email=?";
        try{
            PreparedStatement st=connection.prepareStatement(sql);
            st.setString(1, email);
            ResultSet rs=st.executeQuery();
            if(rs.next())
                return Integer.parseInt(rs.getString(1));
        }catch(SQLException e){
            System.out.println(e);
        }
        return 0;
    }
    
    public Account getAccountIdById(int id){
        String sql="select * from customer where customer_id="+id;
        List<Account> l = listAccount(sql);
//        System.out.println(l);
        return l.isEmpty()?null:l.get(0);
    }
    public int updateAccount(String id, String name, String email, String password, String address, String phone){
        String sql="update customer set customer_name=?, customer_email=?, customer_pwd=?, customer_address=?, customer_phone=? where customer_id="+id;
        try{
            PreparedStatement st=connection.prepareStatement(sql);
            st.setString(1, name);
            st.setString(2, email);
            st.setString(3, password);
            st.setString(4, address);
            st.setString(5, phone);
            return st.executeUpdate();
        }catch(SQLException e){
            System.out.println(e);
        }
        return 0;
    }
        public int updateAccount(String email, String pass){
        String sql="update customer set customer_pwd = ? where customer_email='"+email+"'";
        try{
            PreparedStatement st=connection.prepareStatement(sql);
            st.setString(1, pass);
            return st.executeUpdate();
        }catch(SQLException e){
            System.out.println(e);
        }
        return 0;
    }
    public static void main(String[] args) {
        System.out.println(new CustomerAccount().getAccount("1@gmail.com", "11111111").getEmail());
    }
}

