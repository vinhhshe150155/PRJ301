/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;
import model.Category;


/**
 *
 * @author Admin
 */
public class CategoryDAO extends DBContext{
    public List<Category> listCategory(String sql){
        List<Category> l = new ArrayList<>();
        try{
            PreparedStatement st=connection.prepareStatement(sql);
            ResultSet rs=st.executeQuery();
            while(rs.next()){
                int id = Integer.parseInt(rs.getString(1));
                String name = rs.getString(2);
                Category c = new Category(id, name);
                l.add(c);
            }
            return l;
        }catch(SQLException e){
            System.out.println(e);
        }
        return null;
    }
    public Category getCategoryByID(int id){
        String sql = "select * from category where category_id = "+id;
        return listCategory(sql).get(0);
    }
    public List<Category> getAllCategory(){
        String sql = "select * from category";
        return listCategory(sql);
    }
    
    public List<Category> getCategoryByFilm(int film){
        String sql = "select * from filmCate where film_id = "+film;
        List<Category> l = new ArrayList<>();
        try{
            PreparedStatement st=connection.prepareStatement(sql);
            ResultSet rs=st.executeQuery();
            while(rs.next()){
                int id = Integer.parseInt(rs.getString(1));
                Category a = getCategoryByID(id);
                l.add(a);
            }
            return l;
        }catch(SQLException e){
            System.out.println(e);
        }
        return null;
    }
    /*
        public static void main(String[] args) throws ParseException {
//        List<Category> seat = new CategoryDAO().getAllCategory();
//        seat.forEach((_item) -> {
//            System.out.println(_item.getId()+" "+_item.getName());
//        });
//INSERT INTO ticket values (1,'2020-11-11 13:23:44', 90000, 1)

        Random r = new Random();
//        Date date = new Date();
            int arr[]=new int [358];
//            System.out.println(b);
            for(int j=0; j<358; j++){
                arr[j]=j;
            }
        for(int i=0; i<17; i++){
            int a = r.nextInt(16)+1;
            String b = "'"+
                    2021+
                    "-"+
                    (r.nextInt(12)+1)+
                    "-"+
                    (r.nextInt(28)+1)+
                    " "+
                    r.nextInt(24)+
                    ":"+
                    r.nextInt(60)+
                    ":"+
                    r.nextInt(60)+"'";
            int c = r.nextInt(4)+1;
            
            
            int d = 0;
            while(d==0){
                d = arr[r.nextInt(358)];
                arr[d]=0;
            }
            System.out.println("INSERT INTO showing values ("+
                    a+
                    ","+
                    c+
                    ","+b+")");
        }
    }
*/
    public static void main(String[] args) {
        System.out.println(new CategoryDAO().getCategoryByFilm(1).get(0).getName());
    }
}
