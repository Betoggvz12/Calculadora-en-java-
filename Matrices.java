


public class Matrices {
    public static void main(String[] args) {
        String[] cars = {"Nata", "Juniorh"};
        
        for (String name : cars) {
            System.out.println(name);
        }

        for(int i = 0 ; i < cars.length; i++){
            System.out.println(cars[i]);
        }

        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7}};
        for(int i = 0; i < myNumbers.length; i++){
            for(int j = 0; j < myNumbers[i].length ; j++){
                System.out.println(myNumbers[i][j]);
            }
        }
    }
}
