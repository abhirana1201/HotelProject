package service;
import java.util.Set;
import entities.Guest;
import dao.GuestDao;
import exceptions.IncorrectIdException;

public class GuestServiceImplementation  implements GuestService{
private GuestDao dao;
public GuestServiceImplementation(GuestDao dao)
{
this.dao=dao;	
}
public void addGuest(Guest e)
{
dao.addGuest(e);	
}
@Override
public Guest findGuestById(int id) {
	if(id<0)
	{
		throw new IncorrectIdException("id is incorrect");
	}
	Guest e=dao.findGuestById(id);
	return e;
}
@Override
public Set<Guest> allguest() {
	Set<Guest> guest=dao.allGuest();
	return guest;
}
}
