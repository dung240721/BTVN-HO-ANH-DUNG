package com.example.model;

public class ExFinally {
    public static void main(String[] args){
        try{
            int num = Integer.parseInt("Hello");
            System.out.println(num);
            String str= null;
            System.out.println(str.length());

            int result = 100/10;
            System.out.println(result);
         //   System.exit(0); khi chung t muon ket thucs mot chuong tring
        }catch(NullPointerException e){
            System.out.println(e);
        }
        catch(NumberFormatException ex){
            System.out.println("Sai dinh dang du lieu");

        }
        catch (ArithmeticException e){
            System.out.println(e);
        }

        finally {
            System.out.println("Gia phong ket noi sau khi chuowng trinh chay Connection.close()");

        }
        System.out.println("chuong trinh ket thuc...");
    }
}
