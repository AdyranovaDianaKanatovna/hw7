package com.company;

abstract class Hero implements HavingSuperAbility {
    private int HeroHealth;
    private int HeroDamage;
    private String HeroSuperSkills;

    public int getHeroHealth() {
        return HeroHealth;
    }

    public void setHeroHealth(int heroHealth) {
        HeroHealth = heroHealth;
    }

    public int getHeroDamage() {
        return HeroDamage;
    }

    public void setHeroDamage(int heroDamage) {
        HeroDamage = heroDamage;
    }

    public String getHeroSuperSkills() {
        return HeroSuperSkills;
    }

    public void setHeroSuperSkills(String heroSuperSkills) {
        HeroSuperSkills = heroSuperSkills;
            }
            public abstract String SuperSkills(String heroSuperSkills);
    public String superAbilityType(String abilityType){
        return "the warrior used the super skills CRITICAL DAMAGE"+ abilityType;
    }

    }


