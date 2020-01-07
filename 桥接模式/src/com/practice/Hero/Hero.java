package com.practice.Hero;

import com.practice.Skill.Skill;

public abstract class Hero {
	Skill skill;
	
	public void setSkill(Skill _skill) {
		this.skill = _skill;
	}
	
	public abstract void useSkill();
}
