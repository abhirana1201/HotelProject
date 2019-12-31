package ui;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;
import dao.GuestDao;
import dao.GuestDaoImplements;
import entities.Guest;
import service.GuestService;
import service.GuestServiceImplementation;
import util.GuestIdComparator;
public class GuestMain {
	private GuestService service=new GuestServiceImplementation(new GuestDaoImplements());
public static void main(String[] args)
{
GuestMain ui=new GuestMain();
ui.run();
}
public void run()
{
try {
	Comparator<Guest> comparator=new GuestIdComparator();
	Set<Guest> set=new TreeSet<>(comparator);
	Guest g1=new Guest(2,"abhinav");
	Guest g2=new Guest(3,"ram");
	Guest g3=new Guest(1,"shyam");
	Guest g4=new Guest(4,"rama");
	
	service.addGuest(g1);
	service.addGuest(g2);
	service.addGuest(g3);
	service.addGuest(g4);
	Guest fetched1=service.findGuestById(1);
	Guest fetched2=service.findGuestById(2);
	System.out.println("fetched details"+fetched1.getName());
	System.out.println("fetched details"+fetched2.getName());
	
	Set<Guest> guest=service.allguest();
	print(guest);
	
}	catch(Throwable e)
{
e.printStackTrace();	
System.out.println("something went wrong");
}
}
void print(Collection<Guest>guest)
{
for(Guest g: guest)	
{
System.out.println(g.getName());	
}
}
}
