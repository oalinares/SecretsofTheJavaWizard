package com.secretsofthejavawizard.races;

import java.util.ArrayList;
import java.util.Arrays;

public class Manteater extends BaseOrderkind {

  private int speed = 30;
  private String size = "Medium";
  // Derinkuyu is an underground city found in the Derinkuyu district in Nevsehir Province, Turkey
  private String[] languages = {"Common", "Derinkuyu"};
  private String[] orderkindBuff = {"", ""}; /// Need to think of buffs i.e tongue as a weapon? or
                                             /// use to open doors from underneath?
  private String[] subOrderkindBuff = {""};

  public Manteater(String name, int strength, int dexterity, int constitution, int intelligence,
      int wisdom, int charisma) {

    // +1 to all elements bonus from Orderkind modifer
    super(name, strength + 1, dexterity + 1, constitution + 1, intelligence + 1, wisdom + 1,
        charisma + 1);
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
