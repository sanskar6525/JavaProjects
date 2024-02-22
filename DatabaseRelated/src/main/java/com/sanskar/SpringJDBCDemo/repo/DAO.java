package com.sanskar.SpringJDBCDemo.repo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import com.sanskar.SpringJDBCDemo.model.DataBase;

@Repository
public class DAO {
		
		private static JdbcTemplate template;

		public JdbcTemplate getTemplate() {
			return template;
		}
		@Autowired
		public void setTemplate(JdbcTemplate template) {
			this.template = template;
		}

		public void save(DataBase db)
		{
			String sql="insert into database (id,name,role) values(?,?,?)";
			int rows=template.update(sql,db.getId(),db.getName(),db.getRole());
			System.out.println(rows);
			System.out.println("ADDED");
			
		}
		
		public static List<DataBase> findAll()
		{
			String query="select * from database";
			RowMapper<DataBase> rm=new RowMapper<>() {

				public DataBase mapRow(ResultSet rs,int rowNum) throws SQLException {
					
					DataBase s=new DataBase();
					s.setId(rs.getInt(1));
					s.setName(rs.getString(2));
					s.setRole(rs.getString(3));
					return s;
				}
			};
			List<DataBase> AL=template.query(query, rm);
			return AL;
		}
}

							
							
							
							
							
							
							
							
							
							
							