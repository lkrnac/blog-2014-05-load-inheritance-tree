package net.lkrnac.blog.loadinheritancetree;

import java.util.List;

import net.lkrnac.blog.loadinheritancetree.animals.Animal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Nature {
	List<Animal> animals;

	@Autowired
	public Nature(List<Animal> animals) {
		this.animals = animals;
	}

	public void showAnimals() {
		animals.forEach(animal -> System.out.println(animal));
	}
}
