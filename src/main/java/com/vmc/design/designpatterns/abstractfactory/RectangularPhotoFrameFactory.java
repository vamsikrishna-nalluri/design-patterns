/**
 * 
 */
package com.vmc.design.designpatterns.abstractfactory;

/**
 * @author krishna_v
 *
 */
public class RectangularPhotoFrameFactory implements PhotoFrameFactory {
	@Override
	public Frame createFrame() {
		return new RectangularFrame();
	}

	@Override
	public Photo createPhoto() {
		return new RectangularPhoto();
	}

	public PhotoFrame getPhotoFrame() {
		return new PhotoFrame(createFrame(), createPhoto());
	}
}
