package net.lkrnac.blog.loadinheritancetree.animals;

import org.springframework.stereotype.Component;

@Component
public class PolarBear extends Bear {
	@Override
	public String toString() {
		return "PolarBear []";
	}
}
