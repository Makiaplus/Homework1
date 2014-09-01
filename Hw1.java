/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hw1;
import java.util.Scanner;
/**
 *
 * @author Lenovo
 */
public class Hw1 {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		int[] IncomeRange = new int[4];
		int[] TaxRate = new int[4];
		for (int i = 0; i < 4; i++) {
			System.out.print("Please enter income and tax rate in tax bracket "
					+ (i + 1) + ":");
			IncomeRange[i] = Sc.nextInt();
			TaxRate[i] = Sc.nextInt();
		}
		System.out.print("Please enter tax rate if income > " + IncomeRange[3]
				+ ":");
		int MaxTaxRate = Sc.nextInt();
		System.out.print("Please enter income:");
		int Income = Sc.nextInt();
		System.out.println("0 - 150000 you pay 0 baht ");
		double Tax;
		double SumTax = 0;
		for (int i = 0; i < 3; i++) {

			if (Income >= IncomeRange[i+1]) {

				Tax = ((IncomeRange[i + 1] - IncomeRange[i]) * TaxRate[i + 1] * 0.01);
			
				System.out.print(IncomeRange[i] + 1 + "-" + IncomeRange[i + 1]
						+ " you pay " + (IncomeRange[i + 1] - IncomeRange[i])
						+ " x " + (TaxRate[i + 1] * 0.01) + " = " + Tax
						+ " bath ");
				System.out.println();
				SumTax += Tax;
			}
			else if(Income < IncomeRange[i+1] && Income > IncomeRange[i]){
				Tax = (Income - IncomeRange[i]) * (TaxRate[i] * 0.01);
				System.out.print(IncomeRange[i]+1+ "-" + Income + " you pay "
						+ (Income - IncomeRange[i]) + " x " + (TaxRate[i] * 0.01)
						+ " = " + Tax + " bath ");
				System.out.println();
				SumTax += Tax;
			}
		}
		if (Income > IncomeRange[3]) {
			Tax = (Income - IncomeRange[3]) * (MaxTaxRate * 0.01);
			System.out.print(IncomeRange[3] + 1 + "-" + Income + " you pay "
					+ (Income - IncomeRange[3]) + " x " + (MaxTaxRate * 0.01)
					+ " = " + Tax + " bath ");
			SumTax += Tax;
			System.out.println();
		}
		System.out.print("Total Tax :" + SumTax);

	}

}
