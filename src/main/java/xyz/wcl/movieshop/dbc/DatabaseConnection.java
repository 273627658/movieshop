package xyz.wcl.movieshop.dbc;

import java.sql.*;

public class DatabaseConnection {
	private static final String DBDRIVER = "com.mysql.jdbc.Driver" ;
	private static final String DBURL = "jdbc:mysql://localhost:3306/movieshop?useUnicode=true&characterEncoding=utf8&useSSL=false" ;
	private static final String DBUSER = "root" ;
	private static final String PASSWORD = "" ;

	/**
	 * ��̬����飬����ص��ڴ�ʱ������ִ�У�ע������
	 */
	static {
		try {
			Class.forName(DBDRIVER) ;	// �������ݿ���������
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * ȡ�����ݿ����Ӷ���
	 * @return ʵ������Connection�����������null����ʾû�����ӳɹ�
	 */
	public static Connection getConnection() throws SQLException{
//		��ȡ����
		Connection conn = DriverManager.getConnection(DBURL, DBUSER,PASSWORD) ;
		return conn ;
	}

	/**
	 * �������ݿ�Ĺرղ���
	 */
	public static void close(Connection connection, PreparedStatement prepareStatement, ResultSet resultSet) {
		//�ͷ���Դ connection prepareStatement resultSet
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