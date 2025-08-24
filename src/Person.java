import java.util.ArrayList;

public class Person {


    private String name;
    private int age;
    private String birthday;
    private String phoneNumber;
    private String email;
    private String homeAddress;
    private String allergies;
    private String medication;
    private String specialneedsOrAccomodations;
    private String insuranceCompany;

    public String get_name(){
        return name;
    }
    public int get_age(){
        return age;
    }
    public String get_birthday(){
        return birthday;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public String getEmail(){
        return email;
    }
    public String getHomeAddress(){
        return homeAddress;
    }



    private static int i = 0;

    private void increase_i(){
        i++;
    }
    private void decrease_i(){
        if(i != 0){
            i--;
        }
    }


    ArrayList<Person> familymembers;


    Person(String name,
           int age,
           String birthday,
           String phoneNumber,
           String email,
           String homeAddress,
           String allergies,
           String medication,
           String specialneedsOrAccomodations,
           String insuranceCompany){
        this.name = name;
        this.age = age;
        this.birthday = birthday;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.homeAddress = homeAddress;
        this.allergies = allergies;
        this.medication = medication;
        this.specialneedsOrAccomodations = specialneedsOrAccomodations;
        this.insuranceCompany = insuranceCompany;

        //init the arraylist
        familymembers = new ArrayList<>();


        personInfo();
    }



    public void personInfo(){
        System.out.println("family memeber #");
        System.out.println("this information is for ---> " + name);
        System.out.println("Age: " + age);
        System.out.println("Birthday: " + birthday);
        System.out.println("PhoneNumber: " + phoneNumber);
        System.out.println("Email: " + email);
        System.out.println("HomeAddress: " + homeAddress);
        System.out.println("allergies: " + allergies);
        System.out.println("medication: " + medication);
        System.out.println("SpecialneedsOrAccomodations: " + specialneedsOrAccomodations);
        System.out.println("insuranceCompany: " + insuranceCompany);
        System.out.println();
    }



    public void addPerson(Person person){
        familymembers.add(person);
        System.out.println("new person was added to your InfoPack!");
        System.out.println("person added: " + person.name);
    }

    public void removePerson(String name){
        //loop through arraylist to find this string

        for(int i = 0; i < familymembers.size(); i++){


        }




    }



}
