import java.util.ArrayList;
import java.util.List;


public class Main {
    
    public static void main(String [] args) {
        List<Constraint> cList = new ArrayList<Constraint>();
        
        NumberConstraint c1 = new NumberConstraint(5);
        NumberConstraint c2 = new NumberConstraint(1);
        NumberConstraint c3 = new NumberConstraint(-7);
        NumberConstraint c4 = new NumberConstraint(10);
        
        cList.add(c1);
        cList.add(c2);
        cList.add(c3);
        cList.add(c4);
        
        for(Constraint c: cList) {
            if (!c.check()) {
                System.out.println(c.getFailMessage());
                break;
            }
            System.out.println("Constraint OK");
        }
    }

}
