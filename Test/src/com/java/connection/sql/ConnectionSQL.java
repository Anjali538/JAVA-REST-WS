package com.java.connection.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import com.java.list.term.pojo.RMSList;
import com.java.list.term.pojo.RMSListJersey;

import java.util.*;

public class ConnectionSQL {
	//Main Class for processing all Data	
	public ArrayList<RMSList> getDBConnection()
	   {
		ArrayList<RMSList> lRmsListObject = new ArrayList<RMSList>();
		//ArrayList<RMSListJersey> lRmsListJersey = new ArrayList<RMSListJersey>();
		try{  
			Class.forName("oracle.jdbc.driver.OracleDriver"); 
			System.out.println("try to connect database");
			Connection con=DriverManager.getConnection(  
			"jdbc:oracle:thin:@Anjali-PC:1521:ORCL","system","root"); 
			System.out.println("Database connected successfully");
			Statement stmt=con.createStatement(); 
			ResultSet rs=stmt.executeQuery("select * from rms_list");			
			lRmsListObject = processListXML(rs);
			processListChild(rs);
			//lRmsListJersey = processJSON( rs);
			con.close();	 
		}
		catch(Exception e)
		{
			e.printStackTrace();
		System.out.println(e);
		}
		return lRmsListObject;  
	 
      }
	private void processListChild(ResultSet rs) {
		
		
	}
	//Process all data for XML 
	private ArrayList<RMSList> processListXML(ResultSet rs) {
		ArrayList<RMSList> lListObj = new ArrayList<RMSList>();
		ArrayList<RMSList> lfinalList = new ArrayList<RMSList>();
		Map<String,ArrayList<RMSList>> lHashMap2 = new HashMap<String,ArrayList<RMSList>>();
		try {
			while(rs.next()) {	
			RMSList lRmsList = new RMSList();
			lRmsList.setListId(rs.getString(1));
			lRmsList.setName(rs.getString(3));
			lListObj.add(lRmsList);			
			}
		lHashMap2.put("LIST", lListObj);
		System.out.println("HashMap" + lHashMap2);
		if(lHashMap2.size()>=1) {
			 lfinalList = lHashMap2.get("LIST");
			 System.out.println("FinalRMSList" + lfinalList);
		}
		}
		catch (SQLException e) {
		
			e.printStackTrace();
		}
		return lfinalList;
				
	}
	
  //Process all data for JSON
	private ArrayList<RMSListJersey> processJSON(ResultSet rs) {
		ArrayList<RMSListJersey> lListObj = new ArrayList<RMSListJersey>();
		ArrayList<RMSListJersey> lfinalList = new ArrayList<RMSListJersey>();
		Map<String,ArrayList<RMSListJersey>> lHashMap2 = new HashMap<String,ArrayList<RMSListJersey>>();
		try {
			while(rs.next()) {	
			RMSListJersey lRmsList = new RMSListJersey();
			lRmsList.setListId(rs.getString(1));
			lRmsList.setName(rs.getString(3));
			lListObj.add(lRmsList);			
			}
		lHashMap2.put("LIST", lListObj);
		System.out.println("HashMap" + lHashMap2);
		if(lHashMap2.size()>=1) {
			 lfinalList = lHashMap2.get("LIST");
			 System.out.println("FinalRMSList" + lfinalList);
		}
		}
		catch (SQLException e) {
		
			e.printStackTrace();
		}
		return lfinalList;
				
	}
	
	
}


