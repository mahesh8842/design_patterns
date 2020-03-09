package com.epam.patterns;

interface Dress {
  public void assemble();
}

class BasicDress implements Dress {
  @Override
  public void assemble() {
    System.out.println("Basic Dress Features");
  }
}

class DressDecorator implements Dress {
  protected Dress dress;
  
  public DressDecorator(Dress c) {
    this.dress = c;
  }

  @Override
  public void assemble() {
    this.dress.assemble();
  }
}

class CasualDress extends DressDecorator {
  public CasualDress(Dress c) {
    super(c);
  }
  
  @Override
  public void assemble() {
    super.assemble();
    System.out.println("Adding Casual Dress Features");
  }
}


class SportyDress extends DressDecorator {
  public SportyDress(Dress c) {
    super(c);
  }
  
  @Override
  public void assemble() {
    super.assemble();
    System.out.println("Adding Sporty Dress Features");
  }
}

class FancyDress extends DressDecorator {
  public FancyDress(Dress c) {
    super(c);
  }
  
  @Override
  public void assemble() {
    super.assemble();
    System.out.println("Adding Fancy Dress Features");
  }
}
	
