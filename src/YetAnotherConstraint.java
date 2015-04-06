
public class YetAnotherConstraint implements Constraint {
    
    private String line;
    private String failMessage;
    
    public YetAnotherConstraint(String a) {
        this.line = a;
        this.line = "String " + this.line + " ain't good enough!";
    }

    @Override
    public boolean check() {
        return this.line.length() > 3;
    }

    @Override
    public String getFailMessage() {
        return this.failMessage;
    }
    
}