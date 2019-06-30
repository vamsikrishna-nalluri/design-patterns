/**
 * 
 */
package com.vmc.design.designpatterns.abstractfactory;

/**
 * @author krishna_v
 *
 */
public class CircularPhotoFrameFactory implements PhotoFrameFactory {

	@Override
	public Frame createFrame() {
		return new CircularFrame();
	}

	@Override
	public Photo createPhoto() {
		return new CircularPhoto();
	}

	public PhotoFrame getPhotoFrame() {
		return new PhotoFrame(createFrame(), createPhoto());
	}

}
