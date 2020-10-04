class Main {
  public static void main(String[] args) {
   // kindly use appropriate data types for your declaration
   //declare an array variable and assign the days of the month debtor defaulted,
   byte daysOfTheMonthDebtorDefaulted []={1,2,3,4,5,6,7};
   // declare variables of amount the debtor is to pay per day, and amount the debtor paid and assign values to them
   float amountDebtorPayPerDay= 500f;
   float amountPaid=1700f;
   // declare all the variables needed for your calculations
   float totalAmount = 0f;
   byte actualElement = 0;
   float temp =amountPaid;
   byte daysDebtorPaidFor = 0;
   float leftToPay;
   float extra;
   // calculate and print total amount the debtor is to pay using for each loop
    for(bytei: daysOfTheMonthDebtorDefaulted){
      totalAmount+=amountDebtorPayPerDay;
      actualElement++;
    }
    system.out.println("The number of the elements in the array is"+actualElement);

    system.out.println("The total amount the debtor is to pay is #"+ totalAmount);
   // calculate the days the debtor paid for and print the days in which was paid for starting from the left to the right of the array. Also check if there was a day that the debtor did not pay the complete amount for that day, if yes, print the day and the amount left to pay for that day. 
   for(int i=0;i<actualElement;i++){
     if(temp>=amountDebtorPayPerDay){
       temp = temp-amountDebtorPayPerDay;// temp =amountDebtorPayPerDay
       daysDebtorPaidFor++
     }
     else if(temp<amountDebtorPayPerDay){
       break;
     }//daysDebtorPaidFor =4
   for (int i=0;i<daysDebtorPaidFor;i++){
     system.out.println("Te debtor paid for a day"+daysOfTheMonthDebtorDefaulted[i]);
   }
   if(amountPaid%amountDebtorPayPerDay>0 && amountPaid<totalAmount){
     system.out.println("The day that was not completely paidfor is day"+daysOfTheMonthDebtorDefaulted[daysDebtorPaidFor]);
        
     system.out.println("The amount left to complete the payment for day"+daysOfTheMonthDebtorDefaulted[daysDebtorPaidFor]+"is #"+(amountDebtorPayPerDay-(amountDebtorPayPerDay)));
   }

   }
   // calculate amount the debtor is left to pay if he did not pay complete fees and the days not paid for or  check if the debtor paid extra and the extra amount he paid for, or if he paid the exact amount needed to be paid and print likewise
   if(am)
   //kindly remove the statement below when you are done with the assignment
    
  }
}