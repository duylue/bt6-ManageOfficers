package program;

import creat.CreatOfficers;
import engineer.Engineer;
import manage.Manage;
import officers.Officers;
import staff.Staff;
import worker.Worker;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CreatOfficers creatOfficers = new CreatOfficers();
        Manage manage = new Manage();
        do {
            System.out.println("1 Tao thong tin cong chuc moi");
            System.out.println("2 xem danh sach cong chuc");
            System.out.println("3 tim cong chuc");
            System.out.println("0 Exit");
            int choice = Integer.parseInt(new Scanner(System.in).nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Bạn muốn thêm thông tin của");
                    System.out.println("1 Engineer");
                    System.out.println("2 Staff");
                    System.out.println("3 Cong nhan");
                    int choice2 = Integer.parseInt(new Scanner(System.in).nextLine());
                    switch (choice2) {
                        case 1:
                            Officers engineer = new Engineer();
                            Engineer engineer1 = (Engineer) creatOfficers.creat(engineer);
                            creatOfficers.creatE(engineer1);

                            manage.add(engineer1);
                            break;
                        case 2:
                            Officers staff = new Staff();
                            Staff staff1 = (Staff) creatOfficers.creat(staff);
                            creatOfficers.creatS(staff1);
                            manage.add(staff1);
                            break;
                        case 3:
                            Officers worker = new Worker();
                            creatOfficers.creatW((Worker) creatOfficers.creat(worker));
                            manage.add(worker);
                            break;
                    }
                    break;

                case 2:
                    manage.read();
                    break;
                case 3:
                    System.out.println("Nhap ten");
                    manage.findOfficers(new Scanner(System.in).nextLine());
                    break;
                case 0:
                    System.exit(1);


            }
        } while (true);

    }

}
