package MPP.lab8.prob6;

import MPP.lab8.prob2a.Employee;

import java.util.function.BiFunction;
import java.util.function.Function;

public class prob6 {


    //A. (Employee e) -> e.getName()
  //  Function<Employee, String> emp = e->e.getName();
   // Function <Employee,String> emp1 = Employee::getName;

    //B. (Employee e) -> e.getName()
    //  Function<Employee, String> emp =(e,s)->e.getName();
    // Function <Employee,String> emp1 = Employee::getName;

    // C. (String s1,String s2) -> s1.compareTo(s2)
    // Comparator<String,String> com = (s1,s2) -> s1.compareTo(s2);
    // Comparator<String,String> com1 = String::CompareTo;

    // D. (Integer x,Integer y) -> Math.pow(x,y)
    //BiFunction<Integer,Integer, Double> bi1 = (x,y)-> Math.pow(x, y);
    //BiFunction<Integer,Integer,Double> bi2 = Math::pow;

    // E. (Apple a) -> a.getWeight()
    //Function<Apple, Double> w1 = a-> a.getWeight();
    //Function<Apple, Double> w2 = Apple::getWeight();

  //  F. (String x) -> Integer.parseInt(x);
    // Function(String, Integer) p1 = p-> Integer.parseint(p1);
    //Function(String, Integer) p2 = Integer::parseInt;

    // G. EmployeeNameComparator comp = new EmployeeNameComparator();
    //(Employee e1, Employee e2) -> comp.compare(e1,e2)
    // EmployeeNameComparator comp = new EmployeeNameComparator();
    // Comparator<Employee> comp3 = (e1, e2) -> comp.compare(e1, e2);
    // Comparator<Employee> comp4 = comp::compare;

    public static void main(String[] args) {
        // A
        // System.out.println(e.apply(new Employee("Amin")));

        // B
        //emp4.accept(new Employee("Amin"), "hcinet");

        // C
       // comp2.compare("Amin", "hcinet");

        // D
      //  power2.apply(4, 3);

        // E
        //System.out.println(w.apply(new Apple(5)));

        // F
        //System.out.println(parse.apply("2025"));

    }
}
