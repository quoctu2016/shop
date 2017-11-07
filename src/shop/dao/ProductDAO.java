package shop.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import connection.MySQLConnUtils;
import shop.models.Product;

public class ProductDAO {
	public static ArrayList<Product> getProduct(long id_cat) throws ClassNotFoundException, SQLException{
		Connection conn = MySQLConnUtils.getMySQLConnection();
		String sql = "select * from product where cat_id = "+id_cat+"";
		PreparedStatement ps = conn.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		ArrayList<Product> list = new ArrayList<Product>();
		while(rs.next()) {
			Product pro = new Product();
			pro.setCat_id(rs.getInt("cat_id"));
			pro.setDescription(rs.getString("description"));
			pro.setPro_id(rs.getInt("pro_id"));
			pro.setPro_image(rs.getString("pro_image"));
			pro.setPro_name(rs.getString("pro_name"));
			pro.setPrice(rs.getDouble("price"));
			list.add(pro);
		}
		return list;
	}
	public static ArrayList<Product> getProductByID(long id_pro) throws ClassNotFoundException, SQLException{
		Connection conn = MySQLConnUtils.getMySQLConnection();
		String sql = "select * from product where pro_id = "+id_pro+"";
		PreparedStatement ps = conn.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		ArrayList<Product> list = new ArrayList<Product>();
		while(rs.next()) {
			Product pro = new Product();
			pro.setCat_id(rs.getInt("cat_id"));
			pro.setDescription(rs.getString("description"));
			pro.setPro_id(rs.getInt("pro_id"));
			pro.setPro_image(rs.getString("pro_image"));
			pro.setPro_name(rs.getString("pro_name"));
			pro.setPrice(rs.getDouble("price"));
			list.add(pro);
		}
		return list;
	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		for(Product p : getProduct(1)) {
			System.out.println(p.getPro_id()+"-"+p.getPro_name());
		}
	}
}
