package me.akhilesh;

public class Main {

    public static void main(String[] args) {
        VipCustomer akhilesh = new VipCustomer();
        VipCustomer pratik = new VipCustomer(40000,"akhilesh@hotmail.co.uk");
        VipCustomer rahul = new VipCustomer("Rahul Gangji",80000,"rahul@gmail.com");

        System.out.println(pratik.getName());
    }
}
