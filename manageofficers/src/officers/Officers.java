package officers;

import java.time.LocalDate;

public  class Officers {
    private String fullName;
    private String gioiTinh;
    private String birth;
    private  String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Officers() {
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    @Override
    public String toString() {
        return "Officers{" +
                "fullName='" + fullName + '\'' +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", birth='" + birth + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
