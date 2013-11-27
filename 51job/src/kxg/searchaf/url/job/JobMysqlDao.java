package kxg.searchaf.url.job;

import java.sql.*;
import java.util.HashMap;
import java.util.List;

import kxg.searchaf.db.mysql.MysqlDao;
import kxg.searchaf.util.ProxyUtli;

public class JobMysqlDao extends MysqlDao {

	public String tablename = "company";

	public void save(Company company) {

		try {
			// getConnection("job");
			String sql = "INSERT INTO  " + tablename
					+ " (name, type, guimo, location)" + " VALUES (?,?,?,?)"; // 插入数据的sql语句

			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, company.name);
			ps.setString(2, company.type);
			ps.setString(3, company.guimo);
			ps.setString(4, company.location);
			ps.executeUpdate();

			ps.close();
		} catch (SQLException e) {
			System.out.println("插入数据失败" + company.name + "/" + e.getMessage());
		} finally {
			// try {
			// conn.close();
			// } catch (SQLException e) {
			// } // 关闭数据库连接
		}
	}

	public void update(Company company) {
		try {
			// getConnection("job");
			String sql = "update " + tablename
					+ " set name=?, type=?, guimo=?, location=? "
					+ " where    name=?";

			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, company.name);
			ps.setString(2, company.type);
			ps.setString(3, company.guimo);
			ps.setString(4, company.location);
			ps.setString(5, company.name);
			ps.executeUpdate();

			ps.close();
		} catch (SQLException e) {
			System.out.println("更新数据失败" + company.name + "/" + e.getMessage());
		} finally {
			// try {
			// conn.close();
			// } catch (SQLException e) {
			// } // 关闭数据库连接
		}

	}

	public void delete(Company company) {

	}

	public Company find(String name) {
		Company c = null;
		try {
			// getConnection("job");
			String sql = "select *  from " + tablename + " where name=?"; // 插入数据的sql语句

			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, name);

			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				c = new Company();
				c.name = rs.getString("name");
				c.type = rs.getString("type");
				c.guimo = rs.getString("guimo");
				c.location = rs.getString("location");
			}
			ps.close();
		} catch (SQLException e) {
			System.out.println("查询数据失败" + e.getMessage());
		} finally {
			// try {
			// conn.close();
			// } catch (SQLException e) {
			// } // 关闭数据库连接
		}
		return c;
	}

	public static void main(String[] args) throws Exception {

		//
		JobMysqlDao dao = new JobMysqlDao();
		dao.getConnection("job");
		Company c = dao.find("泰克科技（中国）有限公司");
		System.out.println(c);
		c.guimo = "500-1000人";
		//dao.update(c);
		// Company c = new Company();
		// c.name = "中文";
		// dao.save(c);
		dao.conn.close();

	}
}
