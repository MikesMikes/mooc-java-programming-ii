
import java.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;

public class LicensePlate {
    // don't modify existing parts of this class

    // these instance variables have been defined as final, meaning 
    // that once set, their value can't be changed
    private final String liNumber;
    private final String country;

    public LicensePlate(String country, String liNumber) {
        this.liNumber = liNumber;
        this.country = country;
    }
    
    public boolean equals(Object obj){
        if(obj == null || this.getClass() != obj.getClass()){
            return false;
        }
        
        if(obj == this){
            return true;
        }
        
        if(!(obj instanceof LicensePlate)){
            return false;
        }
        
        LicensePlate compared = (LicensePlate) obj;
        
        if(this.country.equals(compared.getCountry()) &&
                this.liNumber.equals(compared.getNumber()) && 
                this.hashCode() == compared.hashCode()){
            return true;
        }
        
        return false;
    }
    
    public String getCountry(){
        return this.country;
    }
    
    public String getNumber(){
        return this.liNumber;
    }
    
    public int hashCode(){
        int hash = 4;
        hash = 44 * hash * Objects.hashCode(this.country);
        hash = 33 * hash * Objects.hashCode(this.liNumber);
        return hash;
    }

    @Override
    public String toString() {
        return country + " " + liNumber;
    }

}
