/*  Josue Cikanga - 38452028
    September 28, 2025

    Tasks

*/

import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        // variable declaration
        final double tabletMg = 250.0;
        char letter;
        String  code, firstName;
        double  weightKg, heightM, bmi,
                dosage, degrees, radians, cosValue, sinValue;

        // input scanner to read user's input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter service code P/L/T/C");
        // storing user's input that's always uppercase
        letter = input.next().toUpperCase().charAt(0);

        code = switch (letter){
            case 'P' -> "Pharmacy";
            case 'L' -> "Lab";
            case 'T' -> "Triage";
            case 'C' -> "Counseling";
            default -> "Invalid service code";
        };
        // displaying the value returned from the switch
        System.out.println(code);

        // BMI quick calc
        // user input collection and storing
        System.out.println("Please, enter your weight (kg)");
        weightKg = input.nextDouble();
        System.out.println("Please, enter your height (m)");
        heightM = input.nextDouble();

        // rounding BMI
        bmi = weightKg/(heightM * heightM);
        bmi = Math.round(bmi * 10)/10.0;
        // System.out.println("BMI: " + bmi);

        /*
        Commenting the tasks that don't impact the outcome

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
        //System.out.println("Category: " + bmiCategory);

        // dosage round-up
        System.out.println("Please, enter the required dosage (mg)");
        dosage = input.nextDouble();

        // converting and printing number of tablets as an integer
        int numTablets = (int) Math.ceil(dosage / tabletMg);
        System.out.println("Number of tablets: " + numTablets);

        // Simple trig helper
        System.out.println("Please, enter an angle in degrees");
        degrees = input.nextDouble();

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

        */

        // ID sanity check
        Random randomChar = new Random();

        // generating random character value
        int charValue = randomChar.nextInt(26) + 65;
        // casting random value into character data type
        char charUpperCase = (char) charValue;

        // generating random 4 random numbers
        int randomNum1 = 3 + randomChar.nextInt(7);
        int randomNum2 = 3 + randomChar.nextInt(7);
        int randomNum3 = 3 + randomChar.nextInt(7);
        int randomNum4 = 3 + randomChar.nextInt(7);

        // concatenating numbers and characters
        String codeGeneration = "" + charUpperCase + randomNum1 + randomNum2+ randomNum3 + randomNum4;

        // checking whether the code generation meets the requirements
        if (codeGeneration.length() != 5) {
            System.out.println("Invalid length!");
        } else if (!Character.isLetter(codeGeneration.charAt(0))) {
            System.out.println("Invalid: first char must be a letter.");
        } else if (!Character.isDigit(codeGeneration.charAt(1)) || !Character.isDigit(codeGeneration.charAt(2))
                    || !Character.isDigit(codeGeneration.charAt(3)) || !Character.isDigit(codeGeneration.charAt(4))) {
            System.out.println("Invalid: last 4 must be digits");
        } else {
            System.out.println("ID OK");
        }

        // Secure
        System.out.println("Please, enter your firstname");
        firstName = input.nextLine();

        // uppercase the first letter uppercase
        char fLetter = Character.toUpperCase(firstName.charAt(0));
        // shifting forward by 2 positions
        char shift = (char) ('A' + (fLetter - 'A' + 2) % 26);
        // last two characters of ID
        String lastChar = codeGeneration.substring(codeGeneration.length() - 2);
        // rounding bmi
        int roundedBMI = (int) Math.round(bmi);

        // concatenating the final code
        String finalCode = shift + lastChar + "-" + roundedBMI;
        //System.out.println(finalCode);

        // Program summary display
        System.out.println(code.toUpperCase() + " | ID: " + codeGeneration + " | Code: " + finalCode);

        // closing scanners
        input.close();
    }
}