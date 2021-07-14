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
import model.Seat;

/**
 *
 * @author Admin
 */
public class SeatDAO extends DBContext{
    public List<Seat> getListSeat(String sql){
        List<Seat> seat = new ArrayList<>();
        try{
            PreparedStatement st=connection.prepareStatement(sql);
            ResultSet rs=st.executeQuery();
            while(rs.next()){
                int id = rs.getInt(1);
                String row = rs.getString(2);
                int num  = rs.getInt(3);
                Seat s = new Seat(id, row, num);
                seat.add(s);
            }
            return seat;
        }catch(SQLException e){
            System.out.println(e);
        }
        return null;
    }
            
    public String getSeatById(int id){
        String sql = "select * from seat where seat_id = "+id;
        Seat s = getListSeat(sql).get(0);
        return s.getRow()+s.getNumber();
    }
    public static void main(String[] args) {
        System.out.println(new SeatDAO().getSeatById(55));
    }
}
