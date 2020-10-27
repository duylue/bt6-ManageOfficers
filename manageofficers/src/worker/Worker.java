package worker;

import officers.Officers;

import java.nio.file.StandardOpenOption;

public class Worker extends Officers {
    private int level;

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;

    }

    @Override
    public String toString() {
        return "Worker" +
                " {" +
                ", fullName = " + getFullName() +
                ", gioiTinh = " + getGioiTinh() +
                ", birth = " + getBirth()+
                ", address = " + getAddress() +
                " level = "  + level +
                '}';
    }
}
