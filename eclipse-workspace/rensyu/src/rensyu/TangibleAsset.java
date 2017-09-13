/**
 * 
 */
package rensyu;

/**
 * @author nakamashinta
 *
 */
public class TangibleAsset extends Asset implements Thing {
	private String color;
	private double weight;
    public TangibleAsset(String name, int price, String color) {
		super(name, price);
		this.color = color;
    }
    public String getColor() { return this.color;}
@Override
    public double getWeight() { return this.weight;
}
@Override
public void setWeight(double weight) {this.weight = weight;
	// TODO 自動生成されたメソッド・スタブ
	
}
}
