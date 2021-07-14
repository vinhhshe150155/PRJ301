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
import model.Ticket;


/**
 *
 * @author Admin
 */
public class TicketDAO extends DBContext{
    public List<Ticket> getTicket(String sql){
        List<Ticket> l = new ArrayList<>();
        try{
            PreparedStatement st=connection.prepareStatement(sql);
            ResultSet rs=st.executeQuery();
            while(rs.next()){
                int id = Integer.parseInt(rs.getString(1));
                int show_id = Integer.parseInt(rs.getString(2));
                int price = Integer.parseInt(rs.getString(3));
                int seat_id = Integer.parseInt(rs.getString(4));
                int status = Integer.parseInt(rs.getString(5));
                Ticket t = new Ticket(id, show_id, price, seat_id, status);
                l.add(t);
            }
            return l;
        }catch(SQLException e){
            System.out.println(e);
        }
        return null;
    }
        public Ticket getTicketByID(String id){
            String sql = "SELECT * FROM ticket where ticket_id="+id;
            return getTicket(sql).get(0);
        }
        public int updateTicket(int id,int status){
            String sql="update ticket set seat_status="+status+" where ticket_id="+id;
            try{
                PreparedStatement st=connection.prepareStatement(sql);
                return st.executeUpdate();
            }catch(SQLException e){
                System.out.println(e);
        }
            return 0;
        }
        public List<Ticket> getTicketByShow(String show_id){
            String sql = "SELECT * FROM ticket where show_id="+show_id;
            return getTicket(sql);
        }
        public int insertTicket(int show_id, int ticket_price, int seat_id){
            String sql = "insert into ticket values(?,?,?,?)";
            try{
                PreparedStatement st=connection.prepareStatement(sql);
                st.setInt(1, show_id);
                st.setInt(2, ticket_price);
                st.setInt(3, seat_id);
                st.setInt(4, 0);
                System.out.println(sql);
                return st.executeUpdate();
            }catch(SQLException e){
                System.out.println(e);
            }
            return 0;
        }
        public void insertTicket(int show_id, int ticket_price){
            for(int i=1; i<=105; i++){
                System.out.println(insertTicket(show_id, ticket_price, i));
            }
        }
        public int getTicketThisMonthByUser(int customer_id){
            String sql = "select count(*) from order_details o inner join total t on o.total_id = t.total_id where customer_id="+customer_id+" and month(GETDATE())=month(t.total_date) and year(GETDATE())=year(t.total_date)";
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
        public int getNumberTotalThisMonthByUser(int customer_id){
            String sql = "select count(*) from total where customer_id="+customer_id+" and status=1 and month(GETDATE())=month(total_date) and year(GETDATE())=year(total_date)";
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
        public int getAmountTotalThisMonthByUser(int customer_id){
            String sql = "select sum(total_amount) from total where customer_id="+customer_id+" and status=1 and month(GETDATE())=month(total_date) and year(GETDATE())=year(total_date) ";
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
//        public static void main(String[] args) {
////            List<Ticket> t = new TicketDAO().getTicketByShow("11");
////            t.forEach((e) -> {
////                System.out.print(e.getId());
////            });
//            System.out.println(new TicketDAO().getAmountTotalThisMonthByUser(42));
//            
//    }
}
