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
import model.Account;
import model.Language;

/**
 *
 * @author Admin
 */
public class LanguageDAO extends DBContext{
    public List<Language> listLanguage(String sql){
        List<Language> l = new ArrayList<>();
        try{
            PreparedStatement st=connection.prepareStatement(sql);
            ResultSet rs=st.executeQuery();
            while(rs.next()){
                int id = Integer.parseInt(rs.getString(1));
                String name = rs.getString(2);
                Language lang = new Language(id, name);
                l.add(lang);
            }
            return l;
        }catch(SQLException e){
            System.out.println(e);
        }
        return null;
    }
    public Language getLanguageByID(int id){
        String sql = "select * from languages where language_id = "+id;
        return listLanguage(sql).get(0);
    }
        public List<Language> getAllLanguage(){
        String sql = "select * from languages";
        return listLanguage(sql);
    }
    
        public List<Language> getLanguageByFilm(int film){
        String sql = "select * from filmLanguage where film_id = "+film;
        List<Language> l = new ArrayList<>();
        try{
            PreparedStatement st=connection.prepareStatement(sql);
            ResultSet rs=st.executeQuery();
            while(rs.next()){
                int id = Integer.parseInt(rs.getString(2));
                Language a = getLanguageByID(id);
                l.add(a);
            }
            return l;
        }catch(SQLException e){
            System.out.println(e);
        }
        return null;
    }
    
    public static void main(String[] args) {
        LanguageDAO l = new LanguageDAO();
        System.out.println(l.getLanguageByFilm(1).get(1).getName());
    }
}
