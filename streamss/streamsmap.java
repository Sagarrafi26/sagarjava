package streamss;
import java.util.stream.*;
import java.util.*;

public class streamsmap {
    
    public static void main(String[] args){
        ArrayList<Integer> marks=new ArrayList<Integer>();
        marks.add(78);
        marks.add(31);
        marks.add(25);
        marks.add(73);
        marks.add(35);
        marks.add(10);
        System.out.println("students marks"+marks);
        List<Integer>updatedmarks=marks.stream().map(i->i+5).collect(Collectors.toList());
        System.out.println("Updated marks"+updatedmarks);
        long nooffailedstudents=marks.stream().filter(m->m<35).count();
        System.out.println("no of students failed"+nooffailedstudents);
    }
}
