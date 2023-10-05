/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dunia3_prakarraydb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

/**
 *
 * @author Kyrin
 */
public class Dunia3_PrakArrayDB {

    static String sql;

    public static void main(String Args[]) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/prakpd_mod8_2", "root", "");
            Statement stmt = conn.createStatement();
            Scanner sc = new Scanner(System.in);
            boolean exit = true;
            do {
                int nilai = 0, choose = 0;
                String nama = "";
                String id = "";
                sql = "SELECT id, name, score FROM person order by id";
                ResultSet rs = stmt.executeQuery(sql);
                while (rs.next()) {
                    int id2 = rs.getInt("id");
                    String name = rs.getString("name");
                    int score = rs.getInt("score");
                    System.out.println(id2+" "+name+" "+score);
                }
                System.out.println("-----------------");
                System.out.println("1. Create");
                System.out.println("2. Update");
                System.out.println("3. Delete");
                System.out.println("4. Exit");
                System.out.print("Input : ");
                choose = sc.nextInt();
                switch (choose) {
                    case 1:
                        System.out.print("Input Nama\t: ");
                        sc.nextLine();
                        nama = sc.nextLine();
                        System.out.print("Input Nilai\t: ");
                        nilai = sc.nextInt();
                        sql = "INSERT INTO person(name, score) VALUES('" + nama + "','" + nilai + "')";
                        stmt.executeUpdate(sql);
                        break;
                    case 2:
                        System.out.print("Input ID\t: ");
                        sc.nextLine();
                        id = sc.nextLine();
                        System.out.print("Input Nama\t: ");
                        nama = sc.nextLine();
                        System.out.print("Input Score\t: ");
                        nilai = sc.nextInt();
                        sql = "UPDATE person SET score='" + nilai + "', name='" + nama + "' WHERE id='" + id + "'";
                        stmt.executeUpdate(sql);
                        break;
                    case 3:
                        System.out.print("Input ID\t: ");
                        sc.nextLine();
                        id = sc.nextLine();
                        sql = "DELETE FROM person WHERE id = '" + id + "'";
                        stmt.executeUpdate(sql);
                        break;
                    case 4:
                        exit = false;
                        break;
                }
                System.out.println("");
            } while (exit);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}