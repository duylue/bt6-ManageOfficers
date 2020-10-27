package staff;

import officers.Officers;

public class Staff extends Officers {
    private  String job;

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Staff" +
                "{" +
                "fullName = " + getFullName() + '\'' +
                ", gioiTinh = " + getGioiTinh() + '\'' +
                ", birth = " + getBirth()+ '\'' +
                ", address='" + getAddress() + '\'' +
                "job = " + job + '\'' +
                '}';
    }
}
