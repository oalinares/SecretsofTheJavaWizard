package com.secretsofthejavawizard.races;

import java.util.List;

/**
 * Baseline constructor for each new character created. Each Orderkind will inherit this class,so
 * Orderkind buffs' can be added when calculating the stats. All Orderkind will also inherit the
 * Orderkind interface.
 * 
 * @author racso
 *
 */
public abstract class BaseOrderkind implements Orderkind {
  private String name;
  private int strength;
  private int dexterity;
  private int constitution;
  private int intelligence;
  private int wisdom;
  private int charisma;

  public BaseOrderkind() {}

  /**
   * 
   * @param name
   * @param strength
   * @param dexterity
   * @param constitution
   * @param intelligence
   * @param wisdom
   * @param charisma
   */
  public BaseOrderkind(String name, int strength, int dexterity, int constitution, int intelligence,
      int wisdom, int charisma) {
    this.name = name;
    this.strength = strength;
    this.dexterity = dexterity;
    this.constitution = constitution;
    this.intelligence = intelligence;
    this.wisdom = wisdom;
    this.charisma = charisma;
  }

  public String getName() {
    return name;
  }

  public int getStrength() {
    return strength;
  }

  public int getDexterity() {
    return dexterity;
  }

  public int getConstitution() {
    return constitution;
  }

  public int getIntelligence() {
    return intelligence;
  }

  public int getWisdom() {
    return wisdom;
  }

  public int getCharisma() {
    return charisma;
  }
}
