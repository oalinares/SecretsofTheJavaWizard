package com.secretsofthejavawizard.races;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Hamadryad extends BaseOrderkind {

  private int speed = 30;
  private String size = "Large";
  //Oakyn is spoken by kinfolk of the Hamadryad, and Ficus is the language spoken between snake familiars and Hamadryads
  private String[] languages = {"Common", "Oakyn", "Ficus"};
  /**
   * Hamadryads bear a natural affinity to alchemy raised in the forests of (insert mtn range)
   * Hamadryads are able to weave mycellium from the Earth to make fibers, ropers, etc, and 
   * have a resistance to poison from their alchemic practices, teachings, and rituals.
   */
  private String[] orderkindBuff = {"Alchemic Talent", "Mycellium Weaver", "Poison Resistance"}; 
  private String[] subOrderkindBuff = {""};
  public Hamadryad(String name, int strength, int dexterity, int constitution, int intelligence,
      int wisdom, int charisma) {
    
    // +2 intelligence bonus from Orderkind modifier
    super(name, strength, dexterity, constitution, intelligence + 2, wisdom, charisma);
  }
  @Override
  public int getSpeed() {
    return speed;
  }

  @Override
  public String[] getOrderkindBuff() {
    return orderkindBuff;
  }

  @Override
  public String[] getSuborderkindBuff() {
    return subOrderkindBuff;
  }

  @Override
  public String[] getLanguages() {
    return languages;
  }

  @Override
  public String getSize() {
    return size;
  }

  @Override
  public ArrayList<String> getAllElements() {

    ArrayList<String> elements = new ArrayList<String>();
    elements.add(getName());
    elements.add(String.valueOf(getStrength()));
    elements.add(String.valueOf(getDexterity()));
    elements.add(String.valueOf(getConstitution()));
    elements.add(String.valueOf(getIntelligence()));
    elements.add(String.valueOf(getWisdom()));
    elements.add(String.valueOf(getCharisma()));
    elements.add(String.valueOf(getSpeed()));
    elements.add(Arrays.toString(getOrderkindBuff()));
    elements.add(Arrays.toString(getSuborderkindBuff()));
    elements.add(Arrays.toString(getLanguages()));
    elements.add(String.valueOf(getSize()));
    return elements;



  }

}
