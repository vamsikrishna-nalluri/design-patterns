/**
 * 
 */
package com.vmc.design.designpatterns.abstractfactory;

/**
 * @author krishna_v
 *
 */
public interface PhotoFrameFactory {
	public Frame createFrame();

	public Photo createPhoto();
	
	
	// Addition thought
	public PhotoFrame getPhotoFrame();
}
