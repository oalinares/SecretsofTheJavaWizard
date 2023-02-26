package com.secretsofthejavawizard.races;

import java.util.ArrayList;
import java.util.Arrays;

public class Ratasui extends BaseOrderkind {

  private int speed = 35;
  private String size = "Small";
  // Derinkuyu is an underground city found in the Derinkuyu district in Nevsehir Province, Turkey
  private String[] languages = {"Common", "Derinkuyu"};
  /*
   * Vision Nocturna is night vision, and Narrow Squeak allows the player to squeeze through narrow
   * spaces sans armor, but can carry certain weapons and other items.
   */
  private String[] orderkindBuff = {"Vision Nocturna", "Narrow Squeak"};

  private String[] subOrderkindBuff = {""};

  public Ratasui(String name, int strength, int dexterity, int constitution, int intelligence,
      int wisdom, int charisma) {

    // +2 dexterity bonus from Orderkind modifier.
    super(name, strength, dexterity + 2, constitution, intelligence, wisdom, charisma);
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
