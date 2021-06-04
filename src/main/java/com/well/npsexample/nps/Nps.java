package com.well.npsexample.nps;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Nps {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  
  private Integer npsGrade;
  private boolean likedShippingValue;
  private boolean likedPrice;
  private boolean likedNavigation;
  private boolean likedPayment;
  private boolean likedDelivery;
  
  public Nps() {}
  
  public Nps(
    Integer npsGrade,
    boolean likedShippingValue,
    boolean likedPrice,
    boolean likedNavigation,
    boolean likedPayment,
    boolean likedDelivery
  ) {
    this.npsGrade = npsGrade;
    this.likedShippingValue = likedShippingValue;
    this.likedPrice = likedPrice;
    this.likedNavigation = likedNavigation;
    this.likedPayment = likedPayment;
    this.likedDelivery = likedDelivery;
  }
  
  public Long getId() {
    return id;
  }
  
  public Integer getNpsGrade() {
    return npsGrade;
  }
  
  public boolean getLikedShippingValue() {
    return likedShippingValue;
  }
  
  public boolean getLikedPrice() {
    return likedPrice;
  }
  
  public boolean getLikedNavigation() {
    return likedNavigation;
  }
  
  public boolean getLikedPayment() {
    return likedPayment;
  }
  
  public boolean getLikedDelivery() {
    return likedDelivery;
  }

}

