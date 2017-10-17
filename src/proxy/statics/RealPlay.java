package proxy.statics;

import proxy.IPlay;

/**
 * Descriptions: Created by liuguoquan on 2017/7/30.
 */

public class RealPlay implements IPlay {
  @Override public void play() {
    System.out.println("I can play!");
  }
}
