package com.lgq.study.proxy.statics;

import com.lgq.study.proxy.IPlay;

/**
 * Descriptions: Created by liuguoquan on 2017/7/30.
 */

public class RealPlay implements IPlay {
  public void play() {
    System.out.println("I can play!");
  }
}
