/**
 * 
 */
package com.vmc.design.designpatterns.factorymethod;

/**
 * @author krishna_v
 *
 */
public class InvestorFactory extends EntityFactory {

	@Override
	protected IEntity create() {
		return new Investor();
	}

}
