

import java.io.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DataSerialization  implements GestionCabinier<Clients>{

    public  List<Clients> getFromSerialFile() throws IOException {
        List<Clients> ls = new ArrayList<>();
        try {
            FileInputStream fsi = new FileInputStream("Clients"+".serial");
            ObjectInputStream obi = new ObjectInputStream(fsi);
            try {
                ls = (List<Clients>) obi.readObject();
            }finally {
                obi.close();
                fsi.close();
            }
        }catch (ClassNotFoundException e) {
            System.out.println("This class name doesn't exist !");
        }catch (IOException ee){
            System.out.println("There is an error some where ! ");
        }finally {
            return  ls;
        }
    }

    public  void saveToSerialFile(List<Clients> client) throws IOException {
        try {

            FileOutputStream fs = new FileOutputStream("Clients"+".serial");
            ObjectOutputStream obo = new ObjectOutputStream(fs);
            try {
                obo.writeObject(client);
                obo.flush();
            }finally {
                fs.close();
                obo.close();
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }



    @Override
    public Clients getT(int id) throws SQLException, IOException {
        List<Clients> list = getFromSerialFile();
        Clients clients = null;
        for (Clients cl : list){
            if(cl.getId() == id){
                clients= cl;
            }
        }
        return clients;
    }

    @Override
    public List<Clients> getAllTs() throws SQLException, IOException {
        List<Clients> ls= getFromSerialFile();
        return ls;
    }

    @Override
    public void AddT(Clients client) throws SQLException {
        try {
            List ls = getFromSerialFile();
            ls.add(client);
            FileOutputStream fs = new FileOutputStream("Clients"+".serial");
            ObjectOutputStream obo = new ObjectOutputStream(fs);
            try {
                obo.writeObject(ls);
                obo.flush();
            }finally {
                fs.close();
                obo.close();
                System.out.println("Done !");
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void updateT(Clients p, int id) throws SQLException, IOException {
        List<Clients> list = new ArrayList<>();
        list = getFromSerialFile();
        Clients c = null;
        for (Clients cl : list){
            if(cl.getId() == id){
                c= cl;
            }
        }
        System.out.println(c.ToString());

        if(c != null){
            int index = list.indexOf(c);
            list.remove(c);
            list.add(index ,p);
            saveToSerialFile(list);
            System.out.println(" this element has benn updated !");
        }
        else {
            System.out.println(" this element doesn't exist ! !");
        }

    }

    @Override
    public void deleteT(int id) throws SQLException, IOException {
        List<Clients> list = new ArrayList<>();
        Clients c = getT(id);
        list = getFromSerialFile();
        list.remove(c);
        saveToSerialFile(list);
        System.out.println("the elements is deleted ! ");
    }
}
