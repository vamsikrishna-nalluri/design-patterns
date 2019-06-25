/**
 * 
 */
package com.vmc.design.designpatterns.factorymethod;

import com.vmc.design.designpatterns.factorymethod.beans.IEntity;
import com.vmc.design.designpatterns.factorymethod.beans.Issuer;

/**
 * @author krishna_v
 *
 */
public class FactoryMethodPatternService {
	
	public FactoryMethodPatternService(){
		// Client code which requires the Issue or Investor objects
		IEntity e = EntityFactory.getEntity("IN");
		System.out.println(e instanceof Issuer);
		
		System.out.println("hello");
		
	}
	

}
