/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Admin
 */
public class VisitDAO extends DBContext{
    public int countVisit(String sql){
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
    public int insertVisit(){
        String sql = "insert into visit values (GETDATE())";
        try{
            PreparedStatement ps = connection.prepareStatement(sql);
            return ps.executeUpdate();
        }catch(SQLException e){
            System.out.println(e);
        }
        return 0;
    }
    public int getVisitByDate(int i){
        String sql ="select count(*) from visit where visit_time = cast(GETDATE()-"+i+" as date)";
        return countVisit(sql);
    }
    public String getVisit7Day(){
        String s = "";
        for(int i=0; i<7; i++){
            s+=getVisitByDate(6-i)+",";
        }
        s=s.substring(0, s.length()-1);
        return s;
    }
    public int getVisitToday(){
        String sql = "select count(*) from visit where visit_time = cast(GETDATE() as date)";
        return countVisit(sql);
    }
    
//    public static void main(String[] args) {
//        System.out.println(new VisitDAO().getVisit7Day());
//    }
}
