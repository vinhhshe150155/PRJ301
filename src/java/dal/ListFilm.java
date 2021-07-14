package dal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import model.Film;

public class ListFilm extends DBContext{
//    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//    SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");
    public List<Film> listFilm (String sql) throws ParseException{
        List<Film> films = new ArrayList<>();
        try{
            PreparedStatement st=connection.prepareStatement(sql);
            ResultSet rs=st.executeQuery();
            while(rs.next()){
                int id = Integer.parseInt(rs.getString(1));
                String name = rs.getString(2);
                String img = rs.getString(3);
                String date_realase = rs.getString(4);
                String film_start_date = rs.getString(5);
                String film_end_date = rs.getString(6);
                int duration = rs.getInt(7);
                String des = rs.getString(8);
                String trailer = rs.getString(9);
                Film f = new Film(id, name, img, date_realase, film_start_date, film_end_date, duration, des, trailer);
                f.setActor(new ActorDAO().getActorByFilm(id));
                f.setLanguage(new LanguageDAO().getLanguageByFilm(id));
                f.setCategory(new CategoryDAO().getCategoryByFilm(id));
                f.setRating(new RatingDAO().getRatingByFilm(id));
                films.add(f);
            }
            return films;
        }catch(SQLException e){
            System.out.println(e);
        }
        return null;
    }
    public List<Film> getTop3Film() throws ParseException{      
        String sql = "select top 6 * from film where film_start_date <= cast(getdate() as date) and film_end_date >= dateadd(dd,-30,cast(getdate() as date)) order by film_start_date desc";
        return listFilm(sql);
    }
    
    public List<Film> getAllFilm() throws ParseException{
        String sql = "select * from film order by film_start_date desc";
        return listFilm(sql);
    }
    
    public List<Film> getFilmByPage(List<Film> list,
            int start,int end){
        List<Film> f = new ArrayList<>();
        for(int i=start;i<end;i++){
            f.add(list.get(i));
        }
        return f;
    }
    
