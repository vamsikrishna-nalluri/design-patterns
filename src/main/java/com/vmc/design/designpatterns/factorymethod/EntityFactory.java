/**
 * 
 */
package com.vmc.design.designpatterns.factorymethod;

import com.vmc.design.designpatterns.factorymethod.beans.IEntity;

/**
 * @author krishna_v
 *
 */
public abstract class EntityFactory {

	protected abstract IEntity create();
	
	public static IEntity getEntity(String type) {
		if("IN".equalsIgnoreCase(type)) {
			return new InvestorFactory().create();
		} else if("IS".equalsIgnoreCase(type)) {
			return new IssuerFactory().create();
		}
		return null;
	}
	
}
