/**
 * 
 */
package com.vmc.design.designpatterns.abstractfactory;

/**
 * @author krishna_v
 *
 */
public class PhotoFrame {
	Frame frame;
	Photo photo;

	PhotoFrame() {

	}

	PhotoFrame(Frame frame, Photo photo) {
		this.frame = frame;
		this.photo = photo;

	}
}
