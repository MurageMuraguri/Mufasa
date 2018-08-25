
package mufasa;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Mufasa {

    public static int writeFile(String[] passwrd) {
        //pass an array of passwors then it writes to files
        String pass = "";
        try {
			//--------------you should change directory path
            FileWriter fw = new FileWriter("c:/users/admin/desktop/mufasa.txt");
			//---------------
            for (int i = 0; i < passwrd.length; i++) {
                fw.write(passwrd[i]);  // write password to file
            }
            fw.close();
        } catch (IOException ex) {
            System.out.println("Error write file");
            return (1);
        }
        return (0);

    }

    public static String[] readFile(String[] args) {

        //--------------you should change directory path
        String fileName = "c:/users/admin/desktop/mufasa.txt";
		//--------------
        String[] passwrds = new String[100];

        // This will reference one line at a time
        String line = null;

        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader
                    = new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader
                    = new BufferedReader(fileReader);
            int count = 0;

            while ((line = bufferedReader.readLine()) != null) {
                ///left off here
                passwrds[count] = line;
                count += 1;
                System.out.println(line);
            }

            //close file.
            bufferedReader.close();
        } catch (FileNotFoundException ex) {
            System.out.println(
                    "Unable to open file '"
                    + fileName + "'");
        } catch (IOException ex) {
            System.out.println(
                    "Error reading file '"
                    + fileName + "'");
            // Or we could just do this: 
            // ex.printStackTrace();
        }
        return(passwrds);
        //this function returns an array of strings containing the passwords
    }
}
