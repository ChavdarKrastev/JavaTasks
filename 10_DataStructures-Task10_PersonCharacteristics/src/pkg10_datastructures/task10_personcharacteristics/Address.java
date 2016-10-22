package pkg10_datastructures.task10_personcharacteristics;


public class Address {
    
    private String country;
    private String city;
    private String municipality;
    private String postalCode;
    private String street;
    private String streetNumber;
    private String floor;
    private String appartment; 
    
    Address(String country,String city,String municipality,String postalCode,String street,String streetNumber,String floor,String appartment)
    {
        this.country = country;
        this.city = city;
        this.municipality = municipality;
        this.postalCode = postalCode;
        this.street = street;
        this.streetNumber = streetNumber;
        this.floor = floor;
        this.appartment = appartment; 
    }
    
    public String toString()
    {
        return String.format("%s ,%s ,%s ,%s ,%s ,%s ,%s ,%s ", country, city, municipality, postalCode, street, streetNumber, floor, appartment);
    }
    
    public boolean equals(Object obj)
    {
        if(obj instanceof Address){
            Address other = (Address) obj;
            
            return (this.country.equalsIgnoreCase(other.country) && this.city.equalsIgnoreCase(other.city)&&
                    this.municipality.equalsIgnoreCase(other.municipality) &&  this.postalCode.equalsIgnoreCase(other.postalCode) && 
                    this.street.equalsIgnoreCase(other.street) && this.streetNumber.equalsIgnoreCase(other.streetNumber) &&
                    this.floor.equalsIgnoreCase(other.floor) && this.appartment.equalsIgnoreCase(other.appartment));
        }
        
        return false;
    }
    
    
   void setCountry(String country)
   {
       this.country = country;
   }

   String getCountry()
    {
        return this.country;
    }
   
    void setCity(String city)
   {
       this.city = city;
   }
    String getCity()
    {
        return this.city;
    }
    
    void setMunicipality(String municipality)
   {
       this.municipality = municipality;
   }
    String getMunicipality()
    {
        return this.municipality;
    }
    
    void setPostalCode(String postalCode)
   {
       this.postalCode = postalCode;
   }
    String getPostalCode()
    {
        return this.postalCode;
    }
    
    void setStreet(String street)
   {
       this.street = street;
   }
    String getStreet()
    {
        return this.street;
    }
    
    void setStreetNumber(String streetNumber)
   {
       this.streetNumber = streetNumber;
   }
    String getStreetNumber()
    {
        return this.streetNumber;
    }
    
    void setFloor(String floor)
   {
       this.floor = floor;
   }
    String getFloor()
    {
        return this.floor;
    }
    
    void setAppartment(String appartment)
   {
       this.appartment = appartment;
   }
    String getAppartment()
    {
        return this.appartment;
    }
    
}