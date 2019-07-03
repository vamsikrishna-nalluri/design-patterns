/**
 * 
 */
package com.vmc.design.designpatterns.client;

import org.springframework.stereotype.Service;

import com.vmc.design.designpatterns.singleton.President;

/**
 * @author krishna_v
 *
 */
@Service
public class SingletonPattern {
	SingletonPattern() {
		System.out.println("********************************************* singleton start *******************");
		System.out.println(President.getInstance());
		System.out.println(President.getInstance());
		System.out.println("********************************************* singleton end *******************");
	}
}
