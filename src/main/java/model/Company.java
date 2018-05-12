package model;

public class Company {
    private String company;
    private int staff;//员工数
    private String type;
    private String area;

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getStaff() {
        return staff;
    }

    public void setStaff(int staff) {
        this.staff = staff;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
    @Override
    public String toString() {
        return "Person{" + "company=" + company + ", staff='" + staff + '\'' + ", type=" + type + "area="+area+'}';
    }
}
