//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Decalre Variables for seasonal maintenance cost
        double springCost = 250.75;
        double summerCost = 320.50;
        double fallCost = 180.25;
        double winterCost = 400.00;

        //Calculate total yearly maintenance cost
        double totalCost = springCost + summerCost + fallCost + winterCost;

        //Output results
        System.out.println("Spring Maintenance Cost: $"+ springCost);
        System.out.println("Summer Maintenance Cost: $" + summerCost);
        System.out.println("Fall Maintenance Cost: $" + fallCost);
        System.out.println("Winter Maintenance Cost: $" + winterCost);
        System.out.println("Total Yearly Maintenance Cost $" + totalCost);
        }
    }
