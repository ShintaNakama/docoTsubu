/**
 * 
 */
package rensyu;

/**
 * @author nakamashinta
 *
 */
public class Matango {
  int hp = 50;
  private char suffix;
  public Matango(char suffix) {
	  this.suffix = suffix;
  }
  public void attack(Hero h) {
	  System.out.println("キノコ" + this.suffix + "の攻撃");
	  System.out.println("10のタメージ");
	  h.setHp(h.getHp() -10);
	  
  }
}
