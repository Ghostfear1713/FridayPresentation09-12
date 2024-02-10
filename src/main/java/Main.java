import com.google.gson.Gson;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class Main {
    public static void main (String [] args) throws Exception{

        /*                                                 PART 1

        HVAD STÅR JSON FOR OG HVAD BLIVER DET BRUGT TIL?
        Json står for JavasScript Object Notation og bliver brugt som et dataudveklslingsformat,
        som er nemt for mennesker at læse og skrive og samtidigt nemt for maskiner at parse og generate (e.g konvertering
        mellem et Json string til et objekt)
        Det bliver generelt brugt til dataudveksling mellem en server og en wepapplication, især i API'er
            - I API, mange web-API'er bruger Json som den primære format til at udveksle den data som en client efterspørger
            når den laver en request til en server. En client sender en anmodning til et web-API-endpoint og forventer
            typisk et svar, der indholder data i et format den kan forstå. Det er så her Json er et godt format til at strukturere
            og transmitte disse data mellem en client og server.

        HVORDAN DET ER ADSKILT FRA XML
        1. Syntax - JSON bruger en enklere syntaks baseret på nøgle-værdi-par, mens XML bruger tags og attributter
        som kan se meget forvirrende og overvældende ud
        2. Let læseligt - JSON er mere læselig og kompakt sammenlignet med XML.
        3. Parsing - JSON-parsing er normalt hurtigere og mere ligetil i Java sammenlignet med XML-parsing.

        DE 6 DATATYPER DER BRUGES I JSON
        - String
        - Number
        - Boolean
        - Array
        - Object
        - Null

        DE 4 JSON SYNTAX REGLER
        - Data er i navn/værdi-par.
        - Data er adskilt af kommaer.
        - Objekter er i curly brackets
        - Arrays er i square brackets
         */

        /*
                                                        PART 3.2

        Testing AccountReader method, check it out
        Create a method that can read the JSON object from the file and return an array of Account objects.
        ___________________________________________________________________________________________________
        */
        /*//Defining our Json-file variable
        String filePath = "C:\\Users\\45424\\IdeaProjects\\FridayPresentation09-12\\src\\main\\java\\account.json";
        AccountReader accountReader = new AccountReader();
        UserAccount[] accounts = accountReader.readAccountsFromFile(filePath);

        if(accounts != null) {
            for (UserAccount userAccount : accounts) {
                System.out.println(userAccount.getFirstName() + " " + userAccount.getLastName());
            }
        } else {
                System.out.println("Failed to reach accounts.");
            }*/


        //                                              PART 3.5
        // Create an array of UserAccountDTO objects
        //__________________________________________________________________________________________________
        UserAccountDTO userAccountDTO = new UserAccountDTO();
        UserAccountDTO[] userAccountDTOArray = new UserAccountDTO[3]; // Assuming you want an array of size 3

//      Adding some users to our array
        userAccountDTOArray[0] = new UserAccountDTO("John Doe", "New York", 10001, true);
        userAccountDTOArray[1] = new UserAccountDTO("Alice Smith", "Los Angeles", 90001, false);
        userAccountDTOArray[2] = new UserAccountDTO("Bob Johnson", "Chicago", 60601, true);

// Call the printUserDTOs method to print out the UserAccountDTO objects in a nice format
        userAccountDTO.printUserDTONicely(userAccountDTOArray);




































        /*OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url("https://api.openweathermap.org/data/2.5/weather?q=London&appid=bf443f00f25da029e48268cded8eb170")
                .build();
        Response response = client.newCall(request).execute();
        String jsonData = response.body().string();

        //Gson klassen bliver brugt til serializing og deseralizing java objekter til og fra Json. Seralizing = konvertere et objekts properties & fields til Json string.
        Gson gson = new Gson();
        // gson.fromJson(jsonData, WeatherData.class); > basically fortæller vi Gson at vi har noget Json data som vi gerne vil konvertere til java objekter a typen, WeatherData
        WeatherData weatherData = gson.fromJson(jsonData, WeatherData.class);
        System.out.println("Weather in " + weatherData.getName() + ": " + weatherData.getWeather()[0].getDescription());

        double temperature = weatherData.getWeather()[0].getTemperature();
        System.out.println("Temperature in " + weatherData.getName() + ": " + temperature);*/








    }
}
