import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
// DO NOT import anything else

/**
 * This class forms Java Assignment 1, 2021
 */
public class StudentMarking {


    /**
     * The message that the main menu must display --- DO NOT CHANGE THIS
     */
    public final String MENU_TEMPLATE =
            "%nWelcome to the Student System. Please enter an option 0 to 3%n"
                    + "0. Exit%n"
                    + "1. Generate a student ID%n"
                    + "2. Capture marks for students%n"
                    + "3. List student IDs and average mark%n";
    /**
     * DO NOT CHANGE THIS
     */
    public final String NOT_FOUND_TEMPLATE =
            "No student id of %s exists";


   /* Do NOT change the two templates ABOVE this comment.
      DO CHANGE the templates BELOW.
   */

    // TODO (All questions) - Complete these templates which will be used throughout the program
    public final String ENTER_MARK_TEMPLATE = "Please enter the studId to capture their mask (Enter 0 to return to main menu)";
    public final String STUDENT_ID_TEMPLATE = "You entered a given name of %s and a surname of %s%nYour studID is %s";
    public final String NAME_RESPONSE_TEMPLATE = "Please enter mark %d for student %s%n";
    public final String LOW_HIGH_TEMPLATE = "Student %s has a lowest mark of %d%nA highest mark of %d";
    public final String AVG_MARKS_TEMPLATE = "%nStudent ***%s*** has an average of  %3.2f%n";
    public final String COLUMN_1_TEMPLATE = "%7s";
    public final String COLUMN_2_TEMPLATE = "%11s%n";
    public final String CHART_KEY_TEMPLATE = "%4d%12d%n";
    public final String REPORT_PER_STUD_TEMPLATE = "| Student ID %3d is %5s | Average is %5.2f |%n";

    /**
     * Creates a student ID based on user input
     *
     * @param sc Scanner reading {@link System#in} re-used from {@link StudentMarking#main(String[])}
     * @return a studentID according to the pattern specified in {@link StudentMarking#STUDENT_ID_TEMPLATE}
     */
    public String generateStudId(Scanner sc) {
        // TODO (3.4) - Complete the generateStudId method which will allow a user to generate a student id
        String studId = ""; // TODO Don't have unnecessary initialisations

        System.out.printf(
                "Please enter your given name and surname (Enter 0 to return to main menu)%n");
        String StudentName = sc.nextLine();
        String Name = sc.nextLine();
        if (Name.equals("0")) {
            studId = Name;
        } else {

            String GivenName = Name.split(" ")[0];
            String FamilyName = Name.split(" ")[1];

            char First = GivenName.toUpperCase().charAt(0);
            char Second = FamilyName.toUpperCase().charAt(0);
            char Fifth = GivenName.charAt(GivenName.length() / 2);
            char Sixth = FamilyName.charAt(FamilyName.length() / 2);

            if (FamilyName.length() <= 9) {
                char Third = '0';
                String Fourth = String.valueOf(FamilyName.length());
                String StudentID = String.valueOf(new char[]{First, Second, Third}) + Fourth + String.valueOf(new char[]{Fifth, Sixth});
                studId = StudentID;
            } else {
                String ThirdFourth = String.valueOf(FamilyName.length());
                String StudentID = String.valueOf(new char[]{First, Second}) + ThirdFourth + String.valueOf(new char[]{Fifth, Sixth});
                studId = StudentID;
            }
            System.out.printf(STUDENT_ID_TEMPLATE, GivenName, FamilyName, studId);
        }

        return studId;
    }

    /**
     * Reads three marks (restricted to a floor and ceiling) for a student and returns their mean
     *
     * @param sc     Scanner reading {@link System#in} re-used from {@link StudentMarking#main(String[])}
     * @param studId a well-formed ID created by {@link StudentMarking#generateStudId(Scanner)}
     * @return the mean of the three marks entered for the student
     */
    public double captureMarks(Scanner sc, String studId) {
        // TODO (3.5) - Complete the captureMarks method which will allow a user to input three mark for a chosen student
        // DO NOT change MAX_MARK and MIN_MARK
        final int MAX_MARK = 100;
        final int MIN_MARK = 0;
        int[] Grades = new int[3];

        double avg = Double.MIN_VALUE; // TODO Don't have unnecessary initialisations
        if (studId.length() > 6) {
            System.out.printf(NOT_FOUND_TEMPLATE, studId.substring(6));
        } else {
            for (int i = 0; i < 3; i++) {
                System.out.printf(NAME_RESPONSE_TEMPLATE, i + 1, studId);
                int grades = sc.nextInt();
                if (grades <= MAX_MARK && grades >= MIN_MARK) {
                    Grades[i] = grades;
                }
            }
            int temp_max = Grades[0] > Grades[1] ? Grades[0] : Grades[1];
            int Max_Grade = temp_max > Grades[2] ? temp_max : Grades[2];
            int temp_min = Grades[0] < Grades[1] ? Grades[0] : Grades[1];
            int Min_Grade = temp_min < Grades[2] ? temp_min : Grades[2];
            avg = (Grades[0] + Grades[1] + Grades[2]) / 3.00;
            System.out.printf(LOW_HIGH_TEMPLATE, studId, Min_Grade, Max_Grade);
            System.out.printf(AVG_MARKS_TEMPLATE, studId, avg);
            System.out.printf("Would you like to print a bar chart? [y/n]%n");
            String IfPrint = sc.next();
            if (IfPrint.equals("y") || IfPrint.equals("Y")) {
                printBarChart(studId, Max_Grade, Min_Grade);
            } else if (IfPrint.equals("n") || IfPrint.equals("N")) {

            }
        }


        return avg;
    }

