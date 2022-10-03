import Interfaces.ITest;
import Interfaces.ITest2;

public class InterfaceTest implements ITest, ITest2 {

    @Override
    public void function1() {

    }

    @Override
    public int function2(int int1) {
        return 0;
    }

    @Override
    public String function3(String string1) {
        return null;
    }

    @Override
    public int function4(int int4) {
        return 0;
    }

    public double function5(){
        return 0;
    }
}
