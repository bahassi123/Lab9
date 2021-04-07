import java.util.ArrayList;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;

class Main {
static ArrayList<Person> people;
static String filename;
static FileReader myFile;

public static void main(String[] args) 
{
people = new ArrayList<Person>();

people.add(new Person("Mariam",22,"Pink"));
people.add(new Person("A", 87, "Pink"));
people.add(new Person("B", 13, "Yellow"));
people.add(new Person("C", 55, "Black"));
people.add(new Person("D", 4, "Green"));

filename = "data.txt";
String name = "", age = "", color = "";

try {
myFile = new FileReader(filename);
BufferedReader reader = new BufferedReader(myFile);

while (reader.ready()) {
name = reader.readLine();
age = reader.readLine();
color = reader.readLine();
System.out.println(name + "\t" + age + "\t" + color);

Person thePerson = new Person(name, Integer.parseInt(age), color);
people.add(thePerson);

}

reader.close();
} catch (IOException exception) {
System.out.println("An error occurred: " + exception);
}

for(int i=0; i<people.size(); i++) {
System.out.printf("%-20s %-15s %-15s %n", people.get(i).getName(), people.get(i).getAge(), people.get(i).getColor());
  }
System.out.printf("%-20s %-15s %-15s %n", name, age, color);
  FileWriter toWriteFile; 
try
{ 
toWriteFile = new FileWriter("data.txt"); 
BufferedWriter output = new BufferedWriter(toWriteFile);

output.flush();
output.close(); 
} 
catch (IOException excpt) 
{ 
excpt.printStackTrace(); 
} 
}
}
