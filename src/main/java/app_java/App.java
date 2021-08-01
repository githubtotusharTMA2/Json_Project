package app_java;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import model.Address;
import model.Person;

public class App
{
	public static void main(String gsar[]) 
	{
		try
		{
			// read data -
			ObjectMapper mapper = new ObjectMapper();
			InputStream input_stream = new FileInputStream(new File("E:\\QA_Infotech\\Training_Works\\Eclipse\\Workspace_2\\Projects\\Json_Project\\src\\main\\resources\\json_file\\credentials.json"));
			System.out.println("Hello sir");
			/*TypeReference<List<Person>> typeReference = new TypeReference<List<Person>>() {};
			/*List<Person> persons = mapper.readValue(input_stream, typeReference);
			for(Person p : persons)
			{
				System.out.println("name = " + p.getFirstName() + " city = " + p.getAddress().getCity() + " first car = " + p.getCars()[0]);
			}
			
			// write data -
			Person person = new Person();
			person.setFirstName("Jack");
			person.setLastName("Singh");
			person.setAge(21);
			person.setAddress(new Address("12 Street", "Redmond", "123"));
			person.setCars(new String[] {"Lamborghini Aventador SVJ", "Mercedes Benz"});
			mapper.writeValue(new File("E:\\QA_Infotech\\Training_Works\\Eclipse\\Workspace_2\\Projects\\Json_Project\\src\\main\\resources\\json_file\\json_file_write.json"), person);
			*/
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		
	}
}
