class BankTransactions{

Account ab1=new Account();

// Add money >>>
public void addMoney(){
System.out.println("enter 'Account No.' to credit Money >>");

int i=ab1.checkAcNo(ab1.sc.nextInt());
if(i==10){
System.out.println("this account is not present ??");
}
else{

System.out.println("enter 'Amount' to 'CREDIT' >>");
double bal=ab1.getBal(i)+ab1.sc.nextDouble();
ab1.setBal(i, bal);
System.out.println("Amount is Credited Successfully !!!");

}

}

// Withdraw >>>
public void withdrawMoney(){
System.out.println("enter 'Account No.' to Withdraw Money >>");

int i=ab1.checkAcNo(ab1.sc.nextInt());
if(i==10){

System.out.println("This Acoount is not present ??");
}
else{
System.out.println("enter your 'Adhar No.' >>>");
if(ab1.checkAadharNo(i, ab1.sc.nextLong())){
System.out.println("enter Amount for 'WITHDRAW' >>");
double amount=ab1.sc.nextDouble();
if(amount<=ab1.getBal(i)){
double bal=ab1.getBal(i)-amount;
ab1.setBal(i, bal);

System.out.println("Take your Cash >>>");
}
else
System.out.println("Insufficient funds for Transactions ???");
}
else
System.out.println("Invalid 'Aadhar No.' ??");

}


}

// Print balance >>>
public void printBalance(){
System.out.println("enter Your 'Account No.' >>");

int i=ab1.checkAcNo(ab1.sc.nextInt());
if(i==10){

System.out.println("This Acoount is not present ??");
}

else{
System.out.println("enter your 'Adhar No.' >>>");
if(ab1.checkAadharNo(i, ab1.sc.nextLong())){

System.out.println("Your current Balance is >>"+ab1.getBal(i));
}
else
System.out.println("Incorrect 'Adhar No' ??");
}
}
}