package dao;
import java.util.Set;
import entities.Guest;
public interface GuestDao {
void addGuest(Guest e);

Guest findGuestById(int id);

Set<Guest> allGuest();
}
