import java.util.HashSet;
import java.util.Iterator;

public class Pond {
    private HashSet<NonPredator> nonSet;

    public Pond(int amount) {
        this.nonSet = new HashSet<>(amount);
    }

    public void populate(int amount, int rows, int columns){
        for(int i = 0; nonSet.size() < amount; i++){
            nonSet.add(new NonPredator(i, rows, columns));
        }

    }

    public void print(){
        Iterator i = nonSet.iterator();

        while(i.hasNext()) {
            String u = (String)i.next();
            System.out.println(u);
        }
    }

}
