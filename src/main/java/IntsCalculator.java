public class IntsCalculator implements Ints {
    protected final Calculator target;

    public IntsCalculator() { this.target = new Calculator(); }

    @Override
    public int sum(int arg0, int arg1) {
        Calculator.Formula result = target.newFormula().addOperand(arg0).addOperand(arg1).calculate(Calculator.Operation.SUM);
        // return  (int)target.newFormula().calculate(Calculator.Operation.SUM).result();
        return (int)result.result();
    }

    @Override
    public int mult(int arg0, int arg1) {
        Calculator.Formula result = target.newFormula().addOperand(arg0).addOperand(arg1).calculate(Calculator.Operation.MULT);
        return (int)result.result();
    }

    @Override
    public int pow(int a, int b) {
        Calculator.Formula result = target.newFormula().addOperand(a).addOperand(b).calculate(Calculator.Operation.POW);
        return (int)result.result();
    }
}





