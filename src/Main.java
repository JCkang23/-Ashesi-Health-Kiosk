/*  Josue Cikanga - 38452028
    September 28, 2025

    Tasks

*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // variable declaration
        final double tabletMg = 250.0;
        char letter;
        String code;
        double  weightKg,
                heightM,
                bmi,
                dosage,
                degrees,
                radians,
                cosValue,
                sinValue;

        // input scanner to read user's input
        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter service code P/L/T/C");
        // storing user's input that's always uppercase
        letter = input1.next().toUpperCase().charAt(0);

        code = switch (letter){
            case 'P' -> "Pharmacy Desk";
            case 'L' -> "Lab Desk";
            case 'T' -> "Triage Desk";
            case 'C' -> "Counseling Desk";
            default -> "Invalid service code";
        };
        // displaying the value returned from the switch
        System.out.println(code);

        // BMI quick calc
        // user input collection and storing
        Scanner weightInput = new Scanner(System.in);
        System.out.println("Please, enter your weight (kg)");
        weightKg = weightInput.nextDouble();

        Scanner heightInput = new Scanner(System.in);
        System.out.println("Please, enter your height (m)");
        heightM = heightInput.nextDouble();

        // rounding BMI
        bmi = weightKg/(heightM * heightM);
        bmi = Math.round(bmi * 10)/10.0;
        System.out.println("BMI: " + bmi);

        // checking bmi category
        String bmiCategory;

        if (bmi < 18.5) {
            bmiCategory = "Underweight";
        } else if (bmi < 24.9) {
            bmiCategory = "Normal";
        } else if (bmi < 29.9) {
            bmiCategory = "Overweight";
        } else {
            bmiCategory = "Obese";
        }

        System.out.println("Category: " + bmiCategory);

        // dosage round-up
        Scanner dosageInput = new Scanner(System.in);
        System.out.println("Please, enter the require dosage (mg)");
        dosage = dosageInput.nextDouble();

        // converting and printing number of tablets as an int
        int numTablets = (int) Math.ceil(dosage / tabletMg);
        System.out.println("Number of tablets: " + numTablets);

        // Simple trig helper
        Scanner angleInput = new Scanner(System.in);
        System.out.println("Please, enter an angle in degrees");
        degrees = angleInput.nextDouble();

        // java toRadians method to compute radian
        radians = Math.toRadians(degrees);
        // computing cos and sin values using appropriate java methods
        cosValue = Math.cos(radians);
        sinValue = Math.sin(radians);

        // rounding cos & sin values to 3 decimal place
        cosValue = (Math.round(cosValue*1000)/1000.0);
        sinValue = (Math.round(sinValue*1000)/1000.0);

        // displaying cos and sin values
        System.out.println("Cos: " + cosValue);
        System.out.println("Sin: " + sinValue);

        // closing scanners
        weightInput.close();
        heightInput.close();
        dosageInput.close();
        angleInput.close();
    }
}