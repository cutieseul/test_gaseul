package com.javalec.team.dao;

	import java.sql.Connection;
	import java.sql.PreparedStatement;

	import javax.naming.Context;
	import javax.naming.InitialContext;
	import javax.sql.DataSource;

	public class Ordering_dao {
		
		DataSource dataSource;
		
		public Ordering_dao() {
			try {
				Context context = new InitialContext();
				dataSource = (DataSource) context.lookup("java:comp/env/jdbc/1teamp");
				//Servers > context.xml  肉�  �뿳 �뮉  �젟癰귣�以� DB  肉겼칰怨쀬뱽  嫄� 沅� 野� 
			} catch (Exception e) {
				e.printStackTrace();
			}
		}/////
		
		
		public void orderingIn(String pCode, String , String cQuantity) {
			Connection connection = null;
			PreparedStatement preparedStatement = null;
			
			try {
				connection = dataSource.getConnection();
				String query = "insert into ordering (oPrice, oAddress, oQuantity, oDecision, product_pCode, user_uId, oDate) "
						+"values (?,?,?,?,?,?,now()) ";
				preparedStatement = connection.prepareStatement(query);
				preparedStatement.setString(1, 20);
				preparedStatement.setString(2, uAddress);
				preparedStatement.setString(3, oQuantity);
				preparedStatement.setString(4, "배송완료");
				preparedStatement.setString(5, product_pCode);
				preparedStatement.setString(6, user_uId);
				
				preparedStatement.executeUpdate();
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				//
				try {
					if(preparedStatement != null) preparedStatement.close();
					if(connection != null) connection.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		}//write
		
		
		

	}


