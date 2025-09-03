//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /*
        InfoPack newpacket = new InfoPack();
        newpacket.runInfoPack();

         */


        Person barlitos = new Person("barlitos", 25,"00,00,0000", "111-111-1111","barlitos@gmail.com","barlitosRd","N/A",
                "N/A","N/A","insuraceCo");

        Person alicia = new Person("alicia", 30, "12,05,1995", "222-222-2222", "alicia@yahoo.com", "sunsetAve", "N/A",
                "N/A", "N/A", "healthPlus");
        Person theo = new Person("theo", 35, "18,09,1989", "555-555-5555", "theo.t@protonmail.com", "pineRd", "N/A",
                "N/A", "N/A", "guardianHealth");

        Person zara = new Person("zara", 40, "09,03,1985", "666-666-6666", "zara_z@aol.com", "elmStreet", "N/A",
                "N/A", "N/A", "totalCare");

barlitos.addPerson(alicia);
barlitos.addPerson(theo);
barlitos.addPerson(zara);
barlitos.allFamilyMemberInfo();


barlitos.updatePerson("zara");
barlitos.allFamilyMemberInfo();




    }
}