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
public class IssuerFactory extends EntityFactory {

	@Override
	protected IEntity create() {
		return new Issuer();
	}

}