    public Film getFilmByID(int ID) throws ParseException{
        String sql = "select * from film where film_id = "+ID;
        return listFilm(sql).get(0);
    }
    public List<Film> getFilmByNameAsc(String nameSearch) throws ParseException{
        String sql = "select * from film where film_name like N'%"+nameSearch+"%' order by film_name asc";
        return listFilm(sql);
    }
    public List<Film> getFilmByName(String nameSearch) throws ParseException{
        String sql = "select * from film where film_name like N'%"+nameSearch+"%'";
        return listFilm(sql);
    }
    public int insertFilm(Film f){
        String sql = "INSERT INTO film values (N'"+f.getName()+"',?,?,?,?,?,N'"+f.getFilm_description()+"',?)";
        try{
            PreparedStatement st=connection.prepareStatement(sql);
            st.setString(1 , f.getFilm_image());
            st.setString(2 , f.getDate_release());
            st.setString(3 , f.getFilm_start_date());
            st.setString(4 , f.getFilm_end_date());
            st.setString(5 ,Integer.toString(f.getDuration()));
            st.setString(6 , f.getTrailer());
            return st.executeUpdate();
        }catch(SQLException e){
            System.out.println(e);
        }
        return 0;
    }
    public int updateFilm(Film f){
        String sql = "UPDATE film set film_name=?, film_image=?, date_release=?, film_start_date=?, film_end_date=?, duration=?, film_description=?, film_trailer=? where film_id = ?";
        try{
            PreparedStatement st=connection.prepareStatement(sql);
            st.setString(1, f.getName());
            st.setString(2, f.getFilm_image());
            st.setString(3, f.getDate_release());
            st.setString(4, f.getFilm_start_date());
            st.setString(5, f.getFilm_end_date());
            st.setInt(6, f.getDuration());
            st.setString(7, f.getFilm_description());
            st.setString(8, f.getTrailer());
            st.setInt(9, f.getFilmID());
            return st.executeUpdate();
        }catch(SQLException e){
            System.out.println(e);
        }
        return 0;
        
    }
    public List<Film> getFilmMostView() throws ParseException{
        List<Film> lf = new ArrayList<>();
        String sql = "select film_id, count(film_id) as c from order_details o inner join ticket t on o.ticket_id=t.ticket_id inner join showing s on t.show_id = s.show_id and seat_status=1 group by film_id order by c desc";
        try{
            PreparedStatement st=connection.prepareStatement(sql);
            ResultSet rs=st.executeQuery();
            while(rs.next()){
                lf.add(getFilmByID(rs.getInt(1)));
            }
            return lf;
        }catch(SQLException e){
            System.out.println(e);
        }
        return null;
    }
        public List<Film> getFilmMostRate() throws ParseException{
        List<Film> lf = new ArrayList<>();
        String sql = "select film_id from rating r order by r.rate_point desc";
        try{
            PreparedStatement st=connection.prepareStatement(sql);
            ResultSet rs=st.executeQuery();
            while(rs.next()){
                lf.add(getFilmByID(rs.getInt(1)));
            }
            return lf;
        }catch(SQLException e){
            System.out.println(e);
        }
        return null;
    }
    public List<Film> getFilmByCate(String[] cate, String[] lang) throws ParseException{
        List<Film> l = new ArrayList<>();
        String cates = Arrays.toString(cate).replace("[", "(").replace("]", ")");
        String langs = Arrays.toString(lang).replace("[", "(").replace("]", ")");
        String sql = "select distinct c.film_id from filmCate c inner join filmLanguage l on c.film_id=l.film_id where 1=1";
        if(cate==null){
            if(lang==null){
            }else{
                sql+= " and language_id in "+langs;
            }
        }else{
            if(lang==null){
            }else{
                sql+= " and language_id in "+langs;
            }     
             sql+= " and category_id in "+cates;
        }
        System.out.println(sql);
        try{
            System.out.println(sql);
            PreparedStatement st=connection.prepareStatement(sql);
            ResultSet rs=st.executeQuery();
            while(rs.next()){
                int id = Integer.parseInt(rs.getString(1));
                Film f = getFilmByID(id);
                l.add(f);
            }
            return l;
        }catch(SQLException e){
            System.out.println(e);   
        }
        return null;
    }
//    public List<Film> getFilmByCate(int ID) throws ParseException{
//        List<Film> films = new ArrayList<>();
//        String sql = "select * from film where category_id = "+ID;
//        try{
//            PreparedStatement st=connection.prepareStatement(sql);
//            ResultSet rs=st.executeQuery();
//            while(rs.next()){
//                String date_realase = sdf2.format(sdf.parse(rs.getString(7)));
//                String film_start_date = sdf2.format(sdf.parse(rs.getString(8)));
////                System.out.print(film_start_date+"   ");
//                String film_end_date = sdf2.format(sdf.parse(rs.getString(9)));
////                System.out.println(film_end_date);
//                films.add(new Film(Integer.parseInt(rs.getString(1)), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),
//                        (rs.getString(6)), date_realase, film_start_date, film_end_date, 
//                        Integer.parseInt(rs.getString(10)), rs.getString(11), rs.getString(12), rs.getString(13)));
//            }
//            return films;
//        }catch(SQLException e){
//            System.out.println(e);
//        }
//        return null;
//    }
    public List<Integer> getIDShowToday(){
        String sql = "select distinct film_id from showing where cast(show_time as date) = cast(GETDATE() as date)";
        List<Integer> li = new ArrayList<>();
        try{
            PreparedStatement st=connection.prepareStatement(sql);
            ResultSet rs=st.executeQuery();
            while(rs.next()){
                li.add(rs.getInt(1));
            }
            return li;
        }catch(SQLException e){
            System.out.println(e);
        }
        return null;
    }
    public List<Film> getFilmShowToday() throws ParseException{
        List<Film> lf = new ArrayList<>();
        List<Integer> li = getIDShowToday();
        for(Integer i:li){
            lf.add(getFilmByID(i));
        }
        return lf;
    }    
//    public static void main(String[] args) throws ParseException {
//       String []vjp = {"33"};
//
//System.out.println(new ListFilm().getFilmMostView().size());    }
}