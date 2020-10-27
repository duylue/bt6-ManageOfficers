package manage;

import officers.Officers;

import java.util.ArrayList;

public class Manage {
    private ArrayList<Officers> manage = new ArrayList<>();

    public void add(Officers a){
        manage.add(a);
    }
    public void read(){
        if (manage.size()==0){
            System.out.println("Danh sách trống");
        }
        for (Officers a: manage
             ) {
            System.out.println(a.toString());

        }
    }
    public void findOfficers(String n){
        boolean check = false;
        for (Officers a: manage) {
            if (a.getFullName().equals(n)){
            System.out.println(a.toString());
            check=false;
        }
        }
        if (check= true){
            System.out.println("KHÔNG TÌM THẤY");
        }


    }


}
