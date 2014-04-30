package net.lkrnac.blog.loadinheritancetree.animals;

import org.springframework.stereotype.Component;

@Component
public class Wolf extends Animal {
	@Override
	public String toString() {
		return "Wolf []";
	}
}
