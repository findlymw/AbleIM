package com.ablesky.im.smack;

import org.jivesoftware.smack.ConnectionConfiguration;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.XMPPException;

/**
 * 
 * ���ӹ�����
 * 
 * @author wn
 * @version 1.0.0 SmackUtil.java 2014-4-17 ����4:22:37
 */
public class SmackUtil {
	
	/**
	 * 
	  * ��ȡ����
	  *
	  * @autor: wn  2014-4-17 ����4:23:01
	  * @return    
	  * @return XMPPConnection
	 */
	public XMPPConnection getOFConnection() {
		XMPPConnection connection = new XMPPConnection("localhost");
		try {
			connection.connect();
		} catch (XMPPException e) {
			e.printStackTrace();
		}
		return connection;
	}
	
	/**
	 * 
	  * ��ȡ����
	  *
	  * @autor: wn  2014-4-17 ����4:28:09
	  * @param domain
	  * @param port
	  * @return    
	  * @return XMPPConnection
	 */
	public static XMPPConnection getConnection(String domain, int port) {
		ConnectionConfiguration config = new ConnectionConfiguration(domain, port);
		XMPPConnection connection = new XMPPConnection(config);
		try {
			connection.connect();
		} catch (XMPPException e) {
			e.printStackTrace();
		}
		return connection;
	}
	
	/**
	 * 
	  * �Ͽ�����
	  *
	  * @autor: wn  2014-4-17 ����4:24:16
	  * @param connection    
	  * @return void
	 */
	public void disConnextion(XMPPConnection connection) {
		connection.disconnect();
	}
	
	
	
}
