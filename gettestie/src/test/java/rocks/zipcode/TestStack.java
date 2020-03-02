package rocks.zipcode;

import static org.junit.Assert.*;

import java.util.*;

public class TestStack {

    Address place1 = new Address("North Street","Newark","19702");
    Address place2 = new Address("North Street","Newark","19702");
    Address place3 = new Address("North Street","Newark","19702");
    Address place4 = new Address("North Street","Newark","19702");
    Address place5 = new Address("North Street","Newark","19702");
    Address place6 = new Address("North Street","Newark","19702");

    Person person1 = new Person("Jimmy",1999);
    Person person2 = new Person("Simmy",1999);
    Person person3 = new Person("Timmy",1999);
    Person person4 = new Person("Kimmy",1999);
    Person person5 = new Person("Limmy",1999);
    Person person6 = new Person("Bimmy",1999);


    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestStack1() {

        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        assertEquals(false, stack.isEmpty());
        assertEquals("Hello world",stack.peek());
        assertEquals("Hello world",stack.pop());
    }

    @org.junit.Test
    public void TestHashMap(){
        HashMap<Person,Address> nameAddress = new HashMap<>();
        nameAddress.put(person1,place1);
        nameAddress.put(person2,place2);
        nameAddress.put(person3,place3);
        nameAddress.put(person4,place4);
        nameAddress.put(person5,place5);
        nameAddress.put(person6,place6);


        assertEquals(place1,nameAddress.get(person1));      // get(key) ---- returns the value at that key
        assertEquals(false,nameAddress.isEmpty()); // isEmpty() --- returns boolean true or false
        assertEquals(6,nameAddress.size());        // .size() ----- returns the size of the map
    }
    @org.junit.Test
    public void TestHashSet(){

        HashSet<Person> personSet = new HashSet<>(6);
        personSet.add(person1);
        personSet.add(person2);
        personSet.add(person3);
        personSet.add(person4);
        personSet.add(person5);
        personSet.add(person6);

        assertEquals(6,personSet.size());
        assertEquals(false,personSet.isEmpty());
        assertEquals(personSet,personSet.clone());
        personSet.remove(person1);
        assertEquals(5,personSet.size());
        assertEquals(false,personSet.contains(person1));

        // iterator() / clear()
    }
    @org.junit.Test
    public void TestArrayList(){
        ArrayList<Address> addresses = new ArrayList<>();
        addresses.add(place1);
        assertEquals(1,addresses.size());
    }
    @org.junit.Test
    public void TestLinkedList(){
        LinkedList<Person> listy = new LinkedList<>();
        listy.add(person1);
        listy.add(person2);
        listy.addFirst(person4);
        listy.addLast(person5);

        Person expected = person4;
        Person actual = listy.get(0);
        assertEquals(expected,actual);
    }
    @org.junit.Test
    public void iteratorTest(){
        ArrayList<Person> people = new ArrayList<>();
        people.add(person1);
        people.add(person3);
        people.add(person6);

        Iterator it = people.iterator();
        Object expected1 = person1;
        Object actual1 = it.next();
        assertEquals(expected1,actual1);

        Object expected2 = person3;
        Object actual2 = it.next();
        assertEquals(expected2,actual2);
    }
    @org.junit.Test
    public void ArrayDequeTest(){

        ArrayDeque<Person> personDeq = new ArrayDeque<>();

        personDeq.add(person1);
        personDeq.add(person2);
        personDeq.addFirst(person3);

        assertEquals(person3,personDeq.getFirst());
        assertEquals(person2,personDeq.getLast());
        assertEquals(3,personDeq.size());
    }
    @org.junit.Test
    public void VectorTest(){
        Vector<Address> adresso = new Vector<>();

        adresso.add(place1);
        adresso.add(place2);

        assertEquals(2,adresso.size());
        assertEquals(place1,adresso.get(0));
        assertEquals(1,adresso.indexOf(place2));

    }
    @org.junit.Test
    public void TreeMapTest(){

        TreeMap<Person,Address> persToAdd = new TreeMap<>();

        persToAdd.put(person1,place1);
        persToAdd.put(person1,place2);

        assertFalse( persToAdd.containsValue(place1));


        //assertTrue( persToAdd.containsValue(place2.getStreet()));
    }
    @org.junit.Test
    public void TreeSetTest(){
        TreeSet<Person> persTree = new TreeSet<>();

        persTree.add(person3);
        persTree.add(person1);
        assertEquals(true, persTree.contains(person1));
    }
    @org.junit.Test
    public void PriorityQueue(){
        PriorityQueue<Person> persQue = new PriorityQueue<>();

    }


    // HashSet  ---------X
    // ArrayList  -------X
    // HashMap ----------X
    // LinkedList  ------X
    // ArrayDeque -------X
    // Vector -----------X
    // TreeMap ----------X
    // Stack  -----------X
    // TreeSet ----------X
    // Iterator ---------X
    // priorityQueue ---
    // Comparable


}
