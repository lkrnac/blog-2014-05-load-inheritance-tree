package net.lkrnac.blog.loadinheritancetree.animals;

import org.springframework.stereotype.Component;

@Component
public class Bear extends Animal {
	public String toString() {
		return "Bear []";
	}
}
