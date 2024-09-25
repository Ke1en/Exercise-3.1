import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double userVarInput;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose what to do:\n kg to pounds;\n pounds to kg;\n rubles to dollars;\n dollars to rubles;"
                + "\n F temperature to C;\n C temperature to F.");
        String strToChoose = scanner.nextLine();

        while (strToChoose != "exit") {
            switch (strToChoose) {
                case "kg to pounds":
                    System.out.println("Input weight in kg");
                    userVarInput = scanner.nextDouble();
                    System.out.println(userVarInput + " kg in pounds: " + userVarInput*2.20462);
                    break;
                case "pounds to kg":
                    System.out.println("Input weight in pounds");
                    userVarInput = scanner.nextDouble();
                    System.out.println(userVarInput + " pounds in kg: " + userVarInput*0.453592);
                    break;
                case "rubles to dollars":
                    System.out.println("Input amount of rubles");
                    userVarInput = scanner.nextDouble();
                    System.out.println(userVarInput + " rubles in dollars is : " + userVarInput/100);
                    break;
                case "dollars to rubles":
                    System.out.println("Input amount of dollars");
                    userVarInput = scanner.nextDouble();
                    System.out.println(userVarInput + " dollars in rubles is : " + userVarInput*100);
                    break;
                case "F temperature to C":
                    System.out.println("Input temperature in F");
                    userVarInput = scanner.nextDouble();
                    System.out.println(userVarInput + " F in C is " + ((userVarInput-32) * 5 / 9));
                    break;
                case "C temperature to F":
                    System.out.println("Input temperature in C");
                    userVarInput = scanner.nextDouble();
                    System.out.println(userVarInput + " C in F is " + ((userVarInput * 1.8) + 32));
                    break;
            }
            strToChoose = scanner.nextLine();
        }
    }
}