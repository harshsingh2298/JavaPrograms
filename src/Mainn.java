import java.util.*;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class Mainn {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Map<String, Integer> map = new HashMap<>();

        map.put(null, 10);
        map.put(null, 20);
        map.put("A", null);

        System.out.println(map.size());
        System.out.println(map.get(null));
        System.out.println(map.containsKey(null));
        System.out.println(map.get("B"));
        List<Integer> list = Arrays.asList(1,4,5,7,4,2,6,8);
        list.stream().forEach((i)-> System.out.println("New java 8 learning "+i));


        Calculator c = (a,b)->a+b;

        System.out.println(c.calculate(12,45));

        List<Integer> numbers =
                Arrays.asList(10, 15, 20, 25, 30, 35, 40);

        List<Integer> result = numbers.stream().filter(n->(n%2==0))
                .filter(n->n>20).collect(Collectors.toList());

        System.out.println("Result of q1 "+result);


        List<Integer> numbers1 =
                Arrays.asList(2, 4, 6, 8, 10);

        List<Integer> result2 = numbers1.stream().map(n-> n*n).collect(Collectors.toList());
        System.out.println("Second coding with map "+result2);


        List<Integer> numbers3 =
                Arrays.asList(15, 4, 20, 8, 30, 12, 5);

        List<Integer> result3 = numbers3.stream().filter(n->n>10)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println("Problem 3 "+result3);

        ExecutorService executor = Executors.newFixedThreadPool(1);
        Future<Integer> future = executor.submit(() -> {
            Thread.sleep(5000);
            return 100;
        });

//        Integer result = future.get();

        System.out.println("Hello");




        executor.submit(()->
                System.out.println());

        Object lock1 = new Object();
        Object lock2 = new Object();

        Thread t1 = new Thread(() -> {
            synchronized (lock1) {
                synchronized (lock2) {
                    System.out.println("T1");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (lock2) {
                synchronized (lock1) {
                    System.out.println("T2");
                }
            }
        });
//        TreeSet<Integer> set = new TreeSet<>();
//
//        set.add(10);
//        set.add(20);
//        set.add(30);


//      Comparator<Employee> employeeComparator = Comparator.comparing(Employee::getSalary)
//              .thenComparing(Employee::getName);
        TreeSet<String> set2 = new TreeSet<>();
        TreeSet<Employee> set3 = new TreeSet<>();
        Thread t9 = new Thread(() -> {
            System.out.println("T1");
        });
//
//        Thread t2 = new Thread(() -> {
//            System.out.println("T2");
//        });
//
//        t1.start();
//        t2.start();
//
//        t1.join();
//        t2.join();

        System.out.println("Main");
//        set.add("Java");
//        set.add("java");

//        System.out.println(set.size());
//        System.out.println(set.contains("JAVA"));

//        set.floor(25);
//        set.ceiling(25);
//        set.lower(20);
//        set.higher(20);

//        Set<String> set = new HashSet<>();

//        set.add("Java");
//        set.add("Java");
//        set.add(new String("Java"));

//        System.out.println(set.size());
//

//        Map<Integer, String> map = new HashMap<>();
//
//        map.put(3, "C");
//        map.put(1, "A");
//        map.put(2, "B");
//
//        for (Map.Entry<Integer, String> entry : map.entrySet()) {
//            System.out.println(entry.getKey());
//        }
//
//        Map<String, String> map1 = new HashMap<>();
//        map1.put("A", null);
//        map1.put("B", null);
//        map1.put(null, null);
//
//        System.out.println(map.containsKey(null));
//        System.out.println(map.containsValue(null));
//
//        map.put(null, "A");
//        map.put(null, "B");
//
//        System.out.println(map.size());
//        System.out.println(map.get(null));
//
//        String a2 = new String("A");
//        String b2 = new String("A");
//        System.out.println(a2==b2);
//        String a = "Java";
//        String b = "Java";
//
//        System.out.println(a == b);
//        System.out.println(a.equals(b));
//
//
//
//
//
//
//        String s = "Java";
//
//        s = s.concat(" Developer");
//
//        System.out.println(s);
//
//        Parent p = new Child();
//
//       p.getValue();
//
//
//        String a1 = "Java";
//        String b1 = "Java";
//
//        System.out.println(a1.equals(b1));
//        System.out.println(a1.hashCode() == b1.hashCode());
//    }
//
//
        ExecutorService executors = Executors.newFixedThreadPool(2);


        executors.submit(()->{
            System.out.println("task 1");
        });
        executors.submit(()->{
            System.out.println("task 2");
        });
        executors.submit(()->{
            System.out.println("task 3");
        });
        executors.submit(()->{
            System.out.println("task 4");
        });
        executors.submit(()->{
            System.out.println("task 5");
        });
      executors.shutdown();
}


    class A {

     A(){}
     void show() {
        System.out.println("A");
    }
}

class B extends A {


     void show() {
        System.out.println("B");
    }
}
//
//class Parent {
//    void show(int x) {
//        System.out.println("Parent");
//    }
//}
//
//class Child extends Parent {
//    @Override
//    void show(int x) {
//        System.out.println("Child");
//    }
//}
//
class Parent {
    Number getValue() {
        return 10;
    }
}

class Child extends Parent {
    Integer getValue() {
        return 10;
    }
}
class Employee {

    public int id;
    public String name;

    public Double salary;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

@FunctionalInterface
    interface Calculator{
       int calculate(int a,int b);
}


}