/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tampil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Tampil {

	public static void main(String[] args) {
    
    try {
	Class.forName("com.mysql.jdbc.Driver");

        // make connection
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/prakpd_mod8_2", "root", "");

	// make statement
	Statement stmt = conn.createStatement();

	// insert (1, tono, 20), (2, toni, 50), (3, tini, 80)
	String sql = "INSERT INTO person(id, name, score) VALUES(1, \"Tono\", 20), (2, \"Toni\", 50), (3, \"Tini\", 80), (4, \"Tino\", 50)";
	stmt.executeUpdate(sql);

	// update
	sql = "UPDATE person SET score=60, name=\"Tono Martono\" WHERE id=1";
	stmt.executeUpdate(sql);

	// delete
	sql = "DELETE FROM person WHERE id=2";
	stmt.executeUpdate(sql);

	// select, order by score
	String sql2 = "SELECT id, name, score FROM person order by id";
	ResultSet rs = stmt.executeQuery(sql2);

	while (rs.next()) {
            int id = rs.getInt("id");
            String name = rs.getString("name");
            int score = rs.getInt("score");
            System.out.println(id+"\t"+name+"\t"+score);
	}

	} catch (Exception e) {
	System.out.println("Failed");
	}
    }
}