# Movie-Manager
Movie Manager uses MySql Connection. There are various operations present such as Add Movie,Delete Movie,Update Movie,Get Movie Detail. This is just Backend Structure of future Movie-Manager Web Application.

# Setup Required
1. JDK (any latest versions)
2. JRE (any latest versions)
3. IDE (Eclipse/Vscode/Intelij)
4. Server Tomcat
5. MySql Connector(MySql Workbench)

# How to run
1. Install above all Setups
2. Run the project as java Application
3. In Eclipse Terminal Results would be obtained


# Connect MySql Workbench
1. Download [MySql Connector](https://dev.mysql.com/downloads/connector/j/) and extract it.
2. Add to java project By RightClick project ->Properties->java Build Path->Add External Libs->Add MySql connector.
3. Setup Driver class for Connection Establishment.

```
public class DBHandler {
	private static Connection conn = null;
	
	public Connection establishConnection() throws ClassNotFoundException,SQLException {
		try {
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/DATABASE-NAME","USERNAME","PASSWORD");
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
}
```
## Sample Outputs:
```
Welcome to Movie Handler
Enter your choice
1.Add Movie
2.Delete Movie
3.Get Movie Detail
4.Exit
Your Choice : 1
Enter MovieId: 
4
Enter MovieName: 
Fast and Furious
Movie Type: (Thriller/Horror/Family/MyThological)
Thriller
Enter Ticket In Stock(yes/No)
yes

Movie Added Successfully

1.Add Movie
2.Delete Movie
3.Get Movie Detail
4.Exit
Your Choice : 2
Enter Movie Id to delete Movie:
1

Deleted SuccessFully

1.Add Movie
2.Delete Movie
3.Get Movie Detail
4.Exit
Your Choice : 3

Movie Details
Enter Movie id to get Detail
4
Movie Id: 4
Movie Name: Fast and Furious
Movie Release Date: 2020-08-29
Movie Type: Thriller
Movie InStock: yes

1.Add Movie
2.Delete Movie
3.Get Movie Detail
4.Exit
Your Choice : 4

Thank You!! Its been a Pleasure Serving you!!
```
