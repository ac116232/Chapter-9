import javax.swing.*;

public class FindRent {

    public static void main (String[] args){
        int[][] rents = {
                {400, 450, 510},
                {500, 560, 630},
                {625, 676, 740},
                {1000, 1250, 1600},
                {2000, 2250, 2500},
                {4250, 4500, 5000}};
        String entry;
        int floor;
        int bedrooms;

        entry = JOptionPane.showInputDialog(null, "Enter a floor number");
        floor = Integer.parseInt(entry);
        entry = JOptionPane.showInputDialog(null, "Enter number of bedrooms. ");
        bedrooms = Integer.parseInt(entry);

        JOptionPane.showMessageDialog(null, "The rent for a " +
                bedrooms + " bedroom apartment floor " + floor + " is $" + rents[floor] [bedrooms]);

    }
}
