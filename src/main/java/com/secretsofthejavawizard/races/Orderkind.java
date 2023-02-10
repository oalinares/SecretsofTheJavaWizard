package com.secretsofthejavawizard.races;

import java.util.List;

public interface Orderkind {
  
  /**
   * Returns the character's name
   * @return name
   */
  public String getName();
  
  /**
   * Returns the character's Strength value
   * @return strength
   */
  
  public int getStrength();
  /**
   * Returns the character's Intelligence value
   * @return intelligence
   */
  public int getIntelligence();
  
  /**
   * Returns the character's Wisdom value
   */
  public int getWisdom();
  
  /**
   * Returns the character's Dexterity value
   * @return dexterity
   */
  public int getDexterity();
  
  /**
   * Returns the character's Constitution value
   * @return constitution
   */
  public int getConstitution();
  
  /**
   * Return the character's Charisma value
   * @return charisma
   */
  public int getCharisma();
  
  /**
   * Returns the character's speed value
   * @return speed
   */
  public int getSpeed();
  
  /**
   * Returns an array of each Orderkind buff
   * @return orderkindBuff
   */
  public String[] getOrderkindBuff();
  
  /**
   * Returns an arry of each suborderkind buff
   * @return suborderkindBuff
   */
  public String[] getSuborderkindBuff();
  
  /**
   * Returns an array of the character's spoken language(s)
   * @return languages
   */
  public String[] getLanguages();
   
  /**
   * Returns the size of the Orderkind
   * @return size
   */
  public String getSize();
  
  /**
   * Returns all the Orderkind elements in an ArrayList
   * @return elements
   */
  public List<String> getAllElements();
}
