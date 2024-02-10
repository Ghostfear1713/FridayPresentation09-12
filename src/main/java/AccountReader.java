import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.FileReader;
import java.io.Reader;
import java.util.List;

//This class will contain the method that will read accounts from a Json file
public class AccountReader {
    /*
                                                        PART 3.2
        Create a method that can read the JSON object from the file and return an array of Account objects.
        ___________________________________________________________________________________________________
        */
    //This method takes a String parameter representing the path to our Json-file and will return an array of UserAccounts objects
    public UserAccount[] readAccountsFromFile(String filePath) {
        //Now we make a Reader in order to read the document (account.Json) - It's important to do it in a try/catch since
        //it needs to give an error if no file is present / can be found
        try (Reader reader = new FileReader(filePath)) {
            //We create a Gson object, which is responsible for Json parsing and serialization/deserialization
            // We want to deserialize so thats why we create it
            Gson gson = new Gson();

            // We use the "fromJson" method to deserialize the Json data from the reader we made above - In order to do this, we need to write
            // the data we have (which will be in the reader object) and then specify the object we want with TypeToken
            // which will specify the type of object to be deserialized - Here it specifies a List of Account objects.
            List<UserAccount> accountList = gson.fromJson(reader, new TypeToken<List<UserAccount>>(){}.getType());

            // This converts the list of UserAccounts objects (accountList) to an array of UserAccounts objects (accounts)
            //The accountList.size will set the size of this array according to the amount of elements in accountList and
            //the returned value will represent the amount of UserAccounts read from the Json file
            UserAccount[] accounts = new UserAccount[accountList.size()];
            //Next part converts the List<UserAccount> to an array of UserAccount objects - Now accounts will contain the same
            //elements as accountList, but in the form of an Array instead of a list.
            accounts = accountList.toArray(accounts);

            return accounts;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
