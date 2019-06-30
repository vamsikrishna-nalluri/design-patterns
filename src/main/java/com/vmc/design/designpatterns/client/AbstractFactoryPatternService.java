/**
 * 
 */
package com.vmc.design.designpatterns.client;

import org.springframework.stereotype.Service;

import com.vmc.design.designpatterns.abstractfactory.CircularPhotoFrameFactory;
import com.vmc.design.designpatterns.abstractfactory.PhotoFrame;
import com.vmc.design.designpatterns.abstractfactory.PhotoFrameFactory;
import com.vmc.design.designpatterns.abstractfactory.RectangularPhotoFrameFactory;

/**
 * @author krishna_v
 *
 */
@Service
public class AbstractFactoryPatternService {
	
	public AbstractFactoryPatternService() {
		System.out.println("*************** abstaract factory pattern strat ******************");
		PhotoFrameFactory pf = new RectangularPhotoFrameFactory();
		
		//pf.createFrame();
		//pf.createPhoto();
		
		PhotoFrame objPF = pf.getPhotoFrame();
		
		System.out.println("*************** abstract factory pattern end ******************");
	}

}
