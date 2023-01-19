

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException, IOException {
       ClientImplimentaion imp = new ClientImplimentaion();
        List<Clients> cls = new ArrayList<>();
        Clients cn =null;
/*
   //get element with ID:
        System.out.println("get element with ID");
        cn=imp.getT(2);
        System.out.println(cn.ToString());*/
   //get list of elements
        System.out.println("get list of elements");
        cls= imp.getAllTs();
        for (Clients c : cls){
            System.out.println(c.ToString());
        }
   //add elements to DB
    //    System.out.println("add elements to DB");
    //    Clients c2 = new Clients(5 , "M" , "Matin" , "maxi");
      //  imp.AddT(c2);


   //update an element
      //  System.out.println("modify an element");
       // Clients c3 = new Clients(3 , "M" , "Alixes" , "Margin");
     //   imp.updateT(c2 , 3);

   //delete an element
      //  imp.deleteT(1);

       // System.out.println("******************************************");
       // imp.getMeddecine(3);




             //   MedicineImplementation medicineImplementation = new MedicineImplementation();

                // Test adding a new Medicine
          /*      Medicine newMedicine = new Medicine(4, 2, "Dr.", "Alex", "Doe");
                try {
                    medicineImplementation.AddT(newMedicine);
                } catch (SQLException e) {
                    e.printStackTrace();
                }*/

                // Test getting a Medicine by ID
     /*           try {
                    Medicine retrievedMedicine = medicineImplementation.getT(1);
                    System.out.println("Retrieved Medicine: " + retrievedMedicine);
                } catch (SQLException e) {
                    e.printStackTrace();
                }*/

             /*   // Test updating a Medicine
                Medicine updatedMedicine = new Medicine(1, 2, "Dr.", "Jane", "Doe");
                try {
                    medicineImplementation.updateT(updatedMedicine, 1);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
*/
                // Test getting all Medicines
    /*            try {
                    List<Medicine> allMedicines = medicineImplementation.getAllTs();
                    System.out.println("All Medicines: " + allMedicines);
                } catch (SQLException e) {
                    e.printStackTrace();
                }

                // Test deleting a Medicine
                try {
                    medicineImplementation.deleteT(1);
                } catch (SQLException e) {
                    e.printStackTrace();
                }*/

      /*  Clients c1 = new Clients(2 , "M", "alex", "mali");
        Clients c3 = new Clients(3 , "F", "fatima", "fatima");

        DataSerialization dataSerialization = new DataSerialization();
       List<Clients> list = new ArrayList<>();
        System.out.println("get list of elements before ************* ");
       list =dataSerialization.getAllTs();
       for (Clients c : list){
           System.out.println(c.ToString());
       }
        System.out.println("add new element **************");
       //dataSerialization.AddT(c1);
        System.out.println("get list of elements after adding new one *************** ");
        list =dataSerialization.getAllTs();
        for (Clients c : list){
            System.out.println(c.ToString());
        }
        System.out.println("get element bu ID ***************");
       Clients c = dataSerialization.getT(2);
        System.out.println(c.ToString());
        System.out.println("update element ***************");
        Clients c4= new Clients(3 , "F", "maryammmm", "maryam");
        dataSerialization.updateT(c4,2 );
        list =dataSerialization.getAllTs();
        for (Clients cl : list){
            System.out.println(cl.ToString());
        }
        System.out.println("delete element ***************");
        dataSerialization.deleteT(1);
        System.out.println("get list of elements after adding new one *************** ");
        list =dataSerialization.getAllTs();
        list =dataSerialization.getAllTs();
        for (Clients cl : list){
            System.out.println(cl.ToString());
        }*/
    }
}
