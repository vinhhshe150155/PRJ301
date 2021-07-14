package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RatingDAO extends DBContext{
        public int ratePoint(String sql){
        int sum=0, count=0;
        try{
            PreparedStatement st=connection.prepareStatement(sql);
            ResultSet rs=st.executeQuery();
            while(rs.next()){
                int id = Integer.parseInt(rs.getString(3));
                sum+=id;
                count++;
            }
            return count==0?sum:sum/count;
        }catch(SQLException e){
            System.out.println(e);
        }
        return 0;
    }
        public boolean checkRatingExist(int filmID, int customerID){
            String sql = "select * from rating where film_id ="+filmID+" and rate_customer ="+customerID;
            try{
                PreparedStatement st=connection.prepareStatement(sql);
                ResultSet rs = st.executeQuery();
                return rs.next();
            }catch(SQLException e){
                System.out.println(e);
            }
            return false;
        }
        
        public int getRatingByFilm(int film){
            String sql = "select * from rating where film_id = "+film;
            
            return ratePoint(sql);
        }
        
        
        public int rateInsert(int filmID, int ratePoint, int userID){
            String sql;
            if(checkRatingExist(filmID, userID)){
                sql = "UPDATE rating set rate_point=" +ratePoint+" where film_id ="+filmID+" and rate_customer ="+userID; 
            }else{
                sql = "INSERT INTO rating values ("+filmID+","+ratePoint+","+userID+")";
            }
            System.out.println(sql);
        try{
            PreparedStatement st=connection.prepareStatement(sql);
            return st.executeUpdate();
        }catch(SQLException e){
            System.out.println(e);
        }
        return 0;
    }
        public static void main(String[] args) {
            String a = "ABCDEFG";
            for(int i=1; i<=17; i++){
                for(int j=0; j<a.length(); j++){
                    System.out.println("INSERT INTO seat values('"+a.charAt(j)+"',"+i+")");
                }
                
            }
//            System.out.println(new RatingDAO().checkRatingExist(1, 6));
    }//
        
}
