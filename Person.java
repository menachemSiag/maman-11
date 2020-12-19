/**
 * Created by Menachem on 16/12/2020.
 */
public class Person {
// attributes
    private String _firstName;
    private String _lastName;
    private long _id;

// contractor
    public Person(String firstName, String lastName, long id){
        _firstName = firstName;
        _lastName = lastName;
        _id = id;
    }

//    copy contractor
    public Person(Person other) {
        _firstName = other._firstName;
        _lastName = other._lastName;
        _id = other._id;
    }

//    getters
    public String getFirstName(){
        return _firstName;
    }

    public String getLastName() {
        return _lastName;
    }

    public long getId() {
        return _id;
    }

//    setters
    public void setFirstName(String firstName) {
        _firstName = firstName;
    }

    public void setLastName(String lastName) {
        _lastName = lastName;
    }

    public void setId (long id) {
        _id = id;
    }

    public String toStirng() {
        return ("Last Name : " + getLastName() + ", First Name : " + getFirstName() + " ,ID : " + getId());
    }

}
