/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author Viz
 */
public class db {

    private static final String DB_DRIVER = "oracle.jdbc.OracleDriver";
    private static final String DB_CONNECTION = "jdbc:oracle:thin:@localhost:1521:XE";
    private static final String DB_USER = "viz";
    private static final String DB_PASSWORD = "haslord";

    private static Connection getConnection() {
        Connection DB_conn = null;

        try {
            Class.forName(DB_DRIVER);
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        Properties connectionProps = new Properties();
        connectionProps.put("user", DB_USER);
        connectionProps.put("password", DB_PASSWORD);
        try {
            DB_conn = DriverManager.getConnection(
                    DB_CONNECTION, connectionProps
            );
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return DB_conn;
    }

    public static void insertIntoPekam(Map<String, String> values) throws SQLException {
        Connection DB_conn = null;
        Statement stat = null;

        String query = "INSERT INTO PEKAM "
                + "(symbol, tag, name, mainBollard, realtime, minutes, direction, onStopPoint, departure, line) VALUES "
                + "('"
                + values.get("symbol") + "', '"
                + values.get("tag") + "', '"
                + values.get("name") + "', '"
                + values.get("mainBollard") + "', '"
                + values.get("realtime") + "', '"
                + values.get("minutes") + "', '"
                + values.get("direction") + "', '"
                + values.get("onStopPoint") + "', '"
                + values.get("departure") + "', '"
                + values.get("line")
                + "')";

        try {
            DB_conn = getConnection();
            stat = DB_conn.createStatement();
            stat.executeUpdate(query);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            if (stat != null) {
                stat.close();
            }
            if (DB_conn != null) {
                DB_conn.close();
            }
        }
    }

    public static void saveIntoDataBase(String res) throws SQLException, ParseException {
        String symbol, tag, name, mainBollard, realtime, minutes, direction, onStopPoint, departure, line;
        Map<String, String> values = new HashMap();
//http://www.tutorialspoint.com/json/json_java_example.htm
        JSONParser parser = new JSONParser();
        Object obj = parser.parse(res);

        JSONObject response = (JSONObject) obj;
        JSONObject success = (JSONObject) response.get("success");
        JSONObject bollard = (JSONObject) success.get("bollard");
        JSONArray times = (JSONArray) success.get("times");

        values.put("symbol", (String) bollard.get("symbol"));
        values.put("tag", (String) bollard.get("tag"));
        values.put("name", (String) bollard.get("name"));
        values.put("mainBollard", String.valueOf(bollard.get("mainBollard")));

        for (Object time : times) {
            JSONObject t = (JSONObject) time;
            values.put("realtime", (String) t.get("realtime"));
            values.put("minutes", Long.toString((Long) t.get("minutes")));
            values.put("direction", (String) t.get("direction"));
            values.put("onStopPoint", String.valueOf(t.get("onStopPoint")));
            values.put("departure", (String) t.get("departure"));
            values.put("line", (String) t.get("line"));
            insertIntoPekam(values);
        }
    }
}