    /**
     * outputs a simple character-based vertical bar chart with 2 columns
     *
     * @param studId a well-formed ID created by {@link StudentMarking#generateStudId(Scanner)}
     * @param high   a student's highest mark
     * @param low    a student's lowest mark
     */
    public void printBarChart(String studId, int high, int low) {
        // TODO (3.6) - Complete the printBarChart method which will print a bar chart of the highest and lowest results of a student
        System.out.printf("Student id statistics: %s%n", studId);
        char Star = '*';
        for (int i = 0; i < high - low; i++) {
            System.out.printf("%4c%n", Star);
        }
        for (int i = 0; i < low; i++) {
            System.out.printf("%4c%12c%n", Star, Star);
        }
        System.out.printf(COLUMN_1_TEMPLATE + COLUMN_2_TEMPLATE, "Highest", "Lowest");
        System.out.printf(CHART_KEY_TEMPLATE, high, low);

    }

    /**
     * Prints a specially formatted report, one line per student
     *
     * @param studList student IDs originally generated by {@link StudentMarking#generateStudId(Scanner)}
     * @param count    the total number of students in the system
     * @param avgArray mean (average) marks
     */
    public void reportPerStud(String[] studList,
                              int count,
                              double[] avgArray) {
        // TODO (3.7) - Complete the reportPerStud method which will print all student IDs and average marks
        for (int i = 0; i < count; i++) {
            System.out.printf(REPORT_PER_STUD_TEMPLATE, i + 1, studList[i], avgArray[i]);
        }
        //
    }

    /**
     * The main menu
     */
    public void displayMenu() {
        // TODO (3.2) - Complete the displayMenu method to use the appropriate template with printf
        System.out.printf(MENU_TEMPLATE);
    }

    /**
     * The controlling logic of the program. Creates and re-uses a {@link Scanner} that reads from {@link System#in}.
     *
     * @param args Command-line parameters (ignored)
     */
    public static void main(String[] args) {
        // TODO (3.3) - Complete the main method to give the program its core

        // DO NOT change sc, sm, EXIT_CODE, and MAX_STUDENTS
        Scanner sc = new Scanner(System.in);
        StudentMarking sm = new StudentMarking();
        final int EXIT_CODE = 0;
        final int MAX_STUDENTS = 5;

        // TODO Initialise these

        ArrayList<String> keepStudId = new ArrayList<>();
        ArrayList<Double> avg_Array = new ArrayList<>();
        // TODO Build a loop around displaying the menu and reading then processing input
        sm.displayMenu();
        int StuNum = 0;

        while (true) {
            int option = sc.nextInt();
            if (option == 0) {
                System.out.printf("Goodbye%n");
                break;
            }
            while (true) {
                if (option == 1) {
                    String studId = sm.generateStudId(sc);
                    keepStudId.add(studId);
                    sm.displayMenu();
                    StuNum += 1;
                    avg_Array.add(0.00);
                    break;
                } else if (option == 2) {
                    System.out.printf(
                            "Please enter the studId to capture their marks (Enter 0 to return to main menu)%n");
                    //System.out.println(keepStudId);
                    String studID = sc.next();
                    boolean Exist = false;
                    boolean NotExist = false;
                    int number = 0;
                    for (int i = 0; i < keepStudId.size(); i++) {
                        if (studID.equals(keepStudId.get(i))) {
                            Exist = true;
                            number = i;
                        } else {
                            NotExist = true;
                        }
                    }

                    if (Exist) {
                        avg_Array.set(number, sm.captureMarks(sc, studID));
                    } else if (NotExist) {
                        sm.captureMarks(sc, "      " + studID);
                    }
                    sm.displayMenu();
                    break;
                } else if (option == 3) {
                    double[] AvgArray = new double[StuNum];
                    String[] KeepStudId = new String[StuNum];
                    for (int i = 0; i < StuNum; i++) {
                        AvgArray[i] = avg_Array.get(i);
                        KeepStudId[i] = keepStudId.get(i);
                    }
                    sm.reportPerStud(KeepStudId, StuNum, AvgArray);
                    sm.displayMenu();
                    break;
                } else {
                    // Handle invalid main menu input
                    System.out.printf(
                            "You have entered an invalid option. Enter 0, 1, 2 or 3%n");// Skeleton: keep, unchanged
                    sm.displayMenu();
                    break;
                }
            }
        }

    }
}

/*
    TODO Before you submit:
         1. ensure your code compiles
         2. ensure your code does not print anything it is not supposed to
         3. ensure your code has not changed any of the class or method signatures from the skeleton code
         4. check the Problems tab for the specific types of problems listed in the assignment document
         5. reformat your code: Code > Reformat Code
         6. ensure your code still compiles (yes, again)
 */