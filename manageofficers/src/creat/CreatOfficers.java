package creat;

import engineer.Engineer;
import officers.Officers;
import staff.Staff;
import worker.Worker;

import javax.crypto.EncryptedPrivateKeyInfo;
import java.util.ArrayList;
import java.util.Scanner;

public class CreatOfficers {
    public Officers creat(Officers officers) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter name");
        officers.setFullName(input.nextLine());
        System.out.println("Enter Birth");
        officers.setBirth(input.nextLine());
        System.out.println("Nhap gioi tinh");
        officers.setGioiTinh(input.nextLine());
        System.out.println("Nhap dia chi");
        officers.setAddress(input.nextLine());

        return officers;
    }

    public Engineer creatE(Engineer engineer) {
        System.out.println("Nhap Nganh dao tao");
        engineer.setBranch(new Scanner(System.in).nextLine());
        System.out.println(engineer.toString());
        System.out.println("Tạo thành công");

        return engineer;
    }

    public Staff creatS(Staff  staff) {
        System.out.println("Nhap cong viec");
        staff.setJob(new Scanner(System.in).nextLine());
        System.out.println(staff.toString());
        System.out.println("Tạo thành công");
        return staff;
    }

    public Worker creatW(Worker worker) {
        System.out.println("Nhập Bậc (từ 1-7) ");
        worker.setLevel(Integer.parseInt(new Scanner(System.in).nextLine()));
        System.out.println(worker.toString());
        System.out.println("Tạo thành công");
        return worker;
    }


}

