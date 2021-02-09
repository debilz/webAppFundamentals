package com.ServletJsp.web.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.ServletJsp.web.model.Alien;

public class AlienDao {
	
	public Alien getAlien(int id) {
		Alien a = new Alien();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/userlogin","root","123123");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from user where id = " + id);
			if(rs.next()) {
				a.setId(rs.getInt("id"));
				a.setName(rs.getString("name"));
			}
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return a;
	}
}
