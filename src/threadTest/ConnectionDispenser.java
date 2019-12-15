package threadTest;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionDispenser { 
	  private static class ThreadLocalConnection extends ThreadLocal { 
	      public Object initialValue() { 
	    	  return null;
	        /* return DriverManager
	          .getConnection(ConfigurationSingleton.getDbUrl()); */
	      } 
	   } 
	   private static ThreadLocalConnection conn = new ThreadLocalConnection(); 
	    public static Connection getConnection() { 
	       return (Connection) conn.get(); 
	    } 
}
