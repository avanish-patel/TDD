public class MainClass implements Adder, Subtractor{


    @Override
    public long add(long... operands) {

        long sum = 0;

        for(long operand : operands){

            sum += operand;
        }

        return sum;
    }

    @Override
    public long subtract(long... operands) {

        long sub = operands[0];

        for (int i=1; i<operands.length; i++) {

            sub -= operands[i];
        }

        return sub;
    }
}
