package day08_IfStatements;

public class MultiBranchPractice {

    public static void main(String[] args) {

        double score = 95.5;

        boolean AGrade = score >= 90 && score <= 100;
        boolean BGrade = score >= 80 && score < 90;
        boolean Cgrade = score >= 70 && score < 80;
        boolean DGrade = score >= 60 && score < 70;

        char grade = ' ';// if don't put ' ', meaning don't initialize,
        // will give you compiler error


        if(AGrade){
            grade = 'A';
        } else if(BGrade){
            grade = 'B';
        } else if(Cgrade){
            grade = 'C';
        } else if(DGrade){
            grade = 'D';
        } else {
            grade = 'F';
        }
        //System.out.println(grade);
        System.out.println("Score " + score + " is: " + grade);
    }

}
