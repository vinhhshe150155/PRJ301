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
import model.Actor;

/**
 *
 * @author Admin
 */
public class ActorDAO extends DBContext{
    public List<Actor> listActor(String sql){
        List<Actor> l = new ArrayList<>();
        try{
            PreparedStatement st=connection.prepareStatement(sql);
            ResultSet rs=st.executeQuery();
            while(rs.next()){
                int id = Integer.parseInt(rs.getString(1));
                String name = rs.getString(2);
                String image = rs.getString(3);
                String des = rs.getString(4);
                Actor a = new Actor(id, name, image, des);
                l.add(a);
            }
            return l;
        }catch(SQLException e){
            System.out.println(e);
        }
        return null;
    }
    public Actor getActorByID(int id){
        String sql = "select * from actor where actor_id = "+id;
        return listActor(sql).get(0);
    }
    
    public List<Actor> getActorByFilm(int film){
        String sql = "select * from filmActor where film_id = "+film;
        List<Actor> l = new ArrayList<>();
        try{
            PreparedStatement st=connection.prepareStatement(sql);
            ResultSet rs=st.executeQuery();
            while(rs.next()){
                int id = Integer.parseInt(rs.getString(1));
                Actor a = getActorByID(id);
                l.add(a);
            }
            return l;
        }catch(SQLException e){
            System.out.println(e);
        }
        return null;
    }
    public List<Actor> getAllActor(){
        String sql = "select * from filmActor";
        List<Actor> l = new ArrayList<>();
        try{
            PreparedStatement st=connection.prepareStatement(sql);
            ResultSet rs=st.executeQuery();
            while(rs.next()){
                int id = Integer.parseInt(rs.getString(1));
                Actor a = getActorByID(id);
                l.add(a);
            }
            return l;
        }catch(SQLException e){
            System.out.println(e);
        }
        return null;
    }
    
    public static void main(String[] args) {
        ActorDAO l = new ActorDAO();
        System.out.println(l.getActorByFilm(1).get(0).getName());
    }
}
