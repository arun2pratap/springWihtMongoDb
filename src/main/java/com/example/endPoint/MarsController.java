package com.example.endPoint;

import java.util.List;

import com.example.repo.OnTheBooksRoomsPace;
import com.example.repo.OnTheBooksRoomsPaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.repo.OnTheBooksRooms;
import com.example.repo.OnTheBooksRoomsRepository;

@RestController
@RequestMapping("/mars")
public class MarsController {
	private final OnTheBooksRoomsRepository onTheBooksRoomsRepository;
	private final OnTheBooksRoomsPaceRepository onTheBooksRoomsPaceRepository;

	@Autowired
	MarsController(OnTheBooksRoomsRepository onTheBooksRoomsRepository, OnTheBooksRoomsPaceRepository onTheBooksRoomsPaceRepository){
		this.onTheBooksRoomsRepository = onTheBooksRoomsRepository;
		this.onTheBooksRoomsPaceRepository = onTheBooksRoomsPaceRepository;
	}

	@RequestMapping("/onTheBooks")
	public List<OnTheBooksRooms> getOnTheBooks()
	{
		return onTheBooksRoomsRepository.findAll();
	}

	@RequestMapping("/onTheBooks/save")
	public OnTheBooksRooms saveDummy()
	{
		return onTheBooksRoomsRepository.save(new OnTheBooksRooms(34));
	}



	@RequestMapping("/onTheBooksPace")
	public List<OnTheBooksRoomsPace> getOnTheBooksPace()
	{
		return onTheBooksRoomsPaceRepository.findAll();
	}
    
//    @RequestMapping("/firstName")
//	public List<OnTheBooksRooms> byFirstName(@RequestParam("firstName") String firstName)
//	{
//		return employee.findByFirstName(firstName);
//	}
    
//    @RequestMapping("/firstLast")
//	public List<OnTheBooksRooms> byFirstName(@RequestParam("firstName") String firstName, @RequestParam("lastName") String lastName)
//	{
//		return onTheBooksRoomsRepository.findByFirstNameOrLastName(firstName, lastName);
//	}
//
//    @RequestMapping("/save")
//	public OnTheBooksRooms saveEmployee(@RequestParam("firstName") String firstName, @RequestParam("lastName") String lastName)
//	{
//		return onTheBooksRoomsRepository.save(new OnTheBooksRooms(firstName,lastName));
//	}
//
//
//    @RequestMapping("/")
//    public String homePage(){
//        return "Home page";
//    }
//
//    @RequestMapping("/name")
//    public String homePage(@RequestParam("name") String name){
//        return "Welcome " + name;
//    }
}
