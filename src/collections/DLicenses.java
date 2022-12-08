package collections;

import java.util.HashSet;
import java.util.Iterator;

public class DLicenses {
    public static void main(String args[]){
        //Creating HashSet and adding elements
        HashSet<String> DLicensesset=new HashSet<String>();
        DLicensesset.add("A");
        DLicensesset.add("B");
        DLicensesset.add("C");
        DLicensesset.add("D");
        DLicensesset.add("BE");
        DLicensesset.add("CE");
        //Traversing elements
        Iterator<String> itr= DLicensesset.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }


    }
}
