package dal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import model.Film;

public class ListFilm extends DBContext{
    public List<Film> getTop3Film() throws ParseException{
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");
        List<Film> films = new ArrayList<>();
        String sql = "select top 3 * from film where film_start_date <= dateadd(dd,7,cast(getdate() as date)) "
                    + "and film_start_date >= dateadd(dd,-7,cast(getdate() as date))\n" +
                    "order by film_start_date desc";
        try{
            PreparedStatement st=connection.prepareStatement(sql);
            ResultSet rs=st.executeQuery();
            while(rs.next()){
                String date_realase = sdf2.format(sdf.parse(rs.getString(7)));
                String film_start_date = sdf2.format(sdf.parse(rs.getString(8)));
                String film_end_date = sdf2.format(sdf.parse(rs.getString(9)));
                films.add(new Film(Integer.parseInt(rs.getString(1)), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),
                        Integer.parseInt(rs.getString(6)), date_realase, date_realase, date_realase, 
                        Integer.parseInt(rs.getString(10)), rs.getString(11), rs.getString(12)));
            }
            return films;
        }catch(SQLException e){
            System.out.println(e);
        }
        return null;
    }
    public static void main(String[] args) throws ParseException {
        ListFilm l = new ListFilm();
        l.getTop3Film();
    }
}