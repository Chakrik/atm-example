package nicebank;

public class Sample1 {

	static Sample1 i1 = new Sample1();
	
    private Sample1() {

    }
    
    public static Sample1 getInstance() {
    	return i1;
    }
}
