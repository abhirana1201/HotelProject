package dao;
import java.util.*;
import entities.Guest;
import exceptions.GuestFoundException;
import util.GuestIdComparator;

import java.util.Set;
import dao.GuestDao;
public class GuestDaoImplements implements GuestDao {

Map<Integer,Guest> store=new HashMap<>();
@Override
public void addGuest(Guest e)
{
store.put(e.getId(),e);	
}
@Override
public Guest findGuestById(int id)
{
Guest e=store.get(id);
if(e==null){
	throw new GuestFoundException("guest not found"+id);
}
return e;
}


public Set<Guest> allGuest()
{
	Collection<Guest> guest=store.values();
	Set<Guest> guestSet=new TreeSet<>(new GuestIdComparator());
	guestSet.addAll(guest);
	return guestSet;
}
}

