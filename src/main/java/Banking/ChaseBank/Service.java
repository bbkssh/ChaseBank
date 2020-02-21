package Banking.ChaseBank;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class Service {

    //aList is 2D arraylist declaration
    ArrayList<ArrayList<Integer>> aList = new ArrayList<ArrayList<Integer>>();

    ArrayList<Integer> a1 = new ArrayList<Integer>(); //arraylist for 1st deposit
    ArrayList<Integer> a2 = new ArrayList<Integer>(); //arraylist for 2nd deposit
}
