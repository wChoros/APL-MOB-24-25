import java.time.format.DateTimeFormatter;
import java.util.*;
import java.time.*;
import java.util.function.Consumer;

public class Main {
    static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    static void hello(String name) {
        System.out.println("Hello " + name);
    }

    static int sum(int x, int y) {
        return x + y;
    }

    static int power(int x) {
        // x^2
        return x * x;
    }

    static int power(int x, int y) {
        // method overloading
        return (int) Math.pow(x, y);
    }

    public static void main(String[] args) {
        int x = 5015;
        double y = x;
        System.out.println(y);
        System.out.println(Math.max(5, 10));
        System.out.println(Math.min(5, 10));
        System.out.println(Math.sqrt(64));
        System.out.println(Math.abs(-4.7));
        System.out.println((int) (Math.random() * 100) + 1);

        // elvis operator
        int hour = (int) (Math.random() * 23) + 1;
        System.out.println("Hour: " + hour);
        System.out.println(hour < 18 ? "Good day" : "Good evening");


        System.out.println();
        System.out.println();
        // switch case
        int day = (int) (Math.random() * 7) + 1;
        System.out.println("Day: " + day);
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }

        System.out.println();
        System.out.println();

        // for loop
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        System.out.println();
        System.out.println();

        // for each loop
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String car : cars) {
            System.out.println(car);
        }

        System.out.println();
        System.out.println();

        hello("World");


        System.out.println();
        System.out.println();

        System.out.println(sum(5, 10));

        System.out.println();
        System.out.println();


        System.out.println("Power of 5: " + Integer.toString(power(5)));
        System.out.println("Power of 5^3: " + Integer.toString(power(5, 3)));

        System.out.println();
        System.out.println();

        System.out.println("Factorial of 5: " + Integer.toString(factorial(5)));

        System.out.println();
        System.out.println();

        Car myCar = new Car("Red", 2021, "Toyota", "Corolla");
        myCar.display();
        myCar.drive();
        myCar.stop();

        enum Level {
            LOW,
            MEDIUM,
            HIGH
        }
        Level myVar = Level.MEDIUM;
        System.out.println(myVar);

        for (Level level : Level.values()) {
            System.out.println(level);
        }


        System.out.println();
        System.out.println();

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter your name: ");
//        String name = scanner.nextLine();
//        System.out.println("Hello " + name);
//        System.out.println();
//        System.out.println("Enter your salary: ");
//        boolean isSalaryInvalid = true;
//        double salary = 0; // Declare salary here
//        do {
//            try {
//                salary = scanner.nextDouble();
//                isSalaryInvalid = false;
//            } catch (Exception e) {
//                System.out.println("Invalid salary");
//                scanner.next(); // Clear the invalid input
//            }
//        } while (isSalaryInvalid);
//
//        if (salary > 1000) {
//            System.out.println("You are rich skibidi sigma toilet with W rizz " + name);
//        } else {
//            System.out.println("You are poor " + name);
//        }
//
//        scanner.close();

        System.out.println();
        System.out.println();

        LocalTime time = LocalTime.now();
        System.out.println(time);

        LocalDate date = LocalDate.now();
        System.out.println(date);


        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Not formatted: ");
        System.out.println(dateTime);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        System.out.println("Formatted: ");
        System.out.println(dateTime.format(formatter));

        System.out.println();
        System.out.println();

        //arraylist

        System.out.println();
        System.out.println();
        ArrayList<String> carsList = new ArrayList<String>();
        carsList.add("Volvo");
        carsList.add("BMW");
        carsList.add("Ford");
        carsList.add(2, "Mazda");

//        carsList[0] = "Toyota"; // This will give an error
        carsList.set(0, "Toyota");
        carsList.remove(1);
//        carsList.clear();

        System.out.println(carsList.get(2));
        System.out.println(carsList);

        for (String car : carsList) {
            System.out.println("car: " + car);
        }
        System.out.println();
        for (int i = 0; i < carsList.size(); i++) {
            System.out.println("car: " + carsList.get(i));
        }


        System.out.println();
        System.out.println();

        // int linked list
        LinkedList<Integer> numbers = new LinkedList<Integer>();
        for (int i = 0; i < 10; i++) {
            int random_number = (int) (Math.random() * 100) + 1;
            numbers.add(random_number);
        }
        System.out.println(numbers);
        Collections.sort(numbers);
        System.out.println(numbers);


        System.out.println();
        System.out.println();

        //hashmap
        HashMap<String, String> capitalCities = new HashMap<String, String>();
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        System.out.println(capitalCities);
        System.out.println(capitalCities.get("England"));
        capitalCities.remove("England");
        System.out.println(capitalCities);
        System.out.println(capitalCities);
        System.out.println(capitalCities.size());
        for (String i : capitalCities.keySet()) {
            System.out.println(i + ": " + capitalCities.get(i));
        }

        System.out.println();
        System.out.println();


        // hashset
        HashSet<String> carsSet = new HashSet<String>();
        carsSet.add("Volvo");
        carsSet.add("BMW");
        carsSet.add("Ford");
        carsSet.add("BMW");
        System.out.println(carsSet);
        System.out.println(carsSet.contains("Volvo"));
        carsSet.remove("Volvo");
        System.out.println(carsSet);
        for (String car : carsSet) {
            System.out.println(car);
        }

        System.out.println();

        // iterator
        Iterator<String> it = carsSet.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println();
        System.out.println();

        // lambda
        carsSet.forEach((car) -> {
            System.out.println(car);
        });

        System.out.println();

        Consumer<String> method = (car) -> {
            System.out.println(car);
        };
        carsSet.forEach(method);
    }
}
