package engineer;

import officers.Officers;

public class Engineer extends Officers {
    private String branch;

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    @Override
    public String toString() {
        return "Engineer" +
                " {" +
                ", fullName = " + getFullName() + '\'' +
                ", gioiTinh = " + getGioiTinh() + '\'' +
                ", birth = " + getBirth()+ '\'' +
                ", address='" + getAddress() + '\'' +
                " branch =' " + branch + '\'' +

                '}';
    }
}
