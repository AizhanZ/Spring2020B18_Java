package OfficeHours.Practice_03_25_2020;

public class NestedIf_Practice2 {

    public static void main(String[] args) {
/*
for the loan:
    if the person has a job that pays > 5000 ==> might be eligible
    if has a good credit
    if job history is >= 2 years
 */
        int salary = 45000;
        short creditScore = 750;
        byte jobHistory = 1;

        if(salary > 50000){ //might be eligible

            if(creditScore > 650){//might be eligible

                if(jobHistory >= 2){ // eligible for loan
                    System.out.println("You are qualified");
                } else{// not eligible due to job history
                    System.out.println("You do not have enough job history, come back later");
                }


            }else{ // not eligible due to credit score
                System.out.println("You do not have a good credit score");
            }


        }else{
            System.out.println("You need to have a job that pays $50000");
        }

    }

}
