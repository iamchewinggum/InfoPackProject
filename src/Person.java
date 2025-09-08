import java.util.ArrayList;
import java.util.Scanner;

public class Person {

    //--------------------------------------------------------------------------------variables
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



    //-------------------------------------------------------------------------------getters
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
    public String getAllergies(){
        return allergies;
    }
    public String getMedication(){
        return medication;
    }
    public String getSpecialneedsOrAccomodations(){
        return specialneedsOrAccomodations;
    }
    public String getInsuranceCompany(){
        return insuranceCompany;
    }


    //setters



    public void set_name(String name){
        this.name = name;
    }
    public void set_age(int age){
        this.age = age;
    }
    public void set_birthday(String birthday){
        this.birthday = birthday;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setHomeAddress(String homeAddress){
        this.homeAddress = homeAddress;
    }
    public void setAllergies(String allergies){
        this.allergies = allergies;
    }
    public void setMedication(String medication){
        this.medication = medication;
    }
    public void setSpecialneedsOrAccomodations(String specialneedsOrAccomodations){
        this.specialneedsOrAccomodations = specialneedsOrAccomodations;
    }
    public void setInsuranceCompany(String insuranceCompany){
        this.insuranceCompany = insuranceCompany;
    }






    //WHAT DOES THIS DO?
    ArrayList<Person> familymembers;



    //-------------------------------------------------------------------------------constructor
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

        //init the arraylist --------------------------------------------------------------------> WHAT DOES THIS DO PART 2?
        familymembers = new ArrayList<>();

        //CALLS personInfo() function
      //personInfo();
    }



    //----------------------------------------------------------------------------------------------------display person info DONE!!!
    public void personInfo(){
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
        System.out.println(); //just spacing
    }

    //----------------------------------------------------------------------------------------------------display all persons DONE!!!
    public void allFamilyMemberInfo(){
        for(int i = 0; i < familymembers.size(); i++){
            System.out.println("family member #" + (i + 1) );
            familymembers.get(i).personInfo();
        }
    }



    //---------------------------------------------------------------------------------------------------Add DONE!!!
    public void addPerson(Person person){
        familymembers.add(person);
        System.out.println("new person was added to your InfoPack!");
        System.out.println("person added: " + person.name);
        System.out.println();

    }



    //-------------------------------------------------------------------------------------------------Delete DONE!!!
    public void removePerson(String name){
        //loop through arraylist to find this string

        for(int i = 0; i < familymembers.size(); i++){
            if(name == familymembers.get(i).name){
                System.out.println("deleting " + familymembers.get(i).name);
                familymembers.remove(i);
                break;
            }

        }

    }

    //------------------------------------------------------------------------------------------------update
    public void updatePerson(String name){
        Scanner scanner = new Scanner(System.in);
        boolean updating = true;

        //loop through arraylist to find this string

        for(int i = 0; i < familymembers.size(); i++){
            Person P = familymembers.get(i);
            if(name == familymembers.get(i).name){
                System.out.println("updating " + familymembers.get(i).name);
                while(updating){
                    update_menu();
                    int UserNumber = Integer.parseInt(scanner.next().trim());

                    switch (UserNumber){
                        case 1:
                            //Name
                            System.out.println("Enter the new name: ");
                            String newname = scanner.next().trim().toLowerCase();
                            P.set_name(newname);

                            System.out.println("The new name is: " + familymembers.get(i).get_name());

                            break;
                        case 2:
                            //Age
                            System.out.println("Enter the new age: ");
                            int newage = Integer.parseInt(scanner.next().trim());
                            P.set_age(newage);
                            System.out.println("The new age is: " + familymembers.get(i).get_age());


                            break;
                        case 3:
                            //Birthday
                            System.out.println("Enter the new Birthday: ");
                            String newBirthday = scanner.next().trim().toLowerCase();
                            P.set_birthday(newBirthday);
                            System.out.println("The new Birthday is: " +  familymembers.get(i).get_birthday());


                            break;
                        case 4:
                            //PhoneNumber
                            System.out.println("Enter the new PhoneNumber: ");
                            String newPhoneNumber = scanner.next().trim().toLowerCase();
                            P.setPhoneNumber(newPhoneNumber);
                            System.out.println("The new PhoneNumber is: " +  familymembers.get(i).getPhoneNumber());
                            break;
                        case 5:
                            //Email
                            System.out.println("Enter the new Email: ");
                            String newEmail = scanner.next().trim().toLowerCase();
                            P.setEmail(newEmail);
                            System.out.println("The new Email is: " +  familymembers.get(i).getEmail());


                            break;
                        case 6:
                            //HomeAddress
                            System.out.println("Enter the new HomeAddress: ");
                            String newHomeAddress = scanner.next().trim().toLowerCase();
                            P.setHomeAddress(newHomeAddress);
                            System.out.println("The new HomeAddress is: " +  familymembers.get(i).getHomeAddress());

                            break;
                        case 7:
                            //Allergies
                            System.out.println("Enter the new Allergies: ");
                            String newAllergies = scanner.next().trim().toLowerCase();
                            P.setAllergies(newAllergies);
                            System.out.println("The new Allergies are: " +  familymembers.get(i).getAllergies() );


                            break;
                        case 8:
                            //Medication
                            System.out.println("Enter the new Medication: ");
                            String newMedication = scanner.next().trim().toLowerCase();
                            P.setMedication(newMedication);
                            System.out.println("The new Medications are: " +  familymembers.get(i).getMedication());


                            break;
                        case 9:
                            //SpecialneedsOrAccomodations
                            System.out.println("Enter the new SpecialneedsOrAccomodations: ");
                            String newSpecialneedsOrAccomodations = scanner.next().trim().toLowerCase();
                            P.setSpecialneedsOrAccomodations(newSpecialneedsOrAccomodations);
                            System.out.println("The new SpecialneedsOrAccomodations are: " +  familymembers.get(i).getSpecialneedsOrAccomodations());


                            break;
                        case 10:
                            //InsuranceCompany
                            System.out.println("Enter the new InsuranceCompany: ");
                            String newInsuranceCompany = scanner.next().trim().toLowerCase();
                            P.setInsuranceCompany(newInsuranceCompany);
                            System.out.println("The new InsuranceCompany is: " +  familymembers.get(i).getInsuranceCompany() );



                            break;
                        case 11:
                            //Done updating Person
                            updating = false;
                            break;
                    }

                }

            }

        }

    }


    public void update_menu(){
        System.out.println("1. name");
        System.out.println("2. Age");
        System.out.println("3. Birthday ");
        System.out.println("4. PhoneNumber ");
        System.out.println("5. Email ");
        System.out.println("6. HomeAddress ");
        System.out.println("7. allergies ");
        System.out.println("8. medication ");
        System.out.println("9. SpecialneedsOrAccomodations");
        System.out.println("10. insuranceCompany");
        System.out.println("11. Done updating person");

        System.out.println("select a number: ");
    }




}
