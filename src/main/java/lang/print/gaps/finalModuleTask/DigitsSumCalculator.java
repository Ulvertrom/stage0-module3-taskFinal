package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int digitOne = (number / 1000),
                digitTwo = (number / 100 - digitOne * 10),
                digitThree = (number/10 - digitOne * 100 - digitTwo * 10),
                digitFour = (number - digitOne * 1000 - digitTwo * 100 - digitThree * 10);
        System.out.println(digitOne + digitTwo + digitThree + digitFour);
    }

}
