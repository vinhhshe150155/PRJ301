/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;

/**
 *
 * @author Admin
 */
public class GraphDAO extends DBContext{
    public int getUserToday() throws SQLException{
        String sql = "select  count(customer_id) from customer where createdDate =  CAST( GETDATE() AS Date )";
        try{
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                return rs.getInt(1);
            }
        }catch(SQLException e){
            System.out.println(e);
        }
        return 0;
    }
    
    public int getTicketToday() throws SQLException{
        String sql = "select count(*) from order_details o inner join total t on o.total_id = t.total_id where t.status=1 and t.total_date = cast(getdate() as date)";
        try{
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                return rs.getInt(1);
            }
        }catch(SQLException e){
            System.out.println(e);
        }
        return 0;
    }
    public int getTotalToday(){
        String sql = "select sum(tk.ticket_price) from order_details  o inner join total t on o.total_id = t.total_id\n" +
"inner join ticket tk on o.ticket_id = tk.ticket_id\n" +
" where t.total_date=cast(getdate() as date) ";
        try{
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                return rs.getInt(1);
            }
        }catch(SQLException e){
            System.out.println(e);
        }
        return 0;
    }
    public int getTicketByDate(int date){
        String sql = "select  count(*) from order_details o inner join total t on o.total_id = t.total_id where t.total_date=cast(getdate()-? as date)";
        try{
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, date);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                return rs.getInt(1);
            }
        }catch(SQLException e){
            System.out.println(e);
        }
        return 0;
    }
    public String get10DayTicket(){
        String s = "";
        for(int i=0; i<10; i++){
            s+=+getTicketByDate(9-i)+",";
        }
        if(s.endsWith(",")){
            s = s.substring(0, s.length()-1);
        }
        return s;
    }
//    public static void main(String[] args) throws SQLException {
//        String ar = new GraphDAO().get10DayTicket();
//        System.out.println(ar);
//        ;
//    }
}
