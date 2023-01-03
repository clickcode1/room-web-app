package com.imran.landon.roomwebapp.controllers;

import com.imran.landon.roomwebapp.models.Room;
import com.imran.landon.roomwebapp.service.RoomService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import java.util.List;

@Controller
@RequestMapping("/rooms")
public class RoomsController {
    private final RoomService roomService;
    public RoomsController(RoomService roomService) {
        this.roomService = roomService;
    }

    @GetMapping
    public String getAllRooms(Model model){
        model.addAttribute("rooms", roomService.getAllRooms());
        return "rooms";
    }
}
