
class Index {
    public static void main(String[] args) {
        Person p1 = new Person(1, "000", "sunbul@gmail.com", "112233344");
        Address a1 = new Address(1,"first", "first", "first", "first", );
        Student s1 = new Student(id:1, studentNumber:"45", averageMar   k:"55", personId:"1");

        Person.persons.add(p1);
        Person.persons.remove(p1);
        System.out.println(p1);
        Address.addresss.add(a1);
        Address.addresss.remove(a1);
        Student.students.add(s1);

    }
}