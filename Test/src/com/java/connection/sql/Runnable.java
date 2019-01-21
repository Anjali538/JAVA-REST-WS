package com.java.connection.sql;

import java.util.*;

import com.java.list.term.pojo.RMSList;
import com.java.list.term.pojo.RMSListJersey;

public class Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ConnectionSQL lConnectionSQL = new ConnectionSQL();
		
		  ArrayList<RMSList> lList = lConnectionSQL.getDBConnection(); for(RMSList obj:
		  lList ) { System.out.println("ID = " +obj.getListId() + " " + "Name" +
		  obj.getName()); }
		 
        
		/*
		 * ArrayList<RMSListJersey> lList = lConnectionSQL.getDBConnection();
		 * for(RMSListJersey obj:lList ) { System.out.println("ID = " +obj.getListId() +
		 * " " + "Name" + obj.getName()); System.out.println(lList); }
		 */

}
}
