package xyz.wcl.movieshop.dbc;

import java.sql.*;

public class DatabaseConnection {
	private static final String DBDRIVER = "com.mysql.jdbc.Driver" ;
	private static final String DBURL = "jdbc:mysql://localhost:3306/movieshop?useUnicode=true&characterEncoding=utf8&useSSL=false" ;
	private static final String DBUSER = "root" ;
	private static final String PASSWORD = "" ;

	/**
	 * 静态代码块，类加载到内存时会立刻执行，注册驱动
	 */
	static {
		try {
			Class.forName(DBDRIVER) ;	// 加载数据库驱动程序
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * 取得数据库连接对象
	 * @return 实例化的Connection对象，如果返回null，表示没有连接成功
	 */
	public static Connection getConnection() throws SQLException{
//		获取连接
		Connection conn = DriverManager.getConnection(DBURL, DBUSER,PASSWORD) ;
		return conn ;
	}

	/**
	 * 进行数据库的关闭操作
	 */
	public static void close(Connection connection, PreparedStatement prepareStatement, ResultSet resultSet) {
		//释放资源 connection prepareStatement resultSet
		if(resultSet!=null) {
			try {
				resultSet.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(prepareStatement!=null) {
			try {
				prepareStatement.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(connection!=null) {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}