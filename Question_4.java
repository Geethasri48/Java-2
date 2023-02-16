import java.io.*;
class ResidentialSociety
{
    String societyName;
    String location;
    String SecretaryName;
}
class Building extends ResidentialSociety
{
    String buildingName;
    int Apanums;
}
class Apartment extends Building
{
    int Apartmentnum;
    String ownerName;
    String meterNum;
}
public class Question_4
{
    public static void main(String args[])
    {
        ResidentialSociety res=new ResidentialSociety();

        Building b1=new Building();
        Building b2=new Building();
        Building b3=new Building();
        
        String line=null;
        try   
	    {  
	        BufferedReader br = new BufferedReader(new FileReader("Apartment.csv"));  
            while ((line = br.readLine()) != null)   
            {  
	            String[] apartment = line.split(",");  //Split based on comma.   
	            System.out.println(apartment[0]+"\t"+apartment[1]+"\t"+apartment[2]+"\t"+apartment[3]); 
            }  
	    }   
	    catch (IOException e)   
	    {  
		    e.printStackTrace();  
	    }
    }
}