package shop.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import connection.MySQLConnUtils;
import shop.models.Category;

public class CategoryDAO {
	public static ArrayList<Category> getCategory() throws SQLException, ClassNotFoundException{
		Connection conn = MySQLConnUtils.getMySQLConnection();
		
		String sql = "Select * from category";
		PreparedStatement ps = conn.prepareCall(sql);
		ResultSet rs = ps.executeQuery();
		ArrayList<Category> list = new ArrayList<Category>();
		while(rs.next())
		{
			Category cat = new Category();
			cat.setCat_id(rs.getLong("cat_id"));
			cat.setCat_name(rs.getString("cat_name"));
			list.add(cat);
		}
		return list;
		
	}
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		CategoryDAO catDao = new CategoryDAO();
		for(Category c : catDao.getCategory()) {
			System.out.println(c.getCat_name()+"-"+c.getCat_id());
		}
	}
	
}
