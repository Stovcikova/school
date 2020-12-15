package sk.kosickaakademia.stovcikova.nakupnykosik;

import jdk.jshell.execution.Util;
import sk.kosickaakademia.stovcikova.nakupnykosik.cart.Cart;
import sk.kosickaakademia.stovcikova.nakupnykosik.countable.Water;
import sk.kosickaakademia.stovcikova.nakupnykosik.service.Delivery;
import sk.kosickaakademia.stovcikova.nakupnykosik.uncontable.Apple;
import sk.kosickaakademia.stovcikova.xml.GenerateXML;
import sk.kosickaakademia.stovcikova.xml.ReadXML;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Item item1 = new Apple("Golden", 1.1, 5.1);
        Item item2 = new Water("jemne perliva", 0.45, 5);
        Water item3 = new Water("Orange juice", 1.45, 2);
        Item delivery = new Delivery(2.99);

        Cart cart= new Cart();
        cart.addItem(item1);
        cart.addItem(item2);
        cart.addItem(item3);
        cart.addItem(delivery);



        cart.printCart();
        System.out.println("Do you have any coupon (y/n) ?");
        Scanner scanner = new Scanner(System.in);
        String coupon;
        String input= scanner.nextLine().toLowerCase();
        if (input.charAt(0)=='y'){
            System.out.println("Enter coupon code: ");
            coupon= scanner.nextLine();
        }
        System.out.println("/nTotal price: "+ cart.getTotalPrice());
        //System.out.println(" Information price in SKK: "+ Util.convertEurToSkk(cart.getTotalPrice()+ " )"));
        GenerateXML.generateFileXML(cart);
        ReadXML.readXmlAndWriteInConsole();
        }

    }




