/**
 * 
 */
package com.vmc.design.designpatterns.factorymethod;

/**
 * @author krishna_v
 *
 */
public class Investor implements IEntity{

	// The constructor should be visible only for this package 
	// Only factory method is allowed to create object of these.
	protected Investor() {
		System.out.println("investor initialized");
	}
	
}
