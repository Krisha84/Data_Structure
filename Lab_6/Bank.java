import java.util.*;
class Bank_Holder{
    int Act_no;
    int Balance;
    String ActHold;
    String name;

    Bank_Holder(int Act_no,int Balance, String ActHold, String name){
        this.Act_no=Act_no;
        this.Balance=Balance;
        this.ActHold=ActHold;
        this.name=name;

        System.out.println("Act number : "+this.Act_no);
        System.out.println("Balance : "+this.Balance);
        System.out.println("ActHold : "+this.ActHold);
        System.out.println("Name : "+this.name);
    }
}

public class Bank{
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        Bank_Holder[] bk = new Bank_Holder[5];

        for(int i=0;i<5;i++){

            System.out.println("Enter Acount_No :");
            int no = sc.nextInt();

            System.out.println("Enter Balance :");
            int bal = sc.nextInt();

            System.out.println("Enter Acount Holder :");
            String holder = sc.next();

            System.out.println("Enter Name :");
            String name = sc.next();

            System.out.println("");
            System.out.println("---Bank_Details---");

            bk[i] = new Bank_Holder(no,bal,holder,name);
            System.out.println("");
            
        }            
    }
}

