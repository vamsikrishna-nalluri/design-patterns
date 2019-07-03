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

	private static synchronized President getPresident() {
		if(president == null) {
			president = new President();
		}
		return president;
	}
	
	public static President getInstance() {
		if(president == null) {			
			return getPresident();
		}
		return president;
	}
}
