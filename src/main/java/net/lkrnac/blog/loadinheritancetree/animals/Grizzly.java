package net.lkrnac.blog.loadinheritancetree.animals;

import org.springframework.stereotype.Component;

@Component
public class Grizzly extends Bear {
	@Override
	public String toString() {
		return "Grizzly []";
	}
}
