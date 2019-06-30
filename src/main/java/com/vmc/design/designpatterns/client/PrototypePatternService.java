/**
 * 
 */
package com.vmc.design.designpatterns.client;

import org.springframework.stereotype.Service;

import com.vmc.design.designpatterns.prototype.Person;

/**
 * @author krishna_v
 *
 */
@Service
public class PrototypePatternService {
	public PrototypePatternService() {
		System.out.println("*************** prototype pattern  start ******************");
		Person p = new Person();
		p.setName("vamsi");
		p.setAge(23);
		
		Person clone = p.clone();
		
		p.setAge(54);
		System.out.println("chnage in actual object "+p.getAge());
		
		System.out.println("Clone "+clone.getAge());
		System.out.println("*************** prototype pattern end ******************");
	}
}
