/**
 * 
 */
package com.vmc.design.designpatterns.factorymethod;

/**
 * @author krishna_v
 *
 */
public class IssuerFactory extends EntityFactory {

	@Override
	protected IEntity create() {
		return new Issuer();
	}

}
