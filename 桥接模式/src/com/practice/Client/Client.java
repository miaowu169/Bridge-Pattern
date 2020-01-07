package com.practice.Client;

import com.practice.Hero.Hero;
import com.practice.Skill.Skill;

public class Client {
	public static void main(String a[]) {
		Skill skill;
		Hero hero;
		
		skill = (Skill)XMLUtilGame.getBean("skill");
		hero = (Hero)XMLUtilGame.getBean("hero");
		
		hero.setSkill(skill);
		hero.useSkill();
	}
}
