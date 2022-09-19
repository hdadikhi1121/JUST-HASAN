
class Main {
    public static void main(String[] args) {
        Person p1 = new Person(1, "000", "sunbul@gmail.com", "112233344");
        Address a1 = new Address(1,"first", "first", "first", "first","" );
        Student s1 = new Student(2, "45", "55", "2");
        Person.persons.add(p1);
        Person.persons.remove(p1);
        Address.addresss.add(a1);
        Address.addresss.remove(a1);
        Student.students.add(s1);
        System.out.println(p1.toString());
        System.out.println(a1.toString());
        System.out.println(s1.toString());
        
    }
}