import java.util.Scanner;
class Account{

private int acNo;
String name;
private long mobNo;
private long aadharNo;
String acType;
private double bal;

private int atmNo;
private int atmPin;
private static Account a1[]=new Account[5];
Scanner sc=new Scanner(System.in);

private int bankId=144;
private int bankPswd=555;

Account(String name,int acNo,long mobNo,long aadharNo,String acType, double bal, int atmNo,int atmPin){
this. acNo=acNo;
this. name=name;
this. mobNo=mobNo;
this. aadharNo=aadharNo;
this. acType=acType;
this. bal=bal;

this. atmNo=atmNo;
this. atmPin=atmPin;
}

Account(){

}

public void createAccount(){
System.out.println("enter your name >>>");
String name=sc.next();
System.out.println("enter your mob.No. >>>");
long mobNo=sc.nextLong();
System.out.println("enter your aadhar No. >>>");
Long aadharNo=sc.nextLong();

for(int i=0;i<5;i++){
if(a1[i]!=null){
if(a1[i].aadharNo==aadharNo){
System.out.println("This Aadhar No. is already used for other account ??");
System.out.println("SORRY.... We can't continue process of account creation XXXX");
return;
}
}
}

String acType="";
double bal=0.0;
int acNo=0;
int atmNo=0;
int atmPin=0;
boolean ac=false;
while(ac==false){
System.out.println("choose your account type >>>");
System.out.println("1.'Saving'  2.'Current'  3.'JanDhan'");
switch(sc.nextInt()){
case 1:
acType="Saving";
ac=true;
break;
case 2:
acType="Current";
ac=true;
break;
case 3:
acType="JanDhan";
ac=true;
break;
default :
System.out.println("Choose valid Option ??");
}
}
double neededBal=0;
if(acType=="Saving")
neededBal=1000;
else if(acType=="Current")
neededBal=2000;
else if(acType=="JanDhan")
neededBal=0.0;
boolean nbal=false;
while(nbal==false){
System.out.println("You have to deposit minimum amount..'"+neededBal+"' to create an account");
if(acType=="JanDhan"){
System.out.println("No need do depossit any money !!!");
System.out.println("else if you want to deposit press '1' else press any No.>>>");
if(sc.nextInt()==1){
System.out.println("Enter amount >>>");
bal=sc.nextDouble();
nbal=true;


}
else{
nbal=true;
//bal=0.0;

}
}
else{
System.out.println("Deposit amount >>>");
double amount=sc.nextDouble();
if(amount>=neededBal){
nbal=true;
bal=amount;
}
}
if(nbal==true){
boolean sc=false;
for(int i=0;i<5;i++){
if(a1[i]==null){
acNo=(int)(Math.random()*100000);
atmNo=(int)(Math.random()*100000);
atmPin=(int)(Math.random()*10000);

a1[i]=new Account(name,acNo,mobNo,aadharNo,acType,bal,atmNo,atmPin);
System.out.println("Your account is created !!!");
System.out.println("Your 'account No.' is >>'"+acNo+"'");
System.out.println("Your 'atm No.' is >>'"+atmNo+"'");
System.out.println("Your 'atm Pin.' is >>'"+atmPin+"'");
System.out.println("Please remember these details !!!");
System.out.println("Do not share these details to anyone XXXX");
sc=true;
break;
}
}
if(sc==false){
System.out.println("Sorry for inconviniece !!!!");
System.out.println("Our account capacity is full ZZZZ");
System.out.println("We are unable to create your account  XXXX");
System.out.println("if you want to create an account you have to wait >>>");
}

}
}

}

public void removeAccount(){
System.out.println("enter your 'account No.'  >>");
int acNo=sc.nextInt();
boolean ac=false;
for(int i=0;i<5;i++){
if(a1[i]!=null){
if(a1[i].acNo==acNo){
System.out.println("enter your 'Aadhar No.'");
long aadharNo=sc.nextLong();
if(aadharNo==a1[i].aadharNo){
a1[i]=null;
System.out.println("Your accont is successfully Removed ");
 ac=true;
break;
}
}
}
}
if(ac==false)
System.out.println("Invalid Account No. ???");

}
public int checkAcNo(int acNo){
int r=10;
for(int i=0;i<5;i++){
if(a1[i]!=null){
if(a1[i].acNo==acNo)
r=i;

}
}
return r;
}

public boolean checkAcNo2(int i,int acNo){
boolean r=false;
if(a1[i].acNo==acNo)
r=true;
return r;
}
public boolean checkAadharNo(int i,long aadharNo){
boolean r=false;
if(a1[i].aadharNo==aadharNo)
r=true;

return r;
}
public double getBal(int i){
return a1[i].bal;
}
public void setBal(int i,double bal){
a1[i].bal=bal;
}
public int checkAtmNo(int atmNo){
int r=10;
for(int j=0;j<5;j++){
if(a1[j]!=null){
if(a1[j].atmNo==atmNo){
r=j;
break;
}
}
}
return r;
}
public boolean checkAtmPin(int i,int atmPin){
boolean r=false;
if(a1[i].atmPin==atmPin)
r=true;
return r;
}
public void setAtmPin(int i,int atmPin){
a1[i].atmPin=atmPin;
}




public void changeAccountDetails(){  //1
System.out.println("This is private & protected site :- 'Only For our Bank Members' XXXX");
System.out.println("To verify that :- 'you are a our bank Member' >>>");
System.out.println("Banker please entre our 'bank ID' >>> ");
if(sc.nextInt()==bankId){  //2
System.out.println("enter our 'Bank Password'");
if(sc.nextInt()==bankPswd){  //3

System.out.println("enter 'user account No'...");
int acNo=sc.nextInt();
for(int i=0;i<5;i++){  //4
if(a1[i]!=null){  //5
if(a1[i].acNo==acNo){  //6
System.out.println("enter 'user Aadhar No.'");
long aadharNo=sc.nextLong();
if(a1[i].aadharNo==aadharNo){  //7
System.out.println("Choose an option  >>>  1.Change Mob.No.  2.Change Aadhar No.  3.Check MobNo.  4.Check Aadhar No.");
switch(sc.nextInt()){  //8
case 1:
System.out.println("enter new 'Mob.No.'>>>");
a1[i].mobNo=sc.nextLong();
System.out.println("Your mob.No.is successfully updated as '"+a1[i].mobNo+"'");
return;
case 2:
System.out.println("enter new 'Aadhar.No.'>>>");
a1[i].aadharNo=sc.nextLong();
System.out.println("Your Aadhar.No.is successfully updated as '"+a1[i].aadharNo+"'");
return;
case 3:
System.out.println("Your mob. no. linked to your bank Account is '"+a1[i].mobNo+"'");
return;
case 4:
System.out.println("Your Aadhar.no. linked to your bank Account is '"+a1[i].aadharNo+"'");
return;
default :
System.out.println("Incorrect option ??");
return;
}  //-8

}  //-7
else{
System.out.println("Invalid Aadhar No.");
break;
}  



}  //-6

}   //-5;

if(i==4){
System.out.println("Unexisting Account No");
} 

}   //-4



}  //-3
else
System.out.println("Incorrect bank Password ???");
}  //-2
else
System.out.println("Incorrect Bank ID. ???");

} // -1

}
