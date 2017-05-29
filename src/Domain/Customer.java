package Domain;

import java.util.Date;

/**
 * Created by Nikos on 29-May-17.
 */
public class Customer {


    private int id;
    private String fname;
    private String lname;
    private String phoneNo;
    private String mail;
    private String address;
    private String cityzip;
    private boolean type;
    private Employee employee;
    private Storage_Box storage_box;
    private boolean key;
    private Date startDate;
    private Date endDate;

    public Customer(int id, String fname, String lname, String phoneNo, String mail, String address, String cityzip, boolean type, Employee employee, Storage_Box storage_box, boolean key, Date startDate, Date endDate){
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.phoneNo = phoneNo;
        this.mail = mail;
        this.address = address;
        this.cityzip = cityzip;
        this.type = type;
        this.employee = employee;
        this.storage_box = storage_box;
        this.key = key;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }
    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }
    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }
    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public String getCityzip() {
        return cityzip;
    }

    public void setCityzip(String cityzip) {
        this.cityzip = cityzip;
    }
    public boolean isType() {
        return type;
    }

    public void setType(boolean type) {
        this.type = type;
    }
    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
    public Storage_Box getStorage_box() {
        return storage_box;
    }

    public void setStorage_box(Storage_Box storage_box) {
        this.storage_box = storage_box;
    }
    public boolean isKey() {
        return key;
    }

    public void setKey(boolean key) {
        this.key = key;
    }
    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }


}
