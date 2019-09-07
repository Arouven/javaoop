/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2q4;

/**
 *
 * @author Oracle
 */
public class PrintCard {
    private String cardNo,studentName;
    private int sheets;

    public PrintCard() {
        this.sheets = 500;
    }

    public String getCardNo() {
        return cardNo;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getSheets() {
        return sheets;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setSheets(int sheets) {
        this.sheets = sheets;
    }
    
    public void printOne() {
        this.sheets = sheets-1;
    }
    
}
