/********************************************
*	AUTHORS:	Christian Thorn
* COLLABORATORS: <name of peer, tutor, instructor, anyone else who helped>
*	LAST MODIFIED:	<Oct >
********************************************/

/********************************************
*	<Step Tracker>
*********************************************
*	PROGRAM DESCRIPTION:
*	< The program will track a user's walk progress, including the number of steps taken, calories burned, distance traveled, and workout duration. This is useful for people who want to monitor their daily fitness numbers on walks .>
*********************************************
*	ALGORITHM:
*	<Pseudocode here>
*********************************************
*	STATIC METHODS:
* <list of static methods and which teammate made each>
*********************************************/


public class Main 
{
    /***** CONSTANT SECTION *****/
    static final double MET_WALKING = 3.5;  // MET value for walking at moderate speed
    static final double STEP_LENGTH = 0.8;  // Average step length in meters

    public static void main(String[] args)
    {
        /***** DECLARATION SECTION *****/
        String userName;
        int steps;
        double duration, weight, caloriesBurned, distance, speed;

        /***** INITIALIZATION SECTION *****/
        userName = "Christian";
        steps = 13333;             // Number of steps taken
        duration = 83;             // Duration in minutes
        weight = 108.86;           // User's weight in kg

        /***** INTRO SECTION *****/
        System.out.println("Welcome to the Fitness Tracker!");

        /***** PROCESSING SECTION *****/
        // Call static methods to calculate calories burned, distance, and speed
        caloriesBurned = calculateCalories(MET_WALKING, weight, duration);
        distance = calculateDistance(steps, STEP_LENGTH);
        speed = calculateSpeed(distance, duration);

        /***** OUTPUT SECTION *****/
        // Display formatted fitness summary
        System.out.printf("Fitness Summary for %s:%n", userName);
        System.out.printf("Steps Taken: %d steps%n", steps);
        System.out.printf("Duration: %.2f minutes%n", duration);
        System.out.printf("Distance Traveled: %.2f kilometers%n", distance);
        System.out.printf("Calories Burned: %.2f kcal%n", caloriesBurned);
        System.out.printf("Average Speed: %.2f km/h%n", speed);
    }

    /***** STATIC METHODS *****/
    
    // Static method to calculate calories burned
    public static double calculateCalories(double MET, double weight, double duration) {
        // MET * Weight (kg) * (Duration in minutes / 60)
        return MET * weight * (duration / 60);
    }

    // Static method to calculate distance based on steps and step length
    public static double calculateDistance(int steps, double stepLength) {
        // Distance = steps * stepLength (in meters) / 1000 (to convert to kilometers)
        return steps * stepLength / 1000;
    }

    // Static method to calculate speed (distance in km / duration in hours)
    public static double calculateSpeed(double distance, double duration) {
        // Speed = distance (in km) / (duration in minutes / 60 to convert to hours)
        return distance / (duration / 60);
    }
}
