package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int digitOne = (number / 100),
                digitTwo = (number / 10 - digitOne * 10),
                digitThree = (number - digitOne * 100 - digitTwo * 10);
        System.out.println(digitOne + digitTwo * 10 + digitThree * 100);
    }

}
