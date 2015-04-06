
public class NumberConstraint implements Constraint {
    
    private int number;
    private String failMessage;
    
    public NumberConstraint(int i) {
        this.number = i;
        this.failMessage = "Number " + this.number + " ain't good enough!";
    }

    @Override
    public boolean check() {
        return this.number > 0;
    }

    @Override
    public String getFailMessage() {
        return this.failMessage;
    }
    
}
