/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Bill;
import model.Ticket;

/**
 *
 * @author Admin
 */
public class BillDAO extends DBContext{
    public List<Bill> getBill(String sql){
        List<Bill> l = new ArrayList<>();
        try{
            PreparedStatement st=connection.prepareStatement(sql);
            ResultSet rs=st.executeQuery();
            while(rs.next()){
                int total_id = Integer.parseInt(rs.getString(1));
                int amount = Integer.parseInt(rs.getString(2));
                int customer = Integer.parseInt(rs.getString(3));
                int discount = Integer.parseInt(rs.getString(4));
                String date = rs.getString(5);    
                int status = Integer.parseInt(rs.getString(5));
                Bill b = new Bill(status, amount, customer, discount, date, status);
            }
            return l;
        }catch(SQLException e){
            System.out.println(e);
        }
        return null;
    }
    
        public int getBillNotPurchaseByUser(int customer_id){
        String sql = "select total_id from total where customer_id="+customer_id+" and status=0";
        try{
            PreparedStatement st=connection.prepareStatement(sql);
            ResultSet rs=st.executeQuery();
            if(rs.next()){
                return Integer.parseInt(rs.getString(1));
            }

        }catch(SQLException e){
            System.out.println(e);
        }
        return 0;
    }
    public int updateBill(int customer_id, int amount){
        String sql = "update total set status = 1, total_amount ="+amount+" where customer_id="+customer_id+" and status = 0 ";
        try{
            PreparedStatement st=connection.prepareStatement(sql);
            ResultSet rs=st.executeQuery();
            if(rs.next()){
                return Integer.parseInt(rs.getString(1));
            }

        }catch(SQLException e){
            System.out.println(e);
        }
        return 0;
    }
        public List<Bill> getBillByUser(String email){
            List<Bill> blist = new ArrayList<>();
            String sql = "select * from total where customer_id="+new CustomerAccount().getAccountIdByEmail(email)+" order by total_date desc";
            try{
            PreparedStatement st=connection.prepareStatement(sql);
            ResultSet rs=st.executeQuery();
            while(rs.next()){
                int id = rs.getInt(1);
                int amount = rs.getInt(2);
                int customer_id = rs.getInt(3);
                int discount_id = rs.getInt(4);
                String date = rs.getString(5);
                int status = rs.getInt(6);
                Bill b  = new Bill(id, amount, customer_id, discount_id, date, status);
                blist.add(b);
            }
            return blist;

        }catch(SQLException e){
            System.out.println(e);
        }
            return null;
        }
//        public static void main(String[] args) {
//            System.out.println(new BillDAO().getBillByUser("1").get(0).getDate());
//    }
}
