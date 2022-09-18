
class Index {
    public static void main(String[] args) {
        Person p1 = new Person(1, "000", "sunbul@gmail.com", "112233344");
        Address a1 = new Address(1,"first", "first", "first", "first","" );
        Person.persons.add(p1);
        Person.persons.remove(p1);
        Address.addresss.add(a1);
        Address.addresss.remove(a1);
        
    }
}