<%@page import="java.sql.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>通过Mysql的JDBC驱动访问数据库</title>
</head>
<body>
	<h2>通过Mysql的JDBC驱动访问数据库</h2>
	<hr>
	<table border="1" bgcolor="#ccceee" align="center">
		<tr>
			<th width="87" align="center">产品名字</th>
		</tr>
		<%
			Connection con=null;
			Statement stmt=null;
			ResultSet rs=null;
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/product?useUnicode=true&characterEncoding=utf-8";
			con = DriverManager.getConnection(url,"root","liwenchii");
			stmt = con.createStatement();
			String sql = "select * from product";
			rs = stmt.executeQuery(sql);
			while(rs.next()){
			
		 %>
		 <tr>
		 	<td><%= rs.getString("productName") %></td>
		 </tr>
		 <%
		 	}
		 	rs.close();
		 	stmt.close();
		 	con.close();
		  %>
	</table>
	<hr>
</body>
</html>

