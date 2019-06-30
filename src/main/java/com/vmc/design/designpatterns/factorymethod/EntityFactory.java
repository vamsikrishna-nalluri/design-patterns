/**
 * 
 */
package com.vmc.design.designpatterns.factorymethod;

/**
 * @author krishna_v
 *
 */
public abstract class EntityFactory {

	// Protected is to not to allow any other code to create objects of these classes.
	protected abstract IEntity create();
	
	//The static method is called by client passes the parameter to define the type of object.
	public static IEntity getEntity(String type) {
		// You can also wrote logic to take objects from the existing pool and return.
		// You can also randomize the creation of the objects.
		
		// Here you allowed user to ask for which type of object 
		// and the factory method takes the responsibility of object creation.
		
		if("IN".equalsIgnoreCase(type)) {
			return new InvestorFactory().create();
		} else if("IS".equalsIgnoreCase(type)) {
			return new IssuerFactory().create();
		}
		return null;
	}
	
}
