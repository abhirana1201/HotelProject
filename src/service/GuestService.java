package service;
import java.util.Set;

import entities.Guest;

public interface GuestService {
void addGuest(Guest e);
Guest findGuestById(int id);
Set<Guest> allguest();
}
