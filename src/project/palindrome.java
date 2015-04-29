/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package project;

/**
 *
 * @author Owner
 */
public class palindrome {
    
    public void pl() {
        for (int i=900;i<1000;i++){
            for (int j=900;j<1000;j++){
                int temp = i*j;
                //System.out.println(temp);
                int n=temp;
                int reverse=0;
                int remainder;
                while (temp>0){
                    remainder = temp%10;
                    reverse = (reverse*10)+remainder;
                    temp=temp/10;
                }
                if (reverse==n){
                    System.out.println(n);
                }
            }    
        }
    }
    
    public static void main(String[] args){
        palindrome main = new palindrome();
        main.pl();
    }
}
