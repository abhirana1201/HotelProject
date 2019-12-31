package util;
import java.util.Comparator;
import entities.Guest;
public class GuestIdComparator implements Comparator<Guest> {
public int compare(Guest num1,Guest num2)
{
if(num1.getId()>num2.getId())
{
return 1;	
}
if(num1.getId()<num2.getId())
{
return -1;	
}
return 0;
}
}
