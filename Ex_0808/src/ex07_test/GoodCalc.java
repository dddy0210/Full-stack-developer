package ex07_test;

public class GoodCalc extends Calculator {

	//두 수를 더하여 반환하는 add()
	@Override
    public int add(int a, int b){
        return a + b;
    }
	
	//두 수를 빼서 반환하는 substract;
	@Override
    public int substract(int a, int b){
        return a - b;
    }
	
	//배열의 평균을 구하는 average();
	@Override
    public double average(int[] a){
        int sum = 0;
        for(int i : a) {
        	sum +=i;
        }
        double avg = (double)sum / a.length;
        return avg;
        
    }






}
