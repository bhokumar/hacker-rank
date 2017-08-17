package org.bhoopendra.learning.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by bhokumar on 7/4/2017.
 */
public class StreamClient {
    public static void main(String[] args) {
        List<Employee> elements = new ArrayList<>();
        elements.add(new Employee("emp1",22,new Address("noida","Uttar Pradesh",243601)));
        elements.add(new Employee("emp16",23,new Address("noida","Uttar Pradesh",243601)));
        elements.add(new Employee("emp15",24,new Address("noida","Uttar Pradesh",243601)));
        elements.add(new Employee("emp14",25,new Address("noida","Uttar Pradesh",243601)));
        elements.add(new Employee("emp13",26,new Address("noida","Uttar Pradesh",243601)));
        elements.add(new Employee("emp12",21,new Address("noida","Uttar Pradesh",243601)));
        elements.add(new Employee("emp11",29,new Address("noida","Uttar Pradesh",243601)));
        elements.add(new Employee("emp10",35,new Address("noida","Uttar Pradesh",243601)));
        elements.add(new Employee("emp9",36,new Address("noida","Uttar Pradesh",243601)));
        elements.add(new Employee("emp8",39,new Address("noida","Uttar Pradesh",243601)));
        elements.add(new Employee("emp7",45,new Address("noida","Uttar Pradesh",243601)));
        elements.add(new Employee("emp6",24,new Address("noida","Uttar Pradesh",243601)));
        elements.add(new Employee("emp5",78,new Address("noida","Uttar Pradesh",243601)));
        elements.add(new Employee("emp4",17,new Address("noida","Uttar Pradesh",243601)));
        elements.add(new Employee("emp3",32,new Address("noida","Uttar Pradesh",243601)));
        elements.add(new Employee("emp2",27,new Address("noida","Uttar Pradesh",243601)));
        elements.stream().filter(t->t.getAge()%2==0).map(t->t.getAge()).reduce(0,(c,e)->(c+e));
        System.out.println(elements.stream().filter(t->t.getAge()%2==0).map(t->t.getAge()).reduce(0,(c,e)->(c+e)));
        System.out.println(elements.stream().filter(t->t.getAge()%2==1).map(t->t.getAge()).reduce(0,(c,e)->(c+e)));
        List<Integer> agesList = elements.stream().map(t->t.getAge()).collect(Collectors.toList());
        agesList.forEach(System.out::println);

    }
}
