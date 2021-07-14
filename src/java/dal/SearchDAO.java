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
import model.Search;

/**
 *
 * @author Admin
 */
public class SearchDAO extends DBContext{
    public int search(String searchValue){
        String sql = "INSERT INTO search(search_value) values (N'"+searchValue+"')";
        try{
            PreparedStatement st=connection.prepareStatement(sql);
            return st.executeUpdate();
        }catch(SQLException e){
            System.out.println(e);
        }
        return 0;
    }
    public static void main(String[] args) {
        System.out.println(new SearchDAO().search("lmao"));
    }
    public List<String> getTopSearch(int i){
        List<String> l = new ArrayList<>();
        String sql = "select top "+i+" search_value,count(search_value) as s from search\n" +
                        "group by search_value order by s desc";
        try{
            PreparedStatement st=connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                l.add(rs.getString(1));
            }
            return l;
        }catch(SQLException e){
            System.out.println(e);
        }
        return null;
    }
}
