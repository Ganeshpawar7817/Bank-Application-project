import java.util.Scanner;
class ATM {//extends BankTransactions{ //1
  
Account aa1=new Account();
Scanner sc=new Scanner(System.in); 


public void atmTransaction(){        //2
System.out.println("enter your 'Atm No.' >>");
int atmNo=sc.nextInt();
int i=aa1.checkAtmNo(atmNo);
if(i==10)
System.out.println("Invalid 'Atm No.' XXXX");
else{

System.out.println("enter your 'atm Pin' >>>");
int atmPin=sc.nextInt();
if(aa1.checkAtmPin(i,atmPin))
{  //5
System.out.println("choose an Option >>>");
System.out.println("1.Check Balance  2.Withdraw  3.Chage Atm Pin >>>");
switch(sc.nextInt()){  //6
case 1:
System.out.println("Your current account bal is >>>"+aa1.getBal(i));
break;
case 2:
{  //7
System.out.println("enter 'AMOUNT' to withdraw >>>");
double amount =sc.nextDouble();
if(amount<=aa1.getBal(i)){   //8
double bal=(aa1.getBal(i)-amount);
System.out.println("Collect your Cash >>>");
aa1.setBal( i,bal);
}  //--8
else
System.out.println("SORRY Insufficient funds for Transaction ???");
}  //--7
break;
case 3:
{  //9
System.out.println("enter your 'AcNo'");
int acNo =sc.nextInt();

if(aa1.checkAcNo2(i, acNo) ){  //9.1
System.out.println("enter your 'aadhar No.'");
long aadharNo=sc.nextLong();
if(aa1.checkAadharNo(i,aadharNo)){  // 9.2
System.out.println("enter new pin >>> ");
aa1.setAtmPin(i,sc.nextInt());
System.out.println("Pin is updated Successfully !!!");
System.out.println("Don't share it to anyone XXX");
}  //--9.2
else
System.out.println("Invalid 'Aadhar No' ??");
}  //--9.1
else
System.out.println("Invalid 'Account No.' XXXXX");
}
default :
System.out.println("choose correct Option ??");
}  //--6
}  //--5
else
System.out.println("Invalid 'Pin' XXXX");
}  //--4
}

}  //--2

