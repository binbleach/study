package JDBC;

import com.sun.jdi.connect.spi.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;

public class Dao {
    public int select(){
        Connection conn = null;
        PreparedStatement pre = null;
        ResultSet re = null;
        String sqls  = "select * from dept where ?";
        return 1;
    }
}
