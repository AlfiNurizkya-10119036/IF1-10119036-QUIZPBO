/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.pbo;

/**
 *
 * @author Alfi Nurizkya
 * Nama     : Alfi Nurizkya
 * Kelas    : IF-1
 * NIM      : 10119036
 * Deskripsi Program : Menampilkan Program Haircut
 */

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer();
        ServicePrice servicePrice = new ServicePrice();
        Scanner scan = new Scanner(System.in);

	    System.out.println("===Program Kasir Rock n Roll Haircut====");
        System.out.print("Customer Name : ");
        customer.setName(scan.nextLine());
        System.out.print("Customer Email : ");
        customer.setEmail(scan.nextLine());
        servicePrice.displayService();
        servicePrice.setPriceService(servicePrice.getPrice(scan.nextInt()));

        System.out.print("Are you Member (yes/no) : ");
        customer.setMember(servicePrice.checkMemberStatus(scan.next().toUpperCase()));
        System.out.println();
        System.out.println("#*******************************#");
        System.out.println("#*******CUSTOMER INVOICE********#");
        System.out.println("Date Transaction : "+customer.currentTime());
        System.out.println("Service Price : "+servicePrice.getPriceService());
        System.out.println("Discount : "+servicePrice.getSale(customer.isMember(), servicePrice.getPriceService()));
        System.out.println("Total Pay : "+servicePrice.getTotalPay(servicePrice.getPriceService(), servicePrice.getSale(customer.isMember(), servicePrice.getPriceService())));

    }
}
