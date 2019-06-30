/**
 * 
 */
package com.vmc.design.designpatterns.client;

import org.springframework.stereotype.Service;

import com.vmc.design.designpatterns.factorymethod.EntityFactory;
import com.vmc.design.designpatterns.factorymethod.IEntity;

/**
 * @author krishna_v
 *
 */
@Service
public class FactoryMethodPatternService {
	
	public FactoryMethodPatternService() {
		// Client code which requires the Issuer or Investor objects
		// Factory Method is a creational design pattern that provides an interface for
		// creating objects in superclass, but allows subclasses to differentiate the
		// type of objects that will be created.
		IEntity e = EntityFactory.getEntity("IN");
	}

}
