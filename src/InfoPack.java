import java.util.Scanner;

public class InfoPack {
    private boolean AppIsrunning;
    private Messages messages;
    private Person person;

    //constructor
    InfoPack(){
        this.AppIsrunning = true;
        System.out.println("app is running");

        messages = new Messages();
    }

    private static void displayMenu(){
        System.out.println("1. Start");
        System.out.println("2. Add");
        System.out.println("3. Delete");
        System.out.println("4. Update a Person");
        System.out.println("5. Download your InfoPack");
        System.out.println("6. Exit InfoPack");

        System.out.println("select a number: ");
    }

    private void ExitApp(){
        AppIsrunning = false;
    }

    public void runInfoPack(){

        Scanner scanner = new Scanner(System.in);


        while(AppIsrunning){
            System.out.println(
                    messages.get_hiMessage()
            );

         displayMenu();
         int UserNumber = Integer.parseInt(scanner.next().trim());


         switch (UserNumber){
             case 1:
                 //Start

                 break;
             case 2:
                 //Add

                 break;
             case 3:
                 //Delete

                 break;
             case 4:
                 //Update a Person

                 break;
             case 5:
                 //Download Your InfoPack

                 break;
             case 6:
                 //Exit InfoPack
                 ExitApp();
                 break;
         }
        }
        scanner.close();
    }





}