package com.chrisferdev.lakeSide_hotel.repository;

import com.chrisferdev.lakeSide_hotel.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Long> {
}
