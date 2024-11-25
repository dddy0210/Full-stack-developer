package ex01_super;
//상속을 이용해서 다음 클래스들을 간결한 구조로 만드세요 
//부모 -> 넓은 범위의 개념, 자식->좁은 범위의 개념 

class Pen{
	private int amount;
    public int getAmount(){return amount;}
    public void setAmount(int amount){this.amount = amount;}
}

class SharpPen extends Pen{
    private int width;
}

class BallPen extends Pen{
    private String color;
    public String getColor(){return color;}
    public void setColor(String color){this.color = color;}
}

class FountainPen extends BallPen{
	public void refill(int n){int amount = n;}
}

public class PenMain {

	

}
