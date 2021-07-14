/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
//import java.sql.ResultSet;
import java.sql.SQLException;
//import java.util.ArrayList;
import java.util.List;
import model.Ticket;

/**
 *
 * @author Admin
 */
public class PurchaseDAO extends DBContext{
        public int insert(String sql){
        try{
            PreparedStatement st=connection.prepareStatement(sql);
            return st.executeUpdate();
        }catch(SQLException e){
            System.out.println(e);
        }
        return 0;
    }
        public int insertOrderDetails(int tid, int total_id){
            String sql = "INSERT INTO order_details values("+total_id+","+tid+")";
            System.out.println(sql);
            return insert(sql);
        }
        public int insertBill(int customer_id){
            String sql = "INSERT INTO total(customer_id, status) values ("+customer_id+",0)";
            return insert(sql);
        }
        public int sumTicket(int total_id){
            String sql = "select sum(ticket_price) from order_details o inner join ticket t on o.ticket_id = t.ticket_id where o.total_id="+total_id;
            try{
                PreparedStatement st=connection.prepareStatement(sql);
                ResultSet rs = st.executeQuery();
                if(rs.next()){
                    return rs.getInt(1);
                }
            }catch(SQLException e){
                System.out.println(e);
            }
            return 0;
        }
        public void insertOrderDetails(List<Ticket> t,int customer_id){
            String sql = "";
            System.out.println("ID"+customer_id);
            BillDAO b = new BillDAO();
            TicketDAO tDAO = new TicketDAO();
            for(Ticket tk:t){
                tDAO.updateTicket(tk.getId(), 1);
            }
            int bill = new BillDAO().getBillNotPurchaseByUser(customer_id);
            if(bill==0){
                insertBill(customer_id);
                bill = new BillDAO().getBillNotPurchaseByUser(customer_id);
            }
            for(Ticket tk:t){
                insertOrderDetails(tk.getId(), bill);
            }
            System.out.println(bill);
            b.updateBill(customer_id, sumTicket(bill));
            
        }
       
        public static void main(String[] args) {
            System.out.println(new BillDAO().getBillNotPurchaseByUser(1));
    }
}
