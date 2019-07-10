/**
 * 
 */
package com.vmc.design.designpatterns.singleton;

/**
 * @author krishna_v
 *
 */
public class President {
	private static President president;

	private President() {

	}

	private static synchronized void getPresident() {
		if(president == null) {
			president = new President();
		}
	}
	
	public static President getInstance() {
		if(president == null) {			
			getPresident();
		}
		return president;
	}
}
