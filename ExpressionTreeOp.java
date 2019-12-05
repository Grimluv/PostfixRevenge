public class ExpressionTreeOp 
{
    private int termType;
    private char operator;
    private char variable;
    private int value;

    public ExpressionTreeOp(int type, char op, int val, char var) 
    {
        termType = type;
        variable = var;
        operator = op;
        value = val;
    }

    public boolean isOperator() 
    {
        return (termType == 1);
    }
    
    public char getOperator() 
    {
        return operator;
    }
    public boolean isVariable() 
    {
        return (termType == 1);
    }
    
    public char getVariable() 
    {
        return variable;
    }

    public int getValue() 
    {
        return value;
    }
    
    public String toString()
    {
        if (termType == 1) 
            return operator + "";
        else
            return value + "";
    }
}
    

