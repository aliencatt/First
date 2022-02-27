package Inheritane.Bike;

import Inheritane.Bike.Brands.Bajaj;
import Inheritane.Bike.Brands.Honda;

public class Rider {

  public static void main(String[] args) {

    Bike bike = Bajaj.getBajaj("pulsar");
    bike.details();

    //  Honda honda =Honda.getHonda("shine");
  }
}
