import java.util.ArrayList;
import java.util.List;

public class AllCustomers {
    private List<Customer> listOfCustomers = new ArrayList<Customer>();
    private boolean customersLoaded = false;

    private List<String[]> loadRawCustomers(){
        ReadDelimitedFile readDelimitedFile = new ReadDelimitedFile();
        return readDelimitedFile.getFileData("customer.csv");
    }

    private List<Customer>  loadAsCustomers(){
        List<String[]> rawCustomers = loadRawCustomers();
        for (String[] rawCustomer : rawCustomers) {
            listOfCustomers.add( new Customer(rawCustomer[0],rawCustomer[1],rawCustomer[2],rawCustomer[3]));
        }
        customersLoaded = true;
        return listOfCustomers;
    }
    public List<Customer>  getListOfCustomers() {
        if (! customersLoaded){
            loadAsCustomers();
        }
        return listOfCustomers;
    }


}
package Fake;

import java.util.ArrayList;
import java.util.List;

public class AllCustomers {

    private String loadRawCustomers = ",";

    private Load rawCustomer = new rawCustomer();

    public void loadRawCustomers(String loadRawCustomers){
        this.loadRawCustomers = loadRawCustomers;
    }

    package Stub;

import Foundation.loadRawCustomers;

import java.util.ArrayList;
import java.util.List;

public class AllCustomers {

    private String loadRawCustomers = ",";

    private Stub.Load loadRawCustomers = new Stub.loadRawCustomers();

    public void loadRawCustomers(String loadRawCustomers){
        this.rawCustomers = loadRawCustomers;
    }

    public void rawCustomer(Load rawCustomer) {
        this.rawCustomer = rawCustomer;
    }

    public List<String[]> rawCustomers(String "customer.csv") {
        List<String[]> loadRawCustomers = new ArrayList<String[]>();

        List<String> rawCustomers = loadFile.rawCustomers("customer.csv");
        for (String row : fileData) {
        listOfCustomers.add( new Customer(rawCustomer[0],rawCustomer[1],rawCustomer[2],rawCustomer[3]));
        }
        return readDelimitedFile.getFileData("customer.csv");;
    }
}

    public void setLoadFile(Load loadFile) {
        this.loadFile = loadFile;
    }

    public List<String[]> getFileData(String "customer.csv") {
        List<String[]> delimtedData = new ArrayList<String[]>();

        List<String> fileData = loadFile.getFileData("customer.csv");
        for (String row : fileData) {
            listofCustomers.add(row.split(loadRawCustomers));
        }
         return listOfCustomers;
    }
}
package Mock;

import java.util.ArrayList;
import java.util.List;

public class AllCustomers {

    private String  = ",";

    private Load loadFile = new LoadFile();

    public void rawCustomer(String loadRawCustomers){
        this.loadRawCustomers = loadRawCustomers;
    }

    public void setLoadFile(Load loadFile) {
        this.loadFile = loadFile;
    }

    public List<String[]> getFileData(String "customer.csv") {
        List<String[]> rawCustomer = new ArrayList<String[]>();

        List<String> fileData = loadFile.getFileData("customer.csv");
        for (String row : fileData) {
            
            listofCustomers.add(row.split(loadRawCustomers));
        }
        return listofCustomers;
    }
}
