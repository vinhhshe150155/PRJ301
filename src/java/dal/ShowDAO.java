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
import model.Showing;
import model.Ticket;

/**
 *
 * @author Admin
 */
public class ShowDAO extends DBContext{
    public List<Showing> getShowing(String sql){
        List<Showing> l = new ArrayList<>();
        try{
            PreparedStatement st=connection.prepareStatement(sql);
            ResultSet rs=st.executeQuery();
            while(rs.next()){
                int id = Integer.parseInt(rs.getString(1));
                int film_id = Integer.parseInt(rs.getString(2));
                int room_id = Integer.parseInt(rs.getString(3));
                String show_time = rs.getString(4);
                Showing s = new Showing(id, film_id, room_id, show_time);
                l.add(s);
            }
            return l;
        }catch(SQLException e){
            System.out.println(e);
        }
        return null;
    }
    public List<Showing> getShowingByFilm(int film_id){
        String sql = "select * from showing where film_id="+film_id+" and show_time>=getDate()";
        return getShowing(sql);
    }
    public Showing getShowByID(String id){
       String sql = "select * from showing where show_id="+id;
       return getShowing(sql).get(0);
    }
    public List<Showing> getAllShow(){
       String sql = "select * from showing order by show_id desc";
       return getShowing(sql);
    }
    public int insertShow(int film_id, int room_id, String show_time){
        String sql = "insert into showing values(?,?,?)";
        try{
            PreparedStatement st=connection.prepareStatement(sql);
            st.setInt(1, film_id);
            st.setInt(2, room_id);
            st.setString(3, show_time);
//            System.out.println(sql);
            return st.executeUpdate();
        }catch(SQLException e){
            System.out.println(e);
        }
        return 0;
    }
    public int getShowLastest(){
        String sql = "select MAX(show_id) from showing";
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
    public int updateShow(Showing s){
        String sql = "update showing set room_id=?, show_time=? where show_id=?";
        try{
            PreparedStatement st=connection.prepareStatement(sql);
//            System.out.println(sql);
//            System.out.println(s.getTime());
            st.setInt(1, s.getRoom_id());
            st.setString(2, s.getTime());
            st.setInt(3, s.getId());
            return st.executeUpdate();
        }catch(SQLException e){
            System.out.println(e);
        }
        return 0;
    }
    public void insertShowAndTicket(int film_id, int room_id, String show_time){
        System.out.println(insertShow(film_id, room_id, show_time));
            TicketDAO t = new TicketDAO();
            
            t.insertTicket(getShowLastest(), 80000);
        
    }
    public List<Ticket> getAllTicketLeft(int show_id){
        String sql = "select * from ticket where show_id = "+show_id+" and seat_status = 0";
        return new TicketDAO().getTicket(sql);
    }

//    public static void main(String[] args) {
//      ShowDAO l = new ShowDAO();
////      l.insertShowAndTicket(2, 1, "2021-07-15 10:16:000");
////String ghe = "ABCDEFG";
////    int count=1;
////        for(int j=0; j<7; j++){
////            for(int i=1; i<=15; i++){
////                String sql = "UPDATE seat set seat_row='"+ghe.charAt(j)+"', seat_number ="+i+" where seat_id = "+count++;
////                System.out.println(sql);
////            }
////        }
//        System.out.println(l.getAllTicketLeft(1).size());
//    }
    
}
