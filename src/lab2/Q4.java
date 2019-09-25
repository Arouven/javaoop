package lab2;

/**
Qu.4 The IT Centre of the University is concerned about the cost of paper being 
printed on their Laser printers. Consequently, students are to be charged if 
they use more than their quota of paper. When a student requires printing, 
he/she will place a PrintCard in a reader.
The PrintCard holds the following information:
cardNo String
name the name of the student sheets integer, the number of sheets of paper that 
can be printed.
Initially, all cards have the number of sheets set to a quota of 500. As each 
sheet of paper is printed the value of sheets is reduced by 1. When the value of
sheets reaches zero, no more printing is possible and a new PrintCard must be 
purchased.
Details of all PrintCards are held by the ITCentre.
(a) Write the PrintCard class which contains the following:
(i) a constructor
(ii) access methods to set and get the properties
(iii) a method to reduce the number of sheets by one
(b) Properties and methods of the class may be provided with access modifiers 
which can be used to provide protection for class members. Explain the 
protection that should be applied to the properties and methods of the PrintCard
class.
(c) Design and write a short application that will test your PrintCard class. 
Briefly explain the inputs and possible outputs of the program.
 */
public class Q4 {

    public static void main(String[] args) {
        PrintCard p1 = new PrintCard();
        p1.setCardNo("d");
    }
    
    
}
class PrintCard{
    //vars
    private String cardNo; 
    private String studentName; 
    private int sheets;

    //setter
    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setSheets(int sheets) {
        this.sheets = sheets;
    }

    //getter
    public String getCardNo() {
        return cardNo;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getSheets() {
        return sheets;
    }
    
    //constructor
    public PrintCard(){
        this.sheets = 500;
    }
    
    //method
    public void printOneSheet(){
        this.sheets = sheets - 1;
    }
}
