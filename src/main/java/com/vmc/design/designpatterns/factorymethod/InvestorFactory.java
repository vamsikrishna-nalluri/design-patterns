/**
 * 
 */
package com.vmc.design.designpatterns.factorymethod;

import com.vmc.design.designpatterns.factorymethod.beans.IEntity;
import com.vmc.design.designpatterns.factorymethod.beans.Investor;

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
